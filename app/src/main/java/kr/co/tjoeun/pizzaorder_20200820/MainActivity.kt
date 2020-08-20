package kr.co.tjoeun.pizzaorder_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzaorder_20200820.adapters.MainViewPagerAdapter
import kr.co.tjoeun.pizzaorder_20200820.datas.Pizza

// 1. BaseActivity.kt 생성 및 override 만들기
class MainActivity : BaseActivity() {

    //3-5 어댑터 연결
    lateinit var mMainPagerAdapter: MainViewPagerAdapter
    val mPizzaList = ArrayList<Pizza>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {
    }

    override fun setValues() {

        //3-6 연결한 어댑터가 어떤걸 쓰는지 연결
        mMainPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        // mainViewPager와 어댑터를 연결해줘야한다.
        mainViewPager.adapter = mMainPagerAdapter
        tabLayout.setupWithViewPager(mainViewPager)

        //4-4 실제로 뿌려줄 데이터들을 ArrayList변수에 추가해주자.
        // val mPizzaList = ArrayList<Pizza>()
        //val logoName: String, pizzaName: String, val phoneNum : String

    }

}