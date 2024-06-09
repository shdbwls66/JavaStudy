# 코딩테스트 연습

## 1번

```
주어진 문자열의 길이가 홀수인 경우, 문자열의 가운데 3글자를 반환하는 함수를 작성하세요.
예를 들어, 문자열 "Monitor"의 경우 "nit"을 반환해야 합니다.
만약 문자열의 길이가 3보다 작으면, 문자열 자체를 반환하세요.

예제
입력: "Monitor"
출력: "nit"

요구사항
문자열의 길이가 홀수인 경우, 가운데 3글자를 반환합니다.
문자열의 길이가 3보다 작으면, 문자열을 그대로 반환합니다.
```

- 문제 풀이
    
```java
public static String getMiddleThree(String str) {
  String result = str;
  if (str.length() >= 3) {
    int firstIndex = str.length() / 2 - 1;
    result = str.substring(firstIndex, firstIndex + 3);
  }

  return result;
}
```
    
1. 문자열을 반환하는 메서드를 만들기 위해 `public static String getMiddleThree(){};` 입력

2. `if`문으로 `str`길이가 3 이상일 때 중간에 위치한 문자열을 반환하는 코드 작성

3. 문자열 길이를 2로 나눠 1을 빼서 가운데 3글자 중 첫번째 글자 인덱스 값 구함

4. `str.substring` 으로 인덱스 범위를 설정

실행해보기

```java
public static void main(String[] args) {
  System.out.println(getMiddleThree("덮밥"));
  System.out.println(getMiddleThree("Monitor"));
  System.out.println(getMiddleThree("add"));
}
```
    
