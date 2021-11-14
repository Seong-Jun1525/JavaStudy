# JavaStudy 1차
# 진수
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

## 진수표기법
진수 | 표기법 | 값
-- | -- | --
2진수 | 0b1010 | 10
8진수 | 012 | 10
10진수 | 10 | 10
16진수 | 0xa | 10

# 변수
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

# 자료형
byte | 정수형 | 문자형 | 실수형 | 논리형
-- | -- | -- | -- | --
1byte | byte | - | - | boolean
2byte | short | char | - | -
4byte | int | - | float | - 
8byte | long | - | double | - 

- int를 제일 많이 사용
 
 ## 문자
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
 
# 지역 변수 자료형없이 사용하기(자바 10부터 지원 됨)

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

# 변하지 않은 상수와 리터럴, 변수의 형 변환
## 상수 선언하기
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

## 리터럴
- 프로그램에서 사용하는 숫자, 문자, 논리값을 말함
- 리터럴은 상수 풀에 있음
- 정수 리터럴은 int로 실수 리터럴은 double로 저장됨
- 정수의 범위가 넘어가는 경우는 L,l을 float로 사용하는 경우는 F,f를 식별자로 써줘야 함

## 형변환
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
# 산술 연산자

# 복합 대입 연산자

# 증가 & 감소 연산자

# 관계 연산자
- 이항 연산자
- 비교 연산자라고도 함

# 논리 연산자
- 관계 연산자와 혼합하여 사용

# 단락 회로 평가 - 논리 연산에서 모든 항이 실행되지 않는 경우
- 논리 곱(&&)은 두 항의 결과가 모두 true일때만 결과 true
  - 앞의 항의 결과가 false이면 뒤의 항의 결과를 평가하지 않음
- 논리 합(||)은 두 항의 결과 모두 false일때만 결과가 false
  - 앞의 항의 결과가 true일면 뒤의 항의 결과를 평가하지 않음

# 조건 연산자
- 삼항 연산자
- 조건의 결과가 true인 경우와 false인 경우에 따라 다른 결과가 수행됨
- if 조건문을 간단히 표현 가능


# 비트 연산자

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

# if조건문

# switch case문
- if-else if-else문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
- 비교 조건이 특정 값이나 문자열인 경우 사용
- 자바 14부터는 break문을 사용하지 않고 좀 더 간결해진 표현식 지원
- yield 사용

# 자바 14부터 지원되는 switch 표현

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

# while문
- 조건이 참인 동안 반복 수행
- 조건이 맞지 않으면 수행되는 부분이 없음
- 조건식의 결과가 참, 거짓일 때 많이 사용
# do-while문
- 조건이 참인 동안 반복 수행
- 수행문을 먼저 수행 한 후 조건 체크
# for문
- 초기화->조건체크->증감 순으로 수행
- 특정수의 범위 횟수와 관련하여 반복되는 경우 주로 사용
- 배열과 함께 사용
## for문의 문장들은 생략이 가능
- 초기화식 생략 : 이미 이전에 값이 초기화되어서 for문 내부에서 값을 지정할 필요가 없는 경우
- 조건식 생략 : 반복 수행에 조건이 수행문 내부에 있는 경우
- 증감식 생략 : 증감식에 대한 연산이 복잡하거나 다른 변수의 결과 값에 결정되는 경우
- 무한 반복

# 중첩 반복문
- 반복문 내부에 반복문이 있음
- 수행시간에 문제가 발생할 수 있음
- 외부 반복문과 내부 반복문 간의 변수 값 변화를 잘생각하고 구현해야함

# break문과 continue문

# JavaStudy 2차
# 객체와 클래스
```java
public class Order {
	int orderId;
	String buyerId;
	String sellerId;
	int productId;
	String orderDate;
}
```

## 객체지향 프로그래밍
- 객체 정의
- 각 객체의 속성을 멤버변수로 역할을 메서드로 구현 
- 각 객체간의 협력을 구현함

# 함수
- 하나의 기능을 수행하는 코드
- 구현된 함수는 호출되어 사용되고 사용이 끝나면 제어를 반환함
- 함수는 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있음

## 함수의 예
```java
int add(int n1, int n2) {
	int r;
	r = n1 + n2;
	retrun r;
}
// 반환이 없을 경우 데이터 타입을 void로 작성
```

# 메서드
- 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
- 멤버 함수라고도 함
- 메서드를 구현함으로써 객체의 기능이 구현됨
- 메서드의 이름은 그 객체를 사용하는 객체에 맞게 짓는것이 좋음

