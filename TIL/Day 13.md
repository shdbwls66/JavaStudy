# 인터페이스
클래스를 작성할 때 기본이 되는 틀을 제공

클래스 간 중간 매개 역할을 하는 일종의 추상 클래스

어떤 객체가 특정한 인터페이스를 사용하면 그 객체는 반드시 인터페이스의 메서드 들을 구현해야 함

## 인터페이스의 필요성

이것을 코드로 구현하면..

```java
다음은 어떤 동물원의 사육사가 하는 일이다.

난 동물원(zoo)의 사육사(zookeeper)이다.
육식동물(predator)이 들어오면 난 먹이를 던져준다(feed).
 - 호랑이(tiger)가 오면 고기(meat)를 던져준다.
 - 사자(lion)가 오면 생선(fish)를 던져준다.
```

Animal 클래스와 Animal의 자식 클래스인  Tiger와 Lion 생성

```java
public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}
```

```java
public class Lion extends Animal {} // Lion 클래스 생성
```

```java
public class Tiger extends Animal {} // Tiger 클래스 생성
```

ZooKeeper 클래스 생성 후 오버로딩 방식으로 feed 메서드를 생성 (각 메서드의 매개변수는 tiger, lion)

```java
public class ZooKeeper {

  void feed(Tiger tiger) {
    System.out.println("feed meet");
  }

  void feed(Lion lion) {
    System.out.println("feed fish");
  }
}
```

메인 메서드에서 실행 하면

```java
public class Class {
  public static void main(String[] args) {
    ZooKeeper zooKeeper = new ZooKeeper();

    Tiger tiger = new Tiger();
    zooKeeper.feed(tiger);

    Lion lion = new Lion();
    zooKeeper.feed(lion);
  }
}
```

```
실행 결과

feed meet
feed fish
```

하지만 오버로딩을 통해 메서드를 구현하면 동물 클래스를 생성할 때마다 feed 메서드를 생성해야 하는 문제점 생김

인터페이스는 오버로딩으로 인해 코드가 불필요하게 중복되는 것을 방지할 수 있음



## 인터페이스 만들기

인터페이스는 다음과 같이 정의할 수 있음

```java
public interface 인터페이스 이름 {}
```

육식 동물 인터페이스를 생성하면..

```java
public interface Predator {}
```

인터페이스 적용시킬 때 `implements` 키워드 사용

Tiger 클래스와 Lion 클래스에 인터페이스를 적용시키기

```java
public class Tiger extends Animal implements Predator {}
```

```java
public class Lion extends Animal implements Predator{}
```

이제 인터페이스와 클래스 연결 끝!

feed 메서드 하나만 선언해도 tiger, lion에 적용 가능

```java
public class ZooKeeper {

  void feed(Predator predator) {
    System.out.println("feed meet");
  }
}
```

코드 실행 시키면

인터페이스를 통해 각 객체가 하나의 메서드에서 실행되는 것을 볼 수 있음

```java
Tiger tiger = new Tiger();
zooKeeper.feed(tiger);

Lion lion = new Lion();
zooKeeper.feed(lion);
```

```
실행 결과
feed meet
feed meet
```



## 인터페이스 활용과 상속
### 인터페이스에 메서드 추가해보기

인터페이스에 메서드를 추가해 인터페이스가 적용된 각 객체마다 다른 내용의 메서드 호출 시켜보자

지난 시간에 작성했던 걸 가져오면!

Predator 인터페이스가 적용된 객체에 feed() 메서드 호출하면 “feed meet”만 출력됨

```java
public class ZooKeeper {

  void feed(Predator predator) {
    System.out.println("feed meet");
  }

  void feed2(Herbivore herbivore) {
    System.out.println("feed grace");
  }
}
```

객체 마다 다른 내용을 출력하기 위해 Predator 인터페이스에 getFood() 메서드를 추가

```java
public interface Predator {
	String getFood();	

}
```

이제 인터페이스를 implement한 클래스들은 getFood() 메서드를 반드시 구현해야 하는 규칙이 생김

Tiger 클래스와 Lion 클래스에 getFood() 메서드를 구현하면

```java
public class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
        return "meet";
    }
}
```

```java
public class Lion extends Animal implements Predator{
    @Override
    public String getFood() {
        return "fish";
    }
}
```

Zookeeper의 feed 메서드도 Predator.getFood() 구현체를 호출하도록 수정

```java
public class ZooKeeper {
  void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }
}
```

메인 메서드에서 실행하면

```java
Tiger tiger = new Tiger();
zooKeeper.feed(tiger);

Lion lion = new Lion();
zooKeeper.feed(lion);
```

```
실행 결과

feed meet
feed fish
```



## 디폴트 메서드와 상속

