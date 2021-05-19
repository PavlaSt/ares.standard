package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.ZivnostDto;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import cz.stuchlikova.ares.application.stub.rzp.OborCinnosti;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import cz.stuchlikova.ares.application.stub.rzp.VypisRZP;
import cz.stuchlikova.ares.application.stub.rzp.Zivnost;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AresRzpTransformation {

    public List<AresRzpResponseDto> transformResponseRzpToDto(List<OdpovedRZP> responses) {

        checkIfNotEmpty(responses);

        List<AresRzpResponseDto> responseRzpDtos = new ArrayList<>();
        responses.stream()
                .map(OdpovedRZP::getVypisRZP)
                .flatMap(Collection::stream)
                .forEachOrdered(vypis -> getInfoFromVypisAddToDtos(vypis, responseRzpDtos));
        return responseRzpDtos;

    }

    private void getInfoFromVypisAddToDtos(VypisRZP vypis, List<AresRzpResponseDto> responseRzpDtos) {
        String ico = vypis.getZakladniUdaje().getICO();
        String obchodniFirma = vypis.getZakladniUdaje().getObchodniFirma();
        List<Zivnost> zivnostList = vypis.getZivnosti().getZivnost();
        List<ZivnostDto> zivnostDtoList = new ArrayList<>();

        zivnostList.forEach(zivnost -> getInfoFromZivnostAddToDto(zivnost, zivnostDtoList));

        responseRzpDtos.add(new AresRzpResponseDto(obchodniFirma, ico, zivnostDtoList));
    }

    private void getInfoFromZivnostAddToDto(Zivnost zivnost, List<ZivnostDto> zivnostDtoList) {
        String predmetPodnikani = zivnost.getPredmetPodnikani();
        List<String> obory = new ArrayList<>();
        if (!(zivnost.getOboryCinnosti() == null)) {
            List<OborCinnosti> oborCinnostiList = zivnost.getOboryCinnosti().getOborCinnosti();
            obory = oborCinnostiList.stream()
                    .map(OborCinnosti::getText)
                    .collect(Collectors.toList());
        }
        zivnostDtoList.add(new ZivnostDto(predmetPodnikani, obory));
    }

    private void checkIfNotEmpty(List<OdpovedRZP> responses) {
        if (responses.get(0).getPocetZaznamu() == 0) {
            throw new RecordNotFoundException("There are no records for this query");
        }
    }


}
