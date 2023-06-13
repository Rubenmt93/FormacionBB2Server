package com.ruben.FomacionBb2.repositories;

import com.ruben.FomacionBb2.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

   // @Query( value = "SELECT * FROM usuario t where t.ID_USER=2", nativeQuery = true)
   // @Query("SELECT b FROM usuario b")
  // @Query( value = "SELECT * FROM usuario t where t.NAME= 'Maria'", nativeQuery = true)

  //http://localhost:8080/h2-console
  // public ArrayList<UserModel> findPersonal();
}
