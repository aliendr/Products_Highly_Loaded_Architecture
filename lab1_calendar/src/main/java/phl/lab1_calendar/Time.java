package phl.lab1_calendar;

import java.time.LocalTime;

public class Time {
    private LocalTime time;
    private Long id;

    public Time(LocalTime time, Long id) {
        this.time = time;
        this.id = id;
    }

    public LocalTime getTime() {
        return time;
    }

    public Long getId() {
        return id;
    }
}
