package university;

public class Main {
    public static void main(String[] args){
        int countStudents = 6; //количетство студентов
    Student[] listStudents = new Student[countStudents];
        for (int i = 0; i < countStudents; i++) {
            String name = "Иванов "+ i;
            int courseNum = (int) (Math.random()*5+1);
            float averageScore = (float) (Math.random()*2+3);

            Student student = new Student(name,courseNum,averageScore);
            listStudents[i] = student;
            // посмотреть всех созданных студентов:  System.out.println(student.name + " c "+student.courseNum+" курса: средний балл - "+student.averageScore);

        }
    University university = new University("МГТУ им. Н.Э. Баумана", listStudents);
        university.showInfoUpFour(); // Метод выводит инфо о студентах с баллом выше 4

    }
}