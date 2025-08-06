package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import java.io.Serializable;

public class LaunchTrip implements Serializable {

    public String TripNumber, From, To, StartTime;
    public int estimatedHour,price;
    public String date;

    public LaunchTrip(String from,String tripNumber,String to,String startTime, int estimatedHour, int price, String date   ) {
        this.TripNumber = tripNumber;
        this.date = date;
        this.price = price;
        this.estimatedHour = estimatedHour;
        this.StartTime = startTime;
        this.To = to;
        this.From = from;
    }

    public String getTripNumber() {
        return TripNumber;
    }

    public void setTripNumber(String tripNumber) {
        TripNumber = tripNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEstimatedHour() {
        return estimatedHour;
    }

    public void setEstimatedHour(int estimatedHour) {
        this.estimatedHour = estimatedHour;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }
}
