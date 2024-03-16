package sv.edu.ufg.fis.amb.navarretesibrian_actionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.title= "Navarrete Sibrian"//siempre agregar ? porque tiene que tener un valor
        supportActionBar?.subtitle= "Universidad Francisco Gavidia"
        supportActionBar?.setIcon(R.drawable.ic_launcher_foreground)



    }

    override fun onSupportNavigateUp(): Boolean{
        finish()
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater .inflate(R.menu.ufg_toolbar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId)
        {
            R.id.configuracion -> {
                Toast.makeText(this,"usted ha seleccionado la opcion de configuracion", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.perfil -> {
                Toast.makeText(this,"usted ha seleccionado la opcion para ver su perfil", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.mapa -> {
                Toast.makeText(this,"usted ha seleccionado la opcion para enviar su ubicacion",
                    Toast.LENGTH_SHORT).show()
                true
            }

            R.id.nueva_cuenta -> {
                Toast.makeText(this,"usted ha seleccionado la opcion para agregar una nueva cuenta",
                    Toast.LENGTH_SHORT).show()
                true
            }

            R.id.salir -> {
                Toast.makeText(this,"usted ha seleccionado la opcion para salir de la app", Toast.LENGTH_SHORT).show()
                true
            }


            else -> false
        }


    }

}