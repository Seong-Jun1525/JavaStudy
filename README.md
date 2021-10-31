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

## 객체 속성은 멤버 변수로, 객체의 기능은 메서드로 구현
- 클래스를 기반으로 여러개의 인스턴스가 생성될 수 있다.

### student
```java
public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentID + "학번 학생의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
```
### studentTest
```java
public class StudentTest {

	public static void main(String[] args) {
		Student studentLim = new Student();
		
		studentLim.studentID = 201907012;
		studentLim.setStudentName("Seong Jun");
		studentLim.address = "인천";
		
		studentLim.showStudentInfo();
		
		Student studentWoo = new Student();
		
		studentWoo.studentID = 10241028;
		studentWoo.setStudentName("Woo");
		studentWoo.address = "인천";
		
		studentWoo.showStudentInfo();
	}

}
```

## 인스턴스 생성과 힙 메모리
### 인스턴스
- 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 코드 상태
- 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수 값을 가지게 됨
- 학생의 클래스에서 생성된 각각의 인스턴스는 각각 다른 이름, 학번, 학년등의 값을 가지게 됨
- new 키워드를 사용하여 인스턴스 생성

### 힙 메모리
- 생성된 인스턴스는 동적 메모리(힙 메모리)에 할당됨
- C나 C++에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야함(free(), delete())
- Java에서 Gabage Collector가 주기적으로 사용하지 않는 메모리를 수거
- 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨

### 용어 정리
용어 | 설명
-- | --
객체 | 객체 지향 프로그램의 대상, 생성된 인스턴스
클래스 | 객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태
인스턴스 | new 키워드를 사용하여 클래스를 메모리에 생성한 상태
멤버 변수 | 클래스의 속성, 특성
메서드 | 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
참조 변수 | 메모리에 생성된 인스턴스를 가리키는 변수
참조 값 | 생성된 인스턴스의 메모리 주소 값

## 생성자
### 생성자
- 생성자의 기본문법 : <class_name>([<argument_list]){[<statements]}
- 객체를 생성할 때 new 키워드와 함께 사용 - new Student();
- 생성자는 일반함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new와 함께 호출 됨
- 생성자는 반환 값이 없고, 클래스의 이름과 동일
- 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private으로 선언되는 경우도 있음

### 기본생성자
- 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
- 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음
- 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 줌
- new Student()도 사용하고 싶으면 직접 기본생성자(public Student(){})를 만들 수 있다
- 매개 변수, 구현부가 없음

### 생성자 만들기
- 컴파일러가 제공해 주는 기본 생성자외에 필요에 의해 생성자를 직접 구현할 수 있음

