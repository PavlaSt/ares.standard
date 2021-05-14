package cz.stuchlikova.ares.application.domain;

public abstract class BaseResponseDto {

    String obchodniFirma;
    String ico;

    public BaseResponseDto(String obchodniFirma, String ico) {
        this.obchodniFirma = obchodniFirma;
        this.ico = ico;
    }

    public String getObchodniFirma() {
        return obchodniFirma;
    }

    public void setObchodniFirma(String obchodniFirma) {
        this.obchodniFirma = obchodniFirma;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
}
