package Strona;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.beans.factory.annotation.Autowired;

@RestController

public class GreetingController {

    private static final String template = "Hello! Masz na imie: %s! Twój wiek to: %s. Jesteś %s";
    private final AtomicLong counter = new AtomicLong();
    private CountService countService;

    @Autowired
    public GreetingController(CountService countService) { this.countService = countService; }

    @RequestMapping(path="/bye", method = GET)

// zadanie 3, zadanie 4

    public Greetings greeting(@RequestParam(value = "wiek", defaultValue = "21" ) String wiek,
                              @RequestParam(value = "imie", defaultValue = "Paula" ) String imie,String kto) {

// zadanie 5

        if(imie.charAt(imie.length()-1)=='a'){ kto="kobieta"; }
        else{ kto="mezczyzna"; }
        return new Greetings(counter.incrementAndGet(), String.format(template, wiek,imie,kto));

    }

//zadanie 2, zadanie 6

    private final AtomicLong nextCounter = new AtomicLong();
    @RequestMapping(path = "/Użytkownik", method = GET)

    public String match(@RequestParam(value = "imie", defaultValue = "Paula") String imie) {
        String zawiera;

        if (imie.equals("Paula")) { zawiera = "Witaj!"; }
        else zawiera = "To chyba nie twój komputer!";
        return  zawiera;

    }
}