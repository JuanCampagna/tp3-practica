package com.example.tp3_practica

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class FirstFragmentDirections private constructor() {
  public companion object {
    public fun actionFirstFragmentToSecondFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstFragment_to_secondFragment)

    public fun actionFirstFragmentToSecondFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_firstFragment_to_secondFragment2)
  }
}
