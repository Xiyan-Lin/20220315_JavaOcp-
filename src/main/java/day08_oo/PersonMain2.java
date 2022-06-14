package day08_oo;

import java.util.Arrays;

public class PersonMain2 {

    public static void main(String[] args) {
        Person p1 = new Student("John", 18, 100);
        Person p2 = new Student("Jane", 19, 90);
        Person p3 = new Teacher("Mary", 28, 55000);
        Student s1 = new Student("Helen", 17, 70);
        Teacher t1 = new Teacher("Bob", 35, 78000);

        Person[] people = {p1, p2, p3, s1, t1};
        // 1.顯示人名
        for (Person person : people) {
            System.out.println(person.getName());
        }
        // 2.計算平均年齡
        double avgOfAge = Arrays.stream(people)
                //.mapToInt(p -> p.getAge())
                .mapToInt(Person :: getAge)
                .average()
                .getAsDouble();
        System.out.println(avgOfAge);
        // 3.印出所有學生分數 = ?
        for(Person person : people){
        //判斷 Person 是不是學生?
            //System.out.println(person.getClass().getSimpleName());
            //System.out.println(person.getClass().getSimpleName().equals("student"));
            if(person.getClass().getSimpleName().equals("student")){
                Student student = (Student)person; //將person轉型student
                System.out.println(student.getScore());
            }
            
    }
        for(Person person : people){
            //System.out.println((person instanceof Student) + ":" + person.getClass().getSimpleName().equals("student"));
            if(person instanceof  Student){
                Student student = (Student)person;
                System.out.println(student.getScore());
            }
        }
        
        // 4. 印出所有學生分數 = ?  Java8
        Arrays.stream(people)
              .filter(person -> person instanceof Student) // 過濾 student
              .map(person -> (Student)person) //轉為 Student 型別
              .forEach(person -> System.out.println(person.getScore()));

        // 5. 請求出老師的平均薪資(使用 Java8) =?
        double avgOfSalary = Arrays.stream(people)
                .filter(person -> person instanceof Teacher) //確認實質是不是Teacher
                .map(person -> (Teacher)person) //將Person轉型為Teacher
                .mapToDouble(teacher -> teacher.getSalary()) //轉換成數值
                .average()
                .getAsDouble();
        System.out.println(avgOfSalary);
    }
}
