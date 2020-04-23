package com.google.samples.apps.sunflower

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class GardenFragmentDirections private constructor() {
    private data class ActionGardenFragmentToPlantDetailFragment(val plantId: String) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_garden_fragment_to_plant_detail_fragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("plantId", this.plantId)
            return result
        }
    }

    companion object {
        fun actionGardenFragmentToPlantDetailFragment(plantId: String): NavDirections =
                ActionGardenFragmentToPlantDetailFragment(plantId)
    }
}
