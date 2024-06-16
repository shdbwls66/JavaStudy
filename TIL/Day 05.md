# 반복문

# 1. while문
## while 반복문

조건이 참인 **동안** 코드 무한 반복

조건은 참 또는 거짓으로 판별 가능한 표현식 이어야 함

### 기본 구조

```java
while (조건) {
    // 조건이 참인 동안 실행되는 코드
}
```


### while 반복문 작성해보기

(증감식을 작성하지 않으면 코드가 무한 반복하므로 빼먹지 않도록 할 것!)

```java
// 10부터 0까지 카운트

int i = 10;
while (i >= 0) {
  System.out.println("현재 카운트 " + i);
  i--;
}
System.out.println("카운트 종료");
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/ad746063-4489-452b-90b9-fd6e067f65f7)

```java
// 1부터 100까지 합

int n = 0, sum = 0;
while (n <= 100) {
    sum += n;
    n++;
}
System.out.println(sum);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/fc78d96b-92be-4185-9499-8df747d2889d)


```java
// 평균 계산

int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
int n = 0;
int sum = 0;
while (n < numbers.length) {
  sum += numbers[n];
  n++;
}
System.out.println(sum / numbers.length);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/a69fae2e-3e6d-4212-90dd-67c5d377f4b2)


```java
// 3의 배수 출력

int i = 0;
while (i <= 300) {
  if (i % 3 == 0) {
    System.out.println(i);
  }
  i++;
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/04aec0a4-3a8b-4bcf-bc1f-ffcb3ad2b070)


### 문제 1

주어진 배열에서 가장 큰 값을 찾아 출력하는 프로그램을 작성하세요.
    
```java
int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
```
    
변수 max를 배열의 인덱스 0인 값으로 선언
    
if문으로 다른 인덱스 값과의 크기 비교를 반복하고, 이 때 숫자가 더 큰 쪽을 max로 만들기
    
```java
// 최대값 구하기
int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
int max = numbers[0];
int n = 1;
while (n < numbers.length) {
  if (numbers[n]>max){
    max = numbers[n];
  }
  n++;
}
System.out.println(max);
```
    
![image](https://github.com/shdbwls66/backendJava/assets/168792230/246e7c73-f202-452a-9e88-3e0041c0ff2a)


### 문제 2

주어진 배열에서 양수의 합과 음수의 합을 각각 구하여 출력하는 프로그램을 작성하세요.
    
```java
int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
```
    
if문으로 양수와 음수를 구분하여, 양수의 합과 음수의 합을 각각  구함
    
```java
// 양수 합, 음수 합 각각 구하기

int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
int i = 0;
int sum1 = 0;
int sum2 = 0;
while (i < numbers.length) {
  if (numbers[i] > 0) {
    sum1 += numbers[i];
  } else {
    sum2 += numbers[i];
  }
  i++;
}
System.out.println("양수의 합: " + sum1);
System.out.println("음수의 합: " + sum2);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/599b4dde-e0c9-44e7-99cf-a58b682917b0)

    

# 2. for문
## for 반복문

특정 횟수만큼 코드 반복 실행

조건식이 true면 코드 블록 실행, false면 반복문 종료

### 기본 구조

```java
for (초기식; 조건식; 증감식) {
    // 조건식이 참일 때 실행되는 코드
}
```

실행 순서는..

초기식 실행 → 조건식 확인 → 코드 블록 실행 → 증감식 → 조건식 → 코드 블록 실행 → (증감식 → 조건식 → 코드 블록 실행 반복…) 

조건식이 false일 때 반복문 종료


### for 반복문 작성해보기

1부터 4까지 출력

```java
for (int i = 1; i < 5; i++) {
  System.out.println("현재 i의 값은 = " + i);
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f098d5e8-fb3e-4564-b78b-041f96bac3c1)


1부터 100까지 숫자 중에서 모든 짝수의 합

if문으로 2로 나눈 나머지가 0이 나오는 숫자들을 판별하고 해당 숫자들의 합을 구하기

```java
// 1부터 100까지 짝수의 합

int sum = 0;
for (int i = 1; i <= 100; i++) {
  if (i % 2 == 0) {
    sum += i;
  }
}
System.out.println(sum);
```


이런 방법으로도 짝수 합을 구할 수 있음

rangeClosed()에 범위 작성, filter()에 조건 작성

```java
int hap = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
System.out.println(hap);
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/7415dfc4-b07d-4d0e-9fa3-c16547bab3f1)


### 문제 1

사용자로부터 정수 n을 입력받아, 1부터 n까지의 정수 중에서 3의 배수이면서 5의 배수인 수의 합을 계산하여 출력하는 프로그램을 작성하세요.
    
    
and 연산자로 3의 배수이자 5의 배수인 정수를 구함

```java
// 3의 배수이면서 5의 배수인 수의 합

int sum1 = 0;
for (int n = 1; n <= 20; n++) {
  if (n % 3 == 0 && n % 5 == 0) {
    sum1 += n;
  }
}
System.out.println(sum1);
```
    
![image](https://github.com/shdbwls66/backendJava/assets/168792230/dbb1b4e2-0a36-40dc-ada3-4b4eab90e48f)


### 문제 2

피보나치 수열의 첫 10개 항을 출력하는 프로그램을 작성하세요.
    
피보나치 수열

- 첫 번째 항과 두 번째 항은 1
- 세 번째 항부터는 이전 두 항의 합으로 정의

첫 10개의 항

`1, 1, 2, 3, 5, 8, 13, 21, 34, 55`

배열 arr 생성 후 인덱스 0번 값과 1번 값을 1로 초기화

for문으로 수열 계산 후 배열 arr에 담기 (0번과 1번은 값을 이미 선언 했으므로 2번부터 선언)

배열 값 출력

```java
int[] arr = new int[10];
arr[0] = 1;
arr[1] = 1;
    
for(int n = 2; n < arr.length; n++) {
  arr[n] = arr[n-2] + arr[n-1];
}

for(int i : arr) {
 System.out.println(i);
} // 값 출력
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/f31293b5-5e55-4218-820b-47a92eae7bd1)



