package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Parking;
import com.example.demo.repo.ParkingRepo;

@Service("parkingService")
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	ParkingRepo parkingRepo;

	@Override
	public ResponseEntity<Object> addAllVehicles(Parking parking) {

		Parking parkingdb = new Parking();
		parkingdb.setVehicleNo(parking.getVehicleNo());
		parkingdb.setCustomerName(parking.getCustomerName());
		parkingdb.setParkingCode(parking.getParkingCode());

		parkingRepo.save(parkingdb);

		return new ResponseEntity<Object>(parking, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> getAllVehicles() {

		List<Parking> parking = (List<Parking>) parkingRepo.findAll();
		return new ResponseEntity<Object>(parking, HttpStatus.OK);

	}
	
	@Override
	public ResponseEntity<Object> addParkingHistory(Parking parking) {
		
		Parking parkingdb = new Parking();
		parkingdb.setCustomerName(parking.getCustomerName());
		parkingdb.setParkingCode(parking.getParkingCode());
		parkingdb.setVehicleNo(parking.getVehicleNo());
		
		parkingRepo.save(parkingdb);
		
		return new ResponseEntity<Object>(parkingdb, HttpStatus.OK);
	}
	

	@Override
	public ResponseEntity<Object> getParkingHistory() {

		List<Parking> parking = (List<Parking>) parkingRepo.findAll();
		return new ResponseEntity<Object>(parking, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Object> seeVehicleById(int vehicleNo) {
		 Parking parkingobj= parkingRepo.findById(vehicleNo);
		return  new ResponseEntity<Object>(parkingobj, HttpStatus.OK);
	}
}
