package cz.stuchlikova.ares.application.domain;

import java.util.List;

public class AresRzpResponseDto extends BaseResponseDto {

    private List<ZivnostDto> zivnosti;

    public AresRzpResponseDto(String obchodniFirma, String ico, List<ZivnostDto> zivnosti) {
        super(obchodniFirma, ico);
        this.zivnosti = zivnosti;
    }

    public List<ZivnostDto> getZivnosti() {
        return zivnosti;
    }

    public void setZivnosti(List<ZivnostDto> zivnosti) {
        this.zivnosti = zivnosti;
    }

}
