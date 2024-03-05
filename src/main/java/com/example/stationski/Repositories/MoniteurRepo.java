package com.example.stationski.Repositories;

import com.example.stationski.Entity.Moniteur;
//import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;

public interface MoniteurRepo extends CrudRepository<Moniteur,Long> {
}
