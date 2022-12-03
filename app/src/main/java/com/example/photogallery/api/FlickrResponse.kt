package com.example.photogallery.api

import com.example.photogallery.PhotoResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FlickrResponse(
    val photos: PhotoResponse
)
