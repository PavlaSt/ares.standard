package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.domain.AresResponseDto;
import cz.stuchlikova.ares.application.stub.standard.AdresaARES2;
import cz.stuchlikova.ares.application.stub.standard.Identifikace;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import cz.stuchlikova.ares.application.stub.standard.Zaznam;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Transformation {

    public List<AresResponseDto> transformResponseToDto(List<Odpoved> responses) {

        return responses.stream()
                .map(Odpoved::getZaznam)
                .flatMap(Collection::stream)
                .map(this::getDataCreateDto)
                .collect(Collectors.toList());
    }

    private AresResponseDto getDataCreateDto(Zaznam record) {
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

        return new AresResponseDto(obchodniFirma, ico, nazevUlice, cisloDomovni,
                cisloOrientacni, psc, nazevObce, nazevCastiObce);
    }
}
