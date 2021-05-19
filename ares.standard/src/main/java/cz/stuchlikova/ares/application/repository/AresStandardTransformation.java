package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.exceptions.MaxNumberExceeded;
import cz.stuchlikova.ares.application.stub.standard.AdresaARES2;
import cz.stuchlikova.ares.application.stub.standard.Identifikace;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import cz.stuchlikova.ares.application.stub.standard.Zaznam;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AresStandardTransformation {

    public List<AresStandardResponseDto> transformResponseToDto(List<Odpoved> responses) {

        checkResponses(responses);

        return responses.stream()
                .map(Odpoved::getZaznam)
                .flatMap(Collection::stream)
                .map(this::getDataCreateDto)
                .collect(Collectors.toList());
    }

    private AresStandardResponseDto getDataCreateDto(Zaznam record) {
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

        return new AresStandardResponseDto(obchodniFirma, ico, nazevUlice, cisloDomovni,
                cisloOrientacni, psc, nazevObce, nazevCastiObce);
    }

    private void checkResponses(List<Odpoved> responses) {
        if (responses.get(0).getPocetZaznamu() == -1) {
            throw new MaxNumberExceeded("the allowed number of returned subjects has been exceeded: \n" + responses.get(0).getError().get(0).getErrorText());
        }
    }
}
