package com.usecases.springbootcarsapp.service;

import java.util.List;

import com.usecases.springbootcarsapp.model.Cars;


public interface CarService {
	List<Cars> getCars(String brand);
	Cars getCarByModel(String model);
	List<Cars> getCarOptions(Long price);
	List<Cars> getCarOptions2(Long price);
}
