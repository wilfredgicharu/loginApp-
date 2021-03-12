package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.loginapp.databinding.FragmentWelcomeBinding


class WelcomeFrag : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentWelcomeBinding>(inflater, R.layout.fragment_welcome, container, false)
        binding.loginbtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFrag_to_loginFrag))
        binding.registerbtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_welcomeFrag_to_registerFrag))

        setHasOptionsMenu(true)

        return binding.root
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}