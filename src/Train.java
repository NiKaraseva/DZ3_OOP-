public class Train extends OnGround{
    private int countWagons;
    private int crewWagons;
    private int ticketPrice;

    /**
     *
     * @param countWagons количество вагонов
     * @param crewWagons количество экипажа в 1 вагоне
     * @param ticketPrice цена билета
     */
    public Train(String company, String movement, String form, String departure, String arrival, int howOld, int distance, String land,
                 int countWagons, int crewWagons, int ticketPrice) {
        super(company, movement, form, departure, arrival, howOld, distance, land);
        this.countWagons = countWagons;
        this.crewWagons = crewWagons;
        this.ticketPrice = ticketPrice;

    }

    @Override
    public String toString() {
        return super.toString() + ", количество вагонов: " + countWagons + ", количество экипажа: " + crewWagons +
                ", цена билета: " + ticketPrice;
    }


    public int crewCalculation(Train obj){
        int crew = crewWagons*countWagons;
        return crew;
    }

    public int svTickets(Train obj){
        int svPrice = (int) (ticketPrice * 1.75);
        return svPrice;
    }
    public int getCountWagons(){
        return countWagons;
    }

    public void setCountWagons(int countWagonsSet){
        this.countWagons = countWagonsSet;
    }

    public int getCrewWagons(){
        return crewWagons;
    }

    public void setCrewWagons(int crewWagonsSet){
        this.crewWagons = crewWagonsSet;
    }

    public int getTicketPrice(){
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPriceSet){
        this.ticketPrice = ticketPriceSet;
    }
}

