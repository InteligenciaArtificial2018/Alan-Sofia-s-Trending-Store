package sofisapp.sofistrending.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
/**
 * Tabla carrito.
 */
@Entity(tableName = "carrito")
class Carrito(
    @ColumnInfo(name = "nombre") var nombre: String = "",
    @ColumnInfo(name = "precio")   var precio: Double = 0.0)
{
    @PrimaryKey(autoGenerate = true)   var id: Int = 0
}