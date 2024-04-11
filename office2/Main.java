package office2;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Person(1, "Иванов", 70000, 25);
        Person man2 = new Person(2, "Петров", 90000, 29);
        Person man3 = new Person(3, "Сидоров", 60000, 23);

        Person men[] = {man1, man2, man3};//сотрудники для первого офиса
        Office office = new Office("IT Start", men, "Москва");
        Person manMax = office.getManWithMaxSalary();
        Person manMin = office.getManWithMinSalary();
        int rate = 20;//величина премии и взыскания
        office.showInfo();
        Office.setRate(manMax,-rate);//взыскание
        Office.setRate(manMin,rate);//премия
        office.showInfo();

    }


}

