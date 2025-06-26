package uebungen.eigene.bbrothers_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Brothers {
    public static void main(String[] args) {
        // Array.asList() : veränderbar
        // List.of() : unveränderbar
        // stream()

        List<String> bBrothers = Arrays.asList("Burt", "Bronski", "Peter");

        bBrothers.stream().forEach(new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        });

        System.out.println();
        System.out.println(bBrothers);
        System.out.println();

        //mit Lambda-Ausdruck
        bBrothers.stream().forEach(name -> System.out.println(name));

    }
}

//Iteration erfolgt intern, gegen Tell Dont ask verstoßen wir nicht mehr