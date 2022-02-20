package com.example.foodmarket.ui.auth

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import com.example.foodmarket.R
import kotlinx.android.synthetic.main.layout_toolbar.*

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        val pageRequest = intent.getIntExtra("page_request", 0)
        if (pageRequest == 2){
            val navOption = NavOptions.Builder()
                .setPopUpTo(R.id.fragmentSignIn,true)
                .build()
            Navigation.findNavController(findViewById(R.id.autNavHostFragment))
                .navigate(R.id.action_signup,null, navOption)
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun toolbarSignUp(){
        toolbar.title = "Sign Up"
        toolbar.subtitle = "Register and eat"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back,null)
        toolbar.setNavigationOnClickListener{onBackPressed()}
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun toolbarSignUpAdress(){
        toolbar.title = "Address"
        toolbar.subtitle = "Make sure it’s valid"
        toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back,null)
        toolbar.setNavigationOnClickListener{onBackPressed()}
    }

    fun toolbarSignUpSucess(){
        toolbar.visibility = View.GONE

    }
}