# 3. 이중 반복문과 break, continue
## 이중 반복문

자바에서는 여러 반복문을 중첩 해서 코드를 작성할 수 있음

### 기본 구조

바깥쪽 반복문이 실행될 때 안쪽 반복문 실행 시작

안쪽 반복문 실행이 끝난 후에 바깥쪽 반복문 실행

이게 반복됨

```java
for (초기식1; 조건식1; 증감식1) {
    // 바깥쪽 반복문의 본문
    for (초기식2; 조건식2; 증감식2) {
        // 안쪽 반복문의 본문
    }
}
```


### 이중 반복문 작성해보기

구구단 출력

i=2일 때, j는 1부터 9까지 출력

i=3일 때, j는 1부터 9까지 출력

이 과정을 i<10 결과가 거짓이 될 때까지 반복

```java
// 구구단

int i;
int j;
int result;

for (i = 2; i < 10; i++) {
  for (j = 1; j < 10; j++) {
    result = i * j;
    System.out.println(i + " * " + j + " = " + result);
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/920287c2-6f55-4b34-b0bf-2d2f85e6acee)


### 문제

구구단 19단을 역방향으로 출력하는 프로그램을 작성하세요.

출력 형식은 "19 x 19 = 361"부터 "19 x 1 = 19"까지 역순으로 출력되어야 합니다.
    
    
19단부터 1단까지 출력하는 코드 작성

역순 출력 시키기 위해 i와 j값을 19에서 1씩 감소하도록 코드 작성

변수 result에 i와 j를 곱한 값을 선언
    
```java
// 구구단 19단
int i;
int j;
int result;

