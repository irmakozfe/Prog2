package uebungen.eigene.gpt.robot;

public abstract class Robot {
    private String name;
    private int year;
    private String color;

    public Robot(String name, String color, int year ) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args){
        RobotAssistant assistant = new RobotAssistant("Clara", "blue", 2010);
        RobotDog dog = new RobotDog("Luna", "brown", 2020);
        RobotDrone drone = new RobotDrone("D300", "blue", 2022);

        dog.walk();
        dog.talk();

        assistant.talk();
        assistant.walk();

        drone.fly();

    }
}
