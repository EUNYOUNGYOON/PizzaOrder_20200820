package kr.co.tjoeun.pizzaorder_20200820.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
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
        val logo = row.findViewById<ImageView>(R.id.logoUrlImg)
        val name = row.findViewById<TextView>(R.id.pizzaNameListTxt)

        name.text = data.pizzaName
        //4-9 logo 이미지를 하기 위해서는 Gilde를 implement하기
        Glide.with(mContext).load(data.logoUrl).into(logo)

        //4-10 이미지가 제대로 안나오면 권한을 줘야한다. Manifest
        //<uses-permission android:name="android.permission.INTERNET"/>
        //android:usesCleartextTraffic="true"

        //액티비티에 실제 목록을 담아둘 ArrayList를 만들자
        //여기서는 PizzaOrderFragment 프래그먼트화면으로 이동
        return row
    }
}