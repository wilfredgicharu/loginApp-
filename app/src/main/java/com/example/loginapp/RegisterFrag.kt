package com.example.loginapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.loginapp.databinding.FragmentLoginBinding
import com.example.loginapp.databinding.FragmentRegisterBinding


class RegisterFrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding = DataBindingUtil.inflate<FragmentRegisterBinding>(inflater, R.layout.fragment_register, container, false)
        // Inflate the layout for this fragment
        binding.signin.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_registerFrag_to_loginFrag))
        // Inflate the layout for this fragment
        return binding.root
    }


}

