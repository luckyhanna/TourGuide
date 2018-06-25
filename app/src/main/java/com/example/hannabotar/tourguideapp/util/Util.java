package com.example.hannabotar.tourguideapp.util;

import android.content.Context;
import android.content.res.Resources;

import com.example.hannabotar.tourguideapp.R;
import com.example.hannabotar.tourguideapp.model.Event;
import com.example.hannabotar.tourguideapp.model.Hotel;
import com.example.hannabotar.tourguideapp.model.Monument;
import com.example.hannabotar.tourguideapp.model.Restaurant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Util {

    private Context ctx;

    public Util(Context ctx) {
        this.ctx = ctx;
    }

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private static final SimpleDateFormat SDF = new SimpleDateFormat("MMM dd, yyyy, h:mm a");

    public List<Monument> getMonuments() {
        List<Monument> monumentList = new ArrayList<>();

        Monument monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_1_name))
                .withAddress(ctx.getString(R.string.monument_1_address))
                .withWebsite(ctx.getString(R.string.monument_1_website))
                .withPhone(ctx.getString(R.string.monument_1_phone))
                .withEmail(ctx.getString(R.string.monument_1_email))
                .withDescription(ctx.getString(R.string.monument_1_description))
                .withPhotoId(R.drawable.village_museum_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_2_name))
                .withAddress(ctx.getString(R.string.monument_2_address))
                .withWebsite(ctx.getString(R.string.monument_2_website))
                .withPhone(ctx.getString(R.string.monument_2_phone))
                .withDescription(ctx.getString(R.string.monument_2_description))
                .withPhotoId(R.drawable.herastrau_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_3_name))
                .withAddress(ctx.getString(R.string.monument_3_address))
                .withWebsite(ctx.getString(R.string.monument_3_website))
                .withPhone(ctx.getString(R.string.monument_3_phone))
                .withDescription(ctx.getString(R.string.monument_3_description))
                .withPhotoId(R.drawable.parliament_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_4_name))
                .withAddress(ctx.getString(R.string.monument_4_address))
                .withWebsite(ctx.getString(R.string.monument_4_website))
                .withPhone(ctx.getString(R.string.monument_4_phone))
                .withDescription(ctx.getString(R.string.monument_4_description))
                .withPhotoId(R.drawable.atheneum_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_5_name))
                .withAddress(ctx.getString(R.string.monument_5_address))
                .withWebsite(ctx.getString(R.string.monument_5_website))
                .withPhone(ctx.getString(R.string.monument_5_phone))
                .withDescription(ctx.getString(R.string.monument_5_description))
                .withPhotoId(R.drawable.art_collections_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_6_name))
                .withAddress(ctx.getString(R.string.monument_6_address))
                .withDescription(ctx.getString(R.string.monument_6_description))
                .withPhotoId(R.drawable.cathedral_r)
                .build();
        monumentList.add(monument);

        monument = new Monument.Builder()
                .withName(ctx.getString(R.string.monument_7_name))
                .withAddress(ctx.getString(R.string.monument_7_address))
                .withDescription(ctx.getString(R.string.monument_7_description))
                .withPhotoId(R.drawable.triumph_arch_r)
                .build();
        monumentList.add(monument);

        return monumentList;
    }

    public List<Event> getEvents() {
        List<Event> eventList = new ArrayList<>();

        Event event = new Event.Builder()
                .withName(ctx.getString(R.string.event_1_name))
                .withLocation(ctx.getString(R.string.event_1_address))
                .withDate(getDate("02/07/2018 11:55"))
                .withDescription(ctx.getString(R.string.event_1_description))
                .withPhotoId(R.drawable.bjf_r)
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName(ctx.getString(R.string.event_2_name))
                .withLocation(ctx.getString(R.string.event_2_address))
                .withDate(getDate("07/07/2018 11:00"))
                .withDescription(ctx.getString(R.string.event_2_description))
                .withPhotoId(R.drawable.love_yard_sale_r)
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName(ctx.getString(R.string.event_3_name))
                .withLocation(ctx.getString(R.string.event_3_address))
                .withDate(getDate("21/06/2018 18:00"))
                .withPhotoId(R.drawable.sorry_r)
                .build();
        eventList.add(event);

        event = new Event.Builder()
                .withName(ctx.getString(R.string.event_4_name))
                .withLocation(ctx.getString(R.string.event_4_address))
                .withDate(getDate("10/08/2018 18:00"))
                .withPhotoId(R.drawable.summerwell_r)
                .build();
        eventList.add(event);

        return eventList;
    }

    public List<Hotel> getHotels() {
        List<Hotel> hotelList = new ArrayList<>();

        Hotel hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_1_name))
                .withAddress(ctx.getString(R.string.hotel_1_address))
                .withWebsite(ctx.getString(R.string.hotel_1_website))
                .withPhone(ctx.getString(R.string.hotel_1_phone))
                .withStars(5)
                .withDescription(ctx.getString(R.string.hotel_1_description))
                .withPhotoId(R.drawable.hilton_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_2_name))
                .withAddress(ctx.getString(R.string.hotel_2_address))
                .withWebsite(ctx.getString(R.string.hotel_2_website))
                .withPhone(ctx.getString(R.string.hotel_2_phone))
                .withStars(5)
                .withDescription(ctx.getString(R.string.hotel_2_description))
                .withPhotoId(R.drawable.sheraton_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_3_name))
                .withAddress(ctx.getString(R.string.hotel_3_address))
                .withWebsite(ctx.getString(R.string.hotel_3_website))
                .withPhone(ctx.getString(R.string.hotel_3_phone))
                .withEmail(ctx.getString(R.string.hotel_3_email))
                .withDescription(ctx.getString(R.string.hotel_3_description))
                .withStars(5)
                .withPhotoId(R.drawable.radissonblu_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_4_name))
                .withAddress(ctx.getString(R.string.hotel_4_address))
                .withWebsite(ctx.getString(R.string.hotel_4_website))
                .withPhone(ctx.getString(R.string.hotel_4_phone))
                .withEmail(ctx.getString(R.string.hotel_4_email))
                .withDescription(ctx.getString(R.string.hotel_4_description))
                .withStars(5)
                .withPhotoId(R.drawable.intercontinental_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_5_name))
                .withAddress(ctx.getString(R.string.hotel_5_address))
                .withWebsite(ctx.getString(R.string.hotel_5_website))
                .withPhone(ctx.getString(R.string.hotel_5_phone))
                .withEmail(ctx.getString(R.string.hotel_5_email))
                .withDescription(ctx.getString(R.string.hotel_5_description))
                .withStars(3)
                .withPhotoId(R.drawable.rembrandt_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_6_name))
                .withAddress(ctx.getString(R.string.hotel_6_address))
                .withWebsite(ctx.getString(R.string.hotel_6_website))
                .withPhone(ctx.getString(R.string.hotel_6_phone))
                .withEmail(ctx.getString(R.string.hotel_6_email))
                .withDescription(ctx.getString(R.string.hotel_6_description))
                .withStars(4)
                .withPhotoId(R.drawable.novotel_r)
                .build();
        hotelList.add(hotel);

        hotel = new Hotel.Builder()
                .withName(ctx.getString(R.string.hotel_7_name))
                .withAddress(ctx.getString(R.string.hotel_7_address))
                .withWebsite(ctx.getString(R.string.hotel_7_website))
                .withPhone(ctx.getString(R.string.hotel_7_phone))
                .withEmail(ctx.getString(R.string.hotel_7_email))
                .withDescription(ctx.getString(R.string.hotel_7_description))
                .withStars(4)
                .withPhotoId(R.drawable.cismigiu_r)
                .build();
        hotelList.add(hotel);

        return hotelList;
    }

    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurantList = new ArrayList<>();

        Restaurant restaurant = new Restaurant.Builder()
                .withName(ctx.getString(R.string.restaurant_1_name))
                .withType(ctx.getString(R.string.restaurant_1_type))
                .withCuisineType(ctx.getString(R.string.restaurant_1_cuisine))
                .withAddress(ctx.getString(R.string.restaurant_1_address))
                .withWebsite(ctx.getString(R.string.restaurant_1_website))
                .withPhone(ctx.getString(R.string.restaurant_1_phone))
                .withEmail(ctx.getString(R.string.restaurant_1_email))
                .withPhotoId(R.drawable.journeypub_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName(ctx.getString(R.string.restaurant_2_name))
                .withType(ctx.getString(R.string.restaurant_2_type))
                .withCuisineType(ctx.getString(R.string.restaurant_2_cuisine))
                .withAddress(ctx.getString(R.string.restaurant_2_address))
                .withWebsite(ctx.getString(R.string.restaurant_2_website))
                .withPhone(ctx.getString(R.string.restaurant_2_phone))
                .withPhotoId(R.drawable.remodelier_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName(ctx.getString(R.string.restaurant_3_name))
                .withType(ctx.getString(R.string.restaurant_3_type))
                .withCuisineType(ctx.getString(R.string.restaurant_3_cuisine))
                .withAddress(ctx.getString(R.string.restaurant_3_address))
                .withWebsite(ctx.getString(R.string.restaurant_3_website))
                .withPhone(ctx.getString(R.string.restaurant_3_phone))
                .withDescription(ctx.getString(R.string.restaurant_3_description))
                .withPhotoId(R.drawable.adhoc2_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName(ctx.getString(R.string.restaurant_4_name))
                .withType(ctx.getString(R.string.restaurant_4_type))
                .withCuisineType(ctx.getString(R.string.restaurant_4_cuisine))
                .withAddress(ctx.getString(R.string.restaurant_4_address))
                .withWebsite(ctx.getString(R.string.restaurant_4_website))
                .withPhone(ctx.getString(R.string.restaurant_4_phone))
                .withEmail(ctx.getString(R.string.restaurant_4_email))
                .withPhotoId(R.drawable.fiordilatte_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName(ctx.getString(R.string.restaurant_5_name))
                .withType(ctx.getString(R.string.restaurant_5_type))
                .withCuisineType(ctx.getString(R.string.restaurant_5_cuisine))
                .withAddress(ctx.getString(R.string.restaurant_5_address))
                .withWebsite(ctx.getString(R.string.restaurant_5_website))
                .withPhone(ctx.getString(R.string.restaurant_5_phone))
                .withPhotoId(R.drawable.highlife_r)
                .build();
        restaurantList.add(restaurant);

        restaurant = new Restaurant.Builder()
                .withName(ctx.getString(R.string.restaurant_6_name))
                .withType(ctx.getString(R.string.restaurant_6_type))
                .withCuisineType(ctx.getString(R.string.restaurant_6_cuisine))
                .withAddress(ctx.getString(R.string.restaurant_6_address))
                .withWebsite(ctx.getString(R.string.restaurant_6_website))
                .withPhone(ctx.getString(R.string.restaurant_6_phone))
                .withEmail(ctx.getString(R.string.restaurant_6_email))
                .withDescription(ctx.getString(R.string.restaurant_6_description))
                .withPhotoId(R.drawable.rocca_r)
                .build();
        restaurantList.add(restaurant);

        return restaurantList;
    }

    public static String formatDate(Date date) {
        if (date == null) {
            return "";
        }
        return SDF.format(date);
    }

    public static Date getDate(String dateString) {
        Date date = null;
        try {
            date = DATE_FORMAT.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
