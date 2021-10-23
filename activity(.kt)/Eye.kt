package com.example.traplo

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traplo.databinding.EyeBinding

class Eye : AppCompatActivity() {
    val binding by lazy { EyeBinding.inflate(layoutInflater) }

    //adapter객체 먼저 선언해주기!
    private lateinit var adapter:EyeAdapter

    val mDatas = mutableListOf<NatureData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val window = window
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        initializeEyelist()
        initEyeRecyclerView()
    }

    // MainHome - Event
    fun initEyeRecyclerView(){
        val adapter = EyeAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas //데이터 넣어줌
        binding.recyclerViewEye.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.recyclerViewEye.layoutManager= LinearLayoutManager(this)//레이아웃 매니저 연결
    }

    fun initializeEyelist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas) {
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))
            add(NatureData(0, "노들섬", "04437 서울특별시 용산구", "노을 맛집 노들섬에서 친구들과 어쩌구", 208))

        }

    }

}