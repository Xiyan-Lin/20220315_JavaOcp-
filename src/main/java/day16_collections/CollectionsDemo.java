
package day16_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(91, 85, 92, 69, 75);
        // 取出最大值
        int max = Collections.max(scores);
        System.out.println(max);
        // 取出二數相加後的最大值
        // 例如: 91 -> 10, 85 -> 13
        int max2 = Collections.max(scores, (o1, o2) -> (o1/10 + o1%10)-(o2/10 + o2%10));
        System.out.println(max2);
    }
}
