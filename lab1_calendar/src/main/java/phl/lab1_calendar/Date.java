package phl.lab1_calendar;

import java.time.LocalDate;

public class Date {
    private LocalDate date;
    private Long id;

    public Date(LocalDate time, Long id) {
        this.date = time;
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }
}
