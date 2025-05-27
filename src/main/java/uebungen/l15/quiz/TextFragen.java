package uebungen.l15.quiz;

public class TextFragen extends QuizFragen {
    String antwort;

    public TextFragen(String question, String antwort) {
        super(question);
        this.antwort =antwort;
    }

    public String getAntwort() {
        return antwort;
    }

    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }
}
