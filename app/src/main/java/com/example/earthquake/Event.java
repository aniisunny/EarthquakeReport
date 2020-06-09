package com.example.earthquake;

public class Event {

    protected double magnitude;
    protected String place;
    protected long time;
    protected String url;

    public Event(double magnitude, String place, long time, String url) {
        this.magnitude = magnitude;
        this.place = place;
        this.time = time;
        this.url = url;
    }
}
