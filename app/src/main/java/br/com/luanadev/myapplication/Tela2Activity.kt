package br.com.luanadev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*
import org.parceler.Parcels

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        val nome = intent.getStringExtra("nome")
        val idade = intent.getStringExtra("idade")
        val cliente = Parcels.unwrap<Cliente?>(intent.getParcelableExtra("cliente"))
        val pessoa = intent.getParcelableExtra("pessoa")
        textMensagem.text = if (cliente != null) {
            getString(R.string.tela2_texto1, cliente.nome, cliente.codigo)
        } else if (pessoa != null) {
            getString(R.string.tela2_texto2, pessoa.nome, pessoa.idade)
        } else {
            getString(R.string.tela2_texto2, nome, idade)

        }
    }
}