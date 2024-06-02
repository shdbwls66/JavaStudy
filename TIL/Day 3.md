# 자바 #3 문자열 타입과 연산자
# 문자열 타입

## 문자열
- 문자로 구성된 문장

- 문자열을 나타내는 자료형은 `String`

### 문자열 선언
1. 리터럴 표기 방식 이용
```java
String a = "Hello";
```

2. `new` 키워드 이용
```java
String a = new String("Hello");
```

<aside>

    문자열 선언할 때 가독성이 좋고 컴파일 최적화에 도움을 주는 **리터럴 표기 방식**을 권장
    
</aside>


### 문자열 선언하고 출력해보기
- 여러 요소들을 출력할 때 `+`로 결합
```java
public class day3_Test {
  public static void main(String[] args) {

    String firstName = "Yujin";
    String secondName = "Rho";
    String phone = "galaxyS23";
    String status = "sleepy";

    System.out.println("제 이름은 " + secondName + firstName + " 입니다.");
    System.out.println("I'm so " + status);
  }
}
```

- 콘솔 출력 화면

![image](https://github.com/shdbwls66/backendJava/assets/168792230/5c3b0b6a-d107-405e-aebb-2c7a1721eb4c)



## 문자열 내장 메서드
**메서드**
- 객체에 속한 함수
- `String` 자료형 내장 메서드는 `String` 객체에 속한 함수를 가리킴
- 객체 타입으로 선언된 변수는 해당 객체의 메서드 이용 가능

### 1. `equals`
- 문자열 **값**이 같은지 비교하여 결과값을 반환

- 결과값은 `true` `false`

### 값이 같은 건 `true` , 값이 다른 건 `false` 반환
```java
String a = "hello";
String b = "java";
String c = "hello";

System.out.prinln(a.equals(b));
System.out.prinln(a.equals(c));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/c563497c-8772-49c7-989b-6a0945c51924)


### `equals` vs `==`

```java
    String a = "hello";
    String b = new String("hello");

    System.out.println(a.equals(b)); // true

    // 참조 타입이라 메모리 주소를 담고 있음
    // a 주소와 b 주소는 다르므로 false 출력
    System.out.println(a == b); // false
```

- `equals` 메소드를 사용하였을 때 `true` 반환

- `==` 연산자로 사용하였을 때 `false` 반환

![image](https://github.com/shdbwls66/backendJava/assets/168792230/52ae1674-24a0-4e32-bd05-87a9228b1d52)

- 변수 a와 변수 b는 각각 **별개의 객체로 선언**되었기 때문에 값 자체를 비교하기 위해서는 `equals` 메소드 사용하기


### 2. `indexOf`
- 문자열에서 **특정 문자열의 인덱스 값**을 반환

- 찾으려는 문자가 **존재하지 않으면** **-1** 반환

- 찾으려는 문자가 **여러 개** 존재하면 **가장 첫 번째** 문자 위치를 반환

### 문자열 a에서 특정 문자 위치 찾아보기
```java
String a = "Hello World!";

System.out.println(a.indexOf("!")); // 문자 위치
System.out.println(a.indexOf("g")); // 없으면 -1 반환
System.out.println(a.indexOf("l")); // 첫번째 문자 위치 반환
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/9074a9df-e4d0-4434-b5aa-501b7912a051)


### 3. `contains`
- 문자열에서 **특정 문자열이 포함되어있는지** 여부 반환

### World 포함 여부, SOFT 포함 여부 반환
```java
String a = "Hello World!";
System.out.println(a.contains("World"));

String b = "ESTSOFT";
System.out.println(b.contains("SOFT"));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/12930189-80a2-4bca-83f2-faee3bb268be)


### 4. `charAt`
- **특정 위치의 문자** 반환

### 인덱스 값이 6인 글자 반환
```java
String findChar = "What is your hobby?";
System.out.println(findChar(6));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/6a35781f-7ac7-4116-87fd-7cc9fe7173c0)


### 여러 개의 문자를 출력한다고 할 때
메서드만 여러 개 작성해서 실행 시키면 숫자가 반환되므로 중간에 `“”` 넣어줘야 함 

```java
// hobby가 출력
System.out.println(findChar.charAt(13)+""+findChar.charAt(14)+""+findChar.charAt(15)+""+findChar.charAt(16)+""+findChar.charAt(17));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/86efb260-d63c-4bd8-aa72-9a7d39b8fb01)

큰따옴표를 안 넣고 실행한 모습

![image](https://github.com/shdbwls66/backendJava/assets/168792230/7bc9b328-4b1a-4703-a7ac-1b5cc6afaf08)


### 5. `replaceAll`
- 문자열에서 특정 문자열을 **다른 문자열로 대체**

### World를 전부 Java로 바꾸어보기
```java
String a = "Hello World! Hello World! Hello World!";
System.out.println(a.replaceAll("World", "Java"));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f8209ac5-f88a-4a84-a4ba-f4241516c553)


