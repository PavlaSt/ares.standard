package cz.stuchlikova.ares.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.constraints.Pattern;
import java.util.Objects;

//@ResponseStatus(value =  HttpStatus.NOT_ACCEPTABLE)
public class Firma {
    @Pattern(regexp = ".{3,254}[/*]?", message = "Firma has to be minimum 3, maximum 254 characters")
    private String value;

    public Firma() {
    }

    public Firma(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Firma firma = (Firma) o;
        return value.equals(firma.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    /*Obchodní firma
Toto pole slouží k zadání názvu subjektu, pod kterým subjekt vystupuje (obchodní firma, název podnikatele).
 Maximální počet zadávaných znaků je 254. Nerozlišuje se mezi zadáním velkých a malých písmen abecedy.

 Vyhledávání může probíhat s ohledem na české znaky nebo bez nich (k přepínání slouží doplňující parametr Diakritika);
  pokud je volba ASCII, vyhledávání probíhá bez ohledu na diakritická znaménka.

Jméno obchodní firmy se nemusí zadávat celé, stačí zadat jedno nebo několik slov z požadovaného jména, na pořadí slov nezáleží.
 Významné znaky pro vyhledávání jsou písmena a číslice, ostatní znaky jsou považovány za mezeru.
  V případě několika jednopísmenných slov za sebou jsou tato slova považována za jedno slovo napsané proloženě a oddělující mezery
  jsou odstraněny (proto je stejný efekt při vyhledávání např. textů s r. o., s r.o., sro).
  Ve slovech je možné použít zástupné znaky * (pro více znaků) a ? (pro jeden znak), je však nutné dodržet zásadu,
  že slovo musí obsahovat alespoň 3 po sobě jdoucí významné znaky písmena a číslice, nebo 4 tyto znaky celkem
   (je přípustné zadat vod*, *ody, vo*dy, vo*dy*, dol?, není přípustné vo?y, vo*y).
   Nevhodné umístění zástupných znaků (např. na začátku textu) může značně zpomalit vyhledávání.

Pokud název obchodní firmy obsahuje zástupné znaky (*, ?) nesmí se tyto použít pro vyhledání dle názvu firmy.
 Při zadávání obchodního jména tyto znaky vynechejte.*/
}
