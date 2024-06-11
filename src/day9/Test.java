package day9;

public class Test {
  public static void main(String[] args) {

//    Test2 test2 = new Test2();
//
//    System.out.println(test2.add(1, 2));
//    System.out.println(test2.minus(5, 2));

    Person person1 = new Person("노유진", 01010000000, 10000, 25);
    person1.sayHello();
    Person person2 = new Person("인간1호", 01011110000, 1000, 21);
    person2.sayMoney();

    Student student = new Student();

    person1.teaching(student);
    person1.cheating(student);

  }
}
