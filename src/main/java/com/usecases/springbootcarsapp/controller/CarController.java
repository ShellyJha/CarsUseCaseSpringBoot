package com.usecases.springbootcarsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.usecases.springbootcarsapp.model.Cars;
import com.usecases.springbootcarsapp.service.CarService;

@Controller
public class CarController {
	@Autowired
	CarService carsService;
	

	@GetMapping("/")
	public String homePageView() {
		return "homepage";

	}
	
	@GetMapping("/carsByBrand")
	public String getCarsByBrand() {
		return "cars_by_brand";

	}
	
	@PostMapping(path = "/findCarsBrand")
	public String findCarsBrand(@ModelAttribute Cars car, Model model) {

		model.addAttribute("cars", carsService.getCars(car.getBrand()));
		return "cars_list";

	}
	@GetMapping(path = "/carSelected/{model}")
	public String carSelected(@PathVariable(name = "model") String model, Model mod) {
		mod.addAttribute("cars", carsService.getCarByModel(model));
		return "booked_page";

	}

	@GetMapping("/carsByPrice")
	public String findCarsByPrice() {
		return "cars_by_price";
	}

	@PostMapping(path = "/carByPrice")
	public String carByPrice(@ModelAttribute Cars car, Model model) {
		if (car.getPrice() == 500000) {
			model.addAttribute("cars", carsService.getCarOptions(car.getPrice()));
		} else {
			model.addAttribute("cars", carsService.getCarOptions2(car.getPrice()));

		}
		return "cars_list";
	}
	@PostMapping(path="/bookedPage")
	public String bookedPage(@ModelAttribute Cars car,Model model) {
		model.addAttribute("cars", carsService.getCarByModel(car.getModel()));
		return "booked_page";
	}
	
	
	
}
