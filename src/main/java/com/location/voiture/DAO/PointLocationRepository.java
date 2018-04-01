package com.location.voiture.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.location.voiture.Entities.PointLocation;

public interface PointLocationRepository extends JpaRepository<PointLocation,Integer>{

}
