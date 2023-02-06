package com.moonton.mo.gaaaaaaememem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mo.R
import com.moonton.mo.databinding.FragmentGaaaaaaaame5Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Gaaaaaaaame5Fragment : Fragment() {

    private var fragmentGaaameBinding: FragmentGaaaaaaaame5Binding? = null
    private val binding
        get() = fragmentGaaameBinding ?: throw RuntimeException("FragmentGaaaaaaaame5Binding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaameBinding = FragmentGaaaaaaaame5Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.rightDovnp.setOnClickListener {
                Toast.makeText(requireContext(), "not this element, you lose!", Toast.LENGTH_SHORT).show()
            }
            binding.leeeftTop.setOnClickListener {
                Toast.makeText(requireContext(), "not this element, you lose!", Toast.LENGTH_SHORT).show()
            }
            binding.rightTop.setOnClickListener {
                Toast.makeText(requireContext(), "not this element, you lose!", Toast.LENGTH_SHORT).show()
            }
            binding.leeeftDovn.setOnClickListener {
                it.isEnabled = false
                lifecycleScope.launch {
                    Toast.makeText(requireContext(), "Done! Earned 500 points!", Toast.LENGTH_SHORT).show()
                    delay(1900)
                    findNavController().navigate(R.id.action_gaaaaaaaame5Fragment_to_gameStartFragment)
                }
            }



        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaameBinding = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }
}