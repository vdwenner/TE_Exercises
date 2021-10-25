package com.techelevator.hotels.rich.services;

import com.techelevator.hotels.rich.model.City;
import com.techelevator.hotels.rich.model.Hotel;
import com.techelevator.hotels.rich.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private final RestTemplate restTemplate = new RestTemplate();

    public Hotel[] listHotels() {

        return  restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);

    }

    public Review[] listReviews() {

        return restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
    }

    public Hotel getHotelById(int id) {

        return  restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
    }

    public Review[] getReviewsByHotelId(int hotelID) {

        return restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelID +"/reviews", Review[].class);
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        return null;
    }

    public City getWithCustomQuery(){
        return null;
    }

}