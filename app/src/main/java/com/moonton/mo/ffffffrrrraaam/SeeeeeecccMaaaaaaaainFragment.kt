package com.moonton.mo.ffffffrrrraaam

import android.content.Context
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.juok
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.ghhg
import com.moonton.mo.vnkgtgtngtj.ViMod
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mo.R
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class SeeeeeecccMaaaaaaaainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seeeeeeccc_maaaaaaaain, container, false)
    }

    val tgkgtijgtjjgti by activityViewModel<ViMod>(named("MainModel"))
    lateinit var gjgtjihgtjtggt: String
    lateinit var nigtntguigtgt: String
    lateinit var frhrfyugfrgyrf: String
    private lateinit var vgngbgthugthugt: Context

    val gtjotgjiogtjigt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        vgngbgthugthugt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tgkgtijgtjjgti.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val frdegdefeded = it.toString()
                gtjotgjiogtjigt.edit().putString("mainId", frdegdefeded).apply()
            }
        }

        tgkgtijgtjjgti.geo.observe(viewLifecycleOwner) {
            if (it != null) {

                gjgtjihgtjtggt = it.gtugthgthutgut
                frhrfyugfrgyrf = it.gtjigtjijtgijtg
                nigtntguigtgt = it.bvhgtbgtgtgt

                gtjotgjiogtjigt.edit().putString(ghhg, gjgtjihgtjtggt).apply()
                gtjotgjiogtjigt.edit().putString(Coooooooooonnsst.vfbrfgy, frhrfyugfrgyrf).apply()
                gtjotgjiogtjigt.edit().putString(juok, nigtntguigtgt).apply()

                findNavController().navigate(R.id.action_seeeeeecccMaaaaaaaainFragment_to_prrrrreeeFiiiiiiiiiiFragment)
            }
        }
    }
}