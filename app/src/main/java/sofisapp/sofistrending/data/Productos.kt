package sofisapp.sofistrending.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
/**
 * Tabla de productos donde se implementan las foreing Keys.
 */

@Entity(tableName = "Productos",
        foreignKeys = arrayOf(
            ForeignKey(entity = Categorias::class,
                parentColumns = arrayOf("idcategoria"),
                childColumns = arrayOf("categoria"))
        ))
class Productos(
    @ColumnInfo(name = "nombre") var nombre: String = "",
    @ColumnInfo(name = "precio")   var precio: Double = 0.0,
    @ColumnInfo(name = "idcategoria") var idcategoria: String = "",
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "idproducto") var idproducto: String = ""
)


