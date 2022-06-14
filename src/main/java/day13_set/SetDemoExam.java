package day13_set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.stream.Collectors.toSet;

public class SetDemoExam {

    public static void main(String[] args) {
        Exam e1 = new Exam("國文", 100);
        Exam e2 = new Exam("英文", 70);
        Exam e3 = new Exam("數學", 90);

        Set<Exam> exams = new LinkedHashSet<>();
        exams.add(e1);
        exams.add(e2);
        exams.add(e3);

        System.out.println(exams.size());
        System.out.println(exams);

        // 總分
        int sum1 = exams.stream().mapToInt(exam -> exam.getScore()).sum();
        int sum2 = exams.stream().mapToInt(Exam::getScore).sum();
        System.out.println(sum1);
        System.out.println(sum2);

        // 求最高分
        int max = exams.stream().mapToInt(exam -> exam.getScore()).sum();
        System.out.println(max);

        // 求最高分的科目?
        // java 7
        Set<String> subjects = new LinkedHashSet<>(); //儲存最高分的科目
        for (Exam exam : exams) {
            if (exam.getScore() == max) {
                subjects.add(exam.getSubject());
            }
        }

        System.out.println(subjects);

        // Java 8 Part I
        Set<String> subjects2 = exams.stream()
                .filter(exam -> exam.getScore() == max)
                .map(exam -> exam.getSubject()) //{"國文", "數學"} stream 型態
                .collect(toSet()); //傳Set集合 
        
        System.out.println(subjects2);
        // Java 8 Part II
        // filter(Predicate)
        // map(function)
        Predicate<Exam> highScorePredicate = exam -> exam.getScore() == max;
        Function<Exam, String> mapToSubject = exam -> exam.getSubject();
        Set<String> subjects3 = exams.stream()
                                     .filter(highScorePredicate)
                                     .map(mapToSubject)
                                     .collect(toSet());
        System.out.println(subjects3);
        
        
    }
}