### **디폴트 메서드**

- 인터페이스에서 구현체를 제공하는 메서드
- 자바 8부터 인터페이스에 디폴트 메서드를 정의할 수 있게 됨
- 인터페이스를 구현하는 클래스는 디폴트 메서드를 오버라이드할 수 있음
- 디폴트 메서드는 기존 인터페이스에 새로운 기능 추가할 때 유용

### 인터페이스 상속

- 인터페이스는 다중 상속 가능
- extends 키워드로 상속
- 하위 인터페이스를 구현하는 클래스는 하위 메서드 뿐만 아니라 상위 인터페이스의 모든 추상 메서드에 대한 실체 메서드를 가져야 함 (a,b 인터페이스 자식 c 인터페이스의 구현 클래스는 a, b 인터페이스의 메서드도 구현 해야 한다는 뜻)

### 실습

InterfaceA

인터페이스 내에 디폴트 메서드 정의

```java
public interface InterfaceA {
  void methodA();

  default void defaultMethod() {
    System.out.println("디폴트 A");
  }
}
```

InterfaceB 정의

```java
public interface InterfaceB {
    void methodB();
}
```

InterfaceC

인터페이스는 **다중 상속** 가능하므로 InterfaceA와 InterfaceB, 두 인터페이스를 상속 받음

```java
public interface InterfaceC extends InterfaceA, InterfaceB{
    void methodC();
}
```

구현 클래스 ImpleC

InterfaceC를 상속받아 각 인터페이스의 메서드 호출 가능

디폴트 메서드도 직접 호출 가능

```java
public class ImpleC implements InterfaceC {
  @Override
  public void methodC() {
    System.out.println("C실행");
  }

  @Override
  public void methodA() {
    System.out.println("A실행");
  }

  @Override
  public void methodB() {
    System.out.println("B실행");
  }

	public void callMethod(){
    defaultMethod();
}
```

메인 메서드

InterfaceA, InterfaceB 타입의 인스턴스가 ImpleC 인스턴스인 impleC를 통해 정의될 수 있음

```java
InterfaceC impleC = new ImpleC();
InterfaceA interfaceA = impleC;
interfaceA.methodA(); // A실행 출력
System.out.println("===================");

InterfaceB interfaceB = impleC;
interfaceB.methodB(); // B실행 출력
System.out.println("===================");

impleC.methodA(); // A실행 출력
impleC.methodB(); // B실행 출력
impleC.methodC(); // C실행 출력

impleC.defaultMethod(); // okay 출력
```

필요에 따라 **디폴트 메서드를 오버라이드**도 가능

InterfaceB에도 동일한 이름의 디폴트 메서드 추가

```java
public interface InterfaceB {
  void methodB();

  default void defaultMethod() {
    System.out.println("디폴트 B");
  }
}
```

다중 상속 받는 InterfaceC에 디폴트 메서드 오버라이드

이 때 어떤 디폴트 메서드를 사용할 지 지정 해야함

```java
public interface InterfaceC extends InterfaceA, InterfaceB{
    void methodC();

    @Override
    default void defaultMethod() {
        InterfaceA.super.defaultMethod();
    }
}
```

실행 하면 InterfaceA의 디폴트 메서드 호출

```java
InterfaceC impleC = new ImpleC();
impleC.defaultMethod();
```

---

# SOLID

```
SOLID

1. SRP (Single Responsibility Principle) - 단일 책임 원칙

클래스는 단 하나의 책임을 가져야 함

주제가 생판 다른 건 따로!!!

(한 클래스 내부에 서로 다른 내용이 나오지 않도록 할 것. 이름 나오는 클래스에 뜬금없이 데이터 저장하는 메서드 구현하면 안된다는 뜻)

2. OCP (Open-Closed Principle) - 개방-폐쇄 원칙

확장에는 개방, 변경에는 폐쇄

3. LSP (Liskov Substitution Principle) - 리스코프 치환 원칙

자식 클래스는 부모 클래스로 대체 가능해야 함

4. ISP (Interface Segregation Principle) - 인터페이스 분리 원칙

클라이언트는 사용하지 않는 메서드에 의존 X

예를 들어 프린터 인터페이스에 프린트, 스캔, 팩스 기능 다 때려 넣어서 프린트 기능만 있는 프린터를 구현할 때, 스캔, 팩스와 같이 사용하지 않는 기능도 필수적으로 처리를 하게 되는 건 바람직하지 못함.

5. DIP (Dependency Inversion Principle) - 의존 역전 원칙

고수준 모듈은 저수준 모듈에 의존하면 안되며, 추상화에 의존해야 함

구현체에 의존 X, 추상화에(인터페이스나 추상 클래스 같은거)에 의존
```