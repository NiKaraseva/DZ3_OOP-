public class OnAir extends Transport{

    private String airlines;
    private int breakawaySpeed;
    private int takeoffDistance;

    /**
     * @param airlines авиакомпания
     * @param breakawaySpeed скорость отрыва
     * @param takeoffDistance взлётная дистанция
     */
    public OnAir(String company, String movement, String form, String departure, String arrival, int howOld, int distance,
                 String airlines, int breakawaySpeed, int takeoffDistance) {
        super(company, movement, form, departure, arrival, howOld, distance);
        this.airlines = airlines;
        this.breakawaySpeed = breakawaySpeed;
        this.takeoffDistance = takeoffDistance;
    }


    @Override
    public String toString() {
        return super.toString() + ", авиакомпания: " + airlines + ", скорость отрыва: " + breakawaySpeed + ", взлётная дистанция: " + takeoffDistance;
    }

    public String getAirlines(){
        return airlines;
    }

    public void setAirlines(String airlinesSet){
        this.airlines = airlinesSet;
    }

    public int getBreakawaySpeed(){
        return breakawaySpeed;
    }

    public void setBreakawaySpeed(int breakawaySpeedSet){
        this.breakawaySpeed = breakawaySpeedSet;
    }

    public int getTakeoffDistance(){
        return takeoffDistance;
    }

    public void setTakeoffDistance(int takeoffDistanceSet){
        this.takeoffDistance = takeoffDistanceSet;
    }



}
