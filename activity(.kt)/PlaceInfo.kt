package com.example.traplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traplo.databinding.PlaceInfoBinding

class PlaceInfo: AppCompatActivity() {
    val binding by lazy { PlaceInfoBinding.inflate(layoutInflater) }

    //adapter객체 먼저 선언해주기!
    private lateinit var adapter : PlaceInfoImgAdapter
    private lateinit var adapter2 : PlaceInfoReviewAdapter

    val mDatas = mutableListOf<PlaceInfoImgData>()
    val mDatas2 = mutableListOf<PlaceInfoReviewData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // PlaceInfo - Img
        initializePlaceInfoImglist()
        initPlaceInfoImgRecyclerView()

        // PlaceInfo - Review
        initializePlaceInfoReviewlist()
        initPlaceInfoReviewRecyclerView()

    }

    // PlaceInfo - Img
    fun initPlaceInfoImgRecyclerView(){
        val adapter = PlaceInfoImgAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas //데이터 넣어줌
        binding.placeInfoRecyclerViewPlaceImg.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.placeInfoRecyclerViewPlaceImg.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)//레이아웃 매니저 연결
    }

    fun initializePlaceInfoImglist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas) {
            add(PlaceInfoImgData(0))
            add(PlaceInfoImgData(0))
            add(PlaceInfoImgData(0))
            add(PlaceInfoImgData(0))

        }

    }

    // MainHome - Nature
    fun initPlaceInfoReviewRecyclerView(){
        val adapter = PlaceInfoReviewAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas2 //데이터 넣어줌
        binding.placeInfoRecyclerViewReview.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.placeInfoRecyclerViewReview.layoutManager= LinearLayoutManager(this)//레이아웃 매니저 연결
    }

    fun initializePlaceInfoReviewlist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas2) {
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test test test test test test test test test test test test test test test test test test test ", 0,"서울특별시 노원구 공릉동"))
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test", 0,"노원구 공릉동"))
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test", 0,"노원구 공릉동"))
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test", 0,"노원구 공릉동"))
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test", 0,"노원구 공릉동"))
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test", 0,"노원구 공릉동"))
            add(PlaceInfoReviewData(0, "test", "2021-10-20", "test", 0,"노원구 공릉동"))

        }

    }

}