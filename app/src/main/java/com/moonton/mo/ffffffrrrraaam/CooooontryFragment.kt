package com.moonton.mo.ffffffrrrraaam

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mo.R
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gthugthutg
import com.moonton.mo.vnkgtgtngtj.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CooooontryFragment : Fragment() {
    private lateinit var gtjtghgthu: Context


    val gngtnhgthgt: SharedPreferences by inject(named("SharedPreferences"))
    val vngtuhgtugt by activityViewModel<ViMod>(named("MainModel"))

    lateinit var gvbngtuihgthgt: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cooooontry, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjtghgthu = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vngtuhgtugt.countryCode.observe(viewLifecycleOwner) {
            if (it!=null) {
                gvbngtuihgthgt = it.gthtghgthugt
                gngtnhgthgt.edit().putString(gthugthutg, gvbngtuihgthgt).apply()
                igthgtihugtihgtutg()
            }
        }
    }

    private fun igthgtihugtihgtutg() {
        findNavController().navigate(R.id.action_cooooontryFragment_to_seeeeeecccMaaaaaaaainFragment)
    }
}