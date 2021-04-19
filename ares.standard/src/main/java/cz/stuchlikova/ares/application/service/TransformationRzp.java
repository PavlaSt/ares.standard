package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.domain.AresResponseRzpDto;
import cz.stuchlikova.ares.application.domain.ZivnostDto;
import cz.stuchlikova.ares.application.stub.rzp.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class TransformationRzp {

    public List<AresResponseRzpDto> transformResponseRzpToDto(List<OdpovedRZP> responses) {

        List<AresResponseRzpDto> responseRzpDtos = new ArrayList<>();
        for (OdpovedRZP response : responses) {
            List<VypisRZP> vypisRZP = response.getVypisRZP();
            for (VypisRZP vypis : vypisRZP) {
                String ico = vypis.getZakladniUdaje().getICO();
                String obchodniFirma = vypis.getZakladniUdaje().getObchodniFirma();
                List<Zivnost> zivnostList = vypis.getZivnosti().getZivnost();

                List<ZivnostDto> zivnostDtoList = new ArrayList<>();
                for (Zivnost zivnost : zivnostList) {
                    String predmetPodnikani = zivnost.getPredmetPodnikani();

                    List<String> obory = new ArrayList<>();
                    if (!(zivnost.getOboryCinnosti() == null)) {
                        List<OborCinnosti> oborCinnostiList = zivnost.getOboryCinnosti().getOborCinnosti();
                        for (OborCinnosti oborCinnosti : oborCinnostiList) {
                            obory.add(oborCinnosti.getText());
                        }
                    }
                    zivnostDtoList.add(new ZivnostDto(predmetPodnikani, obory));
                }
                responseRzpDtos.add(new AresResponseRzpDto(obchodniFirma, ico, zivnostDtoList));
            }
        }
        return responseRzpDtos;
    }
}
