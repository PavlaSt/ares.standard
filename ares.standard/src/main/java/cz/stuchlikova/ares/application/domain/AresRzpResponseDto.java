package cz.stuchlikova.ares.application.domain;

import java.util.List;

public class AresRzpResponseDto {

    private String obchodniFirma;
    private String ico;
    private List<ZivnostDto> zivnosti;

    public AresRzpResponseDto(String obchodniFirma, String ico, List<ZivnostDto> zivnosti) {
        this.obchodniFirma = obchodniFirma;
        this.ico = ico;
        this.zivnosti = zivnosti;
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

    public List<ZivnostDto> getZivnosti() {
        return zivnosti;
    }

    public void setZivnosti(List<ZivnostDto> zivnosti) {
        this.zivnosti = zivnosti;
    }
}
