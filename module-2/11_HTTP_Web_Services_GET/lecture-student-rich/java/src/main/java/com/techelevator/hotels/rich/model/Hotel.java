package com.techelevator.hotels.rich.model;

public class Hotel {

    private int id;
    private String name;
    private int stars;
    private int roomsAvailable;
    private String coverImage;
    private Address address;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getRoomsAvailable() {
        return roomsAvailable;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public String getAddress() {return address.toString();}

    @Override
    public String toString() {
        return "\n--------------------------------------------" +
                "\n Hotel Details" +
                "\n--------------------------------------------" +
                "\n Id: " + id +
                "\n Name: " + name +
                "\n Stars: " + stars +
                "\n Rooms Available: " + roomsAvailable +
                "\n Cover Image: " + coverImage;
    }
}
