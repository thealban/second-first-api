package com.example.secondfirstapi.service;

import com.example.secondfirstapi.Car;
import com.example.secondfirstapi.exception.CarNotFoundException;
import com.example.secondfirstapi.exception.StolenCarException;
import com.example.secondfirstapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {

        this.carRepository = carRepository;
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findById(Integer id) {
        if(id == 5) {
            throw new StolenCarException("Je ty lype kerr te vjedht");
        }
        return carRepository.findById(id).orElseThrow(() -> new CarNotFoundException("Kerri qe e lype nuk u gjet"));
    }
}
