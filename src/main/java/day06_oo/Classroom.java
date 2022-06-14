
package day06_oo;

public class Classroom {
    public static void main(String[] args) {
        //建構子
        Teacher teacher = new Teacher();
        Student student1 = new Student();
        Student student2 = new Student();
        // 設定物件資料
        teacher.setName("John");
        teacher.setAge(40);
        teacher.setSalary(90_000);
        student1.setName("Mary");
        student1.setAge(10);
        student1.setScore(100);
        student2.setName("Bobo");
        student2.setAge(17);
        student2.setScore(90);
        // 印出物件內容
        System.out.println(teacher);
        System.out.println(student1);
        System.out.println(student2);
        
    }
}
