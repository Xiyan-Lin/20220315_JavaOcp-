
package day06_oo;


public class Classroom2 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John",40,90000);
        Student student1 = new Student("Mary", 18, 100);
        Student student2 = new Student("Bobo", 17, 90);
        
        System.out.println(teacher);
        System.out.println(student1);
        System.out.println(student2);
    }
}
