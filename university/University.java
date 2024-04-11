package university;

public class University {
    private String label;
    Student students[];


    public University(String label, Student students[]){
        this.label = label;
        this.students = students;
    }

    public void showInfoUpFour(){
        System.out.println("Список студентов со средней оценкой выше 4 баллов.");
        for (Student student : students) {
            if (student.averageScore>4){
                System.out.println("Студент " + student.name + " c "+ student.courseNum+" курса. Cредний балл:" +student.averageScore );
            }
        }

    }
}
