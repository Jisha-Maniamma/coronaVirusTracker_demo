package jisha.springExample.coronaVirusTracker_demo.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LocationStats {

    private String state;
    private String country;
    private long totalCases;


}
