package Strona;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.beans.factory.annotation.Autowired;

@RestController

public class GreetingController {

    private static final String template = "Hello!Twoje id to:%s. Twój wiek to: %s. Masz na imie: %s! Jesteś %s. Co dziś robimy? ";
    private final AtomicLong counter = new AtomicLong();
    private CountService countService;

    @Autowired
    public GreetingController(CountService countService) { this.countService = countService; }

    @RequestMapping(path="/bye", method = GET)

// zadanie 3, zadanie 4

    public Greetings greeting(@RequestParam(value = "id", defaultValue = "1234") String id,
                              @RequestParam(value = "wiek", defaultValue = "21" ) String wiek,
                              @RequestParam(value = "imie", defaultValue = "Paula" ) String imie,String kto) {

// zadanie 5

        if(imie.charAt(imie.length()-1)=='a'){ kto="kobietą"; }
        else{ kto="mezczyzną"; }
        return new Greetings(counter.incrementAndGet(), String.format(template, id,wiek,imie,kto));

    }

//zadanie 2, zadanie 6

    @RequestMapping( path="/Użytkownik", method = GET)

    public String zawiera(@RequestParam(value = "imie", defaultValue = "Jagoda") String imie) {
        String zawiera;

        if (imie.equals("Paula")) { zawiera = "Witaj! Cieszę się, że znowu cię widzę!"; }
        else zawiera = "Otwieram się tylko dla wybranych.";
        return  zawiera;

    }
}