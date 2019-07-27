package com.globomatics.bike.services;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositorty.BikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    private BikeRepo bikeRepo;


    @Override
    public List<Bike> getAllBIkes() {
        return bikeRepo.findAll();
    }
}