## 여러가지 생성자를 정의하는 생성자 오버로딩
### 생성자 정의하기
- 생성자를 구현해서 사용할 수 있음
- 클래스에 생성자를 따로 구현하면 기본 생성자는 제공되지 않음
- 생성자를 호출하는 코드(client코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음

### UserInfo
```java
public class UserInfo {
	public String userId;
	public String userPassword;
	public String userName;
	public String userAddress;
	
	public UserInfo() {}
	
	public UserInfo(String userId, String userPassword, String userName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
	}
}
```

### UserInfoTest
```java
public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userSeong = new UserInfo();
		userSeong.userId = "s12345";
		userSeong.userPassword = "12345678";
		userSeong.userName = "Seong Jun";
		userSeong.userAddress = "인천";
		
		System.out.println(userSeong.showUserInfo());
		
		
		UserInfo userWoo = new UserInfo("w12345", "12341234", "Woo");
		System.out.println(userWoo.showUserInfo());
	}
}
```

## 참조 자료형 변수
### 참조 자료형
- 변수의 자료형
	- 기본 자료형 : int, float, double, long 등
	- 참조 자료형 : String, Date Student 등
- 클래스 형으로 변수를 선언
- 기본 자료형은 사용하는 메모리 크기가 정해져 있지만, 참조 자료형은 클래스에따라 다름
- 참조 자료형을 사용 할때는 해당 변수에 대해 생성하여야 함(String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)

### 참조 자료형 정의하여 사용하기
- Student
```java
public class Student {
	int studentId;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKoreanSubject(int score, String name) {
		korean.subjectName = name;
		korean.Score = score;
	}
	public void setMathSubject(int score, String name) {
		math.subjectName = name;
		math.Score = score;
	}
	
	public void showStudentScore() {
		int total = korean.Score + math.Score;
		
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
```
- Subject
```java
public class Subject {
	String subjectName;
	int Score;
	int subjectId;
}
```
- StudentTest
```java
public class StudentTest {

	public static void main(String[] args) {
		Student studentLim = new Student(001, "Lim");
		studentLim.setKoreanSubject(100, "국어");
		studentLim.setMathSubject(100, "수학");
		
		Student studentWoo = new Student(002, "Woo");
		studentWoo.setKoreanSubject(100, "국어");
		studentWoo.setMathSubject(100, "수학");
		
		
		studentLim.showStudentScore();
		studentWoo.showStudentScore();
	}

}
```

## 접근 제어 지시자
- 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
접근제어지시자 | 설명
-- | --
private | 같은 클래스 내부에서만 접근가능(외부 클래스, 상속관계의 클래스에서도 접근 불가)
아무것도 없음(default) | 같은 패키지 내부에서만 접근 가능 (상속관계라도 패키지가 다르면 불가)
protected | 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
public | 클래스의 외부 어디서나 접근할 수 있음

### get() / set() 메서드
- private으로 선언된 멤버 변수(필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
- get() 메서드만 제공되는 경우 read-only 필드
- 이클립스에서 자동으로 생성됨

## 정보 은닉
- private으로 제어한 멤버변수도 public메서드가 제공되면 접근 가능하지만 변수가 public으로 공개되었을 때보다 private일 때 각 변수에 대한 제한을 public메서드에서 제어할 수 있음
<hr />
- BirthDay
```java
public class BirthDay {
	private int day;
	private int month;
	private int year;
	
//	public 이나 접근제어지시자 없이 사용하는 것처럼 다 오픈해서 사용하면
//	멤버변수의 잘못된 사용으로 객체가 잘못 사용되는 것을 노출하게 되고 객체의 어떤 역할에대해서 문제가 생길 수 있다.
//	그래서 private로 막고 메서드에서 제어를 해주게 되면 쓸데없는 데이터 오용이 막아진다.
	
	private boolean isValid; // default 값으로 false를 갖는다
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println("유효하지 않는 날짜 입니다.");
		}
	}
	
	public boolean getIsValid() {
		return isValid;
		// isValid의 값이 정해지는 것은 내부 로직에 의해서 정해진다. 그래서 isValid에 대한 set메서드는 제공하지 않는다.
		// 이런 경우가 read-only 속성
	}
}
```
- BirthDayTest
```java
public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		
		date.setYear(2021);
		date.setMonth(12);
		date.setDay(30);
		
		date.showDate();
	}
}
```

## 캡슐화
### 정보은닉을 활용한 캡슐화
- 꼭 필요한 정보와 기능만 외부에 오픈함
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 함
	- 이러한 경우에는 클라이언트가 제어할 부분이 굉장히 적기 때문에 캡슐화가 잘되어있는 객체같은 경우는 클라이언트에서 쓸 수 있는 API가 한정적이기도 하고 그 객체가 하는 기능이 매번 
	  일관성있게 제공될 수 있다
	- 오류에 대한 감지를 클라이언트 코드하고 상관없이 서비스가 제공하는 객체쪽에서 주로 오류감지나 객체에대한 업그레이드 이런것들을 하면 되기 때문에 오히려 디버깅이나 기능을 추가하는     데에 유연하다 
- 각각의 메서드와 멤버변수를 접근함으로써 발생하는 오류를 최소화한다

