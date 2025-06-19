package uebungen.eigene.gpt.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> zahlen= Arrays.asList(1,2,3,4);

        Iterator<Integer> numbers=zahlen.iterator();

        while(numbers.hasNext()){
            int number = numbers.next();
            if(number % 2 == 0){
                System.out.print(number + " >");
            }
        }


    }



}
