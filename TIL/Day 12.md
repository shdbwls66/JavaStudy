# 예외 처리

## 에러와 예외

### 에러
프로그램 실행 중에 발생하는 문제로 프로그램의 비정상적인 종료를 야기

주로 JVM 에서 발생하며, 프로그래머가 직접 처리 불가능

대표적인 에러의 예: `OutOfMemoryError`, `StackOverflowError`


### 예외
프로그램 실행 중에 발생하는 비정상적인 상황으로, 프로그래머가 적절히 처리 가능

예외는 `try-catch` 블록을 사용하여 처리하고, 예외 발생 시 프로그램의 비정상적인 종료를 방지할 수 있음

대표적인 예외의 예: `NullPointerException` , `ArrayIndexOutOfBoundException`


### 계층 구조
**`Throwable`**: 문제를 나타내는 최상위클래스

- `Error`
- `Exception`
    - `RuntimeException`: 언체크드 예외
        - `NullPointerException`, `ArrayIndexOutOfBoundException` 등
    - `IOException`, `SQLException` 등: 체크드 예외
        - `FileNotFoundException`, `IOException` 등


**언체크드** 예외
컴파일 시점에서 예외 처리를 강제하지 않음 (예외 처리를 따로 하지 않아도 실행은 시켜줌)

주로 프로그래밍 오류에 의해 발생

**체크드** 예외

컴파일 시점에서 예외 처리를 강제함

주로 외부 요인(네트워크, 파일) 에 의해 발생



## 예외 처리 방법
### try-catch 블록
`try` 블록 내에서 발생한 예외를 `catch` 블록 내에서 처리

어떤 정수를 0으로 나눌 때 발생하는 `ArithmeticException` 예외를 처리 하는 코드 작성

```java
public class TryCatchException {
  public static void main(String[] args) {
    try {
      int result = 10 / 0; // ArithmeticException
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 종료되었습니다.");
  }
}
```

`try` 문 내에서 `ArithmeticException` 예외 발생

발생한 예외는 `catch`문에서 처리

예외가 발생했을 때 프로그램이 종료되지 않고 정상적으로 실행되는 것을 볼 수 있음

```
실행결과
0으로 나눌 수 없습니다.
정상적으로 종료되었습니다.
```


### throws 키워드

`throws` 는 예외를 호출한 메서드로 던짐

던져진 예외는 호출한 메서드 내부에 있는 `try-catch`문을 통해 처리됨

메서드 이름 쪽은 `throws` , 메서드 내부에는 `throw` 로 작성하고 new 키워드로 호출할 것

throws를 이용한 예외 처리

```java
public class Throws {
  public static void main(String[] args) {
    try {
      divide(1000, 0);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    }
    System.out.println("정상적으로 죵료되었습니다.");
  }

  public static int divide(int a, int b) throws ArithmeticException {
    return a / b;
  }
}
```

divide 메서드 실행 과정에서 예외가 발생하였을 때 divide 메서드를 호출한 main 메서드로 예외가 전달

main 메서드 내부의 `try-catch` 이 divide 메서드로부터 온 예외를 전달 받아 처리

```
실행결과
0으로 나눌 수 없습니다.
정상적으로 종료되었습니다.
```


### finally 블록
예외 발생 여부와 관계없이 항상 실행되며, 선택적으로 사용할 수 있음

무언가를 종료 시키는 코드를 finally 블록에 작성하는 듯?

finally 블록 이용해보기

```java
import java.util.Scanner;

public class Finally {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int i = scanner.nextInt();
      int result = i / 0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다.");
    } finally {
      System.out.println("스캐너를 종료합니다.");
      scanner.close();
    }
  }
}
```

예외를 발생 시키는 코드를 작성하고 finally 블록이 실행되는지 테스트

예외 처리된 모습

```
실행결과
100
0으로 나눌 수 없습니다.
스캐너를 종료합니다.
```

## 예외를 따로 커스텀 해보기

계좌로부터 돈을 출금하려고 하는데 계좌 잔액이 부족해 출금할 수 없는 상황 표현

예외가 발생한 곳

발생한 예외를 호출한 쪽으로 토스

```java
public class BankAccount {
  private int balance;

  public void withdraw(int amount) throws InsufficientResourcesException {
    if (balance < amount) {
      throw new InsufficientResourcesException("잔액이 부족합니다.");
    }
    balance -= amount;
  }
}
```

예외 조건을 만족했을 때 발생한 걸 던지는 구조.. 

예외를 처리하는 곳

토스 받은 예외를 처리

```java
public class BankApplication {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();
    try {
      account.withdraw(10000);
    } catch (InsufficientResourcesException e){
      System.out.println(e.getMessage());
    }
  }
}
```

메서드를 호출하고 예외가 발생하면 getMessage()를 통해 문자열을 가져와 출력

예외 클래스를 정의한 곳

```java
// 커스텀 익셉션
public class InsufficientResourcesException extends Exception {
  public InsufficientResourcesException(String message) {
    super(message);
  }
}
```

클래스를 생성하고, 예외 클래스 중 가장 상위 클래스에 속하는 Exception 상속 받음

생성자를 선언하면서 예외가 발생하였을 때 문자열을 출력하도록 설정



## 퀴즈

1. 사용자로부터 두 개의 정수를 입력받아 나눗셈을 수행하는 프로그램을 작성하세요. 이때, 두 번째 정수가 0인 경우 ArithmeticException을 처리하여 적절한 메시지를 출력하세요.


