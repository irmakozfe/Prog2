package uebungen.eigene.gpt.robot;

public class RobotDog extends Robot implements Walkable,Talkable{

    public RobotDog(String name, String color, int year){
        super(name, color, year);
    }

    @Override
    public void talk(){
        System.out.println("hav hav");
    }

    public void walk(){
        System.out.println("Dog is walking");
    }
}
