package sofisapp.sofistrending

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent


import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_carrito.*
import kotlinx.android.synthetic.main.activity_main.*
import sofisapp.sofistrending.data.SofiasTrendingDatabase
import sofisapp.sofistrending.data.Carrito


abstract class Agregarcarrito : AppCompatActivity(), CarritoAdapter.OnItemCarritoClickListener {
    private var carritoDatabase: SofiasTrendingDatabase? = null
    private var carritoAdapter: CarritoAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.template_item_carrito)


        carritoDatabase = SofiasTrendingDatabase.getInstance(this)
        carritoAdapter = CarritoAdapter(carritoDatabase?.getCarritoDao()?.getListCarrito())
        carritoAdapter?.setItemCarritoClickListener(this)

    }

    override fun onResume() {
        super.onResume()
        carritoAdapter?.listaCarrito = carritoDatabase?.getCarritoDao()?.getListCarrito()
        RvCarrito.adapter = carritoAdapter
        RvCarrito.layoutManager = LinearLayoutManager(this)
        RvCarrito.hasFixedSize()
    }

    override fun onItemCarritoLongClickListener(carrito: Carrito) {
        // Inicializar una nueva instancia de AlertDialog
        val builder = AlertDialog.Builder(this)

        // Colocar el titulo del dialogo
        builder.setTitle(R.string.tituloDialogoLongClick)

        // Mensaje a desplegar en el dialogo
        builder.setMessage(R.string.mensajeDialogoLongClick)

        // Los dialogos pueden tener hasta 3 botones, uno positivo (SI), uno negativo (NO)
        // y un boton neutro (CANCEL) los cuales utilizaremos para Modificar, Eliminar y Cancelar

        builder.setNegativeButton(R.string.eliminar) {dialog, which ->
            carritoDatabase?.getCarritoDao()?.deleteCarrito(carrito)
            onResume()
            Toast.makeText(this, R.string.mensajetareaEliminada, Toast.LENGTH_SHORT).show()
        }

        builder.setNeutralButton(R.string.cancelar) {dialog, which ->
            Toast.makeText(this,R.string.mensajeCancelarDialogoLongClick, Toast.LENGTH_SHORT).show()
        }

        // Crear el dialogo de alerta con todos los parámetros establecidos
        val dialogo: AlertDialog = builder.create()

        // Mostrar el dialogo
        dialogo.show()

    }

}