# 객체 속성은 멤버 변수로, 객체의 기능은 메서드로 구현
- 클래스를 기반으로 여러개의 인스턴스가 생성될 수 있다.

## student
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
## studentTest
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

# 인스턴스 생성과 힙 메모리
## 인스턴스
- 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 코드 상태
- 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수 값을 가지게 됨
- 학생의 클래스에서 생성된 각각의 인스턴스는 각각 다른 이름, 학번, 학년등의 값을 가지게 됨
- new 키워드를 사용하여 인스턴스 생성

## 힙 메모리
- 생성된 인스턴스는 동적 메모리(힙 메모리)에 할당됨
- C나 C++에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야함(free(), delete())
- Java에서 Gabage Collector가 주기적으로 사용하지 않는 메모리를 수거
- 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됨

## 용어 정리
용어 | 설명
-- | --
객체 | 객체 지향 프로그램의 대상, 생성된 인스턴스
클래스 | 객체를 프로그래밍 하기 위해 코드로 정의해 놓은 상태
인스턴스 | new 키워드를 사용하여 클래스를 메모리에 생성한 상태
멤버 변수 | 클래스의 속성, 특성
메서드 | 멤버 변수를 이용하여 클래스의 기능을 구현한 함수
참조 변수 | 메모리에 생성된 인스턴스를 가리키는 변수
참조 값 | 생성된 인스턴스의 메모리 주소 값

# 생성자
## 생성자
- 생성자의 기본문법 : <class_name>([<argument_list]){[<statements]}
- 객체를 생성할 때 new 키워드와 함께 사용 - new Student();
- 생성자는 일반함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new와 함께 호출 됨
- 생성자는 반환 값이 없고, 클래스의 이름과 동일
- 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private으로 선언되는 경우도 있음

## 기본생성자
- 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
- 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음
- 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 줌
- new Student()도 사용하고 싶으면 직접 기본생성자(public Student(){})를 만들 수 있다
- 매개 변수, 구현부가 없음

## 생성자 만들기
- 컴파일러가 제공해 주는 기본 생성자외에 필요에 의해 생성자를 직접 구현할 수 있음