![image](https://github.com/shdbwls66/backendJava/assets/168792230/8f7cd0d9-e51e-4450-a414-a81532e484cd)

<hr>

## 2번

```
여러분은 아주 크게 짖는 개를 키우고 있습니다.
 hour 매개변수는 현재 시각을 의미하고 0~23까지 숫자를 넣을 수 있습니다.
 만약 개가 7시 이전이나 20시 이후에 짖으면 매우 곤란해질겁니다.
 만약 곤란한 상황이 발생하면 "짖으면 안돼!!" 를 반환하세요, 아니라면 "든든하군!" 을 반환하세요.

 barkingDogProblem(true, 6) ==> "짖으면 안돼!!"
 barkingDogProblem(true, 7) ==> "든든하군!"
 barkingDogProblem(false, 5) ==> "든든하군!"

```

- 문제 풀이
    
```java
public static String barkingDogProblem(boolean barking, int hour) {
  if(barking && (hour < 7 || hour > 20)) {
    return "짖으면 안돼!!";
  } else { 
    return "든든하군!";
  }
}
```
    
1. 7시 이전이나 20시 이후에 짖을 때:  “짖으면 안돼!!”
    - `if` 문 사용
    - `barking && (hour < 7 || hour > 20)`
    - 두 가지 조건 다 충족하여야 하므로 `&&`로 묶어줌

2. 이 외는 “든든하군!”
    
    - `else`문 사용
        
    
실행해보기

```java
System.out.println(barkingDogProblem(true, 5));
System.out.println(barkingDogProblem(false, 22));
System.out.println(barkingDogProblem(true, 9));
```

![image](https://github.com/shdbwls66/backendJava/assets/168792230/9d19fc40-9c1a-4ff8-816a-ecf294688fe4)

<hr>

## 3번

```
주어진 문장에서 category 에 해당하는 모든 단어를 출력하세요.

"When organizing items, always label each group with the appropriate
category. category: books, category: electronics, category: clothing, category: kitchenware,
and so on. "
```

- 문제 풀이
    
```java
public static void printCategory(String str) {
  int category = 0;
  int wordEnd = 0;
  while(true) {
    category = str.indexOf("category: ", wordEnd);
    if (category == -1) {
      break;
    }
    wordEnd = str.indexOf(",", category);
    String words = str.substring(category + "category: ".length(), wordEnd);
    System.out.println(words);
  }
}
```
    
1. "category: " 인덱스 값 도출
    - `str.indexOf` 값이 -1이면, 반복문 종료(str 안에 "category: " 이 없기 때문)
    - `str.indexOf` 에서 wordEnd 값에 따라 첫번째 "category: " 부터 마지막 "category: "까지의 인덱스 값 도출됨
    - 후에 `str.substring` 을 이용할 때 시작 값 계산에 이용

2. “, ” 인덱스 값 도출
    - `str.indexOf` 에서 category 값에 따라 첫번째 ", " 부터 마지막 ", "까지의 인덱스 값 도출됨
    - 후에 `str.substring` 을 이용할 때 마지막 값 계산에 이용

3. "category: "와  “, ” 사이의 값 도출
    - `str.substring` 을 이용해 단어 반환
    - 시작 인덱스는 category 시작 위치에서 “category: “글자 길이 만큼 더하기 (`category + "category: ".length()`)
    - 마지막 인덱스는 wordEnd
    
실행해보기
    
```java
public static void main(String[] args) {
  String str =
      "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on. ";
  printCategory(str);

}
```
    
![image](https://github.com/shdbwls66/backendJava/assets/168792230/dd839bc7-bd49-4d89-b47b-70d339d46aa9)

<hr>

## 4번

```
다음 문장을 for 문을 이용해 순회하면서 안에 있는 문자를 모두 순서대로 한번씩 콘솔로 출력해보세요.

String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다.";
/*
* 
물
방
울
이
* */

그리고 거꾸로 가장 마지막 문자부터 출력하도록 만들어 보세요.
```

- 문제 풀이
    
```java
public static void main(String[] args) {
  String someTxt = "물방울이 떨어지는 소리를 들으며 나는 한적한 숲속 오두막에서 책을 읽고 있었다";
  for (int i = 0; i < someTxt.length(); i++) {
    System.out.println(someTxt.charAt(i));
  }
}
```
    
1. someTxt 문자열에서 한 글자씩 출력
    - `someTxt.charAt(i)` 으로 인덱스 값에 따른 한 글자 출력

2. 문자열 길이만큼 반복
    - `for`문 사용
    - 인덱스 값을 0부터 늘려가기
    
실행해보기

![image](https://github.com/shdbwls66/backendJava/assets/168792230/94667dc8-e48a-4558-9f33-819f778a0679)
    
- 거꾸로 출력하기
    - 마지막 인덱스 값에서 시작 인덱스 값으로 출력
    
```java
  for (int i = someTxt.length()-1; i <= 0; i--) {
    System.out.println(someTxt.charAt(i));
  }
```
        
![image](https://github.com/shdbwls66/backendJava/assets/168792230/4e3b4147-57e0-47e5-8f54-71e64220b3ef)

<hr>

## 5번

```
배열안에서 특정한 데이터를 찾는 함수를 만들어보세요. 찾을 수 있으면 해당원소의 index 값을 반환하고, 찾지 못하면 -1을 반환합니다.
search(new int[] {1,2,3,4,5}, 5); ==> 4
search(new int[] {1,2,3,4,5}, 6); ==> -1

static int search(int[] nums, int target){
}
```

- 문제 풀이

```java
public static int search(int[] nums, int target){
  int result = -1;
  for(i = 0; i < nums.length(); i++) {
    if(nums[i] == target) {
      result = i;
      break;
    }
  }
  return result;
}
```
    
1. 결과값을 저장하는 `result` 변수 정의
    - 특정 조건을 만족하지 않으면 기본값 그대로 반환 `int result = -1;`

2. 배열 nums의 인덱스 값과 target 값이 같을 때 해당 인덱스 값을 변수 `result`에 저장
    - `if(nums[i] == target) {result = i; break;}`
    - 반복문 종료해야 하므로 `break;`

3. 변수 `result` 반환
    - `return result;`

실행 해보기
        
```java
public static void main(String[] args) {
  int[] arr1 = {1, 2, 3, 4, 5};
  int[] arr2 = {1, 2, 3, 4, 5};
  System.out.println(search(arr1, 9));
  System.out.println(search(arr2, 3));
}
```
        
![image](https://github.com/shdbwls66/backendJava/assets/168792230/6cea1ddc-1927-431e-a32f-e0ff677f3d20)
