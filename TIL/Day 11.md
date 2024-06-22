# 상속
- 자바에서는 부모 클래스의 변수와 메서드를 자식 클래스에서도 사용할 수 있는 상속 기능을 지원

- 자식 클래스는 **단 하나**의 부모 클래스를 상속 받을 수 있음

- 상속은 개발 시간이나 유지 보수 시간을 줄여줘 효율적인 개발을 가능하게 함

## 상속 클래스 형성
상속 클래스 형성은 자식 클래스에서 **`extends` + 부모 클래스명** 삽입

```java
class 자식클래스 extends 부모클래스
```

- **IngeritA 클래스 생성**

  부모 클래스

```java
public class InheritA {
  int field1;
  private int s1;

  void method1() {
    System.out.println("InheritA.method1 field1 = " + field1);
  }

  private void method3(){
    System.out.println("이것은 프라이빗");
  }
}
```

- **IngeritB 클래스 생성**

  `extends InheritA`로 IngeritA 클래스를 상속 받음

```java
public class InheritB extends InheritA {
  String field2;

  void method2() {
    System.out.println("InheritB.method2 field2 = " + field2);
  }
}
```

- **메인 메서드 에서 실행 해보기..**

  InheritB의 인스턴스 inheritB 생성

  인스턴스의 객체인 InheritB의 변수와 메서드 뿐만 아니라 부모에 해당하는 InheritA의 변수와 메서드에도 접근이 되는 것을 볼 수 있음

```java
public class Test {
  public static void main(String[] args) {
	  InheritB inheritB = new InheritB();
	
	  inheritB.field2 = "필드2";
	  inheritB.method2();
	
	  inheritB.field1 = 100;
	  inheritB.method1();

  }
}
```

```
실행결과
InhertitB.method2 field2 = 필드2
InhertitA.method1 field1 = 100
```

상속 관계에 있다 해도 자식 클래스는 부모 클래스의 모든 변수와 메서드를 물려받을 수 있는 건 아님

InheritA 클래스의 .method3() 처럼 private으로 선언된 변수와 메서드는 자식 클래스에서 사용 불가능

부모 클래스와 자식 클래스가 속한 패키지가 다를 경우, default로 선언된 변수나 메서드도 사용 불가능 (240613 TIL 접근 제어자 참고)



## 부모 생성자, `super`
자바에서 객체를 생성할 때 `new`를 통해 생성자를 호출함

자식 객체를 메인 메서드에 생성하기 위해 자식 생성자를 호출 해야하며, 상속 관계에 있는 부모 객체도 마찬가지임

이전 페이지에서 자식 객체 생성 후 해당 객체의 변수와 메서드를 이용할 때, 부모 객체를 생성하는 코드는 따로 작성하지 않았는데 어떻게 된거냐!! 하면..


### 부모 생성자 호출 과정

자바 컴파일러에서는 생성자를 따로 선언하지 않았을 때 자체적으로 기본 생성자를 생성함

```java
public Dog {
	super();
}
```

이전 페이지의 코드의 경우도 마찬가지

부모자식 모두 생성자를 따로 선언하지 않은 상태에서, 자식 객체만 불러왔을 때 밑의 코드처럼 기본 생성자를 생성 하였을 것임

```java
public InheritB {
	super(); // 부모 생성자 호출 담당
}
```

여기서 맨 첫 줄에 있는 `super();` 가 부모의 기본 생성자 호출을 담당함

`super();` 키워드는 자식 클래스 호출 후 바로 부모의 기본 생성자 호출 시키는 모습을 명시적으로 나타냄


### super() 키워드 활용

부모 클래스에 **파라미터가 포함된 생성자**가 있다면

**반드시 자식 생성자에서 super()를 통해 부모 생성자 호출을 하여야 함** (이 때 부모 생성자와의 파라미터 타입도 맞아야 함)

또한 `super()`문은 자식 생성자에서 가장 먼저 선언되어야 함

- **부모클래스 Animal**

  부모 생성자 선언할 때 파라미터 name, gender 추가

```java
public class Animal {
  String name;
  String gender;
  
  public Animal(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println(this.name + "Zzzzzz..");
  }
}
```

- **자식클래스 Dog**

  `super()` 로 부모 생성자를 호출
  
  이 때 파라미터로 설정한 name과 gender에 각각 알맞은 인자값을 넣기

