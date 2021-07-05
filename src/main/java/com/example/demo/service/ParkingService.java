package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Parking;



public interface ParkingService {
	public ResponseEntity<Object> addAllVehicles(Parking parking);
	public ResponseEntity<Object> getAllVehicles(); 
	public ResponseEntity<Object> addParkingHistory(Parking parking);
	public ResponseEntity<Object> getParkingHistory();
	public ResponseEntity<Object>  seeVehicleById( int vehicleNo);
}
