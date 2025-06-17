package uebungen.eigene.gpt.robot;

public class RobotDrone extends Robot implements Flyable{

    public RobotDrone(String name, String color, int year) {
        super(name,color,year);

    }

    public void fly(){
        System.out.println("Drone is flying");
    }

}
