package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String models[] = {"Гранта","Веста","Нива","БМВ"};//Модели, которые заказываем
        String modelsFactory[] = {"Гранта","Веста","Нива","Ларгус"};
        Factory factory = new Factory("АвтоВаз",modelsFactory);
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько автомобилей необходимо заказать?\n");
        int count = Integer.parseInt(reader.readLine());
        Diller diller = new Diller("Элвис",20);

        diller.makeOrder(factory,count,models); //Информация о количестве машин добавлена в эту команду order.showInfoCars(factory);
        factory.isDillerOld(diller); //Если диллер имеет стаж работы от 10 лет, то завод представляет скидку в 10%


    }
}
