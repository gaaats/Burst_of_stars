package com.moonton.mo.appplication

import android.app.Application
import android.content.Context
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gjtoigtjtgigtj
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.bng
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gjigtjitgjigtji
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gthtghugt
import com.moonton.mo.ngugihtgh.appModule
import com.moonton.mo.ngugihtgh.viewModelModule
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class ApleApleAple:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(gjtoigtjtgigtj)

        val gtutghugthugt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gtiutguhgthg = getSharedPreferences("PREFS_NAME", 0)

        val bgbnjgb = MyTracker.getTrackerParams()
        val bgntihu = MyTracker.getTrackerConfig()
        val bnkgtuhu = MyTracker.getInstanceId(this)
        bgntihu.isTrackingLaunchEnabled = true
        val bnggtugthugt = UUID.randomUUID().toString()

        if (gtiutguhgthg.getBoolean("my_first_time", true)) {
            bgbnjgb.setCustomUserId(bnggtugthugt)
            gtutghugthugt.edit().putString(gthtghugt, bnggtugthugt).apply()
            gtutghugthugt.edit().putString(bng, bnkgtuhu).apply()
            gtiutguhgthg.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gtigtuhgtfff = gtutghugthugt.getString(gthtghugt, bnggtugthugt)
            bgbnjgb.setCustomUserId(gtigtuhgtfff)
        }
        MyTracker.initTracker(gjigtjitgjigtji, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@ApleApleAple)
            modules(
                listOf(
                    viewModelModule, appModule
                )
            )
        }
    }
}