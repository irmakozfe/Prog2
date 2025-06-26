package uebungen.eigene.bbrothers_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        //  (name) -> {System.out.println(name);}

        // wenn nur ein Parameter
        //  name -> { System.out.println(name);}

        // Wenn nur ein Parameter und nur eine Anweisung
        // name ->  System.out.println(name)

        // Bsp: bBrothers.stream().forEach(name -> sysout(name));


        List<Double> articlePrices = Arrays.asList(10.0, 15.0, 20.0);

        articlePrices.stream().forEach(price -> System.out.println(price * 0.7));


        // !!! Wenn wir Lambda benutzen wollen , sollen wir GENERICS in der Liste benutzen !!!

        List<String> kunden= Arrays.asList("Anna", "Franziska", "Gert", "Lula");

        Predicate<String> beginntMitA = name -> name.startsWith("A");

        Consumer<String> ausgabe = name -> System.out.println(name);

        kunden.stream()
                .filter(beginntMitA)
                .forEach(ausgabe);

// -----------------------------------------------------------------------------

       List<Double> nettopreise= Arrays.asList(10.0, 15.0, 20.0);

        Function<Double, Double> berechneSteuer = preis -> preis * 1.19;

        Consumer<Double> ausgabe1 = preis -> System.out.println(preis);

        nettopreise.stream()
                .map(berechneSteuer)
                .forEach(ausgabe1);

        // --------------------------------------------------------------------------------


      List<Double> bonus = Arrays.asList(1000.0, 1575.0, 2010.0, 3001.5);

      Function<Double, Double> berechneBonus = preis -> {
          if (preis <= 3000.0) return preis * 1.1;
          else return preis;
      };

      Consumer<Double> ausgabe2 = preis -> System.out.println(preis);

      bonus.stream()
              .map(berechneBonus)
              .forEach(ausgabe2);


      // -----------------------------------------------------------------------------------

        List<Double> articles = Arrays.asList(10.0, 15.0, 20.0, 50.45, 35.5);

        Function<Double, Double> rabatt  = article -> {
            if (article > 20) return article * 0.85;
            else return article;
        };

        Consumer<Double> ausgabe3 = preise -> System.out.println(preise);


        List<Double> warenkorb = articles.stream()
                .map(rabatt)
                .collect(Collectors.toList());

        warenkorb.forEach(ausgabe3);





    }
}
