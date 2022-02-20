package com.example.foodmarket.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.foodmarket.R
import com.example.foodmarket.ui.MainActivity
import com.example.foodmarket.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signin.*

@Suppress("DEPRECATION")
class SigninFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnSignup.setOnClickListener {
            val intent = Intent(activity, AuthActivity::class.java)
            intent.putExtra("page_request", 2)
            startActivity(intent)
        }
        btnSignin.setOnClickListener {
            val intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

    }
}