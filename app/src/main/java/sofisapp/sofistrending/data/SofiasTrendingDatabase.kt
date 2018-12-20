package sofisapp.sofistrending.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [Carrito::class, Damas::class, Caballeros::class, Ninos::class], version = 2, exportSchema = false)
abstract class SofiasTrendingDatabase: RoomDatabase() {
    /**
     * Este es un método abstracto que retorna el DAO para la base de datos.
     */
    abstract fun getCarritoDao(): CarritoDao
    abstract fun getDamasDao(): DamasDao
    abstract fun getNinosDao(): NinosDao
    abstract fun getCaballerosDao(): CaballerosDao

    /**
     * Un patrón de diseño Singleton es utilizado para asegurarnos que
     * solamente se cree una instancia de la base de datos.
     */
    companion object {
        val databaseName = "sofiastrending_db"
        var sofiasTrendingDatabase: SofiasTrendingDatabase? = null

        fun getInstance(context: Context): SofiasTrendingDatabase? {
            if (sofiasTrendingDatabase == null) {
                sofiasTrendingDatabase = Room.databaseBuilder(context,
                    SofiasTrendingDatabase::class.java,
                    SofiasTrendingDatabase.databaseName)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return sofiasTrendingDatabase
        }
    }
}