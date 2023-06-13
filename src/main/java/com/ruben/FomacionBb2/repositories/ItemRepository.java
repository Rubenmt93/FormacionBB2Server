package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel,Long> {
    // @Query( value = "SELECT * FROM usuario t where t.ID_USER=2", nativeQuery = true)
    // @Query("SELECT b FROM usuario b")
    // @Query( value = "SELECT * FROM usuario t where t.NAME= 'Maria'", nativeQuery = true)




    public List<ItemModel> findAllByOrderByStateAsc();
    public List<ItemModel> findAllByOrderByStateDesc();
}
