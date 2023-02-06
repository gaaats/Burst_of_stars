package com.moonton.mo.gaaaaaaememem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mo.R
import com.moonton.mo.databinding.FragmentGaaaame3Binding


class Gaaaame3Fragment : Fragment() {
    private var fragmentGaaameBinding: FragmentGaaaame3Binding? = null
    private val binding
        get() = fragmentGaaameBinding ?: throw RuntimeException("FragmentGaaaame3Binding = null")



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaameBinding = FragmentGaaaame3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.btnPlayGameeee.setOnClickListener {
                findNavController().navigate(R.id.action_gaaaame3Fragment_to_gaaaaame4Fragment)
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