package sofisapp.sofistrending.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "caballeros")
class Caballeros(
    @ColumnInfo(name = "nombre") var nombre: String = "",
    @ColumnInfo(name = "precio")   var precio: Double = 0.0)
{
    @PrimaryKey(autoGenerate = true)   var id: Int = 0
}