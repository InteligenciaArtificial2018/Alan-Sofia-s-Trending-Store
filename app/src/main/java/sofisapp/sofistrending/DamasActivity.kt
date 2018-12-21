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

class DamasActivity:AppCompatActivity() {
    var Datos = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_damas)

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

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/damas%2Fdamas1.jpg?alt=media&token=63f4d0a7-5dcb-46c4-9355-a5c18941fccd").into(im1)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/damas%2Fdamas2.jpg?alt=media&token=9a374edc-ed38-4c2d-b858-7b0b01f13cc3").into(im2)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/damas%2Fdamas3.jpg?alt=media&token=d89a1cb5-6ccf-42f1-bbd9-ab0991acb647").into(im3)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/damas%2Fdamas4.jpg?alt=media&token=5d8383bc-4cda-43d6-9c93-4f31ba7c8a9c").into(im4)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/damas%2Fdamas5.jpg?alt=media&token=9aece05d-a181-4956-aece-d00c32237d2a").into(im5)

        t1.setText("Dolce & Gabanna  450.00 Lps")
        t2.setText("Gucci  890.00 Lps")
        t3.setText("Praga  670.00 Lps")
        t4.setText("Morgan  800.00 Lps")
        t5.setText("Kardashian's  900.00 Lps")

        b1.setOnClickListener {
            val intent = Intent(this, DamasCarrito::class.java)
            startActivity(intent)
            Datos.add(t1.toString())
        }
        b2.setOnClickListener {
            val intent = Intent(this, DamasCarrito::class.java)
            startActivity(intent)
            Datos.add(t2.toString())
        }
        b3.setOnClickListener {
            val intent = Intent(this, DamasCarrito::class.java)
            startActivity(intent)
            Datos.add(t3.toString())
        }
        b4.setOnClickListener {
            val intent = Intent(this, DamasCarrito::class.java)
            startActivity(intent)
            Datos.add(t4.toString())
        }
        b5.setOnClickListener {
            val intent = Intent(this, DamasCarrito::class.java)
            startActivity(intent)
            Datos.add(t5.toString())
        }
    }
}
