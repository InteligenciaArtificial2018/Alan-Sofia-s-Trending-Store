package sofisapp.sofistrending.data

import android.arch.persistence.room.*

@Dao
interface CaballerosDao {
    /**
     * Retorna todos las tuplas de Todo en orden ascendente.
     */
    @Query("SELECT * FROM caballeros ORDER BY id ASC")
    fun getListCaballeros(): List<Caballeros>

    /**
     * Retorna una tupla desde la tabla todo
     * @param id el valor de la llave primaria a retornar.
     */
    @Query("SELECT * FROM caballeros WHERE id = :id")
    fun getItemCaballeros(id: Int): Caballeros

    /**
     * Inserta una nueva tupla en la tabla todo.
     * @param caballeros la tupla a insertar en la tabla.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveCaballeros(caballeros: Caballeros)

    /**
     * Actualiza una tupla en la tabla todo.
     * @param caballeros el valor de la tupla a actualizar.
     */
    @Update
    fun updateCaballeros(caballeros: Caballeros)

    /**
     * Remueve una tupla de la tabla todo.
     * @param caballeros el valor de la tupla a remover.
     */
    @Delete
    fun deleteCaballeros(caballeros: Caballeros)
}