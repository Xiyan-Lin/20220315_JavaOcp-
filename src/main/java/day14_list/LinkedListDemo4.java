
package day14_list;

import day13_set.Exam;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class LinkedListDemo4 {
    public static void main(String[] args) {
        Exam e1 = new Exam("Java", 100);
        Exam e2 = new Exam("Java", 100);
        Exam e3 = new Exam("VB", 90);
        Exam e7 = new Exam("Python", 90);
        Exam e8 = new Exam("Python", 90);
        Exam e4 = new Exam("Java", 80);
        Exam e5 = new Exam("VB", 95);
        Exam e6 = new Exam("VB", 90);
        List<Exam> exams = Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
        // 試問 Java 與 VB 的平均分數各是多少?
        /*
        Set<String> subjectNames = exams.stream()
                .map(e -> e.getSubject())
                .collect(Collectors.toSet());
        subjectNames.forEach(subjectName -> System.out.printf("%s %.1f\n", subjectName,getAvg(subjectName, exams)));
        */
        exams.stream()
                .map(e -> e.getSubject())
                .collect(Collectors.toSet())
                .forEach(subjectName -> printScore(subjectName,getAvg(subjectName, exams)));
    
    }   
    public static double getAvg(String subjectName, List<Exam> exams){
        return exams.stream()
                .filter(p -> p.getSubject().equals(subjectName))
                .mapToInt( Exam :: getScore)
                .average()
                .getAsDouble();
    }
    
   public static void printScore(String subjectName, double  avg){
       System.out.printf("%s : %.1f\n",subjectName, avg);
   }
    
    }

