package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.ZivnostDto;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import cz.stuchlikova.ares.application.stub.rzp.*;

import java.util.ArrayList;
import java.util.List;

public class AresRzpTransformation {

    public List<AresRzpResponseDto> transformResponseRzpToDto(List<OdpovedRZP> responses) {
        if (responses.get(0).getPocetZaznamu() == 0) {
            throw new RecordNotFoundException("There are no records for this query");
        }
        List<AresRzpResponseDto> responseRzpDtos = new ArrayList<>();
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
                responseRzpDtos.add(new AresRzpResponseDto(obchodniFirma, ico, zivnostDtoList));
            }
        }
        return responseRzpDtos;
    }
}
