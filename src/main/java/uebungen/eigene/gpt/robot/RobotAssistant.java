package uebungen.eigene.gpt.robot;

public class RobotAssistant extends Robot implements Walkable, Talkable{

    public RobotAssistant(String name, String color, int year) {
        super(name,color,year);
    }

    public void walk() {
        System.out.println("Assistant is now walking");
    }

    public void talk() {
        System.out.println("Hello, How can I help you?");
    }
}
