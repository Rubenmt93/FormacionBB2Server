package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.models.SupplierModel;
import com.ruben.FomacionBb2.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface SupplierRepository extends JpaRepository<SupplierModel,Long> {
}
