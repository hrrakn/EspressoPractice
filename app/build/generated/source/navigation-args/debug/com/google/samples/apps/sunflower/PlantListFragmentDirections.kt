package com.google.samples.apps.sunflower

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String

class PlantListFragmentDirections private constructor() {
    private data class ActionPlantListFragmentToPlantDetailFragment(val plantId: String) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_plant_list_fragment_to_plant_detail_fragment

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("plantId", this.plantId)
            return result
        }
    }

    companion object {
        fun actionPlantListFragmentToPlantDetailFragment(plantId: String): NavDirections =
                ActionPlantListFragmentToPlantDetailFragment(plantId)
    }
}
