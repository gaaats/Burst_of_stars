package com.moonton.mo.ffffffrrrraaam

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.moonton.mo.gaaaaaaememem.GaaaaaaaaaamiiiiActivity2
import com.moonton.mo.R
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.vfbrfgy
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.aps_id
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gthugthutg
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.bng
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.keyVAl
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.fngtb
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gthtghugt
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.papapapccckkkk
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.juok
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.vfbfedgfgr
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.ghhg
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.vfbrfy
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.vfbfgfr
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.vfbfgfrg
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.vnhgth
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.hkkhykyh
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.vbrfyrfy
import com.moonton.mo.gtjogtgtjitgi.HUYfdgfyrrfgrf.gtjitgji
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FiiiiiiiillllllltraaaaFragment : Fragment() {
    private lateinit var vfbcgfrfrgrf: Context
    val vnkgtjjhyi: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        vfbcgfrfrgrf = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiiiiiillllllltraaaa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gthgthu = vnkgtjjhyi.getString(gthugthutg, null)
        val gtkgthyjhyjiyh = vnkgtjjhyi.getString("appCamp", null)
        val vbjfrfygfdgedftedt = vnkgtjjhyi.getString("deepSt", null)
        val hyhpkyyphkhykp = vnkgtjjhyi.getString(ghhg, null)
        val appsgthyhyhy = vnkgtjjhyi.getString(vfbrfgy, null)
        val bdetdetyfed = vnkgtjjhyi.getString(juok, null)
        val hyhykhkph = vnkgtjjhyi.getString("mainId", null)
        val edjhedyudegfed = papapapccckkkk
        val frjogjogt = Build.VERSION.RELEASE
        val frjorfhfhr = vnkgtjjhyi.getString(gthtghugt, null)
        val frjorfhgedtfde: String? = vnkgtjjhyi.getString(bng, null)

        val vfbcddefde = Intent(activity, VeeeeeeeeeebbbbEVvvvvvebActivity2::class.java)
        val vbcvdtfdeed = Intent(activity, GaaaaaaaaaamiiiiActivity2::class.java)

        val frpokgtkphyjihyji = AppsFlyerLib.getInstance().getAppsFlyerUID(vfbcgfrfrgrf)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        vnkgtjjhyi.edit().putString(aps_id, frpokgtkphyjihyji).apply()

        val degyedged = "$bdetdetyfed$hkkhykyh$gtkgthyjhyjiyh&$vfbfgfr$frpokgtkphyjihyji&$vfbfedgfgr$hyhykhkph&$vnhgth$edjhedyudegfed&$vfbfgfrg$frjogjogt&$vbrfyrfy$vfbrfy"
        val vgnngtug = "$bdetdetyfed$vfbfgfr$frjorfhfhr&$vfbfedgfgr$frjorfhgedtfde&$vnhgth$edjhedyudegfed&$vfbfgfrg$frjogjogt&$vbrfyrfy$vfbrfy"
        val gjogtgth = "$bdetdetyfed$hkkhykyh$vbjfrfygfdgedftedt&$vfbfgfr$frpokgtkphyjihyji&$vfbfedgfgr$hyhykhkph&$vnhgth$edjhedyudegfed&$vfbfgfrg$frjogjogt&$vbrfyrfy$gtjitgji"
        val rfjdehdeged = "$bdetdetyfed$hkkhykyh$vbjfrfygfdgedftedt&$vfbfgfr$frjorfhfhr&$vfbfedgfgr$frjorfhgedtfde&$vnhgth$edjhedyudegfed&$vfbfgfrg$frjogjogt&$vbrfyrfy$gtjitgji"

        when(appsgthyhyhy) {
            "1" ->
                if(gtkgthyjhyjiyh!!.contains(keyVAl)) {
                    vnkgtjjhyi.edit().putString(fngtb, degyedged).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "campaign").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else if (vbjfrfygfdgedftedt!=null||hyhpkyyphkhykp!!.contains(gthgthu.toString())) {
                    vnkgtjjhyi.edit().putString(fngtb, gjogtgth).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "deepLink").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else {
                    startActivity(vbcvdtfdeed)
                    activity?.finish()
                }
            "0" ->
                if(vbjfrfygfdgedftedt!=null) {
                    vnkgtjjhyi.edit().putString(fngtb, rfjdehdeged).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else if (hyhpkyyphkhykp!!.contains(gthgthu.toString())) {
                    vnkgtjjhyi.edit().putString(fngtb, vgnngtug).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "geo").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else {
                    startActivity(vbcvdtfdeed)
                    activity?.finish()
                }
        }
    }
}
