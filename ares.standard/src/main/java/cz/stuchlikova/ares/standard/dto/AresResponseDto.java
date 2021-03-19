package cz.stuchlikova.ares.standard.dto;

public class AresResponseDto {
//název firmy, ulice, číslo domovní a orientační, psč a název obce a IČO

private String nazevFirmy;
private String ico;
private String ulice;
private String cisloDomovni;
private String cisloOrientacni;
private String psc;
private String nazevObce;

    public AresResponseDto(String nazevFirmy, String ico, String ulice, String cisloDomovni, String cisloOrientacni, String psc, String nazevObce) {
        this.nazevFirmy = nazevFirmy;
        this.ico = ico;
        this.ulice = ulice;
        this.cisloDomovni = cisloDomovni;
        this.cisloOrientacni = cisloOrientacni;
        this.psc = psc;
        this.nazevObce = nazevObce;
    }

    public String getNazevFirmy() {
        return nazevFirmy;
    }

    public void setNazevFirmy(String nazevFirmy) {
        this.nazevFirmy = nazevFirmy;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getCisloDomovni() {
        return cisloDomovni;
    }

    public void setCisloDomovni(String cisloDomovni) {
        this.cisloDomovni = cisloDomovni;
    }

    public String getCisloOrientacni() {
        return cisloOrientacni;
    }

    public void setCisloOrientacni(String cisloOrientacni) {
        this.cisloOrientacni = cisloOrientacni;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getNazevObce() {
        return nazevObce;
    }

    public void setNazevObce(String nazevObce) {
        this.nazevObce = nazevObce;
    }
}
