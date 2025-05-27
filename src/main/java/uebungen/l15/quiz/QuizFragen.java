package uebungen.l15.quiz;

public abstract class QuizFragen {
    private String question;

    public QuizFragen(String question) {
        this.question = question;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
}
