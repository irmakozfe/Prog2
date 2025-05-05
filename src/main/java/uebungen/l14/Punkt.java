package uebungen.l14;

public class Punkt {

    int x;
    int y;

    public void verschiebePunkt(int zielX, int zielY) {

        if(zielX >= 0 && zielY >= 0 && zielX <= 1920 && zielY <= 1080) {
            y = zielY;
            x = zielX;
        }else {
            throw new RuntimeException("geht nicht");
        }

    }
}
