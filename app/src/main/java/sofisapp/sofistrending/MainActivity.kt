package sofisapp.sofistrending

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import sofisapp.sofistrending.data.Carrito
import sofisapp.sofistrending.data.Damas
import sofisapp.sofistrending.data.SofiasTrendingDatabase

class MainActivity : AppCompatActivity() {
    private var sofiDatabase: SofiasTrendingDatabase? = null
    private var damasList: List<Damas>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvMenu.setOnClickListener {
            val intent = Intent (this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
