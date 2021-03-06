package com.example.learningfragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.learningfragment.databinding.FragmentTitleBinding


class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding: FragmentTitleBinding = DataBindingUtil.inflate(
           inflater,
           R.layout.fragment_title,
           container,
           false
       )
        //SETO AQUI A FUNÇÃO DO BOTÃO NA TELA DE TITLE PARA IR PRO JOGO
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
        return binding.root;
    }


}
