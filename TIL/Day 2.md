# 자바 #2: 변수

# 변수?

## 1. 변수는 무엇일까?
- 값을 저장하기 위한 **공간**
  
- 값 변동 가능 (변할 수 있는 수! 변수!)
  
- 여러 값 저장은 X, **하나의 값**만 저장 가능 (단 배열 자료형은 여러 값 저장 가능)
  

### <변수 선언 해보기>
1. 변수명 앞에 **타입**을 붙인 후 값을 선언
   
2. 라인 끝에 **세미콜론** 추가

- 여기서 `int` 는 변수의 타입, `a` 는 변수명

```java
int a = 10;
System.out.println(a);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/14178015-72b4-4bf8-afd1-1f09e505564d)

- 쉼표를 통해 여러 개의 변수를 한 줄에서 선언 가능

```java
int a = 20, b = 30, c =50;
System.out.println(a + b + c);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/ffa48342-0a18-4067-a066-5802d59e489a)



## 2. 변수 네이밍 규칙
1. 숫자로 시작 X
   
```java
int 4a = 1; // 오류
```

2. 예약어 사용 X

```java
int return = 1; // 오류
```

3. 대소문자 구분 (변수 a와 변수 A는 다름!)

```java
// 각각 다른 변수
int a = 1;
int A = 1;
```

4. 특수문자는 언더바와 달러만 가능

5. 여러 단어가 사용될 때 카멜 케이스로! (CaseOne 이런식으로)



## 3. 변수 타입
- 앞에서 언급한 것처럼 자바에서 변수를 선언할 때 타입을 먼저 작성해야 함
  
- 자바에서 이용할 수 있는 변수 타입으로…
  
- 정수 타입

  (1) `byte`: 약 -128 ~ 127

  (2) `short`: 약 -32,768 ~ 32,767

  (3) `int`: 약 -2,147,483,648 ~ 2,147,483,647

  (4) `long`: 약 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

- 실수 타입
    
  (1) `float`: 약 7자리의 부동 소수점 수, 값 뒤에 f
  
  (2) `double`: 약 15자리의 부동 소수점 수
  
- 문자 타입
    
  (1) `char`: 하나의 문자를 저장, 작은 따옴표 사용

- 불리언 타입

  (1) `boolean`: true 또는 false 값을 가지며, 조건식과 논리 연산에 사용
  
- 문자열 타입
    
  (1) `String`: 문자열 표현에 사용, 문자열은 여러 문자로 이루어진 데이터를 의미

- 기타
    
  (1) `BigInteger`: 아주 큰 정수 값을 저장하기 위한 클래스
  
  (2) `BigDecimal`: 아주 큰 소수 값을 저장하기 위한 클래스



# 변수의 타입

## 1. 원시 타입
- 가장 기본적인 데이터 타입
  
- 직접적으로 데이터 값을 저장하고 처리
  
- 메모리 효율이 좋고 처리 속도가 빠름


### 특징
- **스택 메모리:** 스택 메모리에 저장되어 속도가 빠름
  
- **값**이 저장: 변수 선언할 때 실제 값이 복사 되어 전달

### 초기화

- 값을 바로 적어줌

```java
int a = 10; // 원시타입은 stack 으로 슝~
```


### 1. 정수 타입
- 각각 저장할 수 있는 값의 범위, 메모리 사용 크기가 다름

- byte (1byte) < char (2byte) < short (2byte) < int (4byte) < long (8byte)

1. `byte` 타입
    - 8비트 정수형 데이터 타입
    - 메모리 절약 용도
    - 최대값은 127

```java
public class day2_Test {
	  public static void main(String[] args) {
				byte a = 1;
		}
}
```

128 출력하면 오류남

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f03fc140-0329-438f-b55d-7ccb7c44f845)


2. `char` 타입
    - 16비트 유니코드 문자 저장할 때 사용
      
    - 하나의 문자 또는 유니코드 값 저장 가능
      
    - 작은 따옴표 사용

```java
public class day2_Test2 {
    public static void main(String[] args){
        char c1 = 'A';            //문자 직접 저장
        char c2 = 65;             // 10진수
        char c3 = '\u0041';       // 16진수

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        int uniCode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(uniCode);
    }
}
```

