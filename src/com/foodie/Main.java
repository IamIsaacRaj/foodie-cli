package com.foodie;

import com.foodie.model.Customer;
import com.foodie.model.Dish;
import com.foodie.model.Restaurant;
import com.foodie.util.CsvReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CsvReader reader = new CsvReader();

        List<Customer> customers = reader.readCustomerFromCSV();
        customers.forEach(System.out::println);

        List<Restaurant> restaurants= reader.readRestaurantsFromCSV();
        restaurants.forEach(System.out::println);

        List<Dish> dishes = reader.readDishesFromCsv();
        dishes.forEach(System.out::println);
    }
}
