public class Bus extends Auto{

    private int countSeats;
    private int ticketPrice;

    /**
     * @param countSeats количество мест
     */
    public Bus(String company, String movement, String form, String departure, String arrival, int howOld, int distance,
               String land, boolean commercial, int countSeats) {
        super(company, movement, form, departure, arrival, howOld, distance, land, commercial);
        this.countSeats = countSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество мест: " + countSeats + ", цена билета: " + getTicketPrice();
    }

    public void costCalculation(){
        if (getArrival() == "Kurkino"){
            ticketPrice = 180;
        }
        if (getArrival() == "Kurkino") {
            ticketPrice = 260;
        }
        else
        {
            ticketPrice = 550;
        }
    }
    public int getCountSeats(){
        return countSeats;
    }

    public void setCountSeats(int countSeatsSet){
        this.countSeats = countSeatsSet;
    }

    public int getTicketPrice(){
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPriceSet){
        this.ticketPrice = ticketPriceSet;
    }

}
