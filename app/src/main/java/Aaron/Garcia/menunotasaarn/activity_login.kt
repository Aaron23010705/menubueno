package Aaron.Garcia.menunotasaarn

import Aaron.Garcia.menunotasaarn.ui.home.HomeFragment
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Mandar a llamar a todos los elementos
        val btnRegistrarme = findViewById<Button>(R.id.btnRegistrarse)

        //Programo el botòn

        btnRegistrarme.setOnClickListener {

            val pantallaRegistrarse = Intent(this, activity_registrarse::class.java)
            startActivity(pantallaRegistrarse)


            //Navegas entre pantallas
            //Voy a ir a la pantalla de Registro


            }
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        btnIngresar.setOnClickListener {

            val pantallaPrincipal = Intent(this, MainActivity::class.java)
            startActivity(pantallaPrincipal)
        }
    }
}
