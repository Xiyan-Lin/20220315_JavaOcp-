package day16_collections;

// 排序 List + 複合元素

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsSort2 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
              new User("John", 18),
              new User("Mary", 19),
              new User("Bob", 19),
              new User("Jim", 20),
              new User("Helen", 22)    
        );
        // 排序 stream
        Comparator<User> comp = Comparator.comparing(User :: getAge);
        users = users.stream().sorted(comp).collect(Collectors.toList());
        System.out.println(users);
        // 排序 stream, 依照年齡來排, 若年齡相同則比較姓名
        Comparator<User> comp2 = Comparator.comparing(User::getAge)
                                           .thenComparing(User::getName);
        users = users.stream().sorted(comp2).collect(Collectors.toList());
        System.out.println(users);
    }
}
