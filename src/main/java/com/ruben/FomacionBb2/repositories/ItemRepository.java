package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.enums.ItemStateEnum;
import com.ruben.FomacionBb2.models.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel,Long> {




    public List<ItemModel> findByState(ItemStateEnum state);
    public List<ItemModel> findAll();



}
