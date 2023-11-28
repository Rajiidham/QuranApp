package com.rival.myapplication.core.data.network.quran

import retrofit2.Call
import retrofit2.http.GET

interface QuranApiService {

    //getlist nama surah Al-quran
    @GET("surah")
    fun getListSurah() : Call<SurahResponse>
}