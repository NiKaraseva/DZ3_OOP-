public class Auto extends OnGround{

    private boolean commercial;
    public Auto(String company, String movement, String form, String departure, String arrival, int howOld, int distance, String land,
                boolean commercial) {
        super(company, movement, form, departure, arrival, howOld, distance, land);
        this.commercial = commercial;
    }

    @Override
    public String toString() {
        return super.toString() + ", коммерческий транспорт: " + commercial;
    }

    public boolean getCommercial(){
        return commercial;
    }

    public void setCommercial(boolean commercialSet){
        this.commercial = commercialSet;
    }
}
