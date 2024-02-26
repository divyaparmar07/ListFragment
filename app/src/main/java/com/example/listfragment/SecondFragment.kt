package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SecondFragment : Fragment() {

    lateinit var imageView : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_second, container, false)

        imageView = view.findViewById(R.id.imageView)

        val position = arguments?.getInt("position",0)

        when (position){

            0 -> imageView.setImageResource(R.drawable.first)
            1 -> imageView.setImageResource(R.drawable.second)
            2 -> imageView.setImageResource(R.drawable.third)
            3 -> imageView.setImageResource(R.drawable.fourth)
            4 -> imageView.setImageResource(R.drawable.fifth)

        }

        // Inflate the layout for this fragment
        return view
    }

}