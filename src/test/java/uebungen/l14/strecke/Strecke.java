package uebungen.l14.strecke;

public class Strecke {
    int A;
    int B;


    public Strecke(int A, int B) {
        if (A <= B) {
            this.A=A;
            this.B=B;
        } else {
            throw new IllegalArgumentException("B soll groesser als A sein");
        }
    }


    public Boolean ueberschneiden(Strecke strecke) {
             if (strecke.A < this.A && strecke.B == this.B  || strecke.A == this.B && strecke.B > this.B
                || strecke.A < this.A && strecke.B <= this.A || strecke.A >= this.B && strecke.B >= this.B ) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString(){


        String ergebnis= "";

        if(this.A == this.B){
            return ergebnis += A;
        }

        ergebnis += A;
     for (int i= A; i < B; i++){
         ergebnis += "-";
     }
     ergebnis += B;

     return ergebnis;
    }


    public static void main(String[] args) {
        Strecke s1 = new Strecke(1, 2);
        Strecke s2 = new Strecke(1, 5);
        System.out.println(s1.toString());
        System.out.println(s1.ueberschneiden(s2));
        System.out.println(s1.ueberschneiden(s2));

    }

}
