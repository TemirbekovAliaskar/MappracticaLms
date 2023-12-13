package task1;

import task1.Car;
import task1.CarInfo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Car,CarInfo> infoMap = new HashMap<>();
        infoMap.put(new Car(1,"280AB"),new CarInfo(LocalDate.of(2020,4,3),"Tayota",5000,"green"));
        infoMap.put(new Car(2,"570AA"),new CarInfo(LocalDate.of(2013,5,3),"Corolla",7000,"blue"));

        map(infoMap);
    }

    public static void map(Map<Car,CarInfo> arr){
        for (Map.Entry<Car,CarInfo >entry : arr.entrySet()){
            Car car = entry.getKey();
            CarInfo carInfo = entry.getValue();
            System.out.println("CAR  " + car  + "CARINFO   " + carInfo);
        }

    }
}