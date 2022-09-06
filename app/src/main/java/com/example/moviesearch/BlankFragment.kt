package com.example.moviesearch

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviesearch.databinding.ActivityMainBinding
import com.example.moviesearch.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private   var _binding: FragmentBlankBinding? = null
    private  val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
      _binding = FragmentBlankBinding.inflate(inflater, container, false)
        val  view = binding.root
        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}