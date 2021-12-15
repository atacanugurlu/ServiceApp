package com.example.serviceapp.feature.splash

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.navigation.NavAction
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.serviceapp.R
import com.example.serviceapp.databinding.SplashFragmentBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

class SplashFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: SplashViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[SplashViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = SplashFragmentBinding.inflate(inflater)

        CoroutineScope(Dispatchers.Main).launch {
            delay(2000)
            navigateToLoginPage(binding)
        }

        return binding.root
    }

    private fun navigateToLoginPage(binding: SplashFragmentBinding) {
        Navigation.findNavController(binding.root)
            .navigate(R.id.action_splashFragment_to_loginFragment)
    }


}