### 6. `substring`
- 문자열에서 **특정 문자열을 뽑을 때** 사용

- 값 범위 지정할 때 마지막 값은 원래 인덱스 값보다 1을 더해서 작성해야 함

### a 문자열에서 WEEKEND만 뽑아내기
```java
String a = "WEEEE ASKE ;ND";
System.out.println(a.substring(0, 3) + a.substring(8,10) + a.substring(12,14));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/ca27f0c8-aa65-4868-9ca9-13e6402185e3)


### 문자열의 인덱스 범위를 벗어나면 오류남
```java
System.out.println(a.substring(14, 16));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/e93de3a5-102e-4179-9ab9-ffba0c79cd8a)


### 시작 위치만 작성
시작 위치부터 문자열 끝까지 반환

```java
System.out.println(a.substring(6));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/3a059a6f-ed19-4c30-8f48-efc51929ba12)


### 7. `split`
- 문자열을 **특정한 구분자**로 나누어 **배열**로 반환

### 문자열을 콜론으로 나눠 문자열 배열로 넣기
```java
String a = "a:b:c:d";

String[] split = a.split(":");
System.out.println(split[0]);
```

split 배열의 0번째 값으로 ‘a’가 출력
문자열이 나누어져 들어가 있음

![image](https://github.com/shdbwls66/backendJava/assets/168792230/6cae8e4e-3a04-4907-9e4a-25052d33dfb7)


### 8. `concat`
- 기존 문자열 뒤에 새로운 문자열을 **결합**

- 실행 시 문자열로 반환

### result 문자열에 ! 추가
```java
String result = "Hello";

// result = result + "!";와 같음
String concat = result.concat("!");
System.out.println(concat);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f7df148d-2871-4c08-b112-93391ca34ee4)


## 문자열 포맷팅 메서드 - `format`
- 문자열 안의 특정한 값을 바꿀 수 있게 해줌

- 치환 개수에 제한 X

### 기본 구조
- 각 %s를 치환값1, 치환값2로 치환
```java
String.format("... **%s**.. **%s**..", 치환값1, 치환값2);
```


### `format` 활용

특정값만 바뀌어 출력 되는 모습을 볼 수 있음

```java
String[] category = {"에스프레소류", "블랜디드류", "라떼류"};

String name1 = "아메리카노";
int price1 = 1500;

String name2 = "바닐라라떼";
int price2 = 3500;

String format = String.format("%s의 가격은 %s원 이고 %s 상품입니다", name1, price1, category[0]);
String format1 = String.format("%s의 가격은 %s원 이고 %s 상품입니다", name2, price2, category[0]);

System.out.println(format);
System.out.println(format1);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/4cb6d835-f92a-4e25-977e-ed0538233bfb)



## StringBuffer / StringBuilder
- 문자열을 추가하거나 변경할 때 주로 사용하는 자료형

- StringBuffer와 StringBuilder 내장메서드는 동일

<aside>
  
    `String` 클래스도 문자열 추가 가능하나 `String`은 새로운 객체를 생성하고 String 공간을 할당하기 때문에
    메모리 공간이나, 속도 측면에서 비효율적이라는 단점이 있음

</aside>

### Hello java World 나타내기
문자열이 합쳐져서 출력 되는 것을 볼 수 있음

```java
String result = "";
result += "Hello ";
result += "java";
result += "World";
System.out.println(result);

StringBuilder sb = new StringBuilder();
sb.append("Hello ");
sb.append("java");
sb.append("World");
System.out.println(sb);

StringBuffer sf = new StringBuffer();
sf.append("Hello ");
sf.append("java");
sf.append("World");
System.out.println(sf);
```


### 내장 메서드
### 1. `append`
- 문자열을 생성 / 추가

### ‘hello’ 와 ‘!’ 생성하기
```java
StringBuffer result = new StringBuffer();
result.append("Hello");
result.append("!");
System.out.println(result);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/82274b26-40eb-4b57-b6d4-f947ddb8b77a)


### 2.`insert`
- 특정 위치에 원하는 문자열 삽입

### 0번 인덱스에 World 끼워 넣기
```java
StringBuffer sb = new StringBuffer();

sb.append("Hello");
sb.insert(0, "World");
sb.insert(0, "World");
sb.insert(0, "World");
sb.insert(0, "World");

System.out.println(sb);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/cc678c7d-9607-441f-a25b-6efc95cd727a)

5번에 넣으면
```java
sb.insert(5, "World");
System.out.println(sb);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/36fb1965-f5da-4ba6-bad5-3405ed81f85c)


### 3. `substring`
- `String` 자료형의 `substring` 과 동일한 역할

