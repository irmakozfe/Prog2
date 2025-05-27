package uebungen.l15.quiz;

import java.util.List;

public class MultipleChoiceFragen extends QuizFragen{
    private List<Choice> choices;
    private Schick correctSchick;

    public MultipleChoiceFragen(String question, Schick correctSchick, List<Choice> choices) {
        super(question);
        this.choices= choices;
        this.correctSchick = correctSchick;
    }

    public void printFrage(){
        System.out.println(super.getQuestion());
        for (Choice choice : choices) {
            System.out.println(choice.getSchick() + ": " + choice.getText());
        }
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public Schick getCorrectSchick() {
        return correctSchick;
    }

    public void setCorrectSchick(Schick correctSchick) {
        this.correctSchick = correctSchick;
    }
}
