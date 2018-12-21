package sofisapp.sofistrending.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
/**
 * Tabla categorias.
 */

@Entity(tableName = "Categorias")
class Categorias(
    @ColumnInfo(name = "nombre") var nombre: String = "",
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "categoria") var idcategoria: String = ""
)