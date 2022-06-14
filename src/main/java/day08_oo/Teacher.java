
package day08_oo;


public class Teacher extends Person {
    private int salary;
    
    public Teacher(){}
    
    public Teacher(String name, int age, int salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
