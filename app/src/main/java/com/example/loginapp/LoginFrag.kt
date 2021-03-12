package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.loginapp.databinding.FragmentLoginBinding
import com.example.loginapp.databinding.FragmentWelcomeBinding


class LoginFrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)
        // Inflate the layout for this fragment
        binding.login.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFrag_to_destinationFrag))
        binding.facebook.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFrag_to_registerFrag))


        setHasOptionsMenu(true)

        return binding.root
    }


}