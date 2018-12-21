package sofisapp.sofistrending

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.storage.FirebaseStorage
import com.squareup.picasso.Picasso
import sofisapp.sofistrending.data.SofiasTrendingDatabase

class Caballeros : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caballeros)


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

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/caballeros%2Fcaballeros1.jpg?alt=media&token=ab099489-3c28-4951-9437-d536e979f036").into(im1)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/caballeros%2Fcaballeros2.jpg?alt=media&token=62286a9b-30df-494b-ad68-e1e568e7c930").into(im2)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/caballeros%2Fcaballeros3.jpg?alt=media&token=53457497-be91-4ce9-9ab7-882f94da3541").into(im3)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/caballeros%2Fcaballeros4.jpg?alt=media&token=8db513f1-63f0-4aa7-b3dd-dac2011e573b").into(im4)
        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/sofistrending.appspot.com/o/caballeros%2Fcaballeros5.jpg?alt=media&token=197788a2-49bf-42ec-91dd-5555e110f099").into(im5)

        t1.setText("Tommy")
        t2.setText("Colummbia")
        t3.setText("Calvin Klein")
        t4.setText("Polo")
        t5.setText("Pull & Bear")


        b1.setOnClickListener {
            val intent = Intent(this, CarritoCaballeros::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener {
            val intent = Intent(this, CarritoCaballeros::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener {
            val intent = Intent(this, CarritoCaballeros::class.java)
            startActivity(intent)
        }
        b4.setOnClickListener {
            val intent = Intent(this, CarritoCaballeros::class.java)
            startActivity(intent)
        }
        b5.setOnClickListener {
            val intent = Intent(this, CarritoCaballeros::class.java)
            startActivity(intent)
        }

    }
}