- 인덱스 값 범위 지정할 때 주의!! (마지막 인덱스 값+1)

### Hello 문자열에서 특정 문자열 추출 하기
```java
StringBuffer sb = new StringBuffer();
sb.append("Hello");
System.out.println(sb.substring(2,5));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/90c2a002-5892-4a4f-9ac9-13161112f9e9)



<aside>

    `StringBuffer`: 멀티스레드 환경에서 안정적인 이용이 가능
    `StringBuilder` : 속도 등의 측면에서 우수

</aside>

<hr>

# 연산자
## 단항 연산자
- **단항 연산자**: 피연산자가 하나뿐인 연산자

### 1. 부호 연산자(+, -)
### 양의 부호 연산자(+)
- 변수나 값 앞에 `+` 를 붙여 양수를 표현할 때 사용

- 대부분의 경우 생략, 연산에 영향을 미치지 않음


### 음의 부호 연산자(-)
- 변수나 값 앞에 `-` 를 붙여 해당 수치의 부호를 반전 시킴

- 변수나 상수의 현재 부호를 반대로 만들 때 사용


### 부호 연산자 적용시켜보기!
`+` 적용 → 부호 유지

`-` 적용 → 부호 반전

```java
int positive = 10;
int negative = -10;

System.out.println("양의 부호 연산자 적용: " + (+positive));
System.out.println("음의 부호 연산자 적용: " + (-positive));
System.out.println("음의 부호 연산자로 부호 반전: " + (negative));
System.out.println("음의 부호 연산자로 다시 부호 반전: " + (-negative));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/5f4d01cc-446e-4b5f-82ab-c9e23bf3d059)


### 2. 증감 연산자(++, --)
### 전위 증감 연산자
- 일단 1씩 증감 먼저 하고 값 내놓음

- `++변수` : 변수의 값 1 증가 후, 표현식 평가

- `--변수` : 변수의 값 1 감소 후, 표현식 평가


### 후위 증감 연산자
- 일단 기존 값 먼저 내놓고, 나중에 1씩 증감

- `변수++` : 표현식 평가 후 변수의 값 1 증가

- `변수--` : 표현식 평가 후 변수의 값 1 감소


### 증감 연산자로 연산 해보기
**전위 증감**: 선 적용, 후 출력

**후위 증감**: 선 출력, 후 적용 

```java
int x = 5;
int y = 5;

System.out.println("전위 증가 연산자: " + (++x));
System.out.println("후위 증가 연산자: " + (y++));
System.out.println("===================");

System.out.println("x는 " + x);
System.out.println("y는 " + y);
```

y 경로를 따라가보면..

일단 5 출력 -> 6으로 증가, 현재 y값: 6

일단 6 출력

![image](https://github.com/shdbwls66/backendJava/assets/168792230/4be4da18-e45d-47f4-9f67-eaf96edee3fa)


```java
int a = 100;
int b = 100;

System.out.println("전위 감소 연산자: " + (--a));
System.out.println("후위 감소 연산자: " + (b--));
System.out.println("전위 감소 연산자: " + (--a));
System.out.println("후위 감소 연산자: " + (b--)); 
System.out.println("전위 감소 연산자: " + (--a));
System.out.println("후위 감소 연산자: " + (b--));
```

b 경로를 따라가보면..

일단 100 출력 -> 99로 감소, 현재 b값: 99

일단 99 출력 -> 98로 감소, 현재 b값: 98

일단 98 출력

![image](https://github.com/shdbwls66/backendJava/assets/168792230/34a5bd49-c08e-499b-8f3a-605a1e4120aa)


### 3. 논리 부정 연산자(!)
- 불리언 값의 반대 값 표시

- 주로 조건문이나 논리적 표현식에서 사용

- 연산자는 `!` 기호로 표시


### 논리 부정 연산자 사용 해보기
`!true` = `false`

`!false` = `true` 

```java
// case 1
boolean isRaining = true;

if (isRaining){
  System.out.println("하늘에서 비가와용");
}
if (!isRaining){
  System.out.println("하늘에서 눈이와용");
}

// case 2
boolean isSunny = false;

if (!isSunny){
  System.out.println("날씨가 맑아용");
} else{
  System.out.println("");
}
```

case1
1.  isRaining이 `true` 일 때, "하늘에서 비가와용" 출력
2.  !isRaining이 `true` 일 때, "하늘에서 눈이와용" 출력

`isRaining = true;` 이므로 1번 채택

case2
1. !isSunny가 `true` 일 때, “날씨가 맑아용” 출력
2. isSunny가 `true`일 때, “ ” 출력

`isSunny = false;` 이므로 1번 채택

![image](https://github.com/shdbwls66/backendJava/assets/168792230/88bccb15-695d-4f08-9d4c-c4bb7071ed23)
