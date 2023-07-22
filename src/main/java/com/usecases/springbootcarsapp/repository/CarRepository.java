package com.usecases.springbootcarsapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usecases.springbootcarsapp.model.Cars;

@Repository
public interface CarRepository extends JpaRepository<Cars, Long> {
	List<Cars> findCarsByBrand(String brand);

	Cars findCarByModel(String model);

	List<Cars> findByPriceLessThan(Long price);

	List<Cars> findByPriceGreaterThan(Long price);
}
