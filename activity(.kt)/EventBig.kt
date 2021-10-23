package com.example.traplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.traplo.databinding.EventBigBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class EventBig : AppCompatActivity() {
    val binding by lazy { EventBigBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // FragmentStateAdapter 생성
        val eventBigFragAdapter = EventBigFragAdapter(this)

        // ViewPager2의 adapter 설정
        binding.viewPager.adapter = eventBigFragAdapter

        // ###### TabLayout과 ViewPager2를 연결
        // 1. 탭메뉴의 이름을 리스트로 생성해둔다.
        val tabTitles = listOf<String>("행사 소개", "행사 장소", "홈페이지")

        // 2. TabLayout과 ViewPager2를 연결하고, TabItem의 메뉴명을 설정한다.
        TabLayoutMediator(binding.tab, binding.viewPager, {tab, position -> tab.text = tabTitles[position]}).attach()

    }

}