package com.example.traplo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.traplo.databinding.PlaceInfoReviewItemBinding

class PlaceInfoReviewAdapter : RecyclerView.Adapter<PlaceInfoReviewAdapter.MyViewHolder>() {

    var datalist = mutableListOf<PlaceInfoReviewData>()//리사이클러뷰에서 사용할 데이터 미리 정의 -> 나중에 MainActivity등에서 datalist에 실제 데이터 추가

    inner class MyViewHolder(private val binding: PlaceInfoReviewItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(placeInfoReviewData : PlaceInfoReviewData){
            // 이미지 넘기는 방법 찾으면 바꾸기 ㅠ
            binding.placeInfoReviewImg.setImageResource(R.drawable.sample1)
            binding.placeInfoReviewMapImg.setImageResource(R.drawable.icon_back_app)
            // ratingBar이 val라고 못바꾼다는데 그럼 난 어떡해..?
            // binding.placeInfoReviewRating = placeInfoReviewData.placeInfoReviewRating
            binding.placeInfoReviewName.text = placeInfoReviewData.placeInfoReviewName.toString()
            binding.placeInfoReviewDate.text = placeInfoReviewData.placeInfoReviewDate.toString()
            binding.placeInfoReviewContent.text = placeInfoReviewData.placeInfoReviewContent.toString()
            binding.placeInfoReviewAddress.text = placeInfoReviewData.placeInfoReviewAddress.toString()


        }
    }


    //만들어진 뷰홀더 없을때 뷰홀더(레이아웃) 생성하는 함수
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding= PlaceInfoReviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = datalist.size

    //recyclerview가 viewholder를 가져와 데이터 연결할때 호출
    //적절한 데이터를 가져와서 그 데이터를 사용하여 뷰홀더의 레이아웃 채움
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datalist[position])
    }


}