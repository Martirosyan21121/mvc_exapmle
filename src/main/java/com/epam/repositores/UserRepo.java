package com.epam.repositores;

import com.epam.models.Car;
import com.epam.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface UserRepo extends JpaRepository<User, Integer> {
}
