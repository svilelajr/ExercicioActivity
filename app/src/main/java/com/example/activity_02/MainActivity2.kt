package com.example.activity_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button


class MainActivity2 : AppCompatActivity() {

    private fun findViews(){
        val btnActMain: Button = findViewById(R.id.btnActMain)
        val btnAct3: Button = findViewById(R.id.btnAct3)


        btnActMain.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }

        btnAct3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViews()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Aula02","Entrou On Restart Activity 2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Aula02","Entrou On Start Activity 2")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Aula02","Entrou On Resume Activity 2")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Aula02","Entrou On Pause Activity 2")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Aula02","Entrou On Stop Activity 2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aula02","Entrou On Destroy Activity 2")
    }
}