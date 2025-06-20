package uebungen.eigene.gpt.builder;

public class Notification {
    private String title;
    private String message;
    private String icon;
    private boolean sound;
    private boolean vibration;
    private String actionText;

    public Notification(NotificationBuilder builder){
        this.title= builder.title;
        this.message=builder.message;
        this.icon=builder.icon;
        this.sound=builder.sound;
        this.vibration=builder.vibration;
        this.actionText=builder.actionText;
    }

    @Override
    public String toString() {
        return title + message + icon + sound + vibration + actionText;

    }

    public static class NotificationBuilder {
        private String title;
        private String message;
        private String icon;
        private boolean sound;
        private boolean vibration;
        private String actionText;

        public NotificationBuilder(String title, String message) {
            this.title = title;
            this.message = message;
        }

        public NotificationBuilder withIcon(String icon){
            this.icon = icon;
            return this;
        }

        public NotificationBuilder withSound(boolean sound){
            this.sound= sound;
            return this;
        }

        public NotificationBuilder withVibration(boolean vibration){
            this.vibration= vibration;
            return this;
        }

        public NotificationBuilder withActionText(String actionText){
            this.actionText = actionText;
            return this;
        }

        public Notification build(){
            return new Notification(this);
        }

    }

    public static void main(String[] args){
        Notification notification= new NotificationBuilder("Spotify", "manifestival streams a new album!")
                .withIcon("spot")
                .withSound(true)
                .withVibration(false)
                .withActionText("push")
                .build();

        System.out.println(notification);


    }
}
