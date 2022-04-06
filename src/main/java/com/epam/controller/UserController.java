package com.epam.controller;

import com.epam.models.User;
import com.epam.repositores.UserRepo;
import com.epam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@Component
public class UserController {

  public UserRepo userRepo;

  public UserService userService;

  @GetMapping("/user")
  public String users(Model model){
    List<User> users = userRepo.findAll();
    model.addAttribute("user", users);
    return "user";
  }

  @GetMapping("/user/add")
  public String addUser(){
    return "addUser";
  }

  @PostMapping("/user/add")
  public String addUser(@ModelAttribute User user){
    userService.saveUser(user);
    return "redirect:/user";
  }

  @GetMapping("/user/{id}")
  public String userDetails(@PathVariable(value = "id") int id, Model model){
    if (!userRepo.existsById(id)){
      return "redirect:/user";
    }
    Optional<User> user = userService.findUserById(id);
    List<User> users = new ArrayList<>();
    user.ifPresent(users::add);
    model.addAttribute("user", users);
    return "userDetails";
  }

  @GetMapping("/guns/{id}/edit")
  public String userDetailsEdit(@PathVariable(value = "id") int id, Model model){
    if (!userRepo.existsById(id)){
      return "redirect:/user";
    }
    Optional<User> user = userService.findUserById(id);
    List<User> users = new ArrayList<>();
    user.ifPresent(users::add);
    model.addAttribute("user", users);
    return "userEdit";
  }

  @PostMapping("/guns/{id}/edit")
  public String userIdEdit(@ModelAttribute User user){
    userService.saveUser(user);
    return "redirect:/guns";
  }

  @PostMapping("/user/{id}/remove")
  public String userDelete(@PathVariable(value = "id") int id){
    User user = userService.findUserById(id).orElseThrow();
    userService.deleteUser(user);
    return "redirect:/user";
  }
}
