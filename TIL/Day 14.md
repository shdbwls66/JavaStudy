# 제네릭

## 제네릭
자바 5부터 새롭게 추가된 타입

데이터의 타입을 일반화 하는 것

제네릭은 클래스와 인터페이스 메서드를 정의할 때 타입을 파라미터로 사용할 수 있도록 함

클래스나 메서드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정

미리 타입 검사를 수행하면

- 컴파일 시 미리 타입이 정해져 타입 검사나 변환 같은 작업을 생략 가능
- 클래스나 메서드 내부에서 사용하는 타입 안정성을 높일 수 있음

### 제네릭을 사용하는 이유

컴파일 시 강한 타입 체크로 에러를 사전에 방지 가능

타입이 처음부터 정해지므로 타입 변환 필요 없음

아래처럼 제네릭을 이용할 수 있음

클래스 내부에서 원하는 타입 지정 가능 (그냥 만들 때 T로 퉁치고 메인 메서드에서 원하는 타입 치환시키면 됨)

```java
public class CarGeneric<T> {
  private T t;

  public T get() {
    return t;
  }

  public void set(T t) {
    this.t = t;
  }

}
```

이런식으로 타입 지정할 수 있음

```java
CarGeneric<String> strCarGeneric = new CarGeneric<>();

strCarGeneric.set("hello");
String str = strCarGeneric.get();
System.out.println(str); // hello 출력
```

## 제네릭 타입

타입을 파라미터로 가지는 클래스와 인터페이스

클래스 또는 인터페이스 뒤에 <> 부호가 붙고 사이에 타입 파라미터가 위치

```java
public class 클래스 이름<T>{}
```

### 타입 파라미터를 사용하는 이유

아래의 Box 클래스를 보면 필드 타입이 Object

Object는 자바 클래스의 최상위 부모 클래스이므로, 모든 자바 객체는 Object 타입으로 자동 변환되어 저장

```java
public class Box {
	private Object object;

	public void set(Object object) {
		this.object = object;
	}

	public Object get() {
		return object;
	}
}
```

여기서 set() 메서드는 매개변수 값을 Object 필드에 저장, get() 메서드는 필드에 저장된 객체를 Object 타입으로 리턴

따라서 필드에 저장된 원래 타입의 객체를 얻기 위해서는 따로 타입 변환을 해주어야 함

```java
Box box = new Box();
box.set("hi"); // String 타입 -> Object 타입
String str = (String) box.get(); // Object -> String
```

하지만 Object 자리에 타입 파라미터 T를 넣는다면..

T → String

필드는 String으로 변경

set 메서드는 매개변수로 String 타입을 받고, get 메서드는 String 타입을 반환하도록 변경

객체를 생성할 때 별도로 타입 변환 과정을 거칠 필요 X

```java
public class Box<String> {
	private String t;

	public void set(String t) {
		this.t = t;
	}

	public String get() {
		return t;
	}
}
```

```java
Box<String> box = new Box<String>();
box.set("hello");       
String str = box.get(); 
```

## 제네릭 메서드

매개 타입과 리턴 타입으로 타입 파라미터를 갖는 메서드

리턴 타입 앞에  <> 기호 추가, 타입 파라미터 기술 → 리턴 타입과 매개 타입으로 타입 파라미터 이용

```java
public <타입 파라미터, ..> 리턴 타입 메서드 이름(파라미터, ...){}
```

요런식으로 사용

매개 변수 타입으로 T를 사용하였으며, 리턴 타입으로 제네릭 타입 Box<T> 사용

```java
public <T> Box<T> boxing(T t) {
}
```

제네릭 메서드는 다음과 같은 방식으로 호출 가능

컴파일러가 매개값의 타입을 보고 구체적인 타입을 추정하도록 할 수 있음

```java
리턴 타입 변수 = 메서드명(매개값);
```

```java
Box<Integer> box = boxing(100);
```

## 제한된 타입 파라미터

타입 파라미터에 구체적인 타입을 제한하는 가능

제한된 타입 파라미터를 선언하려면 타입 파라미터 뒤에 extends 키워드, 상위 타입 명시

이 때 상위타입은 인터페이스도 가능

