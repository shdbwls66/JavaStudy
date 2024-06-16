# 함수
## 함수
값을 입력 받아 특정 작업을 수행한 후 결과를 반환함

### 기본 구조

```java
반환타입 함수이름(매개변수){
		메서드 몸체
		return 반환값;
}
```

**반환타입:** 함수의 반환값 타입. 반환값이 없는 경우 `void` 사용

**매개변수:** 함수에 전달되는 값. **파라미터** 라고도 함

**메서드 몸체:** 실제로 수행되는 코드블록

**`return`** : 함수의 실행을 중단하고 값을 반환. 반환값이 없으면 사용 X


### 정수 a와 b를 전달 받아 사칙 연산을 수행하는 함수

여기서 a, b는 **매개변수 또는 파라미터**

```java
// 덧셈
static int add(int a, int b) {
  return a+b;
}
// 뺄셈
static int minus(int a, int b) {
  return a-b;
}
// 곱셈
static int mul(int a, int b) {
  return a*b;
}
// 나눗셈
static int divide(int a, int b) {
  return a/b;
}
```

---
함수 실행

여기서 a, b 자리에 들어간 정수는 **전달 인자 또는 아규먼트**

```java
public static void main(String[] args) {

  System.out.println(add(2,1)); // 3
  System.out.println(minus(2,1)); // 1
  System.out.println(mul(2,1)); // 2
  System.out.println(divide(2,1)); // 2

}
```



## `main` 메서드

자바 프로그램의 실행은 `main` 메서드에서 시작

프로그램 실행 시 처음으로 호출되는 메서드이며, 다른 클래스와 메서드를 호출하여 프로그램의 동작을 조정하고 제어할 수 있음

아래 코드와 같은 구조를 가짐

```java
public static void main(String[] args) {

}
```

`public`: 어디에서나 접근 가능한 메서드 임을 나타낼 때 사용

`static`: 정적 메서드 임을 나타낼 때 사용. 정적 메서드는 인스턴스 생성 없이 호출 가능

`String[] args`: 메소드에 전달되는 인수 저장하는 문자열 배열. 커맨드 라인에서 전달된 인수를 받음




## 외부 클래스 가져오기

외부 파일의 클래스를 메인 파일에서 실행하려면..

- 클래스 파일: 클래스가 정의된 파일이 필요하며, 다른 패키지에서 클래스 파일을 가져올 때에는 `import`문 사용
- 컴파일: 외부 클래스 파일, 메인 파일 모두 컴파일
- 클래스 사용: 외부 클래스를 인스턴스화 하거나 외부 클래스의 정적 메서드를 호출하여 사용


### Test2의 메서드를 Test에서 실행

```java
public class Test {
  public static void main(String[] args) {

    Test2 test2 = new Test2();

    System.out.println(test2.add(1, 2)); // 3 출력
    System.out.println(test2.minus(5, 2)); // 3 출력
  }
}
```

```java
public class Test2 {

  public int add(int a, int b){
    return a+b;
  }

  public int minus(int a, int b){
    return a-b;
  }
}
```



# 클래스 #1
## 객체지향 프로그래밍
프로그래밍 방법론 중 하나

프로그램을 작성할 때 객체들을 만들어 서로 소통하도록 하는 방법


### 객체 지향에서의 객체

표현하고자 하는 현실의 사물을 추상적(공동의 정보?!) 으로 표현한 것

객체를 통해 사람을 표현하면

- Person 객체에 공통적으로 부여할 특성을 멤버변수로 주고

- 생성자를 작성하여 Person 타입의 인스턴스를 선언한다고 할 때 멤버변수는 어떻게 바꿀지 설정해주고 (초기화)

- 메서드를 작성하여 Person 객체 혹은 Person 타입의 인스턴스이라면 이용할 수 있는 동작을 선언

```java
public class Person {
	// 멤버변수
  String name;
  int phoneNumber;
  int money;
  int age;

  // 생성자
  public Person(String name, int phoneNumber, int money, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.money = money;
    this.age = age;
  }

	// 메서드
  public void sayHello() {
    System.out.println("my name is " + name);
  }
  
  public void sayMoney() {
    System.out.println("내가 가지고 있는 돈은 " + money + "야!");
  }
  
  public void teaching(Student student){
    student.levelUp();

  }
  public void cheating(Student student){
    student.levelDown();
  }

}
```

새로운 객체 생성

- `.teaching` `.cheating` 메서드가 실행될 때 불러올 객체와 그 객체의 메서드를 정의

```java
public class Student {
  int level; // 멤버 변수 (클래스의 상태)

  // 생성자
  public Student() {
    this.level = 1;
  }

  // 메서드 (기능)
  public void levelUp() {
  
    level++;
    System.out.println("레벨이 1 증가 했습니다.");
    System.out.println("현재 레벨은 = " + level + "입니다.");

  }

  public void levelDown() {
  
    if (level > 1) {
      level--;
      System.out.println("레벨이 1 감소 했습니다.");
      System.out.println("현재 레벨은 = " + level + "입니다.");
    }

    System.out.println("최소 레벨입니다");
    System.out.println("현재 레벨은 = " + level + "입니다.");

  }
}
```

이런 식으로 각 객체끼리 상호작용 시킴 

```java
  public static void main(String[] args) {
  
    Person person1 = new Person("노유진", 01010000000, 10000, 25);
    person1.sayHello();
    Person person2 = new Person("인간1호", 01011110000, 1000, 21);
    person2.sayMoney();

    Student student = new Student();

    person1.teaching(student);
    person1.cheating(student);

  }
```

코드를 실행 하면 아래와 같은 메세지 출력
```
my name is 노유진
내가 가지고 있는 돈은 1000야!
레벨이 1 증가 했습니다.
현재 레벨은 = 2입니다.
레벨이 1 감소 했습니다.
현재 레벨은 = 1입니다.
```


## 클래스
기본적으로 **멤버변수**와 **메서드**로 구성

클래스의 구조는 아래와 같음

```java
public class Class{
	// 멤버변수 - 클래스 상태, 데이터
	// 생성자 - 객체 초기화
	// 메서드 - 동작
}
```

`public`: 클래스가 어디에서나 접근 가능하게 함. 클래스는 일반적으로 `public`으로 선언

`class`: 클래스를 정의하는 키워드

`Class`: 클래스에 대한 고유한 식별자. 클래스 네임은 관례적으로 대문자로 시작하고 파스칼 표기법을 따름

### 클래스 정의

```java
public class Person {

	// 멤버변수
  String name;
  int phoneNumber;

  // 생성자
  public Person(String name, int phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

	// 메서드
  public void sayHello() {
    System.out.println("my name is " + name);
  }
```

클래스의 상태를 나타내는 멤버변수, 변수들을 초기화 하는 생성자, 클래스의 기능을 나타내는 메서드를 이용하여 클래스를 정의함

클래스를 사용하기 위해서는 예약어 new를 이용해 클래스의 인스턴스를 생성하여야 함

```java
Person person1 = new Person(이름, 폰넘버);
System.out.println(person1.sayHello());
```