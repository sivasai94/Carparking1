package com.example.demo.repo;

 import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Parking;

public interface ParkingRepo extends CrudRepository<Parking, Integer> {

	@Query("select npt from Parking npt where npt.id= :vehicleNo")
	Parking findById(@Param("vehicleNo") int vehicleNo);
	
}
