package com.moonton.mo.vnkgtgtngtj

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.moonton.mo.apppppppppiii.HIHufhrhrfhfrhhrfh
import com.moonton.mo.apppppppppiii.HIufhrrfhrfhhrf
import com.moonton.mo.apppppppppiii.HUfrhuhrfhrfhhrf
import com.moonton.mo.apppppppppiii.GeoDev
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.apappspspspsp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(
    private val mainRepository: HIufhrrfhrfhhrf,
    private val devRepo: HUfrhuhrfhrfhhrf,
    private val shP: SharedPreferences,
    val application: Application
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            getAdvertisingIdClient()
        }
        viewModelScope.launch(Dispatchers.Main) {
            getData()
        }
    }

    private val _countryCode = MutableLiveData<HIHufhrhrfhfrhhrfh>()
    val countryCode: LiveData<HIHufhrhrfhfrhhrfh>
        get() = _countryCode

    private val _geo = MutableLiveData<GeoDev>()
    val geo: LiveData<GeoDev>
        get() = _geo

    private val _appsData = MutableLiveData<String>()
    val appsData: LiveData<String>
        get() = _appsData

    private val _mainId = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = _mainId


    suspend fun getData() {
        _countryCode.postValue(mainRepository.ugtihgtuhgt().body())
        getDevData()
    }

    suspend fun getDevData() {
        _geo.postValue(devRepo.cvdderedfeded().body())
    }

    fun convers(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apappspspspsp, conversionDataListener, application)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun fbDeee(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                shP.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            _appsData.postValue(dataGotten)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun getAdvertisingIdClient() {
        val advertisingIdClient = AdvertisingIdClient(application)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id.toString()
        _mainId.postValue(idUserAdvertising)
    }

}