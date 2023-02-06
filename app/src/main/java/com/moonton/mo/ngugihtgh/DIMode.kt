package com.moonton.mo.ngugihtgh

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.moonton.mo.apppppppppiii.HUfryfrfygrfygrfrf
import com.moonton.mo.apppppppppiii.HIufhrrfhrfhhrf
import com.moonton.mo.apppppppppiii.HUfrhuhrfhrfhhrf
import com.moonton.mo.apppppppppiii.HUhfrgrfygrfrfy
import com.moonton.mo.gtnngtjngtjtg.Jfrhhurfgfryrfyg
import com.moonton.mo.vnkgtgtngtj.ViMod
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {

    single  <HUhfrgrfygrfrfy> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HUhfrgrfygrfrfy::class.java)
    }

    single <HUfryfrfygrfygrfrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(HUfryfrfygrfygrfrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://miraclesofbeam.fun/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        HIufhrrfhrfhhrf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        HUfrhuhrfhrfhhrf(get(named("HostInter")))
    }
    single{
        provideGson()
    }
    single (named("SharedPreferences")) {
        provideSharedPref(androidApplication())
    }
}

fun provideSharedPref(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun provideGson(): Gson {
    return GsonBuilder().create()
}

val viewModelModule = module {
    viewModel (named("MainModel")){
        ViMod((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Jfrhhurfgfryrfyg(get())
    }
}