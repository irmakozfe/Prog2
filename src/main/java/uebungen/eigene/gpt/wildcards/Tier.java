package uebungen.eigene.gpt.wildcards;

public abstract class Tier {
    private String name;

    public Tier(String name) {
        this.name = name;
    }

    public void fuettern(){
        System.out.println(name +  " wird gefüttert");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