# 여러가지 생성자를 정의하는 생성자 오버로딩
## 생성자 정의하기
- 생성자를 구현해서 사용할 수 있음
- 클래스에 생성자를 따로 구현하면 기본 생성자는 제공되지 않음
- 생성자를 호출하는 코드(client코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음

## UserInfo
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

## UserInfoTest
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

# 참조 자료형 변수
## 참조 자료형
- 변수의 자료형
	- 기본 자료형 : int, float, double, long 등
	- 참조 자료형 : String, Date Student 등
- 클래스 형으로 변수를 선언
- 기본 자료형은 사용하는 메모리 크기가 정해져 있지만, 참조 자료형은 클래스에따라 다름
- 참조 자료형을 사용 할때는 해당 변수에 대해 생성하여야 함(String 클래스는 예외적으로 생성하지 않고 사용할 수 있음)

## 참조 자료형 정의하여 사용하기
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

# 접근 제어 지시자
- 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
접근제어지시자 | 설명
-- | --
private | 같은 클래스 내부에서만 접근가능(외부 클래스, 상속관계의 클래스에서도 접근 불가)
아무것도 없음(default) | 같은 패키지 내부에서만 접근 가능 (상속관계라도 패키지가 다르면 불가)
protected | 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
public | 클래스의 외부 어디서나 접근할 수 있음

## get() / set() 메서드
- private으로 선언된 멤버 변수(필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공
- get() 메서드만 제공되는 경우 read-only 필드
- 이클립스에서 자동으로 생성됨

# 정보 은닉
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

# 캡슐화
## 정보은닉을 활용한 캡슐화
- 꼭 필요한 정보와 기능만 외부에 오픈함
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 함
	- 이러한 경우에는 클라이언트가 제어할 부분이 굉장히 적기 때문에 캡슐화가 잘되어있는 객체같은 경우는 클라이언트에서 쓸 수 있는 API가 한정적이기도 하고 그 객체가 하는 기능이 매번 
	  일관성있게 제공될 수 있다
	- 오류에 대한 감지를 클라이언트 코드하고 상관없이 서비스가 제공하는 객체쪽에서 주로 오류감지나 객체에대한 업그레이드 이런것들을 하면 되기 때문에 오히려 디버깅이나 기능을 추가하는     데에 유연하다 
- 각각의 메서드와 멤버변수를 접근함으로써 발생하는 오류를 최소화한다

# 객체 자신을 가리키는 this
- 인스턴스 자신의 메모리를 가리킴
- 생성자에서 또 다른 생성자를 호출 할때 사용
- 자신의 주소(창조값)을 반환 함

## 생성된 인스턴스 메모리의 주소를 가짐
- 클래스 내에서 참조변수가 가지는 주소 값과 동일한 주소 값을 가지는 키워드

```java
public void setYear(int year) {
	this.year = year;
}
```

## 생성자에서 다른 생성자를 호출하는 this
- 클래스에 생성자가 여러개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있음
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없음

```java
public class Person {
	String name;
	int age;
	
	public Person() {
		// code 작성 x
		this("이름없음", 1);
		// code 작성 o
	}
	
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.showPerson();
		
	}
}
```
### 출력 결과
```teatarea
이름없음, 1
```

## 자신의 주소를 반환하는 this
```java
public class Person {
	String name;
	int age;
	
	public Person() {
		// code 작성 x
		this("이름없음", 1);
		// code 작성 o
	}
	
	public Person(String name ,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		
		p.name = "Jun";
		p.age = 22;
		
		Person p2 = p.getPerson();
		System.out.println(p);
		System.out.println(p2);
		
	}
}
```
### 출력 결과
```teatarea
ch13.Person@123a439b
ch13.Person@123a439b
```

# 객체 간의 협력
## 객체지향 프로그래밍에서의 협력
- 객체지향 프로그램에서 객체 간에는 협력이 이루어짐
- 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 함
- 매개변수로 객체가 전달되는 경우가 발생

### review
- Student
```java
public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원");
	}
}
```
- Taxi
```java
public class Taxi {
	String taxiName;
	int money;
	
	public Taxi(String taxiName) {
		this.taxiName = taxiName;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiName + "택시 수입은 " + money + "원 입니다.");
	}
}
```

- TakeTransTest
```java
public class TakeTransTest {

	public static void main(String[] args) {
		Student s1 = new Student("Edward", 20000);
		
		Taxi taxi = new Taxi("잘 나간다 운수");
		
		s1.takeTaxi(taxi);
		
		s1.showInfo();
		taxi.showTaxiInfo();
	}
}
```

# 여러 인스턴스에서 공통으로 사용하는 변수 선언 - static 변수
## 공통으로 사용하는 변수가 필요한 경우
- 여러 인스턴스가 공유하는 기준 값이 필요한 경우
- 학생마다 새로운 학번 생성
- 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
- 회사에 사원이 입사할때 마다 새로운 사번이 필요

## static 변수 선언과 사용하기
static int serialNum;
- 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 데이터 영역에 메모리가 할당되고 프로그램이 다 끝나고 메모리에서 unload되는 순간에 소멸된다
- 클래스 변수, 정적 변수라고도 함(vs 인스터스 변수)
- 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조
Student.serialNum = 100;

## Test
### Employee.java
```java
public class Employee {
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
```
### EmployeeTest
```java
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLim = new Employee();
		employeeLim.setEmployeeName("Lim");
		
		System.out.println(employeeLim.serialNum);
		
		Employee employeeWoo = new Employee();
		employeeWoo.setEmployeeName("Woo");
		employeeWoo.serialNum++;
		
		System.out.println(employeeLim.serialNum);
		System.out.println(employeeWoo.serialNum);
	}
}
```
### 출력 결과
```textarea
1000
1001
1001
```
- 2개의 인스턴스가 하나의 메모리를 공유한다(static 변수는 인스턴스에서 공통으로 사용하는 영역이다)

### 회사원이 입사할 때마다 새로운 사번 부여하기
```java
public class Employee {
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	// 객체가 생성될 때 초기화 작업은 생성자에서 해준다
	public Employee() {
		serialNum++;
		// 이 변수는 공유x.
		// 이 변수를 바로 사번아이디로 할 수 없는 이유
		// 이 변수는 모든 인스턴스가 공유하기 때문
		// 그래서 멤버변수에 복사를 한다
		employeeId = serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
```

```java
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLim = new Employee();
		employeeLim.setEmployeeName("Lim");
		
		System.out.println(Employee.serialNum);
//		System.out.println(employeeLim.serialNum);
		// 노란밑줄이 있는 이유
		// serialNum는 클래스변수이다
		// 인스턴스의 생성하고는 상관없이 사용할 수 있다
		// 즉, serialNum은 클래스변수이기 때문에 클래스이름으로 참조해서 사용하라는 의미
		
		Employee employeeWoo = new Employee();
		employeeWoo.setEmployeeName("Woo");
		Employee.serialNum++;
//		employeeWoo.serialNum++;
		
		System.out.println(employeeLim.getEmployeeName() + "님의 사번 : " + employeeLim.getEmployeeId());
		System.out.println(employeeWoo.getEmployeeName() + "님의 사번 : " + employeeWoo.getEmployeeId());
	}
}
```
### 출력 결과
```textarea
1001
Lim님의 사번 : 1001
Woo님의 사번 : 1002
```

### 출력 결과
```textarea
여러 인스턴스가 공유하는 어떠한 값이 필요할때 그것은 static을 활용한다
```

# static 메서드의 구현과 활용, 변수의 유효 범위
## static메서드 만들기
- 변수를 private으로 선언하고 getter/setter 구현

### Employee.java
```java
public class Employee {
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	// 객체가 생성될 때 초기화 작업은 생성자에서 해준다
	public Employee() {
		serialNum++;
		// 이 변수는 공유x.
		// 이 변수를 바로 사번아이디로 할 수 없는 이유
		// 이 변수는 모든 인스턴스가 공유하기 때문
		// 그래서 멤버변수에 복사를 한다
		employeeId = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
```

### EmployeeTest.java
```java
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employeeLim = new Employee();
		employeeLim.setEmployeeName("Lim");
		
		System.out.println(Employee.getSerialNum());
//		System.out.println(employeeLim.serialNum);
		// 노란밑줄이 있는 이유
		// serialNum는 클래스변수이다
		// 인스턴스의 생성하고는 상관없이 사용할 수 있다
		// 즉, serialNum은 클래스변수이기 때문에 클래스이름으로 참조해서 사용하라는 의미
		
		Employee employeeWoo = new Employee();
		employeeWoo.setEmployeeName("Woo");
//		Employee.serialNum++;
//		employeeWoo.serialNum++;
		
		System.out.println(employeeLim.getEmployeeName() + "님의 사번 : " + employeeLim.getEmployeeId());
		System.out.println(employeeWoo.getEmployeeName() + "님의 사번 : " + employeeWoo.getEmployeeId());
	}
}
```

- 클래스 이름으로 호출 가능(클래스 메서드, 정적 메서드)
```java
System.out.println(employeeLim.serialNum);
```

## static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다
- static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
- 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음

### Employee.java
```java
	public static int getSerialNum() {
		int i = 0; // 지역 변수는 사용 가능
//		employeeName = "Lim"; error
//    이 메서드(getSerialNum())이 불려지는 시점에 employeeName이 없을 수 도 있기 때문이다
//    즉 static 메서드 안에서는 일반 멤버변수를 사용할 수 없다
		return serialNum;
	}

	public int getEmployeeId() {
//		serialNum = 1000; // 일반 메서드 안에서는 static변수를 사용해도 아무 문제가 없다 이유는 메모리 문제이다 로드될때 메모리가 이미 있기 때문이다 
		return employeeId;
	}
```

### EmployeeTest.java
```java
System.out.println(Employee.getSerialNum());
```

## 변수의 유효 범위와 메모리
- 변수의 유효 범위(Scope)와 생성과 소멸(life style)은 각 변수의 종류마다 다름
- 지역변수, 멤버변수 클래스 변수는 유효 범위와 life style, 사용하는 메모리도 다름

변수 유형 | 선언 위치 | 사용 범위 | 메모리 | 생성과 소멸
-- | -- | -- | -- | -- 
지역 변수(로컬 변수) | 함수 내부에 선언 | 함수 내부에서만 사용 | 스택 | 함수가 호출될 때 생성, 함수가 끝나면 소멸
멤버 변수(인스턴스 변수) | 클래스 멤버 변수로 선언 | 클래스 내부에서 사용하고 private가 아니면 참조 변수로 다른 클래스에서 사용 가능 | 힙 | 인스턴스가 생성될 때 힙에 생성, 가비지 컬렉터가 메모리를 수거할때 소멸
static 변수(클래스 변수) | static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 private가 아니면 클래스 이름으로 다른 클래스에서 사용 가능 | 데이터 영역 | 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성, 프로그램이 끝나고 메모리를 해제할 때 소멸

- static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
- 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
- 멤버 변수가 너무 많으면 인스턴스 생성시 쓸데없는 메모리가 할당 됨
- 상황에 적절하게 변수를 사용해야 함

# static 응용 - 싱글톤 패턴
## 싱글톤 패턴이란?
- 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
- static 변수, 메서드를 활용하여 구현 할 수 있음

## 싱글톤 패턴으로 회사 객체 구현하기
- 생성자는 private로 선언

### Company.java
```java
public class Company {
	
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() { // static으로 선언해야지 외부에서 클래스 이름으로 호출할 수 있다
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
```

### CompanyTest.java
```java
//import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
//		Calendar calendar = Calendar.getInstance();
	}
}
```

# static과 싱글톤 패턴 복습
## CarFactory
```java
public class CarFatory {
	private static CarFatory instance = new CarFatory();
	
	private CarFatory() { }
	
	public static CarFatory getInstance() {
		if (instance == null) {
			instance = new CarFatory();
		}
		return instance;
	}

	public Car createCar() {
		Car car = new Car();
		
		return car;
	}
}
```
## Car
```java
public class Car {

	private static int serialNum = 10000;
	
	private int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
```
## CarFactoryTest
```java
public class CarFatoryTest {

	public static void main(String[] args) {
		CarFatory fatory = CarFatory.getInstance();
		
		Car mySonata = fatory.createCar();
		Car yourSonata = fatory.createCar();
		
		System.out.println(mySonata.getCarNum()); // 10001 출력
		System.out.println(yourSonata.getCarNum()); // 10002 출력
	}
}
```

# 자료를 순차적으로 한꺼번에 관리하는 방법 - 배열
## 배열이란?
- 동일한 자료형의 순차적 자료 구조
- 인덱스 연산자[]를 사용하여 빠른 참조 가능
- 물리적 위치와 논리적 위치가 동일
- 배열의 순서는 0부터 시작
- 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함

## 배열 선언과 초기화
### 배열 선언
```java
int[] arr1 = new int[10];
int arr2[] = new int[10];
```

### 배열 초기화
- 배열은 선언과 동시에 자료형에 따라 초기화 됨(정수는 0, 실수는 0.0, 객체는 null)
- 필요에따라 초기값을 지정할 수 있음
```java
int[] number = new int[] {10, 20, 30}; // 개수 생략해야 함
int[] number2 = {10, 20, 30}; // new int[] 생략 가능
int[] ids;
ids = new int[] {10, 20, 30} // 선언 후 배열을 생성하는 경우는 new int[] 생략할 수 없음
```

## 배열 사용하기
- [] 인덱스 연산자 활용 : 배열요소가 저장된 메모리의 위치를 연산하여 찾아줌
- 배열을 이용하여 합을 구하기

### ArrayTest.java
```java
public class ArrayTest {

	public static void main(String[] args) {
		int arr1[] = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr1.length; i++, num++) {
			arr1[i] = num;
		}
		
		for(int i = 0; i < arr1.length; i++) {
			total += arr1[i];
		}
		
		System.out.println(total);
	}

}
```

### 출력결과
```textarea
55
```

## 배열의 길이와 요소의 개수는 동일하지 않는다
- 배열을 선언하면 개수만큼 메모리에 할당되지만, 실제 요소(데이터)가 없는 경우도 있다
- 배열의 length속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
### length를 활용하여 오류가 나는 경우
```java
double[] dArr = new double[5];

dArr[0] = 1.1;
dArr[1] = 2.1;
dArr[2] = 3.1;

double mtotal = 1;

for(int i = 0; i < dArr.length; i++) {
	mtotal *= dArr[i]; 
}

System.out.println(mtotal);
```
### 요소의 개수에 대한 변수(count)를 따로 유지
```java
double[] dArr = new double[5];
int count = 0;
dArr[0] = 1.1, count++;
dArr[1] = 2.1, count++;
dArr[2] = 3.1, count++;

double mtotal = 1;

for(int i = 0; i < count; i++) {
	mtotal *= dArr[i]; 
}

System.out.println(mtotal);
```

## 문자 배열을 만들어 A-Z까지 배열에 저장하고 이를 다시 출력하기
```java
public class ArrayTest2 {

	public static void main(String[] args) {
		char cArr[] = new char[26];
		char x = 'A';
		
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = x++;
		}
		
		for(int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i] + " ");
		}
	}

}
```

## 향상된 for문 사용하기
배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있음
```textarea
for (변수 : 배열) {
	...
}
```
```java
public class ArrayTest2 {

	public static void main(String[] args) {
		char cArr[] = new char[26];
		char x = 'A';
		
		for(int i = 0; i < cArr.length; i++) {
			cArr[i] = x++;
		}
		
//		for(int i = 0; i < cArr.length; i++) {
//			System.out.print(cArr[i] + " ");
//		}
		
		for(char alpha : cArr) {
			System.out.println(alpha + " " + (int)alpha);
		}
	}

}
```
### 출력결과
```textarea
A 65
B 66
C 67
D 68
E 69
F 70
G 71
H 72
I 73
J 74
K 75
L 76
M 77
N 78
O 79
P 80
Q 81
R 82
S 83
T 84
U 85
V 86
W 87
X 88
Y 89
Z 90
```

# 객체 배열 사용하기
## 객체 배열 선언과 구현
- 기본 자료형 배열은 선언과 동시에 배열의 크기 만큼 메모리가 할당되지만, 객체 배열의 경우에는 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 함

### Book.java
```java
public class Book {
	private String title;
	private String author;
	
	public Book() {
		
	}
	
	public Book(String title, String author) { // 초기화 작업
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(title + " " + author);
	}
	
}
```

### BookTest.java
```java
public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		
//		for(int i = 0; i < library.length; i++) {
//			System.out.println(library[i]); // null
//		}
		
		library[0] = new Book("책1", "SJ");
		library[1] = new Book("책2", "SJ");
		library[2] = new Book("책3", "SJ");
		library[3] = new Book("책4", "SJ");
		library[4] = new Book("책5", "SJ");
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
```
### 출력결과
```textarea
ch18.Book@7de26db8
책1 SJ
ch18.Book@1175e2db
책2 SJ
ch18.Book@36aa7bc2
책3 SJ
ch18.Book@76ccd017
책4 SJ
ch18.Book@182decdb
책5 SJ
```


## 객체 배열 복사하기
- System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드
### 얕은 복사
- 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정됨
- 즉, 두 배열이 같은 객체를 가리킴

### ObjectCopyTest.java
```java
public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("책1", "SJ");
		library[1] = new Book("책2", "SJ");
		library[2] = new Book("책3", "SJ");
		library[3] = new Book("책4", "SJ");
		library[4] = new Book("책5", "SJ");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		System.out.println("== library == ");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== copyLibrary == ");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
		
		library[0].setAuthor("SA");
		library[0].setTitle("Book");
		
		System.out.println("== 수정 후 library == ");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== 수정 후 copyLibrary == ");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
```
### 출력 결과
```textarea
== library == 
ch18.Book@7de26db8
책1 SJ
ch18.Book@1175e2db
책2 SJ
ch18.Book@36aa7bc2
책3 SJ
ch18.Book@76ccd017
책4 SJ
ch18.Book@182decdb
책5 SJ
== copyLibrary == 
ch18.Book@7de26db8
책1 SJ
ch18.Book@1175e2db
책2 SJ
ch18.Book@36aa7bc2
책3 SJ
ch18.Book@76ccd017
책4 SJ
ch18.Book@182decdb
책5 SJ
== 수정 후 library == 
ch18.Book@7de26db8
Book SA
ch18.Book@1175e2db
책2 SJ
ch18.Book@36aa7bc2
책3 SJ
ch18.Book@76ccd017
책4 SJ
ch18.Book@182decdb
책5 SJ
== 수정 후 copyLibrary == 
ch18.Book@7de26db8
Book SA
ch18.Book@1175e2db
책2 SJ
ch18.Book@36aa7bc2
책3 SJ
ch18.Book@76ccd017
책4 SJ
ch18.Book@182decdb
책5 SJ
```

### 깊은 복사
- 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함

```java
public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("책1", "SJ");
		library[1] = new Book("책2", "SJ");
		library[2] = new Book("책3", "SJ");
		library[3] = new Book("책4", "SJ");
		library[4] = new Book("책5", "SJ");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		library[0].setAuthor("SA");
		library[0].setTitle("Book");
		
		System.out.println("== 수정 후 library == ");
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("== 수정 후 copyLibrary == ");
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}

}
```

### 출력결과
```textarea
== 수정 후 library == 
ch18.Book@7de26db8
Book SA
ch18.Book@1175e2db
책2 SJ
ch18.Book@36aa7bc2
책3 SJ
ch18.Book@76ccd017
책4 SJ
ch18.Book@182decdb
책5 SJ
== 수정 후 copyLibrary == 
ch18.Book@26f0a63f
책1 SJ
ch18.Book@4361bd48
책2 SJ
ch18.Book@53bd815b
책3 SJ
ch18.Book@2401f4c3
책4 SJ
ch18.Book@7637f22
책5 SJ
```
