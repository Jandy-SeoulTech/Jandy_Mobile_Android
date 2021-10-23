package com.example.traplo

import android.widget.RatingBar

// MainHome
// 오늘의 픽 RecyclerView Data
data class MainHomePickData (
    var mainHomePickImg : Int,
    var mainHomePickTitle : String,
    var mainHomePickPlace : String,
    var mainHomePickMap : String,
    var mainHomePickIntro : String
)

// 자연과 함께라면 RecyclerView Data
data class MainHomeNatureData (
    var mainHomeNatureImg : Int,
    var mainHomeNaturePlace : String,
)

// Event RecyclerView Data
data class MainHomeEventData (
    var mainHomeEventDate : String,
    var mainHomeEventTitle : String,
    var mainHomeEventPlace : String,
    var mainHomeEventState : String
)

data class PlaceInfoImgData (
    var placeInfoImg : Int
)

data class PlaceInfoReviewData (
    var placeInfoReviewImg : Int,
    //var placeInfoReviewRating : RatingBar,
    var placeInfoReviewName : String,
    var placeInfoReviewDate : String,
    var placeInfoReviewContent : String,
    var placeInfoReviewMapImg : Int,
    var placeInfoReviewAddress : String
)

data class NatureData (
    var natureImg : Int,
    var natureName : String,
    var natureAddress : String,
    var natureContent : String,
    var natureHeart : Int
)

data class WishlistData(
    var wishlistImg : Int,
    var wishlistName : String,
    var wishlistType : String,
    var wishlistReviewTotal : Int,
    var wishlistInfo : String
)