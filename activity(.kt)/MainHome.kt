package com.example.traplo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traplo.databinding.MainHomeBinding

class MainHome : AppCompatActivity() {
    val binding by lazy { MainHomeBinding.inflate(layoutInflater) }

    //adapter객체 먼저 선언해주기!
    private lateinit var adapter : MainHomePickAdapter
    private lateinit var adapter2 : MainHomeNatureAdapter
    private lateinit var adapter3 : MainHomeEventAdapter

    val mDatas = mutableListOf<MainHomePickData>()
    val mDatas2 = mutableListOf<MainHomeNatureData>()
    val mDatas3 = mutableListOf<MainHomeEventData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val window = window
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR


        // 우측상단 마이페이지
        binding.mainHomeUserPage.setOnClickListener{
            val intent = Intent(this, Wishlist::class.java)
            startActivity(intent)
        }

        // fab
        binding.fabPloggingStart.setOnClickListener{
            val intent = Intent(this, FabTest::class.java)
            startActivity(intent)

        }

        binding.mainHomeSearch.setOnClickListener{
            val intent = Intent(this, FabTest::class.java)
            startActivity(intent)
        }

        binding.btnEventMore.setOnClickListener{
            val intent = Intent(this, Event::class.java)
            startActivity(intent)
        }

        binding.btnNatureMore.setOnClickListener{
            val intent = Intent(this, Nature::class.java)
            startActivity(intent)
        }

        binding.eye.setOnClickListener{
            val intent = Intent(this, Eye::class.java)
            startActivity(intent)
        }

        // MainHome - Pick
        initializeMainHomePicklist()
        initMainHomePickRecyclerView()


        // MainHome - Nature
        initializeMainHomeNaturelist()
        initMainHomeNatureRecyclerView()

        // MainHome - Event
        initializeMainHomeEventlist()
        initMainHomeEventRecyclerView()


    }

    // MainHome - Pick
    fun initMainHomePickRecyclerView(){
        val adapter = MainHomePickAdapter() //어댑터 객체 만듦
        adapter.datalist=mDatas //데이터 넣어줌
        binding.recyclerViewPick.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.recyclerViewPick.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)//레이아웃 매니저 연결
    }

    fun initializeMainHomePicklist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas) {
            add(MainHomePickData(0, "같이 해요, 플로깅", "숲속 걷기", "마포구 와우산로", "상세 설명 상세 설명 상세 설명 상세 설명\n안녕하세요 플로깅 트라플로입니다!"))
        }

    }

    // MainHome - Nature
    fun initMainHomeNatureRecyclerView(){
        val adapter = MainHomeNatureAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas2 //데이터 넣어줌
        binding.recyclerViewNature.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.recyclerViewNature.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)//레이아웃 매니저 연결
    }

    fun initializeMainHomeNaturelist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas2) {
            add(MainHomeNatureData(0, "서울숲"))
            add(MainHomeNatureData(0, "한강공원"))
            add(MainHomeNatureData(0, "파주"))
            add(MainHomeNatureData(0, "해방촌"))
            add(MainHomeNatureData(0, "뚝섬"))
            add(MainHomeNatureData(0, "서울숲"))
            add(MainHomeNatureData(0, "한강공원"))
            add(MainHomeNatureData(0, "파주"))
            add(MainHomeNatureData(0, "해방촌"))
            add(MainHomeNatureData(0, "뚝섬"))

        }

    }

    // MainHome - Event
    fun initMainHomeEventRecyclerView(){
        val adapter = MainHomeEventAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas3 //데이터 넣어줌
        binding.recyclerViewEvent.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.recyclerViewEvent.layoutManager= LinearLayoutManager(this)//레이아웃 매니저 연결
    }

    fun initializeMainHomeEventlist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas3) {
            add(MainHomeEventData("2021-01-01 ~ 2021-02-02", "봄맞이 플로깅 러닝봄맞이 플로깅 러닝봄맞이 플로깅 러닝봄맞이 플로깅 러닝봄맞이 플로깅 러닝", "방배동","종료"))
            add(MainHomeEventData("2021-05-17", "플로깅 축제", "공릉동","종료"))
            add(MainHomeEventData("2021-06-10 ~ 2021-06-17", "이벤트이벤트이벤트", "삼성동","진행중"))
            add(MainHomeEventData("2020-08-01 ~ 2021-9-01", "아이디어 플로깅", "공릉동","진행중"))

        }

    }
}