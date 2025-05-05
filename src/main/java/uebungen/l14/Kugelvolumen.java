package uebungen.l14;

public class Kugelvolumen {

    public static double berechneKugelvolumen(double radius) {
        if( radius >= 0) {
                return 4 / 3 * Math.PI * radius * radius * radius;
            } else 
                throw new RuntimeException("Kugelvolumen kann nicht negativ sein");
            }




}
