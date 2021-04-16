package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.datatype.DatatypeConfigurationException;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AresOdpovediServiceTest {

   @Autowired
   AresOdpovediService service;

    //Začal bych napsáním testu, kterej ověří, že XML reálný odpovědi na dotaz Etnetera tvoje aplikace
    // správně zpracuje a vypíše ten výstup co uvádíš výše. Asi bych to pro začátek psal jako testy
    // na službu AresOdpovediService.
    //Klíčový pro ty testy bude podstrčit tomu soap clientu URL směřující na soubor
    // v test/resources místo toho, aby se dotazoval přímo tý služby.

    // Je potřeba to říznout úplně před tim voláním SOAP klienta. Pro testy si můžeš udělat vlastní
    // implementaci SoapClient třídy (bude potřeba jim oběma dát společnej interface a tu v testech
    // asi označit pomocí @Primary). No a v ní pak na základě předanýho typu requestu a jeho parametrů
    // sáhneš na filesystem, vezmeš připravený XML a proženešho marshallerem aby ti z něj vrátil výslednej
    // response objekt. Ideální je asi to asi nějak automaticky mapovat na ten filesystem, třeba něco jako
    // test/resources/jméno_metody/parametr1=hodnota1&parametr2=hodnota2.xml

    @Test
    void getDtoResponseByIco_happy_path() throws DatatypeConfigurationException {
        List<AresResponseDto> dtos = service.getDtoResponseByIco("27074358");

        assertThat(dtos.size(), equalTo(1));
        assertThat(dtos.get(0).getObchodniFirma(), equalTo("Asseco Central Europe, a.s."));
        assertThat(dtos.get(0).getIco(), equalTo("27074358"));
    }



    @Test
    void getDtoResponseByFirmName() {
    }
}