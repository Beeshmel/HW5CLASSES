package office;

public class Office {
    String title;
    Person men[];
    String address;

    public Office(String title, Person[] men,String address) {
        this.title = title;
        this.men = men;
        this.address = address;
    }

    void showInfo(){
        System.out.println("В офисе " + title + " по адресу город " + address +" работают следующие сотрудники:");
        for(var man : men){
            System.out.println(man.getInfo());
        }
        System.out.println("Сотрудник " + getManWithMaxSalary().fio + " имеет максимальный оклад");
        System.out.println("\n--------------------------------\n");
    }

    Person getManWithMaxSalary(){
        Person man = men[0];//пусть первый сотрудник это сотрудник с макс. окладом
        for(var i = 1;i < men.length;i++){//перебираем оставшихся
            if(men[i].salary > man.salary){
                man = men[i];
            }
        }
        return man;
    }
}
