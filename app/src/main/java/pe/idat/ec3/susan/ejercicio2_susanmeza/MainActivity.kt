package pe.idat.ec3.susan.ejercicio2_susanmeza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import pe.idat.ec3.susan.ejercicio2_susanmeza.databinding.ActivityInicioBinding
import pe.idat.ec3.susan.ejercicio2_susanmeza.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)



        startTimer()
    }

    fun startTimer(){
        object: CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                val intent = Intent(applicationContext, InicioActivity::class.java).apply {}
                startActivity(intent)
            }
        }.start()
    }

}