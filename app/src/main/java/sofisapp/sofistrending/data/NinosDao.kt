package sofisapp.sofistrending.data

import android.arch.persistence.room.*

@Dao
interface NinosDao {
    /**
     * Retorna todos las tuplas de Todo en orden ascendente.
     */
    @Query("SELECT * FROM ninos ORDER BY id ASC")
    fun getListNinos(): List<Ninos>

    /**
     * Retorna una tupla desde la tabla todo
     * @param id el valor de la llave primaria a retornar.
     */
    @Query("SELECT * FROM ninos WHERE id = :id")
    fun getItemNinos(id: Int): Ninos

    /**
     * Inserta una nueva tupla en la tabla todo.
     * @param ninos la tupla a insertar en la tabla.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveNinos(ninos: Ninos)

    /**
     * Actualiza una tupla en la tabla todo.
     * @param ninos el valor de la tupla a actualizar.
     */
    @Update
    fun updateNinos(ninos: Ninos)

    /**
     * Remueve una tupla de la tabla todo.
     * @param ninos el valor de la tupla a remover.
     */
    @Delete
    fun deleteNinos(ninos: Ninos)
}