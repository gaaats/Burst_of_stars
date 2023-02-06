package com.moonton.mo.ffffffrrrraaam

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mo.R
import com.moonton.mo.vnkgtgtngtj.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MaaaaaainFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vfbgfgfrgyrf.fbDeee(frjrfrf)

        findNavController().navigate(R.id.action_maaaaaainFragment_to_cooooontryFragment)

    }

    private lateinit var frjrfrf: Context

    val vfbgfgfrgyrf by activityViewModel<ViMod>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maaaaaain, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        frjrfrf=context
    }


}