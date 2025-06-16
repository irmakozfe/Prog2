package uebungen.eigene.generics;

public class Music {
    private String titel;
    private String singer;

    public Music(String titel, String singer) {
        this.titel = titel;
        this.singer = singer;

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
