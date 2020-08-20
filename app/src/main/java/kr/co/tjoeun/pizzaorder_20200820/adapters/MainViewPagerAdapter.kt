package kr.co.tjoeun.pizzaorder_20200820.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.pizzaorder_20200820.fragments.MyPageFragment
import kr.co.tjoeun.pizzaorder_20200820.fragments.PizzaOrderFragment

//3-1. MainPager설정하기
class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    //3-4. 프래그먼트들마다 타이틀 부여
    // 그 다음은 MainActivity에서 Adapter연결
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자 주문"
            else -> "내 정보 설정"

        }
    }

    //3-2. getItem과 getCount는 빨간줄 떠서 오버라이딩 자동 생성
    override fun getItem(position: Int): Fragment {

        //3-3. 각각 만들었던 프래그먼트들을 연결한다.
        return when(position) {
            0 -> PizzaOrderFragment()
            else -> MyPageFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }

}