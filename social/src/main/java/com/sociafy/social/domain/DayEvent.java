package com.sociafy.social.domain;

public class DayEvent implements Event {
    @Override
    public String getEventDetails() {
        return "It's a day event!";
    }
}
