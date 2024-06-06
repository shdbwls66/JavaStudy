# 연산자
## 이항 연산자
## 1. 산술 연산자

자바에서 수학적 계산을 가능하게 한다

- 덧셈(`+`)
- 뺄셈(`-`)
- 곱셈(`*`)
- 나눗셈(`/`)
- 나머지(`%`)


### 산술 연산 수행
연산자 한번씩 사용해보기
변수 타입이 int이므로 정수 부분만 출력

```java
int number1 = 10;
int number2 = 3;

int sum = number1 + number2;
int diff1 = number2 - number1;
int diff2 = number1 - number2;

int product = number1 * number2;
int quot = number1 / number2;
int remainder = number1 % number2;

System.out.println("덧셈: " + sum);
System.out.println("뺄셈1: " + diff1);
System.out.println("뺄셈2: " + diff2);
System.out.println("곱셈: " + product);
System.out.println("나눗셈: " + quot);
System.out.println("나머지: " + remainder);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/e3b941e0-413d-4aed-8674-0c706b14ef49)


### 피연산자들의 타입이 동일하지 않다면
피연산자의 크기에 알맞은 **형변환**이 필요

- 피연산자들이 모두 int보다 크기가 작을 때 int로 변환 후 연산
![image](https://github.com/shdbwls66/backendJava/assets/168792230/4b5e93b9-98a9-436c-a9d0-ce2581b0e208)

- 피연산자 중 long 타입이 있다면 모두 long 으로 변환
![image](https://github.com/shdbwls66/backendJava/assets/168792230/0d2e949e-2514-46cb-8029-0b6046185749)

- 피연산자 중 float 혹은 double 타입이 있다면 크기가 큰 실수 타입으로 변환 후 연산
![image](https://github.com/shdbwls66/backendJava/assets/168792230/012786ce-f705-44f5-b86a-033fb1fa59a5)


## 2. 문자열 연결 연산자 (+)
피연산자 중 문자열이 있을 때 `+` 연산자를 이용하여 피연산자들을 결합할 수 있음


### 문자열 결합해보기
문자열 str과 “하세요!” 결합

```java
String str = "안녕";
System.out.println(str + "하세요!");
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/2eba1390-2e53-4902-871d-84a4403f51f5)


### 숫자와 문자열을 결합해보기
왼쪽부터 오른쪽 방향으로 연산 진행됨

첫 번째 코드: 숫자 123과  456의 연산 후 “Hello” 와 연산

두 번째 코드: “Hello”와 123의 연산 후 456과 연산

```java
System.out.println(123 + 456 + "Hello");
System.out.println("Hello" + 123 + 456);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/fb8efcf4-fccf-40d5-9098-5a295c6f4580)


## 3. 비교 연산자 (<, ≤, >, ≥, ==, ≠)
피연산자들을 비교하여 true, false 산출

피연산자가 `char` 타입이면 유니코드 값으로 연산 수행

- `(a > b)` a는 b보다 크다
  
- `(a ≥ b)` a는 b보다 크거나 같다
  
- `(a < b)` a는 b보다 작다
  
- `(a ≤ b)` a는 b보다 작거나 같다
  
- `(a == b)` a와 b는 같다
  
- `(a ≠ b)` a와 b는 다르다


### 비교 연산자 사용해보기

```java
int number1 = 10;
int number2 = 30;

System.out.println(number1 > number2); // false
System.out.println(number1 >= number2); // false
System.out.println(number1 <= number2); // true
System.out.println(number1 < number2); // true

System.out.println(number2 == number1); // false
System.out.println(number2 != number1); // true
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/b62cd5e2-de67-40ca-975c-c3819d3df606)


### 피연산자 타입이 다르면
둘 중에 크기가 더 큰 타입으로 일치 시킴

```java
System.out.println('A' == 65);
System.out.println(10 == 10.0);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/94b42d7c-9a68-43dd-9d08-33ef48e05999)


### 부동 소수점 타입
피연산자들을 비교할 때 타입을 일치 시키기

모든 부동 소수점 타입은 값을 정확히 표기할 수 없기 때문

```java
System.out.println(0.1f == 0.1);
System.out.println(0.1f == (float)0.1);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/79b28ff5-71b5-40fe-b652-562b47bb26a9)


### 문자열 타입
str1과 str2는 동일한 `String` 객체를 참조

str3는 `new`로 생성한 다른 `String` 객체를 참조

```java
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

System.out.println(str1 == str2); // true
System.out.println(str1 == str3); // false
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/0ad38e16-5490-42c5-bea1-0978cefb7622)

값 자체를 비교할 때 .equals() 메소드 사용


## 4. 논리 연산자 (&&, ||, ^, !)
조건식을 연결할 때 사용

피연산자로 `boolean` 타입만 사용 가능


### AND (&&)
피연산자가 모두 true일 때 결과가 true

```java
System.out.println(true && true);
System.out.println(true && false);
System.out.println(false && true);
System.out.println(false && false);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/fe38c9e1-a054-4d35-9cf4-be5ac602acd2)


