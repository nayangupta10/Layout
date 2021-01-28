package com.nayan.layouttypa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.constraint_btn).setOnClickListener(this)
        findViewById<Button>(R.id.relative_btn).setOnClickListener(this)
        findViewById<Button>(R.id.linear_btn).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.constraint_btn -> {
                startActivity(Intent(this,ConstraintLayoutActivity::class.java))
            }
            R.id.relative_btn->{
                startActivity(Intent(this,RelativeLayoutActivity::class.java))
            }
            R.id.linear_btn->{
                startActivity(Intent(this,LinearLayoutActivity::class.java))
            }
        }
    }
}