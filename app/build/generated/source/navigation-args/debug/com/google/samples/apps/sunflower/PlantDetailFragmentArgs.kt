package com.google.samples.apps.sunflower

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class PlantDetailFragmentArgs(val plantId: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("plantId", this.plantId)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): PlantDetailFragmentArgs {
            bundle.setClassLoader(PlantDetailFragmentArgs::class.java.classLoader)
            val __plantId : String?
            if (bundle.containsKey("plantId")) {
                __plantId = bundle.getString("plantId")
                if (__plantId == null) {
                    throw IllegalArgumentException("Argument \"plantId\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"plantId\" is missing and does not have an android:defaultValue")
            }
            return PlantDetailFragmentArgs(__plantId)
        }
    }
}
