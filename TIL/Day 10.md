# 클래스 #2
## this
현재 객체를 참조하는 키워드

`this` 키워드를 통해 현재 객체의 멤버 변수와 메서드에 접근할 수 있음

### `this` 키워드 사용

`this` 로 인해 `Person` 클래스의 멤버 변수에 접근

`buyFood` 메서드를 실행할 때 외부 클래스 Food의 멤버 객체를 끌어와 현재 객체의 멤버 변수에 반영

```java
public class Person {
  int weight;
  int money;
  boolean fat;

  public Person(int weight, int money, boolean fat) {
      this.weight = weight;
      this.money = money;
      this.fat = false;
  }
  
  public void buyFood(Food food) {
    this.money -= food.cost;
	}
  
}
```

외부 클래스 `Food` , 세 가지의 멤버 변수를 선언

여기도 `this` 를 통해 `Food` 의 멤버 변수에 접근하고 있음

```java
public class Food {
    int cost;
    int weight;
    String name;

    public Food(int cost, int weight, String name) {
        this.cost = cost;
        this.weight = weight;
        this.name = name;
    }

}
```

**main 메서드**

실행하면 객체 Person의 멤버 변수를 참조하여 값을 가져옴

1. 인스턴스 person, food 생성
2. person의 메서드 buyFood 실행되면서 person의 money가 food의 cost 만큼 깎임
3. person의 weight와 person의 money 출력

```java
public class MainPerson {
  public static void main(String[] args) {
    Person person = new Person(100, 5000, false);
    Food food = new Food(50, 30, "사탕");

    person.buyFood(food);

    System.out.println(person.weight); // 100 출력
    System.out.println(person.money); // 4950 출력
  }
}
```



## final

final 필드를 이용해 초기값을 지정하면 그 값이 최종적인 값이 되면서 수정 불가능

초기값은 **필드 선언할 때** 혹은 **생성자에서 초기화할 때** 줄 수 있음

### final 필드의 이용

필드 선언할 때 초기값을 주었을 때, 생성자에서 초기화 X

```java
public class Human {
	final String name = "인간";
	int age;
	
	public Human(String name, int age) {
		// this.name = name; 에러 발생
		this.age = age;
	}
	
  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }
	
  public void introduce() {
  // this로 현재 객체 메서드, 멤버 변수를 불러옴
    this.sayHello();
    System.out.println("I am " + this.age + " years old.");
  }

}
```

**main 메서드**

final 이 적용된 name은 인스턴스 생성 때 값을 넣어도 반영 X

반면, final이 적용되지 않은 age는 각 인스턴스에 따른 값이 반영된 것을 볼 수 있음

```java
public class MainHuman {

  public static void main(String[] args) {
    Human human1 = new Human("유진", 25);
    Human human2 = new Human("인간", 22);

    human1.introduce(); // Hello my name is 인간 I am 25 years old. 출력
    human2.introduce(); // Hello my name is 인간 I am 22 years old. 출력
    
  }
}
```

이렇게 `final`로 선언만 하고

```java
public class Human {
	final String name;
	int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	...(생략)...

}
```

이 코드를 실행 시키면..

각 인스턴스의 생성, 초기화 과정에서 정해진 name 값이 그대로 유지

```java
public class MainHuman {

  public static void main(String[] args) {
    Human human1 = new Human("유진", 25);
    Human human2 = new Human("yu", 22);

    human1.introduce(); // Hello my name is 유진 I am 25 years old. 출력
    human2.introduce(); // Hello my name is yu I am 22 years old. 출력
    
  }
}
```



## static final (상수)

상수는 객체마다 저장되지 않고 클래스에만 포함

한 번 초기값이 저장되면 변경 불가능하며 생성자 에서의 초기화도 불가능

상수 선언 시, 상수 이름은 모두 대문자로 작성하고(컨벤션) 다른 단어가 혼합되면 언더바로 단어들을 연결

```java
public class Human {

	static final int BIRTH_YEAR = 2000;
	static final String NATION = "Korea";
	static final boolean SURVIVE = true;
	
	// 정적 블록에서 초기화도 가능
	static final String GENDER;
	static {
	  GENDER = "Female";
	}

}
```

상수 사용 할 때 별도의 인스턴스를 생성할 필요 없이 클래스로 상수를 가져옴

```java
System.out.println(Human.GENDER); // Female 출력
System.out.println(Human.BIRTH_YEAR); // 2000 출력
System.out.println(Human.NATION); // Korea 출력
System.out.println(Human.SURVIVE); // true 출력
```



## 접근 제어자
접근 제어자를 사용하여 변수나 메소드의 접근 권한을 설정할 수 있음

**private > default > protected > public** 순으로 접근 제한이 강함

### private

private이 붙은 변수나 메서드는 **해당 클래스 안에서만 접근 가능**


### private test

name2 변수와, getName2() 메서드는 앞에 private이 붙어 있어 외부 클래스에서 접근 X

LimitTest 내에서만 접근 가능

```java
public class LimitTest {
  private String name2 = "Java";
  String name;
  int age;
  int gold;

  public LimitTest(String name, int age) {
	  this.name = name;
    this.age = age;
  }

  private String getName2(){
    return this.name2;
  }
  
  public void sayHello() {
    getName2();
    System.out.println("Hello my name is " + this.name2);
  }

}
```

에러 발생

