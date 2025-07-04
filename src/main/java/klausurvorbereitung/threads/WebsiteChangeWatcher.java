package klausurvorbereitung.threads;

import java.util.function.Consumer;

public class WebsiteChangeWatcher {
     private final String target;
     private final String url;
     private final Consumer<String> onChange;
     private boolean cancelled = false;
     private Thread thread;

    public WebsiteChangeWatcher(String target, String url, Consumer<String> onChange) {
        this.target = target;
        this.url = url;
        this.onChange = onChange;
    }

    public void hasChanged() {
        thread = new Thread(() -> {
            String last = retrieveWebsiteContent(target, url);

            while(!cancelled) {
                try{
                    Thread.sleep(30_000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }

                String current = retrieveWebsiteContent(target, url);
                if(!current.equals(last)) {
                    last = current;
                    onChange.accept(current);
                }
            }
        });
        thread.start();
    }


    public void cancel() {
        cancelled = true;
    }
    private String retrieveWebsiteContent(String target, String path) {
        // Nur zur Simulation
        return "Simulierter Inhalt von " + target + "/" + path + " " + System.currentTimeMillis();
    }

    public static void main(String[] args) {

        //Consumer definieren
        Consumer<String> print = content -> System.out.println(content);

        //WebsiteChangeWatcher starten
        WebsiteChangeWatcher watcher = new WebsiteChangeWatcher("https://wwww.zeit.de", "campus", print);
        watcher.hasChanged();
        //Thread oldugu icin program bunu calistirdiktan hemen sonra bir sonraki bloga gecer beklemez

        // 2 minuten warten
        try{
            Thread.sleep(120_000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        //Beobachtung beendet
        watcher.cancel();


    }
}
