package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
  public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>(10000);
        List<String> linkedList = new LinkedList<>();

        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
          arrayList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("arrayList 걸린시간: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
          linkedList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("linkedList 걸린시간: " + (endTime - startTime));

    //    List<String> arrayList = new ArrayList<>();
    //    arrayList.add("Java");
    //    arrayList.add("Spring");
    //    arrayList.add("Servlet/JSP");
    //    arrayList.add("DBMS");
    //    arrayList.add("JPA");
    //
    //    System.out.println("총 객체 수: " + arrayList.size());
    //
    //    System.out.println("=================");
    //
    //    for(String str : arrayList){
    //      System.out.println(str);
    //    }
    //
    //    System.out.println("=================");
    //
    //    arrayList.add(2, "hello");
    //    for(String str : arrayList){
    //      System.out.println(str);
    //    }
    //
    //    System.out.println("=================");
    //
    //    arrayList.remove(2);
    //    for(String str : arrayList){
    //      System.out.println(str);
    //    }
    //
    //    System.out.println(arrayList.contains("java"));

    //    ArrayList<Object> list = new ArrayList<>();
    //    list.add(null);
    //
    //    System.out.println(list.isEmpty());
    //
    //    list.clear();
    //    System.out.println(list.isEmpty());
    //
    //    for (String str : arrayList) {
    //      System.out.println(str);
    //    }

    //    ChildProduct<Tv, String, String> product = new ChildProduct<>();
    //    product.setKind(new Tv());
    //    product.setModel("smart TV");
    //    product.setCompany("Samsung");
    //
    //    StorageImpl<Tv> tvStorage = new StorageImpl<>(100);
    //    tvStorage.add(new Tv(), 0);

    //    Course<Person> personCourse = new Course<>("일반인", 5);
    //    personCourse.add(new Person("일반인"));
    //    personCourse.add(new Worker("직장인"));
    //    personCourse.add(new Student("학생"));
    //    personCourse.add(new HighStudent("고등학생"));
    //
    //    Course<Worker> workerCourse = new Course<>("직장인과정", 5);
    //    workerCourse.add(new Worker("직장인"));
    //
    //    Course<Student> studentCourse = new Course<>("학생과정", 5);
    //    studentCourse.add(new Student("학생"));
    //    studentCourse.add(new HighStudent("고등학생"));
    //
    //    Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
    //    highStudentCourse.add(new HighStudent("고등학생"));
    //
    //    registerCourse(personCourse);
    //    registerCourse(workerCourse);
    //    registerCourse(studentCourse);
    //    registerCourse(highStudentCourse);
    //
    //    System.out.println("===================");
    //    System.out.println("===================");
    //    System.out.println("===================");
    //
    //    registerCourseStudent(studentCourse);
    //    registerCourseStudent(highStudentCourse);
    //
    //    System.out.println("===================");
    //    System.out.println("===================");
    //    System.out.println("===================");
    //
    //    registerCourseWorker(personCourse);
    //    registerCourseWorker(workerCourse);

    //        System.out.println(compare(1, 2));
    //        compareString("a", "a");
    //        compareString("a", "ab");
  }

  public static void registerCourse(Course<?> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseStudent(Course<? extends Student> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  public static void registerCourseWorker(Course<? super Worker> course) {
    System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
  }

  //    public static <T extends Number> int compare(T t1, T t2) {
  //      double v1 = t1.doubleValue();
  //      double v2 = t2.doubleValue();
  //      return Double.compare(v1, v2);
  //    }
  //
  //    public static <T extends String> void compareString(T t1, T t2) {
  //      System.out.println(t1.equals(t2) ? "okay" : "no");
  //    }
}
