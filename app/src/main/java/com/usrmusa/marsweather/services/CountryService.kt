package com.usrmusa.marsweather.services

import com.usrmusa.marsweather.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

interface CountryService {
    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}