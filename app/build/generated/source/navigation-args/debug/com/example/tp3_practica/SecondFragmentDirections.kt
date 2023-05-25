package com.example.tp3_practica

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class SecondFragmentDirections private constructor() {
  public companion object {
    public fun actionSecondFragmentToFirstFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_secondFragment_to_firstFragment)
  }
}