다양한 방식으로 하나의 문자를 표현하는 `char`

![image](https://github.com/shdbwls66/backendJava/assets/168792230/486cba34-385c-45a5-8c74-aec6d857f15e)

빈 문자열 대입하면 오류 남

![image](https://github.com/shdbwls66/backendJava/assets/168792230/46f35e25-8973-4c22-9efc-17e76c5af045)


3. `short` 타입
    - 16비트 정수형 데이터 타입

```java
public class day2_Test3 {
  public static void main(String[] args) {
     short sVal = 10;
     short result = (short) (sVal + 10);
     System.out.println(result);
  }
}
```

숫자 10을 더했을 때 결과값이 `int`타입이므로 `short` 타입으로 변환하여 변수 `result` 에 저장 

받는 쪽이 가져오는 쪽보다 값의 범위가 큰 타입이어야 함

출력 화면

![image](https://github.com/shdbwls66/backendJava/assets/168792230/83e13c8f-a85f-4e79-a931-9545b9fb2185)


4. `int` 타입
    - 가장 많이 사용되는 정수형

```java
public class day2_Test3 {
  public static void main(String[] args) {
     int a = 10 + 220;
     System.out.println(a);
  }
}
```

출력 화면

![image](https://github.com/shdbwls66/backendJava/assets/168792230/fc41e1dc-44a1-4580-8e21-d329ce38d1ff)


5. `long` 타입
    - 8바이트 정수형
    - 큰 정수 값을 저장하는 데 사용
    - 값 지정할 때 숫자 뒤에 `l / L` 붙임

뒤에  `l / L` 붙이지 않아 `int` 로 인식하여 오류난 모습

![image](https://github.com/shdbwls66/backendJava/assets/168792230/aebb83dc-9eaa-4b72-b954-7a59c4d44e47)

```java
public class LongVariableExample {
    public static void main(String[] args) {
        long a = 9999999999L;
				System.out.println(a);
    }
}
```

정상적으로 실행되는 모습

![image](https://github.com/shdbwls66/backendJava/assets/168792230/261488f5-8c3e-4770-b6f2-ded4850b0aba)


### 2. 실수 타입
- 소수점 숫자까지 저장 가능

1. `float` 타입
    - 7자리 숫자까지 정확하게 표현 가능
      
    - 리터럴로 표현할 때 뒤에 `f / F` 붙이기

```java
float myFloat = 9.75f;
float anotherFloat = myFloat * 2;
System.out.println("Original float value: " + myFloat);
System.out.println("Calculated float value: " + anotherFloat);
```

실행 화면

![image](https://github.com/shdbwls66/backendJava/assets/168792230/98196a9a-f07a-44bf-beb6-aab5cd85aed4)

`int` 와 `byte` 로 형변환 하였을 때 반올림으로 처리

![image](https://github.com/shdbwls66/backendJava/assets/168792230/c6228930-ae97-41df-be09-0500197704d1)


2. `double` 타입
    - 15~16 자리의 정밀도 제공
      
    - 특별한 접미사 없이 숫자 만으로 표현 가능

```java
double myDouble = 9.545;
double anotherFloat = myDouble * 2;
System.out.println("Original float value: " + myDouble);
System.out.println("Calculated float value: " + anotherFloat);
```

숫자만 넣어도 오류 안 남

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f0c7195b-a1a1-4067-af95-1dadce77a1bc)


### 3. 논리 타입
- 논리값 저장

```java
public class day2_Test4 implements day2_Test5 {
  public static void main(String[] args) {
    boolean isTrue = false;
    if (!isTrue) {
      System.out.println("이건트루");
    } else {
      System.out.println("이건펄스");
    }
  }
}
```

`false` 의 부정이 출력 되므로 `true` 값이 출력된 모습

![image](https://github.com/shdbwls66/backendJava/assets/168792230/52cd7a11-9e1a-43c8-9bb3-6ae93408a775)



## 2. 참조 타입
- 데이터가 저장된 메모리 주소를 참조

- 객체의 참조를 저장하고 객체 접근에 사용


### 특징
- **힙 메모리**
    - 힙 메모리 영역에 저장
    - 프로그램의 런타임 동안 동적으로 할당되고 관리
  
- **가비지 컬렉션(Garbage Collection)**
    - 더 이상 참조되지 않을 때 가비지 컬렉터에 의해 자동으로 정리
 
- **Null 참조**
    - **`null`**은 어떠한 객체도 참조하고 있지 않다는 것을 의미
 

### 초기화
- `null` 또는 예약어인 `new` 사용

```java
int[] arr = null; // 참조타입은 heap 으로 슝~
int[] arr = new int[5];
```

- 단 `String` 은 `new` 없이도 초기화 가능

```java
String name = new String("sung yeon");
```


### 1. 클래스
- 객체 지향 프로그래밍의 기본 단위
  
- **데이터(상태)** 와 **행동(메서드)** 을 캡슐화
  
- 사용자는 클래스를 정의하고, 그 안에 필드(변수)와 메서드(함수) 선언

이런 느낌?

```java
public class day2_Test4 {
  public static void main(String[] args) {
		//변수 생성 등등
  }
}
```


### 2. 인터페이스
- 모든 메서드가 추상 메서드(구현되지 않은 메서드)

- 다른 클래스가 인터페이스를 구현하도록 강제

이런 모양
(클래스가 인터페이스를 구현한 모습은 클래스 항목 참조)

```java
public interface day2_Test5 {
		// 구현 강제할 메서드 작성

}
```


- 구현 과정..
인터페이스 파일 생성

```java
public interface day2_Test5 {
    void walk();

}
```

클래스 파일이랑 인터페이스 파일이랑 연결하는 코드 작성 후
`alt + Enter` -> 메서드 구현

```java
public class day2_Test4 implements day2_Test5
```

객체 김땡땡에게 walk 속성 부여한 모습
이 walk 속성은 다른 인간들에게도 부여할 수 있음 (등장인물 프로필 느낌..?)

```java
public class day2_Test4 implements day2_Test5 {
  public static void main(String[] args) {
		String human = "김땡땡"
  }

  @Override
  public void walk() {
  }
}
```


### 3. 배열
- 동일한 타입의 여러 데이터를 저장

- 정해진 크기를 가지며, 변경 안 됨

- 기본 타입 또는 객체 타입 요소들 저장 가능

데이터 타입이 int이고 크기가 5로 고정된 배열 arr

```java
public class day2_Test6 {
  public static void main(String[] args) {
    int[] arr = new int[5]; // 크기 고정
    System.out.println(arr[0]);
  }
}
```

초깃값이 0이라서 아래의 결과가 나옴

![image](https://github.com/shdbwls66/backendJava/assets/168792230/71e71933-227e-4acc-89e3-71be7416e99c)

배열은 별도의 인덱스를 지정하지 않으면 주소를 출력

![image](https://github.com/shdbwls66/backendJava/assets/168792230/3e8c927e-6502-4750-a266-987c7c5b172f)

<hr>

# 참고

<aside>

  💡 **오늘의 단축키**
  
    - `ctrl + /` : 한 줄 주석 처리
  
    - `ctrl + alt + /` : 여러 줄 주석 처리
  
    - `ctrl + shift + k` : 깃허브 푸쉬
  
    - `ctrl + shift + F10` : 코드 실행
    
    - `ctrl + alt + L` : 코드 정렬 (google java format 플러그인 설치 필요)
    
    - `alt + Enter` : 코드 관련 메뉴?

</aside>



<aside>
  
  💡 **인텔리제이에서 깃허브 올리기~**
  
    1. 메뉴창에서 Git - 원격관리 클릭
  
    2. 깃허브 링크 추가
  
    3. 우측의 커밋 클릭, 커밋할 파일 선택하여 커밋
  
    4. `ctrl + shift + k` 로 푸쉬 창 열고 푸쉬하기
  
  
    원하는 파일만 커밋 하는 방법
  
    1.  `gitignore` 파일 우클릭 - Add template (없으면 ignore 플러그인 설치)
  
    2. Java, Gradle, JetBrains all 추가
  
    3. `gitignore` 파일에 커밋 하지 않을 파일 추가 (파일 경로를 입력하기)

</aside>
