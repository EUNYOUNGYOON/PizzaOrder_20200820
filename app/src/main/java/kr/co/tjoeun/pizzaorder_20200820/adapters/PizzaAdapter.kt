package kr.co.tjoeun.pizzaorder_20200820.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.pizzaorder_20200820.R
import kr.co.tjoeun.pizzaorder_20200820.datas.Pizza

//4-4 피자 ListView랑 사용할 Adapter클래스 생성
class PizzaAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<Pizza>
) : ArrayAdapter<Pizza>(mContext,resId,mList) {

    // 4-5 객체로 변환해주는 (화면에 뿌리도록 도와주는) 변수를 멤버변수로 생성
    val inf = LayoutInflater.from(mContext)

    // getView오버라이딩 : 우리가 원하는대로 갈아엎기 위해
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null)
        {
            tempRow = inf.inflate(R.layout.pizza_list_item, null)
        }

        // tempRow는 맞는데 절대 null은 아니다 (=!!)
        val row = tempRow!!

        val data = mList[position]
        val logoNameTxt = row.findViewById<TextView>(R.id.logoNameImgView)
        val pizzaNameTxt = row.findViewById<TextView>(R.id.pizzaNameTxt)
        return row
    }



}