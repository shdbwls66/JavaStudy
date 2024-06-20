package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) throws InterruptedException {

    //    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    //
    //    numbers.stream()
    //            .filter(integer -> integer % 2 != 0)
    //            .forEach(integer -> System.out.println(integer));
    //
    List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "melon", "a", "bb"));
    List<String> list =
        fruits.stream()
                .filter(str -> str.length() <= 5)
                .collect(Collectors.toList());

    System.out.println(list);

    //    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //    List<Integer> result =
    //        numbers.stream().filter(integer -> integer % 2 != 0).collect(Collectors.toList());
    //
    //    System.out.println(result);

    //    numbers.stream().sorted().forEach(integer -> System.out.println(integer));

    //    numbers.stream().filter(integer -> integer % 2 == 0); // 조건에 맞는 숫자만 포함
    //    numbers.stream().map(integer -> integer * 2); // 매핑
    //    numbers.stream().sorted(); // 정렬

    //    numbers.stream()
    //        .filter(integer -> integer % 2 == 0)
    //        .forEach(integer -> System.out.println(integer)); // 최종연산

    //    List<Integer> collect =
    //        numbers.stream().map(integer -> integer * 2).collect(Collectors.toList());
    //
    //    for (int i : collect) {
    //      System.out.println(i);
    //    }

    //        int[] array = {1,2,3,4,5};
    //        Arrays.stream(array);
    //      Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

    //    List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    //
    //    numbers.removeIf((integer) -> integer % 2 == 0);
    //
    //    System.out.println(numbers);

    //    Iterator<Integer> iterator = numbers.iterator();
    //
    //    while(iterator.hasNext()){
    //      Integer next = iterator.next();
    //      if (next % 2 == 0) {
    //        iterator.remove();
    //      }
    //    }
    //    System.out.println(numbers);

    //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    //    callList(list);

    //        Thread thread1 = new Thread(new MyRunnable(1));
    //        Thread thread2 = new Thread(new MyRunnable(2));
    //        Thread thread3 = new Thread(new MyRunnable(3));
    //        Thread thread4 = new Thread(new MyRunnable(4));
    //        Thread thread5 = new Thread(new MyRunnable(5));
    //
    //        thread1.start();
    //        thread2.start();
    //        Thread.sleep(5000);
    //        thread3.start();
    //        thread4.start();
    //        thread5.start();

    //        MyThread myThread = new MyThread("스레드");
    //        MyThread myThread1 = new MyThread("스레드1");
    //        MyThread myThread2 = new MyThread("스레드2");
    //        MyThread myThread3 = new MyThread("스레드3");
    //        MyThread myThread4 = new MyThread("스레드4");
    //
    //        myThread.start(); // 스레드 시작
    //        myThread1.start();
    //        myThread2.start();
    //        myThread3.start();
    //        myThread4.start();

    //    Coin coin = new Coin(100); // heap 에 저장
    //
    //    coin.getValue();
    //
    //    coin = null; // GC 에서 new Coin(100) 제거
  }

  //  public static void callList(List<Integer> integerList) {
  //    for (int i : integerList) {
  //      System.out.println(i);
  //    }
  //  }

}
