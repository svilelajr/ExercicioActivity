package com.example.activity_02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    private fun findViews(){
        val btnActMain: Button = findViewById(R.id.btnActMain)
        val btnAct3: Button = findViewById(R.id.btnAct3)

        btnActMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btnAct3.setOnClickListener {
            val intent =  Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        findViews()
    }




    override fun onRestart() {
        super.onRestart()
        Log.d("Aula02","Entrou On Restart Activity 3")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Aula02","Entrou On Start Activity 3")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Aula02","Entrou On Resume Activity 3")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Aula02","Entrou On Pause Activity 3")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Aula02","Entrou On Stop Activity 3")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aula02","Entrou On Destroy Activity 3")
    }

}