![image](https://github.com/shdbwls66/backendJava/assets/168792230/948d9a33-e4e2-4593-92c6-269710040914)


### default

변수나 메소드에 접근 제어자를 따로 설정하지 않으면 default 접근 제어자가 자동으로 설정

default가 붙은 변수와 메소드는 **동일한 패키지 내에서만 접근 가능**

### default test

day10 패키지 내에 있는 Package 클래스

lastName이 default로 설정

```java
package day10;

public class Package {
    String lastName = "noh";
    public String firstName = "yujin";
}
```

day10 패키지 외부에 있는 Test 클래스

Package의 각 멤버 변수에 접근 하였을 때 lastName으로 접근 실패한 것을 볼 수 있음

```java
import day10.Package;

public class Test {
  public static void main(String[] args) {
    Package pack = new Package();
    System.out.println(pack.firstName);
    System.out.println(pack.lastName); // 에러 발생
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/79047011-c62d-4950-99a3-25b473fa4b5f)


동일한 패키지로 옮겼을 때 정상적으로 실행

```java
package day10;

public class Test {
  public static void main(String[] args) {
    Package pack = new Package();
    System.out.println(pack.firstName); // yujin 출력
    System.out.println(pack.lastName); // noh 출력
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/b19bb801-7dae-431e-b288-70ed205517fc)


### protected

protexted가 붙은 변수나 메소드는 **동일 패키지의 클래스** 또는 **해당 클래스를 상속 받은 클래스**에서만 접근 가능

### protected test

car 패키지 안에 Car 클래스 생성 

멤버 변수 company에 protected 설정

```java
package car;

public class Car {
  protected String company = "weniv";
  int workerNum = 100;
}
```

car 패키지 안에 example 패키지 만든 다음, example 패키지 안에 Sonata 클래스 생성

클래스를 정의할 때 `extends Car` 를 붙여 Car와 Sonata 간 상속 관계 형성 (Car에 alt + Enter 누르면 자동으로 임포트 해줌)

Sonata는 속한 패키지가 Car와 다름에도 불구하고 Car의 변수나 메서드로 접근 가능해짐 (protected 레벨 까지 한해서)

```java
package car.example;

import car.Car;

public class Sonata extends Car {
  // 여기엔 멤버변수가 없음

  public static void main(String[] args) {
    Sonata sonata = new Sonata();
    
    // 부모 멤버변수 상속받아옴
    System.out.println(sonata.company); // weniv 출력
  }
}
```

하지만 default로 선언된 workerNum은 접근 불가능

![image](https://github.com/shdbwls66/backendJava/assets/168792230/ace62758-2200-4b57-89ed-0f193870b41d)


### public

접근 제어자가 public인 변수와 메소드는 어디서든 접근 가능

같은 클래스는 물론이고 패키지가 같은 외부 클래스에서도, 패키지가 다른 클래스에서도 다 접근 가능

앞에서 작성하였던 Car의 멤버변수 workerNum 앞에 public을 붙이면

```java
public int workerNum = 100;
```

Sonata에서 sonata.workerNum 접근이 가능해짐 (여기선 상속 관계일 때만 가능..)

```java
System.out.println(sonata.workerNum); // 100 출력
```



## 캡슐화(Getter, Setter)
객체 지향 프로그래밍에서 외부에서 객체 데이터로의 직접적인 접근은 지양하고 있음

객체의 데이터를 외부에서 마음대로 접근하여 수정하면 객체의 무결성이 깨지는 문제점이 있음 (ex. 외부에서 자동차 속도를 음수로 바꾸는 경우)

이러한 이유로 인해 객체 지향 프로그래밍에서는 메서드를 통해 데이터를 변경하는 것을 선호

### Setter 메서드

객체 지향 프로그래밍에서 객체의 무결성을 지키기 위해 직접적이지 않은 방법으로 데이터에 접근할 때 사용하는 메서드

객체 데이터는 private로 만들어 외부 접근은 막고, 메서드는 public으로 만들어 메서드를 통해 데이터를 변경

### Setter 사용

private를 통해 speed로의 접근은 막고, setSpeed 메서드를 통해 speed를 변경하도록 해당 메서드는 공개

speed가 0일 때 0, 0 이상일 때 인자로 받은 값을 멤버 변수에 적용

전달 받은 속도에 따라 기어를 변환

```java
public class Car {
	private int speed;
	
	public void setSpeed(int speed) {
		// speed 반영
    this.speed = speed < 0 ? 0 : speed;

    // 조건 따라 gear 변경
    if (speed <= 30) {
      this.gear = 1;
      System.out.println("현재 속도는 " + speed +", " + this.gear + "단 입니다.");
    } else if(speed <= 70){
      this.gear = 2;
      System.out.println("현재 속도는 " + speed +", " + this.gear + "단 입니다.");
    } else {
      this.gear = 3;
      System.out.println("현재 속도는 " + speed +", "+ this.gear + "단 입니다.");
    }
	}
}
```


### Getter 메서드

외부에서 객체 데이터를 읽을 때 사용하는 메서드

객체 데이터는 private로 만들어 외부 접근은 막고, 메서드는 public으로 만들어 메서드를 통해 데이터를 읽음

### Getter 사용

getSpeed() 메서드가 통해 멤버 변수 speed로 접근하여 km를 계산 후 반환

```java
public class Car {
	private int speed;
	
	public double getSpeed() {
		double km = speed * 1.6;
		return km;
	}
}
```


### setSpeed(), getSpeed() 실행

```java
public class Test {
  public static void main(String[] args) {
    Car car = new Car();
    car.setSpeed(120); // 현재 속도는 120, 3단 입니다. 출력
    System.out.println(car.getSpeed()); // 192.0 출력

  }
}
```


---
# 참고
**💡단축키**
```
alt + insert: 생성자, Setter 메서드, Getter 메서드 바로 생성
```
