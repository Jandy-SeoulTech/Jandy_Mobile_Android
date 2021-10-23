package com.example.traplo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traplo.databinding.EventBinding

class Event : AppCompatActivity() {
    val binding by lazy { EventBinding.inflate(layoutInflater) }

    //adapter객체 먼저 선언해주기!
    private lateinit var adapter : EventEventAdapter

    val mDatas = mutableListOf<MainHomeEventData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.eventX.setOnClickListener {
            finish()
        }

        // Event Data
        initializeMainHomeEventlist()
        initMainHomeEventRecyclerView()
    }

    // MainHome - Event
    fun initMainHomeEventRecyclerView(){
        val adapter = EventEventAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas //데이터 넣어줌
        binding.recyclerViewEvent.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.recyclerViewEvent.layoutManager= LinearLayoutManager(this)//레이아웃 매니저 연결
    }

    fun initializeMainHomeEventlist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas) {
            add(MainHomeEventData("2021-01-01 ~ 2021-02-02", "봄맞이 플로깅 러닝 봄맞이 플로깅 러닝 봄맞이 플로깅 러닝 봄맞이 플로깅 러닝 봄맞이 플로깅 러닝 봄맞이 플로깅 러닝 봄맞이 플로깅 러닝 ", "방배동","종료"))
            add(MainHomeEventData("2021-05-17", "플로깅 축제", "공릉동","종료"))
            add(MainHomeEventData("2021-06-10 ~ 2021-06-17", "이벤트이벤트이벤트", "삼성동","진행중"))
            add(MainHomeEventData("2020-08-01 ~ 2021-9-01", "아이디어 플로깅", "공릉동","진행중"))
            add(MainHomeEventData("2020-09-21", "릴레이 플로깅", "하계동","진행중"))
            add(MainHomeEventData("2020-08-01 ~ 2021-9-01", "아이디어 플로깅", "공릉동","진행중"))
            add(MainHomeEventData("2020-09-21", "릴레이 플로깅", "하계동","진행중"))
            add(MainHomeEventData("2021-01-01 ~ 2021-02-02", "봄맞이 플로깅 러닝", "방배동","종료"))
            add(MainHomeEventData("2021-05-17", "플로깅 축제", "공릉동","종료"))
            add(MainHomeEventData("2021-06-10 ~ 2021-06-17", "이벤트이벤트이벤트", "삼성동","진행중"))
            add(MainHomeEventData("2020-08-01 ~ 2021-9-01", "아이디어 플로깅", "공릉동","진행중"))
            add(MainHomeEventData("2020-09-21", "릴레이 플로깅", "하계동","진행중"))
            add(MainHomeEventData("2020-08-01 ~ 2021-9-01", "아이디어 플로깅", "공릉동","진행중"))
            add(MainHomeEventData("2020-09-21", "릴레이 플로깅", "하계동","진행중"))

        }

    }
}