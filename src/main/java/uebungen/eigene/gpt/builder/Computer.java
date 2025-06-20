package uebungen.eigene.gpt.builder;

public class Computer {
    private String cpu;
    private int ram;
    private String graphicscard;
    private int ssd;
    private int hdd;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.graphicscard = builder.graphicscard;
        this.ssd = builder.ssd;
        this.hdd = builder.hdd;
    }

    @Override
    public String toString() {
        return "CPU: " + cpu + ", RAM: " + ram + ", GPU :" + graphicscard + ", SSD: " + ssd + ", HDD: " + hdd;
    }


    public static class Builder{
        private String cpu;
        private int ram;
        private String graphicscard= "None";
        private int ssd=0;
        private int hdd=0;

   public Builder(String cpu, int ram){
       this.cpu = cpu;
       this.ram = ram;
   }

   public Builder graphicscard(String graphicscard){
       this.graphicscard = graphicscard;
       return this;
   }
   public Builder ssd(int ssd){
       this.ssd = ssd;
       return this;
   }
   public Builder hdd(int hdd){
       this.hdd = hdd;
       return this;
   }

   public Computer build(){
       return new Computer(this);
   }

    }


    public static void main(String[] args){
        Computer myComputer = new Builder("Intel i9", 16)
                .graphicscard("NVIDIA RTX 4060")
                .ssd(512)
                .hdd(1000)
                .build();

        System.out.println(myComputer);
    }



}

