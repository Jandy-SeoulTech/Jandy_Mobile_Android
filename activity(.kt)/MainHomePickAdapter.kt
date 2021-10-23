package com.example.traplo

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.traplo.databinding.MainHomeEventItemBinding
import com.example.traplo.databinding.MainHomePickItemBinding

class MainHomePickAdapter : RecyclerView.Adapter<MainHomePickAdapter.MyViewHolder>() {

    var datalist = mutableListOf<MainHomePickData>()//리사이클러뷰에서 사용할 데이터 미리 정의 -> 나중에 MainActivity등에서 datalist에 실제 데이터 추가

    inner class MyViewHolder(private val binding: MainHomePickItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(mainHomePickData : MainHomePickData){
            // 이미지 넘기는 방법 찾으면 바꾸기 ㅠ
            binding.mainHomePickImg.setImageResource(R.drawable.sample1)

            binding.mainHomePickTitle.text = mainHomePickData.mainHomePickTitle.toString()
            binding.mainHomePickPlace.text = mainHomePickData.mainHomePickPlace.toString()
            binding.mainHomePickMap.text = mainHomePickData.mainHomePickMap.toString()
            binding.mainHomePickIntro.text = mainHomePickData.mainHomePickIntro.toString()

        }
    }


    //만들어진 뷰홀더 없을때 뷰홀더(레이아웃) 생성하는 함수
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding= MainHomePickItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = datalist.size

    //recyclerview가 viewholder를 가져와 데이터 연결할때 호출
    //적절한 데이터를 가져와서 그 데이터를 사용하여 뷰홀더의 레이아웃 채움
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datalist[position])

        // 아이템 클릭 이벤트
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView?.context, PlaceInfo::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }
    }


}