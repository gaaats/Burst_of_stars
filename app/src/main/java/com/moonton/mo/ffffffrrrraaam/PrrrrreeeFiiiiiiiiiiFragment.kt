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
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.vfbrfgy
import com.moonton.mo.vnkgtgtngtj.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class PrrrrreeeFiiiiiiiiiiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_prrrrreee_fiiiiiiiiii, container, false)
    }

    val gtjiotggtjgt by activityViewModel<ViMod>(named("MainModel"))
    val vbfrgyrfgyfr: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var fbrfygfrgyrf: String
    private lateinit var gngthugthugt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gngthugthugt = context
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vbygffgryfr = vbfrgyrfgyfr.getString(vfbrfgy, null)
        val vngtgthutg = vbfrgyrfgyfr.getString("appCamp", null)

        if (vbygffgryfr=="1" &&vngtgthutg == null) {
            gtjiotggtjgt.convers(gngthugthugt)
            gtjiotggtjgt.appsData.observe(viewLifecycleOwner) {
                if (it != null) {
                    fbrfygfrgyrf = it.toString()
                    vbfrgyrfgyfr.edit().putString("appCamp", fbrfygfrgyrf).apply()
                    findNavController().navigate(R.id.action_prrrrreeeFiiiiiiiiiiFragment_to_fiiiiiiiillllllltraaaaFragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_prrrrreeeFiiiiiiiiiiFragment_to_fiiiiiiiillllllltraaaaFragment)
        }
    }

}