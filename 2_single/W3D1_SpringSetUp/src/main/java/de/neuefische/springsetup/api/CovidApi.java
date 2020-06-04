package de.neuefische.springsetup.api;

import de.neuefische.springsetup.model.CovidCountryStats;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CovidApi {

    public int numberOfInfections() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.covid19api.com/total/country/germany/status/confirmed?from=2020-05-24T23:59:59Z&to=2020-05-25T00:00:00Z";

        ResponseEntity<CovidCountryStats[]> responseEntity = restTemplate.getForEntity(url, CovidCountryStats[].class);

        CovidCountryStats[] covidData = responseEntity.getBody();

        if(covidData.length > 0) {
            return covidData[0].getActive();
        }
        throw new IllegalStateException("No data from covid api");
    }
}
