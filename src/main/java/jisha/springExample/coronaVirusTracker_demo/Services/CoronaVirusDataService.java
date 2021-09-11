package jisha.springExample.coronaVirusTracker_demo.Services;


import lombok.Setter;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CoronaVirusDataService {
    @Setter
    public static String DATA_SOURCE="https://github.com/CSSEGISandData/COVID-19/blob/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

    public void fetchVirusData() throws IOException, InterruptedException {

        HttpClient client=HttpClient.newHttpClient();
        HttpRequest  request=HttpRequest.newBuilder().uri(URI.create(DATA_SOURCE)).build();

        HttpResponse<String> httpResponse=client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());

    }
}
