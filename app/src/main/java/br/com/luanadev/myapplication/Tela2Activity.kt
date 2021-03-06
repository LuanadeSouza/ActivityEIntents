package br.com.luanadev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val nome = intent.getStringExtra("nome")
        val idade = intent.getStringExtra("idade")
        textMensagem.text = "Nome: $nome / Idade: $idade"
    }
}