package office2;

public class Office {
    String title;
    Person men[];
    String address;

    public Office(String title, Person[] men, String address) {
        this.title = title;
        this.men = men;
        this.address = address;
    }

    /**
     *
     * @param person - сотрудник, у которого меняем оклад
     * @param rate - если > 0 - значит премия, а иначе взывскание
     */
    static void setRate(Person person,int rate){
        System.out.println(person.fio + (rate > 0 ?
                " Поздравляем, у Вас премия " + rate + "%" :
                " Сожалеем, у Вас взыскание"));
        person.salary +=  person.salary * rate / 100;
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

    Person getManWithMinSalary(){
        Person man = men[0];//пусть первый сотрудник это сотрудник с мин. окладом
        for(var i = 1;i < men.length;i++){//перебираем оставшихся
            if(men[i].salary < man.salary){
                man = men[i];
            }
        }
        return man;
    }
}
