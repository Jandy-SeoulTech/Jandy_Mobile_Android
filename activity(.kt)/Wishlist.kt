package com.example.traplo

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.traplo.databinding.WishlistBinding

class Wishlist : AppCompatActivity() {
    val binding by lazy { WishlistBinding.inflate(layoutInflater) }

    //adapter객체 먼저 선언해주기!
    private lateinit var adapter: WishlistAdapter

    val mDatas = mutableListOf<WishlistData>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val window = window
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        initializeWishlistlist()
        initWishlistRecyclerView()
    }

    // MainHome - Event
    fun initWishlistRecyclerView(){
        val adapter = WishlistAdapter() //어댑터 객체 만듦
        adapter.datalist = mDatas //데이터 넣어줌
        binding.recyclerViewWishlist.adapter = adapter //리사이클러뷰에 어댑터 연결
        binding.recyclerViewWishlist.layoutManager= LinearLayoutManager(this)//레이아웃 매니저 연결
    }

    fun initializeWishlistlist() { //임의로 데이터 넣어서 만들어봄
        with(mDatas) {
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))
            add(WishlistData(0, "삼성미술관리움", "이색거리", 2, "수준 높은 소장품 전시 및..."))

        }

    }

}