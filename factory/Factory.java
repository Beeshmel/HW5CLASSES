package factory;

import java.util.Arrays;

public class Factory {
    String titleFactory;
    String listCars[];
    private Diller diller;
    private int sum=0;




    public Factory(String titleFactory,String listCars[]) {
        this.titleFactory = titleFactory;
        this.listCars = listCars;
        System.out.println("Завод может изготовить следующие авто:");
        System.out.println(Arrays.toString(listCars));

    }

    Car createCar(String titleCar) {
        if (!isCanCreateCar(titleCar)) {
            System.out.println("Завод " + titleFactory + " не изготавливает " + titleCar);
            return null;
        } else {
            System.out.println("Завод " + titleFactory + " приступил к сборке автомобиля " + titleCar);
                Car car = new Car(titleCar, (int) (Math.random() * 4000 + 1000));
                sum += car.getPrice();


            return car;

        }
    }

    boolean isCanCreateCar(String titleCar){
        for (String car: listCars) {
            if (car.equals(titleCar)) {
                return true;
            }
        }
        return false;
    }

    void isDillerOld(Diller diller){
        if (diller.ageDiller > 10){
            System.out.println("Завод дарит вам скидку 10%. Сумма с учетом скидки: "+ (sum*0.9));
        }else {
            System.out.println("Спасибо за покупку!");
        }
    }




}
