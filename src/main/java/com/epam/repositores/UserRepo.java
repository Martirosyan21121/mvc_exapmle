package com.epam.repositores;

import com.epam.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Integer, Car> {
}