### OR (||)
피연산자 중 하나만 true이면 결과는 true

```java
System.out.println(true || true);
System.out.println(true || false);
System.out.println(false || true);
System.out.println(false || false);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/97f08022-368b-446b-b0ed-c21f80bff426)


### XOR(배타적 논리합)
피연산자 중 하나는 true, 다른 하나는 false일 때 결과가 true

```java
System.out.println(true ^ true);
System.out.println(true ^ false);
System.out.println(false ^ true);
System.out.println(false ^ false);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/0b6320ed-7fec-4e5c-9579-5ec541157c74)


### NOT (논리 부정)
피연산자의 논리값을 반전 시킴

```java
System.out.println(true ^ !true);
System.out.println(true ^ !false);
System.out.println(false ^ !true);
System.out.println(false ^ !false);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/57da4c3d-18e6-4ed6-a3ef-614375d42e18)


### 논리 연산자 활용
**1. i는 2의 배수이면서 3의 배수**

두가지 다 해당되어야 하므로 and 사용

```java
i % 2 == 0 && i % 3 == 0
```

**2. x는 30의 배수이면서 2의 배수이거나 5의 배수**
```java
(x % 30 == 0) && ((x % 2 == 0) || (x % 5 == 0))
```


## 5. 비트 연산자 (&, |, ~, <<, >>)
데이터를 비트 단위로 연산할 때 사용

이진수로 표현 가능한 `int` 타입만 사용


### AND (논리곱)
두 비트가 모두 1일 때 결과가 1

```java
System.out.println(1 & 1);
System.out.println(1 & 0);
System.out.println(0 & 1);
System.out.println(0 & 0);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/9c18192f-3431-4b74-8c9d-9dadfc32325c)


### OR (논리합)
두 비트 중 하나만 1일 때 결과가 1

```java
System.out.println(1 | 1);
System.out.println(1 | 0);
System.out.println(0 | 1);
System.out.println(0 | 0);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/c2e25c97-6ac1-4b81-96f4-3baf5137d45b)


### XOR (배타적 논리합)
두 비트 중 하나는 1, 다른 하나는 0일 때 결과가 1

```java
System.out.println(1 ^ 1);
System.out.println(1 ^ 0);
System.out.println(0 ^ 1);
System.out.println(0 ^ 0);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/e3630554-6e29-4ee4-b307-d5e5caa26cd6)


### NOT (논리 부정)
0은 1로, 1은 0으로 바꾸어 줌

```java
System.out.println(1 ^ ~1);
System.out.println(1 ^ ~0);
System.out.println(0 ^ ~1);
System.out.println(0 ^ ~0);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/65741009-fff7-416d-9691-789473ad7971)


### 비트 이동 연산자 (쉬프트 연산자)
정수 데이터의 비트를 좌측 또는 우측으로 밀어서 이동 시키는 연산 수행

- `a << b` : 정수 a의 각 비트를 b만큼 좌측 이동 (빈자리는 0으로 채워짐)
- `a >> b` : 정수 a의 각 비트를 b만큼 우측 이동 (빈자리는 최상위 부호 비트와 같은 값으로 채워짐)
- `a >>> b` : 정수 a의 각 비트를 b만큼 우측 이동, 새로운 비트는 전부 0으로 채워짐


**정수 8을 왼쪽으로 2비트 이동 시켜보기**

정수 8을 2진수로 표현하면 `00001000`

비트 전체를 좌측 이동하면 맨 왼쪽의 0 두 개는 없어지고 맨 오른쪽에 새로 생긴 2비트는 0으로 채워짐 (`00100000`)

`00100000` 을 10진수로 변환하면 32가 됨

(2^7*0)+(2^6*0)+(2^5*1)+(2^4*0)+(2^3*0)+(2^2*0)+(2^1*0)+(2^0*0) = 32

```java
int a = 8;
System.out.println(a<<2);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/26ff8f28-a922-4eb6-8fd0-bf4d83395903)


**정수 -8을 오른쪽으로 2비트 이동 시켜보기**

-8을 2진수로 표현하면 `11111000`

비트 전체가 우측 이동 하면 맨 오른쪽의 비트 두 개는 버려지고 왼쪽에 2비트는 최상위 부호비트와 동일한 값으로 채워짐(`11111110`)

최상위 부호 비트가 1이면 음수, 0이면 양수인데, 연산 결과의 최상위 부호 비트가 1이므로 2의 보수 적용

11111110 에서 1의 보수 적용 → 00000001

