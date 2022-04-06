package com.epam.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private int year;
  private int price;
  private String country;

  public Car() {
  }

  public Car(int id, String name, int year, int price, String country) {
    this.id = id;
    this.name = name;
    this.year = year;
    this.price = price;
    this.country = country;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return id == car.id && year == car.year && price == car.price && Objects.equals(name, car.name) && Objects.equals(country, car.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, year, price, country);
  }

  @Override
  public String toString() {
    return "Car{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", year=" + year +
            ", price=" + price +
            ", country='" + country + '\'' +
            '}';
  }
}
