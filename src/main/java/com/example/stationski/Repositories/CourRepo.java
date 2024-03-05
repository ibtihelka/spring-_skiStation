package com.example.stationski.Repositories;

import com.example.stationski.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourRepo extends JpaRepository<Cours, Long> {


    @Query(value = "SELECT *" +

    "FROM cours c " +
            "JOIN moniteur_cours mc ON c.num_cours=mc.cours_num_cours" +
            "JOIN moniteur m on m.num_moniteur=mc.moniteur_num_moniteur" +
   " WHERE m.nomm =:nomM" , nativeQuery = true)
    List<Cours>GetCoursByMoniteurSql(@Param("nomM")String nomM);//recuperer cours selon nom moniteur
    @Query(value = "SELECT c" +

            "FROM cours c " +
            "JOIN Moniteur m ON c member m.cours" +
            " WHERE m.nomm =:nomM" , nativeQuery = true)

    List<Cours>GetCoursByMoniteurJPql(@Param("nomM")String nomM);//recuperer cours selon nom moniteur adapter avec tous les types de de base
}                                                               //
