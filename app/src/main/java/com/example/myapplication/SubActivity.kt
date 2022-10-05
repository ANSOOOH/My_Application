package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("ITM","SubActivity created!")
        binding.button.setOnClickListener {
            intent.putExtra("grade","${binding.txtReply.text}")
            setResult(RESULT_OK,intent)
            finish()
        }
        //setContentView(R.layout.activity_sub)
    }
}