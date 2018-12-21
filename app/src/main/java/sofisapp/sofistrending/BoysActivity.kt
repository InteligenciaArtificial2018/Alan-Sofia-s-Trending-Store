package sofisapp.sofistrending

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso

class BoysActivity:AppCompatActivity() {

    var Datos = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninos)

        val bdd = FirebaseStorage.getInstance()

        val im1 = findViewById<ImageView>(R.id.imageview1)
        val im2 = findViewById<ImageView>(R.id.imgDetalle2)
        val im3 = findViewById<ImageView>(R.id.imgDetalle3)
        val im4 = findViewById<ImageView>(R.id.imgDetalle4)
        val im5 = findViewById<ImageView>(R.id.imgDetalle5)
        val t1 = findViewById<TextView>(R.id.tvTitulo)
        val t2 = findViewById<TextView>(R.id.tvTitulo2)
        val t3 = findViewById<TextView>(R.id.tvTitulo3)
        val t4 = findViewById<TextView>(R.id.tvTitulo4)
        val t5 = findViewById<TextView>(R.id.tvTitulo5)
        val b1 = findViewById<Button>(R.id.btnCarrito1)
        val b2 = findViewById<Button>(R.id.btnCarrito2)
        val b3 = findViewById<Button>(R.id.btnCarrito3)
        val b4 = findViewById<Button>(R.id.btnCarrito4)
        val b5 = findViewById<Button>(R.id.btnCarrito5)

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/ni%C3%B1os%2Fboy1.jpg?alt=media&token=46cdf257-095a-49eb-8ca8-4d627bf5ae17").into(im1)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/ni%C3%B1os%2Fboy2.png?alt=media&token=086e7922-92ec-4037-ae0b-369361c99ccf").into(im2)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/ni%C3%B1os%2Fboy3.png?alt=media&token=c40eba6b-c365-4bed-9c88-1726c0c123f2").into(im3)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/ni%C3%B1os%2Fboy4.jpg?alt=media&token=8e10539f-0013-44c0-9312-47fef5ed375a").into(im4)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/ni%C3%B1os%2Fboy5.jpg?alt=media&token=95ff6168-6133-4999-aca9-c852fbc78091").into(im5)

        t1.setText("Fisher Price  1200.00 Lps")
        t2.setText("Carter's  500.00 Lps")
        t3.setText("Bebe Crece  900.00 Lps")
        t4.setText("Johnson Babies 700.00 Lps")
        t5.setText("Bad Bunnies  650.00.00 lPS")

        b1.setOnClickListener {
            val intent = Intent(this, Carritoboy::class.java)
            startActivity(intent)
            Datos.add(t1.toString())
        }
        b2.setOnClickListener {
            val intent = Intent(this, Carritoboy::class.java)
            startActivity(intent)
            Datos.add(t2.toString())
        }
        b3.setOnClickListener {
            val intent = Intent(this, Carritoboy::class.java)
            startActivity(intent)
            Datos.add(t3.toString())
        }
        b4.setOnClickListener {
            val intent = Intent(this, Carritoboy::class.java)
            startActivity(intent)
            Datos.add(t4.toString())
        }
        b5.setOnClickListener {
            val intent = Intent(this, Carritoboy::class.java)
            startActivity(intent)
            Datos.add(t5.toString())
        }
    }
}

