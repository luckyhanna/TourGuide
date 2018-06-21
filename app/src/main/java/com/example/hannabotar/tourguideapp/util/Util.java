package com.example.hannabotar.tourguideapp.util;

import com.example.hannabotar.tourguideapp.model.Event;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.model.Restaurant;

import java.text.SimpleDateFormat;
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
                .withDescription("blabl ablabl ablablablablab lablabla blabl ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl a b l ab lab lab lab blablab lablabla blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab lablabla blablablablablablablablablablabla blab lablablab lablabla blabl ablabla blablablablablablablablablablabla bla blablabla blab lablab lablab labla blabl ablablab lablablablabl ablabla blablablabla bl abl ab lab lablab labla blabl abla bla blablabla blabla blabla blabla blabl ablabl ablabl ab lablabla")
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
                .withDescription("blabl ablabl ablablablablab lablabla blabl ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl a b l ab lab lab lab blablab lablabla blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab lablabla blablablablablablablablablablabla blab lablablab lablabla blabl ablabla blablablablablablablablablablabla bla blablabla blab lablab lablab labla blabl ablablab lablablablabl ablabla blablablabla bl abl ab lab lablab labla blabl abla bla blablabla blabla blabla blabla blabl ablabl ablabl ab lablabla")
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
                .withWebsite("www.aph.ro")
                .withEmail("contact@aph.ro")
                .withPhone("021-142354")
                .withStars(5)
                .withDescription("blabl ablabl ablablablablab lablabla blabl \n" +
                        "ablablablablablab la AAAAAAAAAAAAAAAAA la blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +"ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +"ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b DDDDDDDDDDD lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +"ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +"ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "ablabla SSSSSSSSSSSSSSSSSSSSSSSSSSSSS lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +"ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +"ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl \n" +
                        "a b l ab lab lab lab blablab lablabla \n" +
                        "blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab \n" +
                        "lablabla blablab  AAAAAAAAAAAAAAAAAAAAAAAAA  blablabla blab lablablab lablabla blabl ablabla blablablablablablablablablablabla bla blablabla blab lablab lablab labla blabl ablablab lablablablabl ablabla blablablabla bl abl ab lab lablab labla blabl abla bla blablabla " +
                        "blabla blabla blabla blabl ablabl ablabl ab GGGGGGGGGGGGGGGGG")
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName("Allegro")
                .withAddress("Calea Calarasi nr. 2")
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
                .withWebsite("www.journeypub.ro")
                .withDescription("blabl ablabl ablablablablab lablabla blabl ablablablablablab lablablabla blablab blabl ablabl ablablablablab lablabla blabl abl a b l ab lab lab lab blablab lablabla blab lablablabla blablabla blablablabl ablablablabla blabl ablab labla blab lablab lablabla blablablablablablablablablablabla blab lablablab lablabla blabl ablabla blablablablablablablablablablabla bla blablabla blab lablab lablab labla blabl ablablab lablablablabl ablabla blablablabla bl abl ab lab lablab labla blabl abla bla blablabla blabla blabla blabla blabl ablabl ablabl ab lablabla")
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName("Shift Pub")
                .withType("Eatery")
                .withCuisineType("Italian, Romanian")
                .withAddress("Str. Avram nr. 24")
                .withPhone("021-9876541")
                .withEmail("rezervari@shiftpub.ro")
                .build();
        restaurantList.add(restaurant);

        return restaurantList;
    }

    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy, h:mm a");
        return sdf.format(date);
    }

}
