package uebungen.eigene.generics;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        List<String> modules = new ArrayList<>();

        modules.add("Prog2");
        modules.add("Numerik");
        modules.add("GTI");
        modules.add("BWL");

        System.out.println(modules);
        System.out.println(modules.contains("GTI"));
        System.out.println(modules.get(2));
        modules.add("SE2");
        System.out.println(modules);
        modules.remove(modules.get(3));
        System.out.println(modules);
        modules.removeAll(modules);
        System.out.println(modules);
    }
}
