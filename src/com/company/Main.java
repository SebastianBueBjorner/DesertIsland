package com.company;
import java.util.Arrays;
import java.util.Scanner;

/*
Desert island program
*/

public class Main {

    //Indlæser scanner objekt
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        //Initializer arrays
        String[] options = {"Kæreste", "Kaffemaskine", "Netflix", "Sofa", "Løbesko", "Guitar", "Slik", "Hung", "Bog", "Øl"};
        int[] optionsInput = new int[options.length];

        System.out.println("Hvilke ting vil du helst have med på en øde ø?");

        //Displays the different possibilities from the array
        optionsDisplayed(options);

        //Makes the user input their options - can choose up to []options.lenght
        optionsInputtet(optionsInput);

        //Displays the choices and the most choosen option
        resultDisplayed(optionsInput, options);

    }


    //Metode der udskriver de forskellige valgmuligheder.
    public static void optionsDisplayed(String[] options) {
        for (int i = 0; i < options.length; i++) {
            System.out.println(i+1 + " " + options[i].substring(0));
        }
    }

    //Metode der tager brugerens valg og lægger dem i et array
    public static void optionsInputtet(int[] optionInput) {
        for (int i = 0; i < optionInput.length; i++) {
            System.out.print("Indtast valg: ");
            int inputInt = input.nextInt();

            optionInput[inputInt-1] += 1;
        }
    }


    //Metode der udskriver brugerens svar
    public static void resultDisplayed (int[] optionInput, String[] options) {
        System.out.println(Arrays.toString(optionInput));
        int highestCount = 0;
        int highestArrayIndex = 0;

        //Find the index for highest option choicen by user
        for (int i = 0; i < options.length; i++) {
            if (highestCount < optionInput[i]) {
                highestCount = optionInput[i];
                highestArrayIndex = i;
            }
        }
        System.out.printf("Mest populære valg er %s", options[highestArrayIndex]);
    }
}
