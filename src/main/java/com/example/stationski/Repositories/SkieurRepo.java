package com.example.stationski.Repositories;

import com.example.stationski.Entity.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieurRepo extends CrudRepository <skieur, Long> {
    //key word AndInscriptionsCoursTypeCours
    //keyword JPA
    List<skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbon);
    List<skieur>findByAbonnementTypeAbonAndPistesCouleurAndInscriptionsCoursSupportAndInscriptionsCoursTypeCours(TypeAbonnement abonnement_typeAbon, Couleur pistes_couleur, Support inscriptions_cours_support, TypeCours inscriptions_cours_typeCours);

 @Query( value =
         "SELECT *" +
         "FROM skieur s\n" +
         "JOIN inscription i ON s.num_skieur=i.skieurs_num_skieur \n" +
         "JOIN moniteur_cours mc ON i.cours_num_cours=mc.cours_num_cours\n" +
         "JOIN moniteur m on m.num_moniteur=mc.moniteur_num_moniteur\n" +
         "WHERE m.nomm= :nomM" , nativeQuery = true)

/*
 @Query("SELECT i.skieur" +
 "JOIN Inscription i" +
 "JOIN Moniteur m on i.cour member m.cours "
+
         "WHERE m.nomM = : nameMon" )

 */

 List<skieur> GetSkieurByMoniteurNameJpql( @Param("nomM") String nomM);


}
