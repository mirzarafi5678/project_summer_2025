package com.example.finalproject_oop213.MirzaMdSufianHridoy;

public class LaunchTrip {

    public String TrioNumber, From, To, StartTime;
    public int estimatedHour;

    public LaunchTrip(String from, String trioNumber, String to, String startTime, int estimatedHour) {
        From = from;
        TrioNumber = trioNumber;
        To = to;
        StartTime = startTime;
        this.estimatedHour = estimatedHour;
    }

    public String getTrioNumber() {
        return TrioNumber;
    }

    public void setTrioNumber(String trioNumber) {
        TrioNumber = trioNumber;
    }

    public int getEstimatedHour() {
        return estimatedHour;
    }

    public void setEstimatedHour(int estimatedHour) {
        this.estimatedHour = estimatedHour;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    @Override
    public String toString() {
        return "LaunchTrip{" +
                "TrioNumber='" + TrioNumber + '\'' +
                ", From='" + From + '\'' +
                ", To='" + To + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", estimatedHour=" + estimatedHour +
                '}';
    }
}
