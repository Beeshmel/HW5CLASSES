package office;

/*
* Существует 2 вида методов - это статические и нестатические.
* Статические относятся к классу, а нестатические относятся к объекту класса.
* Если в методе нет this, то с вероятностью 99% этот метод должен быть static
* */

public class Person {
    int id;
    String fio;
    int salary;
    int age;

//    Конструктор - это метод, который называется по имени класса и вызывается
//    при создании объекта через оператор new. Конструктор не должен содержать
//    оператор return. Основная цель конструктора - заполнение свойств объекта значениями


    public Person(int id, String fio, int salary, int age) {
        this.id = id;
        this.fio = fio;
        this.salary = salary;
        this.age = age;
    }

    String getInfo(){
       return "Сотруднику " + fio + " " + age + " лет, его оклад " + salary;
    }



}
