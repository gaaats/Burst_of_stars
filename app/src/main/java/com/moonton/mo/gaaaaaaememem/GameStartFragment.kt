package com.moonton.mo.gaaaaaaememem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mo.R
import com.moonton.mo.databinding.FragmentGameStartBinding


class GameStartFragment : Fragment() {
    private var fragmentGaaameBinding: FragmentGameStartBinding? = null
    private val binding
        get() = fragmentGaaameBinding ?: throw RuntimeException("FragmentGameStartBinding = null")


    private val lissstElements by lazy {
        listOf(
            binding.imgGameElem1,
            binding.imgGameElem2,
            binding.imgGameElem3,
            binding.imgGameElem4,
            binding.imgGameElem5,
            binding.imgGameElem6,
            binding.imgGameElem7,
            binding.imgGameElem8,
        )
    }

    private fun makeCheckVisibility() {
        lissstElements.forEach {
            if (it.visibility == View.VISIBLE) return
        }
        findNavController().navigate(R.id.action_gameStartFragment_to_gaaame2Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaameBinding = FragmentGameStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.imgGameElem1.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem2.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem3.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem4.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem5.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem6.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem7.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
            }

            binding.imgGameElem8.setOnClickListener {
                it.visibility = View.INVISIBLE
                it.isEnabled = false
                makeCheckVisibility()
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