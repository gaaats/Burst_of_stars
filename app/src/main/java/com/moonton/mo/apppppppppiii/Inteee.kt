package com.moonton.mo.apppppppppiii

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class GeoDev(
    @SerializedName("shmeogeopeo")
    val gtugthgthutgut: String,
    @SerializedName("vebbb")
    val bvhgtbgtgtgt: String,
    @SerializedName("checker")
    val gtjigtjijtgijtg: String,
)



interface HUhfrgrfygrfrfy {
    @GET("typo.json")
    suspend fun gtntguhgtuhgthgt(): Response<GeoDev>
}

class HIufhrrfhrfhhrf(private val gtiugthgtuhgt: HUfryfrfygrfygrfrf) {
    suspend fun ugtihgtuhgt() = gtiugthgtuhgt.gtiutghtghugt()
}
class HUfrhuhrfhrfhhrf(private val HUIhfrrfhhfruhrf: HUhfrgrfygrfrfy) {
    suspend fun cvdderedfeded() = HUIhfrrfhhfruhrf.gtntguhgtuhgthgt()
}