```java
public class Dog extends Animal {
  int age;

  public Dog(int age){
  super("뽀삐", "남"); // new Animal();
  this.age = 6;
}

  void sleep(int times) {
    System.out.println(name + "zzzz..." + times + " hours");
  }
  
}
```

- **코드 실행**

  new로 자식 생성자 호출 후 변수와 메서드 실행
  
  부모로부터 변수와 메서드를 상속 받은 모습을 볼 수 있음

```java
public class Test {
	public static void main(String[] args) {
    Dog dog = new Dog(12);

    System.out.println(dog.name); // 뽀삐 출력
    
    dog.setName("용팔이"); 
    System.out.println(dog.name); // 용팔이 출력
    
    dog.sleep(100); // 용팔이zzzz...100 hours 출력

	}
	
}
```

```
실행 결과
뽀삐
용팔이
용팔이zzzz...100 hours
```



## 메서드 오버로딩
메서드의 이름은 동일, 입력 항목이 다른 경우를 **메서드 오버로딩**이라고 함

이런식으로 이름은 같고 파라미터만 다른 형태의 메서드를 만들 수 있음

```java
dog.sleep();
dog.sleep(100);
```

### 메서드 오버로딩 살펴보기

- **Animal 클래스**

```java
public class Animal {
  String name;

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println(this.name + "Zzzzzz..");
  }
}
```

- **Dog 클래스**

```java
public class Dog extends Animal {

  void sleep(int times) {
    System.out.println(name + "zzzz..." + times + " hours");
  }
}
```

- **메인 메서드**

  `.sleep()` 메서드 명은 같지만 다른 함수
  
  인자값의 타입에 따라 다른 결과가 나옴

```java
public class Test{
	public static void main(String[] args) {
		Dog dog = new Dog(12);
		
		dog.setName("뽀삐");
	  dog.sleep(); // 뽀삐Zzzzzz..
	  dog.sleep(100); // 뽀삐zzzz...100 hours
	}
  
}
```

```
실행 결과
뽀삐Zzzzzz..
뽀삐zzzz...100 hours
```



## 메서드 오버라이딩
메서드 오버라이딩은 부모 클래스의 메서드 내용을 자식 클래스에서 재정의 하는 것 (일명 덮어쓰기)

따라서 자식 객체에서 메서드를 호출하면 오버라이딩된 자식 메소드가 호출

**메서드 오버라이딩 규칙**

- 부모의 메서드와 동일한 시그니처(리턴 타입, 메서드명, 매개변수 리스트)를 가져야 함
- 부모 클래스의 메서드 보다 접근 제한이 강하면 안됨
- 새로운 예외를 throws 불가능

### 메서드 오버라이딩 살펴보기

- **부모 클래스 Parent** 

  method1, method2 메서드 생성

```java
public class Parent {

  void method1(){
    System.out.println("Parent의 메서드1 호출");
  }

  void method2(){
    System.out.println("Parent의 메서드2 호출");
  }
  
}
```

- **자식 클래스 Child**

  method2, method3 메서드 생성

```java
public class Child extends Parent {

  void method2(){
    System.out.println("Child의 메서드2 호출");
  } // 부모 보다 접근 제한이 더 세면 안됨

  void method3(){
    System.out.println("Child의 메서드3 호출");
  }

}
```

- **메인 메서드**

  `child.method2();` 를 실행 했을 때 자식 클래스에서 재정의된 메서드가 호출

```java
public class Test {
	public static void main(String[] args){
	  Child child = new Child();
	
	  child.method1(); // Parent의 메서드1 호출
	  child.method2(); // Child의 메서드2 호출
	  child.method3(); // Child의 메서드3 호출
	}

}
```

```
실행 결과
Parent의 메서드1 호출
Child의 메서드2 호출
Child의 메서드3 호출
```



## 추상 클래스
**추상 메서드를 하나 이상 포함**하는 클래스

추상: 실체 간 공통 특성을 추출한 것

사람을 예로 들면 사람들의 공통되는 특성으로 말하기, 숨쉬기 등등 있는데 이러한 특성들을 클래스로 모아둔 것이 추상 클래스

추상 클래스는 실체 클래스로부터 공통되는 필드와 메서드를 추출하여 만들어진 클래스로 객체를 직접 생성할 수 없고 **오로지 실체 클래스의 부모 클래스**로만 사용됨

