package com.epam.service;

import com.epam.models.Car;
import com.epam.models.User;
import com.epam.repositores.CarRepo;
import com.epam.repositores.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Component
public class CarService {

  @Autowired
  public CarRepo carRepo;

  public void saveCar(Car car) {
    carRepo.save(car);
  }

  public Optional<Car> findCarById(int id) {
    return carRepo.findById(id);
  }

  public void deleteCar(Car car) {
    carRepo.delete(car);
  }
}
