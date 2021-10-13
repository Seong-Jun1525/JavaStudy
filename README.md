# JavaStudy 1차
## 1-1
필기 x

## 1-2
```java
  int num = 10;
  int bNum = 0b1010;
  int oNum = 012;
  int xNum = 0xa;

  System.out.println(num);
  System.out.println(bNum);
  System.out.println(oNum);
  System.out.println(xNum);
```

### 진수표기법
진수 | 표기법 | 값
-- | -- | --
2진수 | 0b1010 | 10
8진수 | 012 | 10
10진수 | 10 | 10
16진수 | 0xa | 10

## 변수
변수는 변하는 수이다.

- 사용 방법
```java
String name = "Seong Jun";
int age = 22;
int height = 182;
```

- 언제 보더라도 이 변수가 뭐를 하는 변수인지 알 수 있어야함.
- 의미있는 변수명은 길더라도 알 수 있게 써야함.
- 축약형 x
- 카멜로테이션으로 작성. 소문자로 시작해서 단어가 바뀔때마다 대문자로 써줌.
  - ex) int nameOfStudent;

## 자료형
byte | 정수형 | 문자형 | 실수형 | 논리형
-- | -- | -- | -- | --
1byte | byte | - | - | boolean
2byte | short | char | - | -
4byte | int | - | float | - 
8byte | long | - | double | - 

- int를 제일 많이 사용
 
 ### 문자
- 예제
```java
char ch1 = 'A';
System.out.println(ch1);
System.out.println((int)ch1);

char ch2 = 66;
System.out.println(ch2);
System.out.println((char)ch2);

char ch3 = 67;
System.out.println(ch3);
System.out.println((char)ch3);

char han = '한';
char ch = '\uD55C';
System.out.println(han);
System.out.println(ch);
 ```
- 출력 결과

```console
A
65
B
B
C
C
한
한
```
 
## 지역 변수 자료형없이 사용하기(자바 10부터 지원 됨)

- 추론 가능한 변수에 대한 자료형을 선언하지 않음
- 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입할 수 없음
- 지역변수만 사용 가능

- 예제
```java
var i = 10;
var j = 10.0;
var str = "hello";

System.out.println(i);
System.out.println(j);
System.out.println(str);

str = "test";
// str = 3; error
```
- 출력 결과
```console
10
10.0
hello
```

## 변하지 않은 상수와 리터럴, 변수의 형 변환
### 상수 선언하기
- 상수는 변하지 않는 수
- 원주률, 1년 12개월 등
- final 예약어를 사용하여 선언
- 상수를 사용하면 변하지 않는 값을 반복하여 사용하여 사용할 때 의미있는 문자로 인식하기 쉽고 변하더라도 선언한 부분만 변경하면 되므로 여러번 수정할 필요가 없음

- 예제
```java
final int MAX_NUM = 100;
final int MIN_NUM;

MIN_NUM = 0;

System.out.println(MAX_NUM);
System.out.println(MIN_NUM);

// MAX_NUM = 1000; error
```

- 출력 결과
```console
100
0
```

### 리터럴
- 프로그램에서 사용하는 숫자, 문자, 논리값을 말함
- 리터럴은 상수 풀에 있음
- 정수 리터럴은 int로 실수 리터럴은 double로 저장됨
- 정수의 범위가 넘어가는 경우는 L,l을 float로 사용하는 경우는 F,f를 식별자로 써줘야 함

### 형변환
- 서로 다른 자료형 간에 연산 등의 수행을 위해 하나의 자료형으로 동일하는 것
- 묵시적 형 변환(자동 형 변환)과 명시적 형 변환(강제 형 변환)이 있다
- 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 됨
- 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 됨

- 예제
```java
int iNum = 10;
byte bNum = (byte)iNum;

System.out.println(iNum);
System.out.println(bNum);

int iiNum = 255;
byte bbNum = (byte)iiNum;

System.out.println(iiNum);
System.out.println(bbNum);
```
- 출력 결과
```console
10
10
255
-1
```

- 10과 같은 수는 byte로 담을 수 있으나 255처럼 byte에 담을 수 없는 수를 대입하면 이상한 값이 출력 됨

- 예제2
```java
double dNum = 1.2;
float fNum = 0.9F;

int iNum1 = (int)dNum + (int)fNum;
int iNum2 = (int)(dNum + fNum);

System.out.println(iNum1);
System.out.println(iNum2);
```
- 출력 결과
```console
1
2
```

## 산술 연산자


## 복합 대입 연산자

## 증가 & 감소 연산자

## 관계 연산자
- 이항 연산자
- 비교 연산자라고도 함

## 논리 연산자
- 관계 연산자와 혼합하여 사용

