package com.example.latihan_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*

class Home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getNama = arguments?.getString("dataNama")
        textHaloHome.text = "Halo, $getNama"
        Toast.makeText(context, "Halo $getNama", Toast.LENGTH_SHORT).show()

        buttonHitung.setOnClickListener{
            val dataUmur = inputUmur.text.toString()
            val bund = Bundle()
            bund.putString("dataUmur", dataUmur)
            bund.putString("dataNama", getNama)
            Navigation.findNavController(view).navigate(R.id.action_home2_to_hasilHitung, bund)
        }

        profilIcon.setOnClickListener{
            val bund = Bundle()
            bund.putString("dataNama", getNama)
            Navigation.findNavController(view).navigate(R.id.action_home2_to_profile, bund )
        }
    }
}