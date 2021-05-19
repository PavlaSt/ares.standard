package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.exceptions.MyAbstractException;
import org.springframework.http.HttpStatus;

import javax.validation.constraints.Pattern;
import java.util.Objects;

import static java.lang.Integer.parseInt;


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

    public void checkControlAlghorithm() {
        int subtotal = 0;
        String[] icoArray = value.split("");
        int lastDigit;

        for (int i = 0; i < 7; i++) {
            subtotal += (parseInt(icoArray[i]) * (8 - i));
        }
        subtotal = subtotal % 11;
        lastDigit = 11 - subtotal;
        switch (subtotal) {
            case 1:
                lastDigit = 0;
                break;
            case 0:
            case 10:
                lastDigit = 1;
                break;
        }

        if (parseInt(icoArray[7]) != lastDigit) {
            throw new MyAbstractException(HttpStatus.NOT_ACCEPTABLE,
                    "ICO does not match the control algorithm");
        }
    }
}
