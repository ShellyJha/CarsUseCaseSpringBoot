package com.usecases.springbootcarsapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class Cars {
	@Id
	@Column(name="id")
	private Long id;
	@Column(name="Brand")
	private String brand;
	@Column(name="Model")
	private String model;
	@Column(name="Year")
	private String year;
	@Column(name="NoofKms")
	private Long kilometers;
	@Column(name="Price")
	private Long price;
	@Column(name="Fuel")
	private String fuel;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Long getKilometers() {
		return kilometers;
	}
	public void setKilometers(Long kilometers) {
		this.kilometers = kilometers;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