00000001 에서 마지막 비트에 1 더함 → 00000010 → -2

```java
int a = -8;
System.out.println(a>>2);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/22e58196-7e7c-448a-aafb-dc110634aead)



## 삼항 연산자
## 1. 삼항 연산자
세 개의 피연산자가 있는 연산자

`조건식 ? true일 때 값 또는 연산식 : false일 때 값 또는 연산식` 으로 구성


### 삼항 연산자 활용해보기
간단한 연산식을 한 줄로 나타낼 때 효율적

```java
int a = 10;
int b = 20;

String str = (a > b) ? "a is greater than b" : ((a < b) ? "a is less than b" : "a and b are equal");
System.out.println(str);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/ff333b2b-2280-4169-8259-28f8e509189c)



# 조건문
## if문
### if 조건문
특정 조건이 참일 때만 코드 블록 실행 가능

if문 구조

소괄호 안에 조건식 작성하고 중괄호 안에 조건식 결과에 따른 코드 작성

```java
if (조건) {
    // 조건이 참일 때 실행 코드
}
```


### if문 작성해보기 (else)
조건이 거짓일 때 코드는 `else` 에 작성

score가 90보다 클 때  ‘A’ 출력, 아니면 ‘B’ 출력

```java
int score = 95;
if (score > 90) {
  System.out.println('A');
} else {
  System.out.println('B');
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/72b99be5-10b6-4bb0-a07c-5398d0e7bdad)


### if문 작성해보기 (else if, else)
여러 조건을 작성할 때 else if 조건문 사용

number가 10보다 크면 "number는 10보다 큽니다"출력, 10보다 작으면 "number는 10보다 작습니다" 출력, 10이면 "number는 10입니다" 출력하는 코드

```java
int number = 10;
if (number > 10) {
  System.out.println("number는 10보다 큽니다");
} else if (number < 10) {
  System.out.println("number는 10보다 작습니다");
} else {
  System.out.println("number는 10입니다");
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/46f74160-face-4eb9-a140-6a703488d082)


- 문제

