package com.globomatics.bike.repositorty;

import com.globomatics.bike.models.Bike;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BikeRepo extends CrudRepository<Bike, Long> {

   public List<Bike> findAll();
}
