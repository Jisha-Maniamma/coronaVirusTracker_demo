package jisha.springExample.coronaVirusTracker_demo.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@ComponentScan
@Controller
@RequestMapping("/home/Covid19/Tracker")
public class HomeController {

@GetMapping("/HomePage")
    public String Home(){
        return "Home";
    }
}
