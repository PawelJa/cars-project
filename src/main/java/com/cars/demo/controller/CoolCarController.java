package com.cars.demo.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.demo.entity.Car;
import com.cars.demo.repository.CarRepository;

@RestController
public class CoolCarController {
	
	private CarRepository carRepository;
	
	public CoolCarController(CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	@GetMapping("/cool-cars")
	public Collection<Car> coolCars() {
		return carRepository.findAll().stream()
				.filter(this::isCool)
				.collect(Collectors.toList());
	}
	
	private boolean isCool(Car car) {
		return !car.getName().equals("AMC Gremlin") &&
				!car.getName().equals("Triumph Stag") &&
				!car.getName().equals("Ford Pinto") &&
				!car.getName().equals("Yugo GV");
	}

}
