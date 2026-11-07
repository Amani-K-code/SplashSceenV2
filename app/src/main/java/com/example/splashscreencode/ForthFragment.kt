package com.example.splashscreencode

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.splashscreencode.databinding.FragmentFirstBinding
import com.example.splashscreencode.databinding.FragmentForthBinding
import com.example.splashscreencode.databinding.FragmentThirdBinding
class ForthFragment : Fragment() {

    private var _binding: FragmentForthBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentForthBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_FirstFragment)
        }

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_SecondFragment)
        }

        binding.buttonThird.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_ThirdFragment)
        }
        binding.buttonFifth.setOnClickListener {
            findNavController().navigate(R.id.action_ForthFragment_to_FifthFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}