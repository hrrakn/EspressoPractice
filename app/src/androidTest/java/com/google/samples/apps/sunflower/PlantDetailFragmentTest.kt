package com.google.samples.apps.sunflower

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.idling.concurrent.IdlingThreadPoolExecutor
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until.hasObject
import com.google.samples.apps.sunflower.utilities.CoroutinePlugin
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.asCoroutineDispatcher
import org.junit.After
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.LinkedBlockingQueue
import java.util.concurrent.ThreadFactory
import java.util.concurrent.TimeUnit

@RunWith(AndroidJUnit4::class)
@MediumTest
class PlantDetailFragmentTest {

    //DataBindingを使用している場合、DataBindingのupdate完了まで待つためのIdlingResourceを設定する必要がある
    private val dataBindingIdlingResource = DataBindingIdlingResource()

    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(dataBindingIdlingResource)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(dataBindingIdlingResource)
    }

    @Test
    fun addPlantToGarden_UIAutomator() {

        // TODO UiDeviceのインスタンスを取得する
        val uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())        // plantId = 1を渡してPlantDetailFragmentを起動する
        val bundle = PlantDetailFragmentArgs("1").toBundle()
        val scenario = launchFragmentInContainer<PlantDetailFragment>(bundle, R.style.AppTheme_NoActionBar)

        // DataBinding用のIdlingResourceでは、Fragmentが保持するDataBindingの情報にアクセスする必要があるので、FrgamentScenarioクラスを渡してあげる
        dataBindingIdlingResource.monitorFragment(scenario)

        onView(withId(R.id.fab)).perform(click())

        // TODO SnackBarのTextView(R.id.snackbar_text)の文字列が'Save finished'のときにtrueを返すSearch Conditionを作る
        val searchCondition = hasObject(By.res(toResourceName(R.id.snackbar_text)).text("Save finished"))
// TODO UiDeviceで条件の検索を行う
        val waitSuccess = uiDevice.wait(searchCondition, 3000L)

        // 条件に合致していたらtrueが返ってくる
        assertTrue("Elementが見つかりませんでした(id: R.id.snackbar_text, text: Save finished)", waitSuccess)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun addPlantToGarden_idlingThreadPoolExecutor() {

        val executor = IdlingThreadPoolExecutor("IdlingThreadPoolExecutor", 2, 10, 5L, TimeUnit.SECONDS,
                LinkedBlockingQueue<Runnable>(), ThreadFactory { r -> Thread(r) })

        // TODO CoroutinePlugin#ioDispatcherHandlerをIdlingThreadPoolExecutorから生成されるCoroutine Dispatcherに差し替える
        CoroutinePlugin.ioDispatcherHandler = {executor.asCoroutineDispatcher()}
        val bundle = PlantDetailFragmentArgs("1").toBundle()
        val scenario = launchFragmentInContainer<PlantDetailFragment>(bundle, R.style.AppTheme_NoActionBar)
        dataBindingIdlingResource.monitorFragment(scenario)

        onView(withId(R.id.fab)).perform(click())
        onView(withId(R.id.snackbar_text)).check(matches(withText("Save finished")))
    }
}