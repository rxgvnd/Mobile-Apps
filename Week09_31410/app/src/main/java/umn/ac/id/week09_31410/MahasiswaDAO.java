package umn.ac.id.week09_31410;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MahasiswaDAO {
    @Query("SELECR * FROM tblMahasiswa")
    LiveData<List<Mahasiswa>> getAllMahasiswa();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Mahasiswa msh);

    @Delete
    void delete(Mahasiswa mhs);

    @Update
    void update(Mahasiswa mhs);

    @Query("DELETE FROM tblMahasiswa")
    void deleteAll();
}