## 단락 회로 평가 - 논리 연산에서 모든 항이 실행되지 않는 경우
- 논리 곱(&&)은 두 항의 결과가 모두 true일때만 결과 true
  - 앞의 항의 결과가 false이면 뒤의 항의 결과를 평가하지 않음
- 논리 합(||)은 두 항의 결과 모두 false일때만 결과가 false
  - 앞의 항의 결과가 true일면 뒤의 항의 결과를 평가하지 않음

## 조건 연산자
- 삼항 연산자
- 조건의 결과가 true인 경우와 false인 경우에 따라 다른 결과가 수행됨
- if 조건문을 간단히 표현 가능


## 비트 연산자

- 마스크 : 특정 비트를 가리고 몇 개의 비트값만 사용할 때
- 비트 켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때
  - 예) x비트 & 00001111 (하위 4비트 중 1인 비트만 꺼내기)
- 비트 끄기 : 특정 비트들만을 0으로 설정해서 사용하고 싶을 때
	- 예) x비트 | 11110000 (상위 4비트 중 0인 비트만 0으로 만들기)

연산자 | 설명 | 예
-- | -- | --
~ | 비트의 반전(1의 보수) | a = ~a;
& | 비트 단위 AND | 1 & 1 1반환 그 외 0
| | 비트 단위 OR | 0|0 0반환 그 외 1
^ | 비트 단위 XOR | 두 개의 비트가 서로 다른 경우 1
\<< | 왼쪽 shift | a<<2 a를 2비트만큼 왼쪽으로 이동
\>> | 오른쪽 shift | a>>2 a를 2비트만큼 오른쪽으로 이동
\>>> | 오른쪽 shift | >> 동일한 연산. 채워지는 비트가 부호와 상관없이 0임

## if조건문

## switch case문
- if-else if-else문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
- 비교 조건이 특정 값이나 문자열인 경우 사용
- 자바 14부터는 break문을 사용하지 않고 좀 더 간결해진 표현식 지원
- yield 사용

## 자바 14부터 지원되는 switch 표현

```java
int month = 3;
		
int day = switch (month) {
case 1, 3, 5, 7, 8, 10, 12 -> {
  System.out.println("한 달은 31일 입니다.");
  yield 31;
}
case 4, 6, 9, 11 -> {
  System.out.println("한 달은 30일 입니다.");
  yield 30;
}
case 2 -> {
  System.out.println("한 달은 28일 혹은 29일 입니다.");
  yield 31;
}
default -> {
  System.out.println("존재하지 않는 달 입니다.");
  yield 0;
}
};
System.out.println(month + "월은" + day + "일 입니다.");
```

## while문
- 조건이 참인 동안 반복 수행
- 조건이 맞지 않으면 수행되는 부분이 없음
- 조건식의 결과가 참, 거짓일 때 많이 사용
## do-while문
- 조건이 참인 동안 반복 수행
- 수행문을 먼저 수행 한 후 조건 체크
## for문
- 초기화->조건체크->증감 순으로 수행
- 특정수의 범위 횟수와 관련하여 반복되는 경우 주로 사용
- 배열과 함께 사용
### for문의 문장들은 생략이 가능
- 초기화식 생략 : 이미 이전에 값이 초기화되어서 for문 내부에서 값을 지정할 필요가 없는 경우
- 조건식 생략 : 반복 수행에 조건이 수행문 내부에 있는 경우
- 증감식 생략 : 증감식에 대한 연산이 복잡하거나 다른 변수의 결과 값에 결정되는 경우
- 무한 반복

## 중첩 반복문
- 반복문 내부에 반복문이 있음
- 수행시간에 문제가 발생할 수 있음
- 외부 반복문과 내부 반복문 간의 변수 값 변화를 잘생각하고 구현해야함

## break문과 continue문

# JavaStudy 2차
## 객체와 클래스
```java
public class Order {
	int orderId;
	String buyerId;
	String sellerId;
	int productId;
	String orderDate;
}
```

### 객체지향 프로그래밍
- 객체 정의
- 각 객체의 속성을 멤버변수로 역할을 메서드로 구현 
- 각 객체간의 협력을 구현함

## 함수
- 하나의 기능을 수행하는 코드
- 구현된 함수는 호출되어 사용되고 사용이 끝나면 제어를 반환함
- 함수는 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있음

### 함수의 예
```java
int add(int n1, int n2) {
	int r;
	r = n1 + n2;
	retrun r;
}
// 반환이 없을 경우 데이터 타입을 void로 작성
```

## 메서드
- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
- 멤버 함수라고도 함
- 메서드를 구현함으로써 객체의 기능이 구현됨
- 메서드의 이름은 그 객체를 사용하는 객체에 맞게 짓는것이 좋음

