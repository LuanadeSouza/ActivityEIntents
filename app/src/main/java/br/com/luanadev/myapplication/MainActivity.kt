package br.com.luanadev.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonToast.setOnClickListener {
            val texto = editTexto.text.toString()
            Toast.makeText(this, "Texto", Toast.LENGTH_SHORT).show()
        }
        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent
            )
        }
    }
}