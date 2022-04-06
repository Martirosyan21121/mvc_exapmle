package com.epam.repositores;

import com.epam.models.Car;
import com.epam.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarRepo extends JpaRepository<Car, Integer> {

}
