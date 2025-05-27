package uebungen.l15.quiz;

public class Choice {
    private Schick schick;
    private String text;

    public Choice(Schick schick, String text) {
        this.schick = schick;
        this.text = text;
    }


    @Override
    public String toString() {
        return schick + ": " + text;
    }

    public Schick getSchick() {
        return schick;
    }

    public void setSchick(Schick schick) {
        this.schick = schick;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
