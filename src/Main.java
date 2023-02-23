public class Main {
    public static void main(String[] args) {

        /**
         * Создали объект класса OnAir
         */
        OnAir airplane = new OnAir("Airbus", "air", "airplane", "Moscow",
                "Colombo", 10, 6570, "Emirates", 700, 150);

        System.out.println(airplane);
        System.out.println();

        /**
         * Создали объект класса Train
         */

        Train sapsan = new Train("Siemens AG", "ground", "train", "St.Petersburg",
                "Moscow", 5, 2000, "plain", 12, 2, 4500);

        System.out.println(sapsan);

        /**
         * Воспользовались двумя методами: посчитали стоимость СВ билетов и количество экипажа на борту
         */
        System.out.println("Стоимость СВ билатов на Сапсан равна: " + sapsan.svTickets(sapsan));
        System.out.println("Общее количество экипажа на борту равно: " + sapsan.crewCalculation(sapsan));
        System.out.println();

        /**
         * Создали объект класса Car
         */
        Car passengerCar = new Car("Honda", "ground", "auto", "Podolsk", "Rostov",
                5, 262, "plain", false, "sidan", "petrol", 1.8);

        System.out.println(passengerCar);

        /**
         * Воспользовались методом подсчёта расхода топлива
         */
        System.out.println("Расход топлива на " + passengerCar.getDistance() + " км составляет: " + passengerCar.fuelCalculate(1000));
        System.out.println();

        /**
         * Создали объект класса Bus
         */
        Bus passengerBus = new Bus("Volgabus", "ground", "bus", "Moskow", "Kurkino",
                9, 70, "plain", true, 25);

        /**
         * Воспользовались методом подсчёта стоимости билета до пункта назначения
         */
        passengerBus.costCalculation();

        System.out.println(passengerBus);
        System.out.println();
    }

}