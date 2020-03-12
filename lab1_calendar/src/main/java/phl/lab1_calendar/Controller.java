package phl.lab1_calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private final AtomicLong cnt = new AtomicLong();


    @GetMapping("/time")
    public Time getTime(){
        return new Time(java.time.LocalTime.now(), cnt.incrementAndGet());
    }
    @GetMapping("/date")
    public Date getDate(){
        return new Date(java.time.LocalDate.now(), cnt.incrementAndGet());
    }
}
