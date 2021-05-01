package com.will.imcalc

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.main_relative.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_relative)
        setListeners()

    }

    private fun setListeners() {
        //show object like a cloud on keyboard with numbers that's are typing
       pesoEDT?.doAfterTextChanged { text ->
           // Toast.makeText( this, text.toString(), Toast.LENGTH_SHORT ).show()
        }
        alturaEDT?.doOnTextChanged { text, _, _, _ ->
          // titleTXT?.text = text
        }
        calculaBTN?.setOnClickListener {
            calculaIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
        }
    }

    private fun calculaIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        if(peso != null && altura != null){
            val imc = peso /(altura * altura)
            resutlTXT.text= "Your IMC: %.2f".format(imc)
        }
    }
}