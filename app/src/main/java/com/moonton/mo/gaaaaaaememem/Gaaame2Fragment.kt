package com.moonton.mo.gaaaaaaememem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mo.R
import com.moonton.mo.databinding.FragmentGaaameBinding


class Gaaame2Fragment : Fragment() {
    private var fragmentGaaameBinding: FragmentGaaameBinding? = null
    private val binding
        get() = fragmentGaaameBinding ?: throw RuntimeException("FragmentGaaameBinding = null")

    val naaaames by lazy {
        listOf(
            "Sasha",
            "Kromos",
            "Extal",
            "Maxela",
            "Volcine",
            "Doggyd",
            "Moxo",
            "Evos",
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaameBinding = FragmentGaaameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.imgEnemy1.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }

            binding.imgEnemy2.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.imgEnemy3.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.imgEnemy4.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.imgEnemy5.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.imgEnemy6.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.imgStart.setOnClickListener {
                Toast.makeText(requireContext(), "${naaaames.random()} bonus!", Toast.LENGTH_SHORT)
                    .show()
            }
            binding.btnPlay.setOnClickListener {
                findNavController().navigate(R.id.action_gaaame2Fragment_to_gaaaame3Fragment)
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