추상 클래스를 선언할 때에는 `abstract` 사용

```java
public abstract class 추상클래스명 {}
```


### 추상 메서드

**자식 클래스에서 반드시 오버라이드 해야만 사용할 수 있는 메서드**

자식 클래스에서 반드시 추상 메서드를 구현해야 한다는 일종의 규제를 추가하기 위해 사용

추상 메서드 선언은 `abstract` 키워드 사용

```java
abstract 리턴타입 메서드명();
```


### 추상 클래스의 용도

실체 클래스들의 공통된 필드와 메서드의 이름을 통일

실체 클래스의 필드나 메서드 이름은 사람마다 다르게 정의될 수 있어 동일한 내용임에도 다른 방식으로 사용될 수 있는데, 추상 클래스는 각 필드나 메서드 이름을 통일 시켜줌

실체 클래스를 작성할 때 시간 절약

공통적인 건 추상 클래스에 작성해두고 다른 점만 실체 클래스에 작성하면 되므로 작성 시간을 줄일 수 있음


### 추상 클래스 만들어보기
- **추상 클래스 Phone**

  `abstract` 키워드로 추상 클래스 선언 후 공통적인 특징을 변수와 메서드로 정의

```java
public abstract class Phone {
  private String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("폰 전원을 킵니다.");
  }

  public void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}
```

- **실체 클래스 SmartPhone**

  추상 클래스로부터 상속 받기 위해 extends 작성, super 부모 생성자 호출

```java
public class SmartPhone extends Phone {

  public SmartPhone(String owner) {
    super(owner);
  }

  public void internetSearch() {
    System.out.println("인터넷 검색을 합니다.");
  }

}
```


- **메인 메서드에서 실행**

  추상 클래스의 변수와 메서드를 이용하는 smartPhone 인스턴스를 볼 수 있음

```java
public class Test {
  public static void main(String[] args) {
    SmartPhone smartPhone = new SmartPhone("노유진");

    smartPhone.turnOn(); // 폰 전원을 킵니다.
    smartPhone.turnOff(); // 폰 전원을 끕니다.
    smartPhone.internetSearch(); // 인터넷 검색을 합니다.
  }
  
}
```

```
실행 결과
폰 전원을 킵니다.
폰 전원을 끕니다.
인터넷 검색을 합니다.
```


### 추상 메서드의 오버라이딩

추상 클래스에서 선언된 추상 메서드는 실체 클래스에서 반드시 오버라이딩 시키기

오버라이딩 하면 `@Override` 표시 필수! (ctrl + o로 바로 가능)

- **추상 클래스 AnimalAbstract 생성**

  어떤 동물을 설명한다고 하면 공통적으로 말할 수 있는 것들에 해당하는 kind, breathe(), sound()가 변수와 메서드로 구현
  
  또한 sound()는 동물마다 다르므로 추상 메서드로 구현

```java
public abstract class AnimalAbstract {
  protected String kind;

  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

  public abstract void sound();
}
```

- **실체 클래스 CatAbstract**

  추상 메서드인 sound()가 오버라이딩

```java
public class CatAbstract extends AnimalAbstract {

  public CatAbstract() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("miumiu");
  }
}
```

- **실체 클래스 DogAbstract**

  추상 메서드인 sound()가 오버라이딩

```java
public class DogAbstract extends AnimalAbstract {

  public DogAbstract() {
    this.kind = "포유류";
  }

  @Override
  public void sound() {
    System.out.println("월월");
  }
}
```

- **메인 메서드 에서 실행**

  각 실체 클래스 마다 정의 한대로 오버라이딩 되어 출력 되는 모습

```java
public class Test {
  public static void main(String[] args) {
    CatAbstract cat = new CatAbstract();
    cat.sound(); // miumiu
    
    DogAbstract dog = new DogAbstract();
    dog.sound(); // 월월
  }
  
}
```

```
실행 결과
miumiu
월월
```

---
# 참고
**디버그**
```
  입력한 코드를 트랙킹 할 수 있어 코드의 실행 흐름을 파악할 때 유용

  코드 줄 번호를 클릭하여 시작 지점을 선택한 후 벌레 모양 버튼을 클릭하면 디버그 실행

  F7을 클릭하거나 스텝 인 투를 클릭하면 다음 실행 단계로 넘어감
```

**단축키**
```
`ctrl + o`: 오버라이드 키워드 생성
```
