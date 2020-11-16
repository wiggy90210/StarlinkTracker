package com.example.starlinktracker.retrofit

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface StarlinkAPI {

    @GET("above/{observer_lat}/{observer_lng}/{observer_alt}/{search_radius}/{category_id}/&apiKey=API_KEY")
    fun getVisibleStarlinks(@Path("observer_lat") observerLat: Double,
                            @Path("observer_lng") observerLng: Double,
                            @Path("observer_alt") observerAlt: Double,
                            @Path("search_radius") searchRadius: Double,
                            @Path("category_id") categoryId: Double) : Observable<List<Results>>

    companion object {
        const val BASE_URL = "https://api.n2yo.com/rest/v1/satellite/"
        const val PAGE_SIZE = 20
    }
}