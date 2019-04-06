package br.com.heiderlopes.placapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_placar.*

class PlacarActivity : AppCompatActivity() {

    private var timeCasa: String? = null
    private var timeVisitante: String? = null
    private var golCasa: Int = 0
    private var golVisitante: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placar)

        timeCasa = intent.getStringExtra("TIMECASA")
        timeVisitante = intent.getStringExtra("TIMEVISITANTE")

        tvTimeCasa.text = timeCasa
        tvTimeVisitante.text = timeVisitante


        if (savedInstanceState != null) {
            golCasa = savedInstanceState.getInt("GOLCASA")
            golVisitante = savedInstanceState.getInt("GOLVISITANTE")
        }
        tvPlacarCasa.text = golCasa.toString()
        tvPlacarVisitante.text = golVisitante.toString()
    }

    fun golCasa(v: View) {
        golCasa++
        tvPlacarCasa.text = golCasa.toString()
    }

    fun golVisitante(v: View) {
        golVisitante++
        tvPlacarVisitante.text = golVisitante.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("GOLCASA", golCasa)
        outState.putInt("GOLVISITANTE", golVisitante)
    }
}