```java
public <T extends 상위타입(인터페이스)> 리턴타입 메서드(매개변수)
```

String을 넣어 문자열로 타입 제한

```java
public static <T extends String> void compareString(T t1, T t2) {
  System.out.println(t1.equals(t2) ? "okay" : "no");
}
```

Number를 넣어 숫자형으로 타입 제한

```java
public static <T extends Number> int compare(T t1, T t2) {
  double v1 = t1.doubleValue();
  double v2 = t2.doubleValue();
  return Double.compare(v1, v2);
}
```

실행 결과

```java
System.out.println(compare(1, 2)); // -1 리턴
compareString("a", "a"); // okay
compareString("a", "ab"); // no
```



## 와일드카드 타입

일반적으로 ?를 와일드카드라고 함

제네릭 타입을 매개값이나 리턴 타입으로 사용할 때 와일드카드 사용할 수 있음

- 제네릭 타입<?>
    - 타입 파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올 수 있음
- 제네릭 타입<? extends 상위 타입>
    - 타입 파라미터를 대치하는 구체적인 타입으로 해당 상위 타입 부터 하위타입까지 올 수 있음 (상위 클래스 제한)
- 제네릭 타입<? super 하위 타입>
    - 타입 파라미터를 대치하는 구체적인 타입으로 해당 하위 타입 부터 상위 타입까지 올 수 있음 (하위 클래스 제한)

Course 클래스 생성

name과 students 배열을 필드에 생성

타입 파라미터로 배열을 생성하려면 `(T[]) (new Object[capacity])` 이런 형태로 작성해야 함

```java
public class Course<T> {
  private String name;
  private T[] students;

  public Course(String name, int capacity) {
    this.name = name;
    students = (T[]) (new Object[capacity]);
  }

  public String getName() {
    return this.name;
  }

  public T[] getStudents() {
    return students;
  }

  // 배열에 비어있는 부분을 찾아서 추가
  public void add(T t) {
    for (int i = 0; i < students.length; i++) {
      if (students[i] == null) {
        students[i] = t;
        break;
      }
    }
  }
}
```

Person 클래스와 Student, Worker 클래스, HighStudent 클래스 생성

```java
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}

public class Student extends Person {
    public Student(String name) {
        super(name);
    }
}

public class Worker extends Person {
    public Worker(String name) {
        super(name);
    }
}

public class HighStudent extends Student {
    public HighStudent(String name) {
        super(name);
    }
}
```

registerCourse() 메서드의 매개값으로 와일드 카드 타입 이용

Course<?> → 모든 수강생들이 들을 수 있음

Course<? extends Student> → 학생만 들을 수 있음

Course<? super Worker> → 직장인만 들을 수 있음

```java
public static void registerCourse(Course<?> course) {
  System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
}

public static void registerCourseStudent(Course<? extends Student> course) {
  System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
}

public static void registerCourseWorker(Course<? super Worker> course) {
  System.out.println(course.getName() + "수강생: " + Arrays.toString(course.getStudents()));
}

public static void main(String[] args){

	Course<Person> personCourse = new Course<>("일반인과정", 5);
	personCourse.add(new Person("일반인"));
	personCourse.add(new Worker("직장인"));
	personCourse.add(new Student("학생"));
	personCourse.add(new HighStudent("고등학생"));
	
	Course<Worker> workerCourse = new Course<>("직장인과정", 5);
	workerCourse.add(new Worker("직장인"));
	
	Course<Student> studentCourse = new Course<>("학생과정", 5);
	studentCourse.add(new Student("학생"));
	studentCourse.add(new HighStudent("고등학생"));
	
	Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
	highStudentCourse.add(new HighStudent("고등학생"));
	
	registerCourse(personCourse);
	registerCourse(workerCourse);
	registerCourse(studentCourse);
	registerCourse(highStudentCourse);
	
	System.out.println("===================");
	System.out.println("===================");
	System.out.println("===================");
	
	registerCourseStudent(studentCourse);
	registerCourseStudent(highStudentCourse);
	
	System.out.println("===================");
	System.out.println("===================");
	System.out.println("===================");
	
	registerCourseWorker(personCourse);
	registerCourseWorker(workerCourse);

}
```