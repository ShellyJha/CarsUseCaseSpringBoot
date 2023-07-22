package com.usecases.springbootcarsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecases.springbootcarsapp.model.Cars;
import com.usecases.springbootcarsapp.repository.CarRepository;
@Service
public class CarServiceImpl implements CarService {
	@Autowired
	CarRepository carRepository;

	@Override
	public List<Cars> getCars(String brand) {
		List<Cars> cars = carRepository.findCarsByBrand(brand);

		return cars;
	}

	@Override
	public Cars getCarByModel(String model) {
		Cars car = carRepository.findCarByModel(model);
		return car;
	}

	@Override
	public List<Cars> getCarOptions(Long price) {
		price = 500000L;
		List<Cars> cars = carRepository.findByPriceLessThan(price);
		if (cars.size() > 0) {
			return cars;
		} else {
			throw new RuntimeException("No cars Found for given criteria!!!!");

		}
	}

	@Override
	public List<Cars> getCarOptions2(Long price) {
		price = 500000L;
		List<Cars> cars = carRepository.findByPriceGreaterThan(price);
		if (cars.size() > 0) {
			return cars;
		} else {
			throw new RuntimeException("No cars Found for given criteria!!!!");

		}
	}

}
