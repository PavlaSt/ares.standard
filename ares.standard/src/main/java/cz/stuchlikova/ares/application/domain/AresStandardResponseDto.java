package cz.stuchlikova.ares.application.domain;

public class AresStandardResponseDto extends BaseResponseDto{

    private String nazevUlice;
    private Integer cisloDomovni;
    private String cisloOrientacni;
    private String psc;
    private String nazevObce;
    private String nazevCastiObce;

    public AresStandardResponseDto(String obchodniFirma, String ico, String nazevUlice, Integer cisloDomovni, String cisloOrientacni, String psc, String nazevObce, String nazevCastiObce) {
        super(obchodniFirma, ico);
        this.nazevUlice = nazevUlice;
        this.cisloDomovni = cisloDomovni;
        this.cisloOrientacni = cisloOrientacni;
        this.psc = psc;
        this.nazevObce = nazevObce;
        this.nazevCastiObce = nazevCastiObce;
    }

    public String getNazevUlice() {
        return nazevUlice;
    }

    public void setNazevUlice(String nazevUlice) {
        this.nazevUlice = nazevUlice;
    }

    public Integer getCisloDomovni() {
        return cisloDomovni;
    }

    public void setCisloDomovni(Integer cisloDomovni) {
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

    public String getNazevCastiObce() {
        return nazevCastiObce;
    }

    public void setNazevCastiObce(String nazevCastiObce) {
        this.nazevCastiObce = nazevCastiObce;
    }

    @Override
    public String toString() {
        return "{\"obchodniFirma\":\"" + obchodniFirma + '\"' +
                ",\"ico\":\"" + ico + '\"' +
                ",\"nazevUlice\":\"" + nazevUlice + '\"' +
                ",\"cisloDomovni\":" + cisloDomovni +
                ",\"cisloOrientacni\":\"" + cisloOrientacni + '\"' +
                ",\"psc\":\"" + psc + '\"' +
                ",\"nazevObce\":\"" + nazevObce + '\"' +
                ",\"nazevCastiObce\":\"" + nazevCastiObce + '\"' +
                '}';
    }
}