for (i = 19; i > 0; i--) {
  for (j = 19; j > 0; j--) {
    result = i * j;
    System.out.println(i + " * " + j + " = " + result);
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/d89ae65b-a012-4d5b-90dc-b5e7ade48eb9)



## break

**반복문을 즉시 종료**하고 바로 다음 코드로 이동

### break문 작성해보기

5가 되었을 때 반복문 중단 하기

```java
int number = 0;
while (number < 10) {
  System.out.println("현재 숫자: " + number);
  if (number == 5) {
    System.out.println("5가 되었습니다.");
    break;
  }
  number++;
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/050eaab1-7d58-49ad-83c8-ecf48450a846)


for문에서 break 사용해보기

```java
for (int i = 0; i < 10; i++) {
  System.out.println("현재 숫자: " + i);
  if (i == 5) {
    break;
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/76cb1d76-ad76-4768-b382-c78a274e7603)


j값이 5일 때 j값이 속한 반복문 중단

(i값 0, j값 0, 1, 2, 3, 4, 5, i값 1, j값 0, 1, 2, 3, 4, 5…. 이런식으로 반복 출력..)

```java
for(int i = 0; i < 10; i++) {
  System.out.println("현재 i의 값은 = " +i);
  for(int j = 0; j < 10; j++) {
    System.out.println("현재 j의 값은 = " +j);
    if (j == 5) {
      break;
    }
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/9b8772a8-709f-4de6-bcb3-f4348d35acf9)


i가 50일 때 break, j가 80일 때 break

i가 1씩 증가할 때마다, j는 2~80까지 출력, i가 50일 때 반복문 중단 되면서 실행 끝!

```java
int i, j;
for(i = 1; i <= 100; i++) {
  System.out.println("현재 i값: " + i);
  if (i == 50) {
    break;
  }
  for(j = 2; j <= 100; j++) {
    System.out.println("현재 j값: " + j);
    if (j == 80) {
      break;
    }
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/a995c255-c391-4fa2-a830-88ef634cac09)



## continue

현재 실행되는 코드를 즉시 중단하고 **다음 반복으로 넘김**

### continue문 작성해보기

0부터 9까지 출력, 이 때 3은 출력 x

```java
int number = 0;

while (number < 10) {
  number++;
  if (number == 3) {
    continue;
  } 
  System.out.println("현재 값은 :" + number);
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/ff2770ea-f551-41ae-a186-046391094d65)


for문으로 작성해보면..

```java
for (int i = 0; i < 10; i++) {
  if (i == 3) {
    continue;
  }
  System.out.println("현재 값은 :" + i);
}
```



💡 **주의: 증감식 위치에 신경 쓰기**
<aside>
  
    `number++;` 을 continue 밑에 작성하면
    
    숫자가 3이 되었을 때 continue 밑의 코드를 실행하지 않고
    
    바로 다음 반복으로 넘어가기 때문에 값이 3인 상태로 무한 반복 일어남

</aside>

![image](https://github.com/shdbwls66/backendJava/assets/168792230/c03a6157-7025-4622-818d-ae1a03c57f2a)


### break와 continue 활용

적절히 혼용하면 다양한 조건에 따른 반복문을 구현할 수 있음

i가 5일 때 반복문 중단, j값은 5를 제외하고 출력

```java
for (int i = 0; i < 10; i++) {
  if (i == 5) {
    break;
  }
  for (int j = 0; j < 10; j++) {
    if (j == 5) {
      continue;
    }
    System.out.println(j);
  }
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/93f3d872-a816-4d66-883b-61d2ba8e4658)


1부터 10까지 숫자 출력, 이 때 4와 7은 건너뛰기

4와 7, 모두 참으로 묶기 위해 or 연산자 사용

```java
for(int i = 1; i <= 10; i++) {
  if (i == 4 || i == 7) {
    continue;
  }
  System.out.println(i);
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/5375dcda-ea7a-4abb-b8e3-c65c640717ee)



## 향상된 반복문

배열이나 컬렉션의 요소를 순차적으로 처리하는 반복문

기존 for문에 비해 가독성이 좋음

**요소에 직접 접근**

### 기본 구조

```java
for (요소타입 변수명 : 배열 또는 컬렉션) {
    // 반복할 코드
}
```


### 배열

인덱스 값이 아닌 배열 요소로 직접 접근

```java
int[] arr = {1, 2, 3, 4, 5};

for (int i : arr) {
  System.out.println(i);
}
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/8bb381f3-0201-4876-bdca-5701beafee9e)


### 문제 1

정수형 배열 `scores`가 주어졌을 때, 향상된 반복문을 사용하여 점수의 총합과 평균을 계산하는 코드를 작성하세요.
    
    
향상된 반복문을 사용하여 배열 요소의 합 구함

평균 구할 때 소수점을 고려하여 double 타입으로 지정 (sum은 int 타입이므로 double 타입으로 형변환)

```java
int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
int sum = 0;

for(int i: scores) {
  sum += i;
}

double avg = (double)sum / scores.length();

System.out.println("합: " + sum);
System.out.println("평균: " + avg);
```
    
![image](https://github.com/shdbwls66/backendJava/assets/168792230/1c5558e8-35b8-46aa-a694-b0eb93d1f478)


### 문제 2

문자열 배열 `names`가 주어졌을 때, 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성하세요.
    

향상된 반복문과 if문을 이용하여 배열의 각 요소로 접근하여 길이가 5 이상인지 판별

```java
String[] names = {"okay2","asbds","good2","ormiiiii","abcde"};

for (String arr: names) {
  if (names.length >= 5) {
    System.out.println(arr);
  }
}
```
    
![image](https://github.com/shdbwls66/backendJava/assets/168792230/cfab48db-3aaf-4cfa-9840-c733183afc09)