당신은 두 개의 정수 변수 **`a`**와 **`b`**를 가지고 있습니다. 이 변수들에 대해 다음 조건을 만족하는 프로그램을 작성하세요
    
    - `a`가 `b`보다 크면 "a is greater than b"를 출력합니다.
    - `a`와 `b`가 같으면 "a and b are equal"을 출력합니다.
    - `a`가 `b`보다 작으면 "a is less than b"를 출력합니다.
    
    ```java
    int a = 10;
    int b = 20;
    
    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a < b) {
      System.out.println("a is less than b");
    } else {
      System.out.println("a and b are equal");
    }
    ```
    
    ![image](https://github.com/shdbwls66/backendJava/assets/168792230/6092164c-14c2-483c-9037-5fe78b575274)
    

- 논리 연산자 문제
    
당신은 세 개의 불리언(boolean) 변수 **`x`**, **`y`**, **`z`**를 가지고 있습니다. 이 변수들에 대해 다음 조건을 만족하는 프로그램을 작성하세요:
    
  - `x`가 `true`이고, `y`가 `false`일 때, "조건 1 충족"을 출력합니다.
  - `y`와 `z` 둘 다 `true`이거나, `x`와 `z` 둘 다 `false`일 때, "조건 2 충족"을 출력합니다.
  - `x`, `y`, `z` 중 하나라도 `true`이면 "적어도 하나는 참"을 출력합니다.
  - 세 변수 모두 `false`일 때, "모두 거짓"을 출력합니다.
    
    (y = false로 선언하고 y 그냥 출력해도 true 나옴)
    
    ```java
    boolean x = true, y = true, z = true;
    if (x && !y) {
      System.out.println("조건 1 충족");
    }
    if ((y && z) || (!x && !z)) {
      System.out.println("조건 2 충족");
    }
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }
    if (!x && !y && !z) {
      System.out.println("모두 거짓");
    }
    ```



## switch
### switch 문
특정 변수의 값을 확인하고 그 값에 따른 코드를 실행

기본 구조

`case` 문은 변수의 값과 비교할 값, 일치하면 해당 `case`문의 코드 실행

`break`문은 `switch`문에서 빠져나오는 역할

`break`문이 없으면 다음 `case`문으로 넘어감

`default` 문은 일치하는 `case`문이 없을 경우 실행

```java
switch (변수) {
    case 값1:
        // 변수가 값1과 일치하는 경우 실행할 코드
        break;
    case 값2:
        // 변수가 값2와 일치하는 경우 실행할 코드
        break;
    case 값3:
        // 변수가 값3과 일치하는 경우 실행할 코드
        break;
    default:
        // 변수와 일치하는 어떤 case 문도 없는 경우 실행할 코드
}
```


### switch문 작성해보기
변수 data 값을 받아 해당되는 case문 코드 블록 실행

```java
int data = 10;

switch (data) {
  case 1:
    System.out.println("1입니다");
    break;
  case 2:
    System.out.println("2입니다");
    break;
  case 10:
    System.out.println("10입니다");
    break;
  default:
    System.out.println("d");
    break;
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/dce88806-3331-49db-91e6-9a127c167384)


- 문제

프로그램 내에서 미리 지정된 요일에 따라 적합한 활동을 제안하는 프로그램을 작성하세요.

**조건**:

1. 요일은 프로그램 내에서 문자열 변수로 미리 정의합니다 (예: "수요일").
2. **`switch`** 문을 사용하여 각 요일에 따른 활동을 제안합니다.
    - 예: "월요일"에는 "책 읽기", "금요일"에는 "영화 보기" 등
3. 일치하는 요일이 없으면 "알 수 없는 요일"이라는 메시지를 출력합니다.


“수요일” 로 문자열 변수 선언

수요일에 해당되는 코드 블록 실행 후 종료

```java
String day = "수요일";

switch (day) {
  case "월요일":
    System.out.println("노래듣기");
    break;
  case "화요일":
    System.out.println("커피마시기");
    break;
  case "수요일":
    System.out.println("악기 뚱땅거리기");
    break;
  case "목요일":
    System.out.println("게임하기");
    break;
  case "금요일":
    System.out.println("술마시기");
    break;
  case "토요일":
    System.out.println("누워있기");
    break;
  case "일요일":
    System.out.println("폰만지기");
    break;
  default:
    System.out.println("알 수 없는 요일");
    break;
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/c020d141-ebe0-4e98-94c7-ba7a45219c00)


- 문제

    - 1번: 변수 `grade`에 'A', 'B', 'C', 'D', 'F' 중 하나의 문자가 저장되어 있습니다. 각 등급에 따라 "Excellent", "Good", "Average", "Below Average", "Fail"을 출력하는 코드를 작성하세요.
    
    ```java
    // 1
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Ecellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      case 'F':
        System.out.println("Fall");
        break;
      default:
        System.out.println("error");
        break;
    }
    ```

    - 2번: 변수 `operator`에 '+', '-', '*', '/' 중 하나의 문자가 저장되어 있습니다. 두 개의 정수형 변수 `num1`과 `num2`의 값에 따라 해당 연산을 수행하고 결과를 출력하는 코드를 작성하세요.

    ```java
    // 2
    char operator = '+';
    int num1 = 20, num2 = 10;
    
    switch (operator) {
      case '+':
        System.out.println(num1 + num2);
        break;
      case '-':
        System.out.println(num1 - num2);
        break;
      case '*':
        System.out.println(num1 * num2);
        break;
      case '/':
        System.out.println(num1 / num2);
        break;
      default:
        System.out.println("오류");
        break;
    }
    ```

    - 3번: 변수 `color`에 "red", "green", "blue" 중 하나의 문자열이 저장되어 있습니다. 각 색상에 따라 "Apple", "Grass", "Sky"를 출력하는 코드를 작성하세요.

    ```java
    // 3번
    String color = "red";
    switch (color) {
      case "red":
        System.out.println("Apple");
        break;
      case "green":
        System.out.println("Grass");
        break;
      case "blue":
        System.out.println("Sky");
        break;
      default:
        System.out.println("error");
    }
    ```

    - 4번: 변수 `score`에 0부터 100 사이의 점수가 저장되어 있습니다. 점수 범위에 따라 "A", "B", "C", "D", "F" 등급을 출력하는 코드를 작성하세요.
      - 90 이상: A
      - 80 이상 90 미만: B
      - 70 이상 80 미만: C
      - 60 이상 70 미만: D
      - 60 미만: F

    ```java
    // 4번
    int score = 0;
    switch (score / 10) {
      case 10:
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
        break;
    }
    ```

    - 5번: 변수 `language`에 "Java", "Python", "C++", "JavaScript" 중 하나의 문자열이 저장되어 있습니다. 각 프로그래밍 언어에 대한 간단한 설명을 출력하는 코드를 작성하세요.

    ```java
    // 5번
    String language = "Java";
    switch (language) {
      case "Java":
        System.out.println("Java");
        break;
      case "Python":
        System.out.println("Python");
        break;
      case "C++":
        System.out.println("C++");
        break;
      case "JavaScript":
        System.out.println("JavaScript");
        break;
      default:
        System.out.println("목록에 없는 코드!");
        break;
    }
    ```

    - 실행 화면 (1번부터 5번까지)
 
      ![image](https://github.com/shdbwls66/backendJava/assets/168792230/532684a4-8377-40c1-93e9-d472c8e43d26)

