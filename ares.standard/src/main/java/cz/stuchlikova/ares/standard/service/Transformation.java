package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.stub.AdresaARES2;
import cz.stuchlikova.ares.standard.stub.Identifikace;
import cz.stuchlikova.ares.standard.stub.Odpoved;
import cz.stuchlikova.ares.standard.stub.Zaznam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Transformation {

    public List<AresResponseDto> transformResponseToDto(List<Odpoved> responses) {
        List<AresResponseDto> responseDtos = new ArrayList<>();

        responses.stream()
                .map(odpoved -> odpoved.getZaznam())
                .flatMap(zaznams -> zaznams.stream())
                .forEach(record -> {
                    String obchodniFirma = record.getObchodniFirma();
                    String ico = record.getICO();
                    Identifikace identifikace = record.getIdentifikace();
                    AdresaARES2 adresa = identifikace.getAdresaARES();
                    String nazevObce = adresa.getNazevObce();
                    String nazevCastiObce = adresa.getNazevCastiObce();
                    String nazevUlice = adresa.getNazevUlice();
                    Integer cisloDomovni = adresa.getCisloDomovni();
                    String cisloOrientacni = adresa.getCisloOrientacni();
                    String psc = adresa.getPSC();

                    AresResponseDto responseDto = new AresResponseDto(obchodniFirma, ico, nazevUlice, cisloDomovni,
                            cisloOrientacni, psc, nazevObce, nazevCastiObce);
                    responseDtos.add(responseDto);
                });
        return responseDtos;
    }
}
