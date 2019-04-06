package br.com.heiderlopes.placapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comecarJogo(v: View) {

        if (etTimeCasa.text.toString().isEmpty()) {
            Toast.makeText(
                this, "Informe o time da casa",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        if (etTimeVisitante.text.toString().isEmpty()) {
            Toast.makeText(
                this, "Informe o time visitante",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        val proximaTela = Intent(this, PlacarActivity::class.java)
        proximaTela.putExtra(
            "TIMEVISITANTE",
            etTimeVisitante!!.text.toString()
        )
        proximaTela.putExtra(
            "TIMECASA",
            etTimeCasa!!.text.toString()
        )
        startActivity(proximaTela)


    }
}
