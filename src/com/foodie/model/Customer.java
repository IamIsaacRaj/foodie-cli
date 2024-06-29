package com.foodie.model;

import java.util.Objects;

public class Customer {
    private String id;
    private String name;
    private String email;
    private String password;

    public String getId() {
        return id;
    }
// Getters and setters
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
<<<<<<< HEAD

    public Customer() {
    }

=======
//  No Arg Constructor
    public Customer() {
    }
//  Override hashCode() and equals() methods
>>>>>>> ccaec8776d2729be3851e1ba7187df4fadb974ef
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(password, customer.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password);
    }

<<<<<<< HEAD
=======
//  Override toString() methods
>>>>>>> ccaec8776d2729be3851e1ba7187df4fadb974ef

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
