package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        try (
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        ) {
            System.out.println("Enter a phone number: ");
            String userInput = bufferedReader.readLine();

            if (PhoneNumberValidator.validate(userInput)) {
                System.out.println("Number is valid");
            } else {
                System.out.println("ERROR: Number is not valid");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
