
package day08_oo;


public class PersonMain {
    public static void main(String[] args) {
        //不使用多型
        Student student1 = new Student("John", 18, 100);
        Teacher teacher1 = new Teacher("Mary", 20, 55000);
        Student student2 = new Student("Jane", 19, 90);
        
        Student[] students = {student1,student2};
        Teacher[] teachers = {teacher1};
        for(Student student : students){
            System.out.println(student.getName());
        }
        for(Teacher teacher : teachers){
            System.out.println(teacher.getName());
        }
        
        
        
    }
}
