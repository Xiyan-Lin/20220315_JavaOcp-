
package day23_forkjoin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamIterate {
    public static void main(String[] args) {
        /*
        Stream.iterate(1, n -> n*2)
              .limit(10) // 取10個
              .forEach(x -> System.out.println(x));
        */
        /*
        Stream.iterate(1, n -> n+1)
              .filter(x -> x%2 == 1)
              .limit(10)
              .forEach(x -> System.out.println(x));
        */
        /*
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0]+n[1]})
              .limit(10)
                .forEach(x -> System.out.println(Arrays.toString(x)));
        */
        /*
        Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0]+n[1]})
              .parallel()
              .limit(45)
              .mapToInt(n -> n[0])
              .forEach(x -> System.out.println(x));
        */
        List<Integer> list = Stream.iterate(new int[]{0,1}, n -> new int[]{n[1],n[0]+n[1]})
            //.sequential()
              .parallel()
              .limit(45)
              .peek(x -> System.out.println(x[0]))
              .mapToInt(n -> n[0]) // Object/Integer
              .boxed() //可以藉由 boxed 轉 Integer stream
              .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
    
    
    }
}
