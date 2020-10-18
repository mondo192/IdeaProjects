package com.company;

import java.util.regex.Pattern;

public class PhoneNumberValidator {

    private String number;

    public PhoneNumberValidator(String number) {
        this.number = number;
    }

    public static boolean validate(String userInput) {
        String regex = "\\+\\d{3}[-.\\s]\\d{2,3}[-.\\s]\\d{3}[-.\\s]\\d{4}";
        return userInput.matches(regex);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "PhoneNumberValidator{" +
                "number='" + number + '\'' +
                '}';
    }
}
