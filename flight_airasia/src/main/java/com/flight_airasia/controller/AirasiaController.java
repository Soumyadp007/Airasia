package com.flight_airasia.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight_airasia.entity.Airasia;
import com.flight_airasia.repository.FlightRepository;

@Controller
public class AirasiaController {
   
	@Autowired
	private FlightRepository flightRepo;

	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate")  @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
	                          ModelMap modelMap) {
	    List<Airasia> findFlights = flightRepo.findFlights(from, to, departureDate);
	    modelMap.addAttribute("findFlights", findFlights);
	    return "displayFlights"; // Assuming "displayFlights" is the correct name of your view
	}
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		Optional<Airasia> findById = flightRepo.findById(flightId);
		Airasia airasia = findById.get();
		modelMap.addAttribute("airasia", airasia);
		return "showReservation";
		
	}

}
