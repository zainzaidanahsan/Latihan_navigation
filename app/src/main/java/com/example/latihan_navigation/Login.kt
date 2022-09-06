package com.example.latihan_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*

class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLogin.setOnClickListener{
            var defaultUsername = "zainzaidanahsan"
            var defaultPassword = "12345"
            if (txtUsername.text.toString() == defaultUsername && password.text.toString() == defaultPassword ) {
                var dataNama = txtUsername.text.toString()
                var bundle = Bundle()
                bundle.putString("dataNama", dataNama)
                Navigation.findNavController(view).navigate(R.id.action_login_to_home2, bundle)
            }
            else{
                Toast.makeText(context, "Akun anda belum terdaftar silahkan regist", Toast.LENGTH_LONG).show()
            }
        }
        lupaPassword.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_login_to_lupa_password)
        }
        register.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_login_to_register2)
        }
        chat_cs.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_login_to_chat_cs)
        }
        help.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_login_to_help)
        }
    }
}