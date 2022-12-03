package com.example.photogallery.api

import retrofit2.http.GET

private const val API_KEY = "20a5b6cc81b98f23fd712bb1ffb1289f"

interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList" +
        "&api_key=$API_KEY" +
        "&format=json"+
        "&nojsoncallback=1"+
        "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}