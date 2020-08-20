package kr.co.tjoeun.pizzaorder_20200820.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.tjoeun.pizzaorder_20200820.R

//2-1 Fragment
class PizzaOrderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pizza_order, container, false)
    }

    //onActivityCreated override하기
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // 리스트뷰에서 피자 가게 뿌려주기
    }

}