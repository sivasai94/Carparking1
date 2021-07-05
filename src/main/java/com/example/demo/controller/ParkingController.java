package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Parking;
import com.example.demo.service.ParkingService;
import com.example.exception.ParkingException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.annotations.ApiOperation;




@RestController
@RequestMapping("/parking")
public class ParkingController {

	private static final int ParkingId = 0;
	
	Logger logger = LoggerFactory.getLogger(ParkingController.class);

	@Autowired
	ParkingService parkingService;

	@GetMapping(value="/getAllvehicles", produces = "application/json")
	
	@ApiOperation(value = "get all vehicles", notes = "This will give the details of all vehicles")
	public ResponseEntity<Object> getAllVehicles(Parking parkingDtoObj) {
		logger.info("it is in -getallvehicles");
		return parkingService.getAllVehicles();
	}
	
@	PostMapping(value="/addparkinghistory", produces = "application/json")
	
	@ApiOperation(value = "adds parking history", notes = "This willaddition to history")
	public ResponseEntity<Object> addparkinghistory(@Valid @RequestBody Parking parkingDtoObj)  throws ParkingException{
	ResponseEntity<Object> parkingeo = parkingService.addParkingHistory(parkingDtoObj );
		if(parkingeo==null) {
			throw new ParkingException("no such parking available");
		}
	logger.info("it is in -add history to the parking");
		//return parkingService.addParkingHistory(parkingDtoObj);
		return parkingeo;
}

	@GetMapping("/getParkingHistory")
	@ApiOperation(value = "get parking history", notes = "This will give the details of parking history")
	public ResponseEntity<Object> getParkingHistory() {
		logger.info("it is in -getparkinghistory");
		return parkingService.getParkingHistory();
	}
	
	@GetMapping("/seeVehicleById")
	@ApiOperation(value = "see vehicle by id", notes = "This will be giving details by id")
	public ResponseEntity<Object>  seeVehicleById(@RequestParam ("vehicleNo") int vehicleNo){
		logger.info("it is in -seevehiclebyid");
		return parkingService.seeVehicleById(vehicleNo);
	}

}
