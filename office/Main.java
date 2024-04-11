package office;

public class Main {
    public static void main(String[] args) {
        Person man1 = new Person(1,"Иванов",70000,25);
        Person man2 = new Person(2,"Петров",90000,29);
        Person man3 = new Person(3,"Сидоров",60000,23);

        Person man4 = new Person(4,"Алексеев",70000,25);
        Person man5 = new Person(5,"Романов",90000,29);
        Person man6 = new Person(6,"Андреев",60000,23);

        Person men1[] = {man1,man2,man3};//сотрудники для первого офиса
        Person men2[] = {man4,man5};//сотрудники для 2 офиса
        Person men3[] = {man1,man6};


        Office office1 = new Office("IT Start",men1,"Москва");
        Office office2 = new Office("IT Start",men2,"Омск");
        Office office3 = new Office("IT Start",men3,"Казань");

        Office offices[] = {office1,office2,office3};

        for (var office : offices){
            Person man = office.getManWithMaxSalary();

            System.out.println(man.fio + " имеет максимальный оклад " + man.salary);

            office.showInfo();
        }






    }
}
