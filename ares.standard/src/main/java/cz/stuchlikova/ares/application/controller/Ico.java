package cz.stuchlikova.ares.application.controller;

import javax.validation.constraints.Pattern;
import java.util.Objects;


public class Ico {
    @Pattern(regexp = "[0-9]{8}", message = "ICO must be of 8 digit")
    private String value;

    public Ico() {
    }

    public Ico(String value) {
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
        Ico ico = (Ico) o;
        return value.equals(ico.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
