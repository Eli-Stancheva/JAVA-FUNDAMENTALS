package FUNDAMENTALS.FINAL_EXAM_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P3_NeedforSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> carMileage = new HashMap<>();
        Map<String, Integer> carFuel = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] cars = scanner.nextLine().split("[|]");
            String carName = cars[0];
            int mileage = Integer.parseInt(cars[1]);
            int fuel = Integer.parseInt(cars[2]);

            carMileage.put(carName, mileage);
            carFuel.put(carName, fuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split(" : ");
            String command = data[0];
            String car = data[1];

            switch (command) {
                case "Drive":
                    int driveDistance = Integer.parseInt(data[2]);
                    int driveFuel = Integer.parseInt(data[3]);

                    if (carFuel.get(car) < driveFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int startProbeg = carMileage.get(car);
                        int currProbeg = startProbeg + driveDistance;
                        carMileage.put(car, currProbeg);

                        int startFuel = carFuel.get(car);
                        int currFuel = startFuel - driveFuel;
                        carFuel.put(car, currFuel);

                        System.out.printf("%s driven for %s kilometers. %s liters of fuel consumed.\n", car, driveDistance, driveFuel);
                    }

                    if (carMileage.get(car) >= 100000){
                        carMileage.remove(car);
                        carFuel.remove(car); //?
                        System.out.printf("Time to sell the %s!\n", car);
                    }
                    break;
                case "Refuel":
                    int refuelFuel = Integer.parseInt(data[2]);
                    int sumLitres = refuelFuel + carFuel.get(car);

                    if (sumLitres > 75){           //sipvam kolkoto trqbva do 75l
                        int overFlue = Math.abs(75 - sumLitres);
                        int toRefuel = refuelFuel - overFlue;
                        int currFuel = carFuel.get(car);
                        carFuel.put(car, toRefuel + currFuel);
                        System.out.printf("%s refueled with %s liters\n", car, toRefuel);
                    } else {                       //sipvam cqloto dadeno gorivo
                        carFuel.put(car, sumLitres);
                        System.out.printf("%s refueled with %s liters\n", car, refuelFuel);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(data[2]);
                    int newProbeg = carMileage.get(car) - kilometers;

                    if (newProbeg < 10000){
                        carMileage.put(car, 10000);
                    } else {
                        System.out.printf("%s mileage decreased by %d kilometers\n", car, kilometers);
                        carMileage.put(car, newProbeg);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        carMileage.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.printf("%s -> Mileage: %s kms, Fuel in the tank: %s lt.\n", e.getKey(), e.getValue(), carFuel.get(e.getKey())));
    }
}
