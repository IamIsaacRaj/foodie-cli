package com.foodie.util;

import com.foodie.model.Customer;
import com.foodie.model.Dish;
import com.foodie.model.Restaurant;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {

    private List<Dish> dishList;
    private String CUSTOMERS_FILE = "D:\\Foodie\\data\\customers.csv";
    private String RESTAURANTS_FILE = "D:\\Foodie\\data\\restaurants.csv";
    private String DISHES_FILE = "D:\\Foodie\\data\\dishes.csv";



    public List<Dish> readDishesFromCsv(){
        String line;
        List<Dish> dishList = new ArrayList<>();
       try(BufferedReader br = new BufferedReader(new FileReader(DISHES_FILE))){
           String CSVSplitBy = ",";
           br.readLine();// Skip header
            while((line = br.readLine()) != null) {
               String[] data = line.split(CSVSplitBy);
               Dish dish = new Dish();
               dish.setId(data[0]);
               dish.setName(data[1]);
               dish.setDescription(data[2]);
               dish.setPrice(Double.parseDouble(data[3]));
               dishList.add(dish);
           }
            this.dishList = dishList;

       }catch (IOException e) {

           System.out.println("Issues in the CSV file from the path : " + CUSTOMERS_FILE);
           System.exit(0);
       }
       return dishList;
    }

    public List<Customer> readCustomerFromCSV() {
        List<Customer> customerList = new ArrayList<>();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(CUSTOMERS_FILE))) {
            String CSVSplitBy = ",";
            br.readLine();// Skip header
            while ((line = br.readLine()) != null){
                String[] data = line.split(CSVSplitBy);
                Customer customer = new Customer();
                customer.setId(data[0]);
                customer.setName(data[1]);
                customer.setEmail(data[2]);
                customer.setPassword(data[3]);
                customerList.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Issues in the CSV file from the path : " + CUSTOMERS_FILE);
            System.exit(0);
        }
        return customerList;
    }

    public List<Restaurant> readRestaurantsFromCSV(){
        List<Restaurant> restaurantList = new ArrayList<>();
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(RESTAURANTS_FILE))) {
            String CSVSplitBy = ",";
            br.readLine();// Skip header
            while ((line = br.readLine()) != null){
                String[] data = line.split(CSVSplitBy);
                Restaurant restaurant = new Restaurant();
                restaurant.setId(data[0]);
                restaurant.setName(data[1]);
                restaurant.setAddress(data[2]);
                restaurant.setMenu(Arrays.asList(data[3].split(":")));
                restaurantList.add(restaurant);
            }
        }  catch (IOException e) {
            e.printStackTrace();
            System.out.println("Issues in the CSV file from the path: " + RESTAURANTS_FILE);
            System.exit(0);
        }
        return restaurantList;
    }
}
