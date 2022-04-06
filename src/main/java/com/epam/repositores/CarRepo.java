package com.epam.repositores;

import com.epam.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Integer, User> {

}
