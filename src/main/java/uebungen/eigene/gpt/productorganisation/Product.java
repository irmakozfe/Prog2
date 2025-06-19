package uebungen.eigene.gpt.productorganisation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {
    private String name;
    private double bewertung;

    public Product(String name, double bewertung) {
        this.name = name;
        this.bewertung = bewertung;
    }

    @Override
    public int compareTo(Product p){
        if(this.bewertung > p.bewertung){
            return -1;
        }
        else if(this.bewertung < p.bewertung){
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBewertung() {
        return bewertung;
    }

    public void setBewertung(double bewertung) {
        this.bewertung = bewertung;
    }


    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product( "Fernbedienung", 4.5 ));
        products.add(new Product( "Teebeutel", 1.5 ));
        products.add(new Product( "Tasse", 2.5 ));

        Collections.sort(products);

        for(Product product: products){
            System.out.println(product.getName() + " " + product.bewertung);
        }

    }
}
