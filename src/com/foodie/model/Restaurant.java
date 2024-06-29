package com.foodie.model;

import java.util.List;
import java.util.Objects;

public class Restaurant {
    private String id;
    private String address;
    private List<Dishes> menu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Dishes> getMenu() {
        return menu;
    }

    public void setMenu(List<Dishes> menu) {
        this.menu = menu;
    }

    public Restaurant() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(id, that.id) && Objects.equals(address, that.address) && Objects.equals(menu, that.menu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, menu);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }
}
