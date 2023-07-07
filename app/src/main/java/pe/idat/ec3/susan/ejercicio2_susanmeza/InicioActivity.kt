package pe.idat.ec3.susan.ejercicio2_susanmeza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pe.idat.ec3.susan.ejercicio2_susanmeza.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btninicio.setOnClickListener {
            Toast.makeText(this,"Bievenida a tu Boutique", Toast.LENGTH_SHORT).show()
        }

    }
}