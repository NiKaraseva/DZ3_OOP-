/**
 * Основной класс Transport
 */

public class Transport {
    private String company;
    private String movement;
    private String form;
    private String departure;
    private String arrival;
    private int howOld;
    private int distance;

    /**
     * Конструктор
     * @param company компания производитель
     * @param movement способ передвижения
     * @param form форма транспортного средства
     * @param departure место отправления
     * @param arrival место прибытия
     * @param howOld сколько лет транспортному средству
     * @param distance расстояние до пункта назначения
     */
    public Transport(String company, String movement, String form, String departure, String arrival, int howOld, int distance) {
        this.company = company;
        this.movement = movement;
        this.form = form;
        this.departure = departure;
        this.arrival = arrival;
        this.howOld = howOld;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Компания: " + company +
                ", способ передвижения: " + movement +
                ", форма транспортного средства: " + form +
                ", место отправления: " + departure +
                ", место прибытия: " + arrival +
                ", сколько лет транспортному средству: " + howOld +
                ", дистанция до места назначения: " + distance;
    }

    /**
     * Геттеры и сеттеры
     */
    public String getCompany(){
        return company;
    }

    public void setCompany(String companySet){
        this.company = companySet;
    }

    public String getMovement(){
        return movement;
    }

    public void setMovement(String movementSet){
        this.movement = movementSet;
    }

    public String getForm(){
        return form;
    }

    public void setForm(String formSet){
        this.form = formSet;
    }

    public String getDeparture(){
        return departure;
    }

    public void setDeparture(String departureSet){
        this.departure = departureSet;
    }

    public String getArrival(){
        return arrival;
    }

    public void setArrival(String arrivalSet){
        this.arrival = arrivalSet;
    }

    public int getHowOld(){
        return howOld;
    }

    public void setHowOld(int howOldSet){
        this.howOld = howOldSet;
    }

    public int getDistance(){
        return distance;
    }

    public void setDistance(int distanceSet){
        this.distance = distanceSet;
    }

}
