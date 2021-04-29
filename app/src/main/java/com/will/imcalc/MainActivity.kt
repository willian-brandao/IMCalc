package com.will.imcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w( "lifecycle", "entrei no create - estou criando tela")
        finish()
    }
    override fun onStart()
    {
        super.onStart()
        Log.w( "lifecycle", "entrei no Start- deixei a tela visivel")
    }

    override fun onResume()
    {
        super.onResume()
        Log.w( "lifecycle", "entrei no Resume- agora você pode interagir com a tela")
    }

    override fun onPause()
    {
        super.onPause()
        Log.w( "lifecycle", "Pause - a tela perdeu o foco")
    }
    override fun onStop()
    {
        super.onStop()
        Log.w( "lifecycle", "Stop - a tela não está mais visivel mas ainda existe")
    }

    override fun onDestroy()
    {
        super.onDestroy()
        Log.w( "lifecycle", "\nentrei no destroy - oh não! a tela foi destruida")
    }
    override fun onRestart()
    {
        super.onRestart()
        Log.w( "lifecycle", "\nentrei no Restart - a tela está retornando o foco")
    }
}