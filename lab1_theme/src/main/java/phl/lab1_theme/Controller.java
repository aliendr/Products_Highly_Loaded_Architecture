package phl.lab1_theme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {

    private final AtomicLong cnt = new AtomicLong();

    @GetMapping("/colors")
    public Color getColor(){
        Random rnd = new Random();
        int intVal = rnd.nextInt(16777215 + 1);
        String color1 = Integer.toHexString(intVal);

        intVal = rnd.nextInt(16777215 + 1);
        String color2 = Integer.toHexString(intVal);

        return new Color("#"+color1,"#"+color2,cnt.incrementAndGet());
    }
}
