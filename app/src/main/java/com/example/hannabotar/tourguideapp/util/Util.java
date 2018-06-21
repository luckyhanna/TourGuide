package com.example.hannabotar.tourguideapp.util;

import com.example.hannabotar.tourguideapp.model.Event;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.model.Restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Util {

    public static List<Monument> getMonuments() {
        List<Monument> monumentList = new ArrayList<>();

        Monument monument = new Monument.Builder()
                .withName("Muzeul taranului")
                .withAddress("Piata Victoriei nr. 34\nSector 1")
                .withWebsite("www.mtr.ro")
                .withEmail("contact@mtr.ro")
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName("Muzeul de istorie")
                .withAddress("Calea Victoriei nr. 128\nSector 1")
                .withPhone("021-142354")
                .build();
        monumentList.add(monument);

        return monumentList;
    }

    public static List<Event> getEvents() {
        List<Event> eventList = new ArrayList<>();

        Event event = new Event.Builder()
                .withName("Rudimental")
                .withLocation("Arenele Romane")
                .withDate(new Date())
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName("Concert cameral")
                .withLocation("Ateneul Roman")
                .withDate(new Date())
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName("Concert Alexandrina & Band")
                .withLocation("Copper's Pub")
                .build();
        eventList.add(event);

        return eventList;
    }

    public static List<Hotel> getHotels() {
        List<Hotel> hotelList = new ArrayList<>();

        Hotel hotel = new Hotel.Builder()
                .withName("Athene Palace Hilton")
                .withAddress("Calea Victoriei nr. 11\nSector 1")
                .withStars(5)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Radisson Blu")
                .withAddress("Calea Victoriei nr. 204\nSector 1")
                .withStars(4)
                .build();
        hotelList.add(hotel);

        return hotelList;
    }

    public static List<Restaurant> getRestaurants() {
        List<Restaurant> restaurantList = new ArrayList<>();

        Restaurant restaurant = new Restaurant.Builder()
                .withName("Journey Pub")
                .withType("Pub & more")
                .withCuisineType("International")
                .withAddress("Str. George Enescu nr. 3\nSector 2")
                .build();
        restaurantList.add(restaurant);

        return restaurantList;
    }

}