```java
import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("첫 번째 정수 입력: ");
    int num1 = scanner.nextInt();
    System.out.println("두 번째 정수 입력: ");
    int num2 = scanner.nextInt();

    try{
      divide(num1, num2);
    } catch (ArithmeticException e){
      System.out.println(e.getMessage());
    } finally{
      System.out.println("프로그램이 종료되었습니다.");
      scanner.close(); // finally 안에다 작성할 것
    }

  }

  public static void divide(int num1, int num2) throws ArithmeticException {
    if (num2 == 0){
      throw new ArithmeticException("0으로 나눌 수 없습니다.");
    } else {
      double result = (double) num1 / num2;
      System.out.println(result);
    }
  }
}
```

- Scanner를 통해 두 정수 a, b를 입력받는다
- `try` 블록 내, 나눗셈을 해주는 함수 divide를 실행시킨다.
    - divide를 선언할 때 throw 키워드로 예외 발생 시 호출 메서드에게 이를 알리게 한다.
    - 두번째 정수가 0이면 바로 예외 처리를 하는데, 이 때 예외를 선언할 때 출력할 메세지를 설정한다.
    - 0이 아니면, double 타입으로 나눗셈 연산을 수행한 후 연산값을 출력한다. (double 타입일 때 분모가 0이어도 결과가 나옴..)
- 예외를 전달 받으면, `catch` 블록을 실행시킨다.
    - ArithmeticException 타입 예외 객체 e를 선언한 후 getMessage() 메서드를 통해 설정한 문자열을 가져와 출력하도록 한다.
- `finally` 블록에서 실행 중인 것을 종료시킨다.

```
실행 결과

첫 번째 정수 입력:
100
두 번째 정수 입력:
0
0으로 나눌 수 없습니다.
프로그램이 종료되었습니다.
```


2. 사용자로부터 정수 배열의 크기와 배열 요소를 입력받아 배열을 생성하는 프로그램을 작성하세요. 이때, 입력된 인덱스가 배열의 크기를 벗어나면 ArrayIndexOutOfBoundsException을 처리하여 적절한 메시지를 출력하세요.


```java
import java.util.Scanner;

public class Quiz2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      System.out.println("원하는 배열 크기를 입력하세요");
      int arrLength = sc.nextInt();
      int[] arr = new int[arrLength];

      System.out.println("배열 요소를 입력하세요 :");
      int i = 0;
      while (true) {
        System.out.println("arr[" + i + "] = ");
        arr[i] = sc.nextInt();
        System.out.println("arr[" + i + "] = " + arr[i]);
        i++;
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열의 인덱스를 벗어났습니다.");
    } finally {
      System.out.println("정상적으로 종료되었습니다");
      sc.close();
    }
  }
}
```

- Scanner를 통해 배열 크기를 입력
- 입력 받은 숫자만큼의 크기를 가진 배열을 생성
- 배열 요소를 입력
    - while문으로 배열 인덱스를 통해 요소값을 계속해서 입력 받음
    - 배열 인덱스가 지정한 배열 크기를 넘어섰을 때 예외가 발생
- 발생한 예외는 `catch` 문에서 처리
- `finally` 에서 자원을 종료 시키기


3. 사용자로부터 이름과 나이를 입력받아 Person 객체를 생성하는 프로그램을 작성하세요. 이때, 나이가 음수이면 InvalidAgeException(사용자 정의 예외)을 발생시키고 적절한 메시지를 출력하세요.

```java
import java.util.Scanner;

public class Quiz3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("이름을 입력하세요");
      String name = sc.nextLine();

      System.out.println("나이를 입력하세요");
      int age = sc.nextInt();

      Person person = new Person(name, age);

      checkAge(age);

      System.out.println("이름: " + person.name + ", 나이: " + person.age);

    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    } finally{
      System.out.println("프로그램이 정상적으로 종료되었습니다.");
      sc.close();
    }

  }

  public static void checkAge(int age) throws InvalidAgeException{
    if (age < 0){
      throw new InvalidAgeException("음수는 작성할 수 없습니다.");
    }
  }

}
```

- `try` 문
    - 이름과, 나이를 각각 입력 받음
    - 입력 받은 걸로 Person 객체 생성
    - checkAge함수를 통해 입력 받은 나이가 음수인지 양수인지 판별
        - checkAge 함수는 age를 매개변수로 설정하여 age가 음수이면 발생한 예외를 호출 메서드로 던지도록 함
        - 예외 처리를 위해 InvalidAgeException를 호출하여 출력할 메세지 설정
    - 이름과 나이 출력
- `catch` 문
    - 예외를 전달 받아 getMessage() 메서드를 통해 문자열 출력
- `finally` 문
    - 자원 종료

```java
public class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```

- 생성자 선언을 통해 Person 객체를 생성할 때 이름과 나이를 입력하도록 함

```java
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

- InvalidAgeException 라는 클래스를 만들어 Exception 기능을 상속 받아 문자열 메세지를 출력하도록 만듦


4. 사용자로부터 문자열을 입력받아 정수로 변환하는 프로그램을 작성하세요. 이때, 입력된 문자열이 정수로 변환될 수 없는 경우 NumberFormatException을 처리하여 적절한 메시지를 출력하세요.
    - tip: `Integer.parseInt(str); *// 문자열을 정수로 변환*`

```java
import java.util.Scanner;

public class Quiz4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
      System.out.println("문자열을 입력하세요");
      int num = Integer.parseInt(sc.nextLine());
      System.out.println(num);
    } catch (NumberFormatException e) {
      System.out.println("정수로 출력할 수 없습니다");
    } finally{
      System.out.println("프로그램이 정상적으로 종료되었습니다.");
      sc.close();
    }
  }
}
```

- 입력 받은 문자열을 `Integer.parseInt()` 를 통해 정수로 변환하고 num에 저장
- num 출력
- 예외 처리를 위해 `catch` 에서 출력할 메세지 설정
- `finally` 블록에서 자원 종료