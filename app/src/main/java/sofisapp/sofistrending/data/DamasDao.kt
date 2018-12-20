package sofisapp.sofistrending.data

import android.arch.persistence.room.*

@Dao
interface DamasDao {
    /**
     * Retorna todos las tuplas de Todo en orden ascendente.
     */
    @Query("SELECT * FROM damas ORDER BY id ASC")
    fun getListDamas(): List<Damas>

    /**
     * Retorna una tupla desde la tabla todo
     * @param id el valor de la llave primaria a retornar.
     */
    @Query("SELECT * FROM damas WHERE id = :id")
    fun getItemDamas(id: Int): Damas

    /**
     * Inserta una nueva tupla en la tabla todo.
     * @param damas la tupla a insertar en la tabla.
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun saveDamas(damas: Damas)

    /**
     * Actualiza una tupla en la tabla todo.
     * @param damas el valor de la tupla a actualizar.
     */
    @Update
    fun updateDamas(damas: Damas)

    /**
     * Remueve una tupla de la tabla todo.
     * @param carrito el valor de la tupla a remover.
     */
    @Delete
    fun deleteDamas(damas: Damas)
}