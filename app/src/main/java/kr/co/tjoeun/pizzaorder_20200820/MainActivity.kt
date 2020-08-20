package kr.co.tjoeun.pizzaorder_20200820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 1. BaseActivity.kt 생성 및 override 만들기
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    override fun setupEvents() {
    }

    override fun setValues() {
    }

}