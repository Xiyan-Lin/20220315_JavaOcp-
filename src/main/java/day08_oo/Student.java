
package day08_oo;


public class Student extends Person{
    private int score;
    
    public Student(){
        
    }
    
    public Student(String name, int age, int score){
        setName(name);
        setAge(age);
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
