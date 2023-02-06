package com.moonton.mo.gtnngtjngtjtg

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Jfrhhurfgfryrfyg(application: Application): ViewModel() {
    val frhhhrfurfhu = application.packageManager
    fun vbjhvbbgtgthbgt(gthgthhgt: WebView): WebSettings{
       val gtjiotgjjgtgti = gthgthhgt.settings
        gtjiotgjjgtgti.javaScriptEnabled = true
        gtjiotgjjgtgti.useWideViewPort = true
        gtjiotgjjgtgti.loadWithOverviewMode = true
        gtjiotgjjgtgti.allowFileAccess = true
        gtjiotgjjgtgti.domStorageEnabled = true
        gtjiotgjjgtgti.userAgentString = gtjiotgjjgtgti.userAgentString.replace("; wv", "")
        gtjiotgjjgtgti.javaScriptCanOpenWindowsAutomatically = true
        gtjiotgjjgtgti.setSupportMultipleWindows(false)
        gtjiotgjjgtgti.displayZoomControls = false
        gtjiotgjjgtgti.builtInZoomControls = true
        gtjiotgjjgtgti.allowFileAccess = true
        gtjiotgjjgtgti.allowContentAccess = true
        gtjiotgjjgtgti.setSupportZoom(true)
        gtjiotgjjgtgti.pluginState = WebSettings.PluginState.ON
        gtjiotgjjgtgti.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gtjiotgjjgtgti.cacheMode = WebSettings.LOAD_DEFAULT
        gtjiotgjjgtgti.allowContentAccess = true
        gtjiotgjjgtgti.mediaPlaybackRequiresUserGesture = false
        return gtjiotgjjgtgti
    }
    fun HUfhrhrfhfrhrf(gtjgtjgtgth: String) {
        OneSignal.setExternalUserId(
            gtjgtjgtgth,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val isPushSuccess = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $isPushSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val isEmailSuccess =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $isEmailSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val isSmsSuccess = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $isSmsSuccess"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gtgthugthugt(uri: String): Boolean {
        try {
            frhhhrfurfhu.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}