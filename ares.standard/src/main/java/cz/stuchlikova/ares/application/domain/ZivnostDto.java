package cz.stuchlikova.ares.application.domain;

import java.util.List;

public class ZivnostDto {
    String predmetPodnikani;
    List<String> oboryCinnosti;

    public ZivnostDto(String predmetPodnikani, List<String> oboryCinnosti) {
        this.predmetPodnikani = predmetPodnikani;
        this.oboryCinnosti = oboryCinnosti;
    }

    public String getPredmetPodnikani() {
        return predmetPodnikani;
    }

    public void setPredmetPodnikani(String predmetPodnikani) {
        this.predmetPodnikani = predmetPodnikani;
    }

    public List<String> getOboryCinnosti() {
        return oboryCinnosti;
    }

    public void setOboryCinnosti(List<String> oboryCinnosti) {
        this.oboryCinnosti = oboryCinnosti;
    }

}
