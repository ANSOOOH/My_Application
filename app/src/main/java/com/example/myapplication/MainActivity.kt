package com.example.myapplication

import android.app.SearchManager
import android.content.Intent
import android.content.Intent.createChooser
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("ITM", "onCreate() called!")

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

/*
        val tView: TextView = findViewById(R.id.textView)
        tView.text = "This code will change the string!"

        val tBtn: Button = findViewById(R.id.btnSay)
        tBtn.setOnClickListener{
            tView.visibility = View.INVISIBLE
        }
*/

        //위의 코드들을 ViewBinding으로 다시
        binding.btnSay.setOnClickListener {
            /*val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:023630168")*/
            /*val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("geo:0,0?q=seoul+national+university+of+science+and+technology")*/
            /*val intent = Intent(Intent.ACTION_WEB_SEARCH).apply {
                putExtra(SearchManager.QUERY,"seoultech ITM")*/
            /*val intent = Intent(Intent.ACTION_SEND).apply {
                type = "image/jpg"*/
            /*val intent = Intent(Intent.ACTION_VIEW)
            val chooser = Intent.createChooser(intent, "Show me the Picture!")
            startActivity(chooser)*/
            //startActivity(intent)
            //binding.textView.text = "I love Android!"
            val intent = Intent(this,SubActivity::class.java)
            startActivityForResult(intent,1000)
        }

        Log.d("ITM","onCreate() called!")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("ITM","requestCode:$requestCode resultCode:$resultCode")
        Log.d("ITM","${data?.getStringExtra("grade")}")
        Toast.makeText(this,data?.getStringExtra("grade"),Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        Log.d("ITM","onStart() called!")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ITM","onResume() called!")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ITM","onPause() called!")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ITM","onStop() called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ITM","onDestroy() called!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ITM","onRestart() called!")
    }
}