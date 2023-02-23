public class Car extends Auto{

    private String bodyType;
    private String fuelType;
    private double engineCapacity;

    /**
     * @param bodyType тип кузова
     * @param fuelType тип топлива
     * @param engineCapacity объём двигателя
     */
    public Car(String company, String movement, String form, String departure, String arrival, int howOld, int distance,
               String land, boolean commercial, String bodyType, String fuelType, double engineCapacity) {
            super(company, movement, form, departure, arrival, howOld, distance, land, commercial);
            this.bodyType = bodyType;
            this.fuelType = fuelType;
            this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", тип кузова: " + bodyType + ", тип топлива: " + fuelType +
                ", объём двигатеоя: " + engineCapacity;
    }


    public int fuelCalculate(double fuelCount){
        double fuelConsumption = (fuelCount / getDistance()) * 100;
        return (int) fuelConsumption;
    }

    public String getBodyType(){
        return bodyType;
    }

    public void setBodyType(String bodyTypeSet){
        this.bodyType = bodyTypeSet;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelTypeSet){
        this.fuelType = fuelTypeSet;
    }

    public double getEngineCapacity(){
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacitySet){
        this.engineCapacity = engineCapacitySet;
    }
}
