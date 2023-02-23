public class OnGround extends Transport{

    private String land;

    public OnGround(String company, String movement, String form, String departure, String arrival, int howOld, int distance,
                    String land) {
        super(company, movement, form, departure, arrival, howOld, distance);
        this.land = land;
    }

    @Override
    public String toString() {
        return super.toString() + ", поверхность: " + land;
    }

    public String getLand(){
        return land;
    }

    public void setLand(String landSet){
        this.land = landSet;
    }
}
