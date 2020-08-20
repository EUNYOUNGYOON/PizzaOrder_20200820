package kr.co.tjoeun.pizzaorder_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_pizza_detail.*
import kotlinx.android.synthetic.main.pizza_list_item.*
import kr.co.tjoeun.pizzaorder_20200820.datas.Pizza

class PizzaDetailActivity : BaseActivity() {

    lateinit var mStore : Pizza

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_detail)

        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        //5. 그 다음 작업으로는 실제 List를 클릭했을 때 화면 이동
        // 앞 내용을 하기 전에 Serializable부터 설정하기 - Pizza 클래스로 이동
        mStore = intent.getSerializableExtra("pizzaInfo") as Pizza

        pizzaNameTxt.text = mStore.pizzaName
        pizzaPhoneNumTxt.text = mStore.phoneNum

        Glide.with(mContext).load(mStore.logoUrl).into(logoUrlImg)

    }

}