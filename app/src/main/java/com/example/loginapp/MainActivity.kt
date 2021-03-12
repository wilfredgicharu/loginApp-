package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration : AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navhostfragment)
        return NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}