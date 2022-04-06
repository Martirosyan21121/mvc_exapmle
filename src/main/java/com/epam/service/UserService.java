package com.epam.service;

import com.epam.models.User;
import com.epam.repositores.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Component
public class UserService {

  @Autowired
  public UserRepo userRepo;

  public void saveUser(User user)  {
    userRepo.save(user);
  }

  public Optional<User> findUserById(int id) {
    return userRepo.findById(id);
  }

  public void deleteUser(User user) {
    userRepo.delete(user);
  }
}
