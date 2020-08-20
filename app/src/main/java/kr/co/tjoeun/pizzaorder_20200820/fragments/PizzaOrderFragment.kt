package kr.co.tjoeun.pizzaorder_20200820.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.fragment_pizza_order.*
import kr.co.tjoeun.pizzaorder_20200820.PizzaDetailActivity
import kr.co.tjoeun.pizzaorder_20200820.R
import kr.co.tjoeun.pizzaorder_20200820.adapters.PizzaAdapter
import kr.co.tjoeun.pizzaorder_20200820.datas.Pizza

//2-1 Fragment
class PizzaOrderFragment : Fragment() {

    //4-6 실제로 뿌려줄 데이터들을 ArrayList변수에 추가해주자.
    // val mPizzaList = ArrayList<Pizza>()
    //val logoName: String, pizzaName: String, val phoneNum : String
    // 피자헛, 파파존스, 도미노 피자, 미스터 피자
    val mPizzaList = ArrayList<Pizza>()

    //4-8 lateinit var 생성
    lateinit var mPizzaAdapter: PizzaAdapter

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

        // 4-7 실제 데이터 목록을 add해주기
        mPizzaList.add(Pizza("https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg", "피자헛", "1588-5588"))
        mPizzaList.add(Pizza("http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800", "파파존스", "1577-8080"))
        mPizzaList.add(Pizza("https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200", "미스터피자", "1577-0077"))
        mPizzaList.add(Pizza("https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png", "도미노피자", "1577-3082"))

        // 4-8 이어서 하기
        // context를 직접 넣었는데 오류가 뜨는이유는 null일 수도 있는 가능성 때문이라 일단 강제적으로 !! 널이 아니다라는걸 표시
        // context 변수(Fragment들이 갖고 있는 변수-우리가 만든게 아니다)로 대입
        // context 변수는 Context? 타입 -> null일수도 있기 때문에 어댑터 대입 불가
        // 고로 !!를 이용해 NullPointException의 리스크를 감수하고 억지로 우겨서 대입
        mPizzaAdapter = PizzaAdapter(context!!, R.layout.pizza_list_item, mPizzaList)

        // 실제 list_item에 있는걸 adapter 연결
        pizzaListView.adapter = mPizzaAdapter

        //5. 그 다음 작업으로는 실제 List를 클릭했을 때 화면 이동 - PizzaDetailActivity
        pizzaListView.setOnItemClickListener { adapterView, view, position, l ->
            
            val clickedStore = mPizzaList[position]
            val myIntent = Intent(context, PizzaDetailActivity::class.java)
            startActivity(myIntent) //이건 화면이동만 설정

        }



    }

}