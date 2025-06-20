package uebungen.eigene.gpt.builder;

public class Reservation {
    private String guestName;
    private String checkInDate;
    private String checkOutDate;
    private String roomType;
    private boolean breakfastIncluded;
    private String specialRequest;


    public Reservation(ReservationBuilder builder) {
        this.guestName= builder.guestName;
        this.checkInDate= builder.checkInDate;
        this.checkOutDate= builder.checkOutDate;
        this.roomType= builder.roomType;
        this.breakfastIncluded = builder.breakfastIncluded;
        this.specialRequest= builder.specialRequest;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public String getSpecialRequest() {
        return specialRequest;
    }

    @Override
    public String toString() {
        return guestName + " " + checkInDate + " " + checkOutDate + " " + roomType + " " + specialRequest;
    }


    public static class ReservationBuilder {
        private String guestName;
        private String checkInDate;
        private String checkOutDate;
        private String roomType;
        private boolean breakfastIncluded;
        private String specialRequest;

        public ReservationBuilder(String guestName, String checkInDate, String checkOutDate) {
            this.guestName = guestName;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public ReservationBuilder withroomType(String roomType) {
            this.roomType= roomType;
            return this;
        }

        public ReservationBuilder withBreakfastIncluded(boolean breakfastIncluded) {
            this.breakfastIncluded = breakfastIncluded;
            return this;
        }

        public ReservationBuilder withSpecialRequest(String specialRequest) {
            this.specialRequest = specialRequest;
            return this;
        }

        public Reservation build() {
            return new Reservation(this);
        }

        public static void main(String[] args){
            Reservation rez= new ReservationBuilder("Erdinç Özdemir", "12-06-2025", "18-07-2025")
                    .withroomType("King")
                    .withBreakfastIncluded(true)
                    .withSpecialRequest("Fruit Salad")
                    .build();

            System.out.println(rez);

        }







    }


}
