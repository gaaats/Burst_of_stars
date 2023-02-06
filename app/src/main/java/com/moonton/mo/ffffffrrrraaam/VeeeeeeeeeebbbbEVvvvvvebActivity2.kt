package com.moonton.mo.ffffffrrrraaam

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.moonton.mo.databinding.ActivityVeeeeeeeeeebbbbEvvvvvveb2Binding
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.aps_id
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.fngtb
import com.moonton.mo.gtjogtgtjitgi.Coooooooooonnsst.gthtghugt
import com.moonton.mo.gtnngtjngtjtg.Jfrhhurfgfryrfyg
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class VeeeeeeeeeebbbbEVvvvvvebActivity2 : AppCompatActivity() {

    private var gbngtgthugt = false
    override fun onBackPressed() {

        if (vbfhvfhbvf.canGoBack()) {
            if (gbngtgthugt) {
                vbfhvfhbvf.stopLoading()
                vbfhvfhbvf.loadUrl(frhfrhrfh)
            }
            this.gbngtgthugt = true
            vbfhvfhbvf.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                gbngtgthugt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }



    private val ghjojhy by viewModel<Jfrhhurfgfryrfyg>(
        named("BeamModel")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rffrfrgyfr = ActivityVeeeeeeeeeebbbbEvvvvvveb2Binding.inflate(layoutInflater)
        vbfhvfhbvf = WebView(this)
        setContentView(vbfhvfhbvf)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(vbfhvfhbvf, true)
        ghjojhy.vbjhvbbgtgthbgt(vbfhvfhbvf)

        vbfhvfhbvf.webViewClient = Hfurfrfgyrf()
        vbfhvfhbvf.webChromeClient = Jifrhirfrfgrfgrf()
        vbfhvfhbvf.loadUrl(gtfgdeyuyugffr())
    }

    private lateinit var rffrfrgyfr: ActivityVeeeeeeeeeebbbbEvvvvvveb2Binding
    lateinit var vbfhvfhbvf: WebView
    private var hykhyk: ValueCallback<Array<Uri>>? = null
    private var vnfbjbrfgfrgt: String? = null
    private  val gkpkyhji = 1

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != gkpkyhji || hykhyk == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var vngtutghugt: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (vnfbjbrfgfrgt != null) {
                    vngtutghugt = arrayOf(Uri.parse(vnfbjbrfgfrgt))
                }
            } else {
                val nvfhugt = data.dataString
                if (nvfhugt != null) {
                    vngtutghugt = arrayOf(Uri.parse(nvfhugt))
                }
            }
        }
        hykhyk!!.onReceiveValue(vngtutghugt)
        hykhyk = null
        return
    }

    inner class Hfurfrfgyrf: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (ghjojhy.gtgthugthugt(url)) {

                    val vfbfrgyffgthyjj = Intent(Intent.ACTION_VIEW)
                    vfbfrgyffgthyjj.data = Uri.parse(url)
                    startActivity(vfbfrgyffgthyjj)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            vfbfgyfrgfrrf(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VeeeeeeeeeebbbbEVvvvvvebActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }


    inner class Jifrhirfrfgrfgrf : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            hykhyk?.onReceiveValue(null)
            hykhyk = filePath
            var frhigthyjuju: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (frhigthyjuju!!.resolveActivity(packageManager) != null) {
                var djofrjtgyhuj: File? = null
                try {
                    djofrjtgyhuj = frjigtjtjihyjhy()
                    frhigthyjuju.putExtra("PhotoPath", vnfbjbrfgfrgt)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (djofrjtgyhuj != null) {
                    vnfbjbrfgfrgt = "file:" + djofrjtgyhuj.absolutePath
                    frhigthyjuju.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(djofrjtgyhuj)
                    )
                } else {
                    frhigthyjuju = null
                }
            }
            val sferfgthyhy = Intent(Intent.ACTION_GET_CONTENT)
            sferfgthyhy.addCategory(Intent.CATEGORY_OPENABLE)
            sferfgthyhy.type = "image/*"
            val gtythyujuj: Array<Intent?> = frhigthyjuju?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val rhjhyjihyihy = Intent(Intent.ACTION_CHOOSER)
            rhjhyjihyihy.putExtra(Intent.EXTRA_INTENT, sferfgthyhy)
            rhjhyjihyihy.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            rhjhyjihyihy.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtythyujuj)
            startActivityForResult(rhjhyjihyihy, gkpkyhji)
            return true
        }

        fun frjigtjtjihyjhy(): File? {
            val frgthyhyyhju = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val gthyujujik = "JPEG_" + frgthyhyyhju + "_"
            val gthyujujujkiik = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                gthyujujik,
                ".jpg",
                gthyujujujkiik
            )
        }
    }

    private fun gtfgdeyuyugffr(): String {

        val spvfbfvbfrgrfon = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val deedhfgfrgyrfgrf = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)

        val frgkogtjitgi = deedhfgfrgyrfgrf.getString(fngtb, null)
        Log.d("lolo", frgkogtjitgi.toString())
        val vndeytdeffde = deedhfgfrgyrfgrf.getString(gthtghugt, null)
        val cvvcfvfrtgfr = deedhfgfrgyrfgrf.getString(aps_id, null)


        when (deedhfgfrgyrfgrf.getString("WebInt", null)) {
            "campaign" -> {
                ghjojhy.HUfhrhrfhfrhrf(cvvcfvfrtgfr.toString())
            }
            "deepLink" -> {
                ghjojhy.HUfhrhrfhfrhrf(cvvcfvfrtgfr.toString())
            }
            "deepLinkNOApps" -> {
                ghjojhy.HUfhrhrfhfrhrf(vndeytdeffde.toString())
            }
            "geo" -> {
                ghjojhy.HUfhrhrfhfrhrf(vndeytdeffde.toString())
            }
        }
        return spvfbfvbfrgrfon.getString("SAVED_URL", frgkogtjitgi).toString()
    }

    var frhfrhrfh = ""
    fun vfbfgyfrgfrrf(vfbvfbhrfgyrfyg: String?) {
        if (!vfbvfbhrfgyrfyg!!.contains("t.me")) {

            if (frhfrhrfh == "") {
                frhfrhrfh = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    vfbvfbhrfgyrfyg
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", vfbvfbhrfgyrfyg)
                ededededededed.apply()
            }
        }
    }

}
