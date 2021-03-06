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
변수는 변하는 수입니다.

### 사용 방법
```java
String name = "Seong Jun";
int age = 22;
int height = 182;
```

- 언제 보더라도 이 변수가 뭐를 하는 변수인지 알 수 있어야합니다.
- 의미있는 변수명은 길더라도 알 수 있게 써야합니다.
- 축약형은 좋지 않습니다.
- 카멜로테이션으로 작성하고 소문자로 시작해서 단어가 바뀔때마다 대문자로 써줍니다.
  - ex) int nameOfStudent;

# 자료형
byte | 정수형 | 문자형 | 실수형 | 논리형
-- | -- | -- | -- | --
1byte | byte | - | - | boolean
2byte | short | char | - | -
4byte | int | - | float | - 
8byte | long | - | double | - 

- int를 제일 많이 사용합니다.
 
 ## 문자
### 예제
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

### 출력 결과
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
 
# 지역 변수 자료형없이 사용하기(자바 10부터 지원 됩니다.)

- 추론 가능한 변수에 대한 자료형을 선언하지 않습니다.
- 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입할 수 없습니다.
- 지역변수만 사용 가능합니다.

### 예제
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
### 출력 결과
```console
10
10.0
hello
```

# 변하지 않은 상수와 리터럴, 변수의 형 변환
## 상수 선언하기
- 상수는 변하지 않는 수입니다.
- 원주률, 1년 12개월 등
- final 예약어를 사용하여 선언합니다.
- 상수를 사용하면 변하지 않는 값을 반복하여 사용하여 사용할 때 의미있는 문자로 인식하기 쉽고 변하더라도 선언한 부분만 변경하면 되므로 여러번 수정할 필요가 없습니다.

### 예제
```java
final int MAX_NUM = 100;
final int MIN_NUM;

MIN_NUM = 0;

System.out.println(MAX_NUM);
System.out.println(MIN_NUM);

// MAX_NUM = 1000; error
```

### 출력 결과
```console
100
0
```

## 리터럴
- 프로그램에서 사용하는 숫자, 문자, 논리값을 말합니다.
- 리터럴은 상수 풀에 있습니다.
- 정수 리터럴은 int로 실수 리터럴은 double로 저장됩니다.
- 정수의 범위가 넘어가는 경우는 L,l을 float로 사용하는 경우는 F,f를 식별자로 써줘야 합니다.

## 형변환
- 서로 다른 자료형 간에 연산 등의 수행을 위해 하나의 자료형으로 동일하는 것입니다.
- 묵시적 형 변환(자동 형 변환)과 명시적 형 변환(강제 형 변환)이 있습니다.
- 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 됩니다.
- 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 됩니다.

### 예제
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
### 출력 결과
```console
10
10
255
-1
```

- 10과 같은 수는 byte로 담을 수 있으나 255처럼 byte에 담을 수 없는 수를 대입하면 이상한 값이 출력 됩니다.

### 예제2
```java
double dNum = 1.2;
float fNum = 0.9F;

int iNum1 = (int)dNum + (int)fNum;
int iNum2 = (int)(dNum + fNum);

System.out.println(iNum1);
System.out.println(iNum2);
```
### 출력 결과
```console
1
2
```
# 산술 연산자

# 복합 대입 연산자

# 증가 & 감소 연산자

# 관계 연산자
- 이항 연산자
- 비교 연산자라고도 합니다.

# 논리 연산자
- 관계 연산자와 혼합하여 사용합니다.

# 단락 회로 평가 - 논리 연산에서 모든 항이 실행되지 않는 경우
- 논리 곱(&&)은 두 항의 결과가 모두 true일때만 결과 true
  - 앞의 항의 결과가 false이면 뒤의 항의 결과를 평가하지 않습니다.
- 논리 합(||)은 두 항의 결과 모두 false일때만 결과가 false
  - 앞의 항의 결과가 true일면 뒤의 항의 결과를 평가하지 않습니다.

# 조건 연산자
- 삼항 연산자
- 조건의 결과가 true인 경우와 false인 경우에 따라 다른 결과가 수행됩니다.
- if 조건문을 간단히 표현 가능합니다.


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
&#124; | 비트 단위 OR | 0&#124;0 0반환 그 외 1
^ | 비트 단위 XOR | 두 개의 비트가 서로 다른 경우 1
\<< | 왼쪽 shift | a<<2 a를 2비트만큼 왼쪽으로 이동
\>> | 오른쪽 shift | a>>2 a를 2비트만큼 오른쪽으로 이동
\>>> | 오른쪽 shift | >> 동일한 연산. 채워지는 비트가 부호와 상관없이 0

# if조건문

# switch case문
- if-else if-else문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현합니다.
- 비교 조건이 특정 값이나 문자열인 경우 사용합니다.
- 자바 14부터는 break문을 사용하지 않고 좀 더 간결해진 표현식을 지원합니다.
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
- 조건이 참인 동안 반복 수행합니다.
- 조건이 맞지 않으면 수행되는 부분이 없습니다.
- 조건식의 결과가 참, 거짓일 때 많이 사용합니다.

# do-while문
- 조건이 참인 동안 반복 수행합니다.
- 수행문을 먼저 수행 한 후 조건을 체크합니다.

# for문
- **초기화->조건체크->증감** 순으로 수행합니다.
- 특정수의 범위 횟수와 관련하여 반복되는 경우 주로 사용합니다.
- 배열과 함께 사용합니다.


## for문의 문장들은 생략이 가능
- **초기화식 생략** : 이미 이전에 값이 초기화되어서 for문 내부에서 값을 지정할 필요가 없는 경우
- **조건식 생략** : 반복 수행에 조건이 수행문 내부에 있는 경우
- **증감식 생략** : 증감식에 대한 연산이 복잡하거나 다른 변수의 결과 값에 결정되는 경우
- 무한 반복

# 중첩 반복문
- 반복문 내부에 반복문이 있습니다.
- 수행시간에 문제가 발생할 수 있습니다.
- 외부 반복문과 내부 반복문 간의 변수 값 변화를 잘생각하고 구현해야합니다.

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
- 각 객체의 속성을 멤버변수로 역할을 메서드로 구현합니다. 
- 각 객체간의 협력을 구현합니다.

# 함수
- 하나의 기능을 수행하는 코드
- 구현된 함수는 호출되어 사용되고 사용이 끝나면 제어를 반환합니다.
- 함수는 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있습니다.

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
- 멤버 함수라고도 합니다.
- 메서드를 구현함으로써 객체의 기능이 구현됩니다.
- 메서드의 이름은 그 객체를 사용하는 객체에 맞게 짓는것이 좋습니다.

# 객체 속성은 멤버 변수로, 객체의 기능은 메서드로 구현
- 클래스를 기반으로 여러개의 인스턴스가 생성될 수 있습니다.

## student.java
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
## studentTest.java
```java
public class StudentTest {

	public static void main(String[] args) {
		Student studentLim = new Student();
		
		studentLim.studentID = 11111;
		studentLim.setStudentName("Seong Jun");
		studentLim.address = "인천";
		
		studentLim.showStudentInfo();
		
		Student studentWoo = new Student();
		
		studentWoo.studentID = 22222;
		studentWoo.setStudentName("Woo");
		studentWoo.address = "인천";
		
		studentWoo.showStudentInfo();
	}

}
```

# 인스턴스 생성과 힙 메모리
## 인스턴스
- 클래스는 객체의 속성을 정의하고, 기능을 구현하여 만들어 놓은 코드 상태입니다.
- 실제 클래스 기반으로 생성된 객체(인스턴스)는 각각 다른 멤버 변수 값을 가지게 됩니다.
- 학생의 클래스에서 생성된 각각의 인스턴스는 각각 다른 이름, 학번, 학년등의 값을 가지게 됩니다.
- new 키워드를 사용하여 인스턴스 생성합니다.

## 힙 메모리
- 생성된 인스턴스는 동적 메모리(힙 메모리)에 할당됩니다.
- C나 C++에서는 사용한 동적 메모리를 프로그래머가 해제 시켜야합니다. (free(), delete())
- Java에서 Gabage Collector가 주기적으로 사용하지 않는 메모리를 수거합니다.
- 하나의 클래스로 부터 여러개의 인스턴스가 생성되고 각각 다른 메모리 주소를 가지게 됩니다.

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
- 객체를 생성할 때 new 키워드와 함께 사용합니다. - new Student();
- 생성자는 일반함수처럼 기능을 호출하는 것이 아니고 객체를 생성하기 위해 new와 함께 호출 됩니다.
- 생성자는 반환 값이 없고, 클래스의 이름과 동일합니다.
- 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private으로 선언되는 경우도 있습니다.

## 기본생성자
- 클래스에는 반드시 적어도 하나 이상의 생성자가 존재해야합니다.
- 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있습니다.
- 클래스에 생성자가 하나도 없는 경우 컴파일러가 생성자 코드를 넣어 줍니다.
- new Student()도 사용하고 싶으면 직접 기본생성자(public Student(){})를 만들 수 있습니다.
- 매개 변수, 구현부가 없습니다.

## 생성자 만들기
- 컴파일러가 제공해 주는 기본 생성자외에 필요에 의해 생성자를 직접 구현할 수 있습니다.

# 여러가지 생성자를 정의하는 생성자 오버로딩
## 생성자 정의하기
- 생성자를 구현해서 사용할 수 있습니다.
- 클래스에 생성자를 따로 구현하면 기본 생성자는 제공되지 않습니다.
- 생성자를 호출하는 코드(client코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있습니다.

## UserInfo.java
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

## UserInfoTest.java
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
- 클래스 형으로 변수를 선언합니다.
- 기본 자료형은 사용하는 메모리 크기가 정해져 있지만, 참조 자료형은 클래스에따라 다릅니다.
- 참조 자료형을 사용 할때는 해당 변수에 대해 생성하여야 합니다. (String 클래스는 예외적으로 생성하지 않고 사용할 수 있습니다.)

## 참조 자료형 정의하여 사용하기
### Student.java
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
### Subject.java
```java
public class Subject {
	String subjectName;
	int Score;
	int subjectId;
}
```
### StudentTest.java
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
- 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드입니다.

접근제어지시자 | 설명
-- | --
private | 같은 클래스 내부에서만 접근가능(외부 클래스, 상속관계의 클래스에서도 접근 불가)
아무것도 없음(default) | 같은 패키지 내부에서만 접근 가능 (상속관계라도 패키지가 다르면 불가)
protected | 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외 외부에서는 접근 할 수 없음
public | 클래스의 외부 어디서나 접근할 수 있음

## get() / set() 메서드
- private으로 선언된 멤버 변수(필드)에 대해 접근, 수정할 수 있는 메서드를 public으로 제공합니다.
- get() 메서드만 제공되는 경우 read-only 필드
- 이클립스에서 자동으로 생성됩니다.

# 정보 은닉
- private으로 제어한 멤버변수도 public메서드가 제공되면 접근 가능하지만 변수가 public으로 공개되었을 때보다 private일 때 각 변수에 대한 제한을 public메서드에서 제어할 수 있습니다.
<hr />

### BirthDay.java

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

### BirthDayTest.java
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
- 꼭 필요한 정보와 기능만 외부에 오픈합니다.
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 합니다.
	- 이러한 경우에는 클라이언트가 제어할 부분이 굉장히 적기 때문에 캡슐화가 잘되어있는 객체같은 경우는 클라이언트에서 쓸 수 있는 API가 한정적이기도 하고 그 객체가 하는 기능이 매번 
	  일관성있게 제공될 수 있습니다.
	- 오류에 대한 감지를 클라이언트 코드하고 상관없이 서비스가 제공하는 객체쪽에서 주로 오류감지나 객체에대한 업그레이드 이런것들을 하면 되기 때문에 오히려 디버깅이나 기능을 추가하는     데에 유연합니다.
- 각각의 메서드와 멤버변수를 접근함으로써 발생하는 오류를 최소화합니다.

# 객체 자신을 가리키는 this
- 인스턴스 자신의 메모리를 가리킵니다.
- 생성자에서 또 다른 생성자를 호출 할때 사용합니다.
- 자신의 주소(창조값)을 반환 합니다.

## 생성된 인스턴스 메모리의 주소를 가집니다.
- 클래스 내에서 참조변수가 가지는 주소 값과 동일한 주소 값을 가지는 키워드입니다.

```java
public void setYear(int year) {
	this.year = year;
}
```

## 생성자에서 다른 생성자를 호출하는 this
- 클래스에 생성자가 여러개인 경우, this를 이용하여 생성자에서 다른 생성자를 호출할 수 있습니다.
- 생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로 this() statement 이전에 다른 statement를 쓸 수 없습니다.

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
```console
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
```console
ch13.Person@123a439b
ch13.Person@123a439b
```

# 객체 간의 협력
## 객체지향 프로그래밍에서의 협력
- 객체지향 프로그램에서 객체 간에는 협력이 이루어집니다.
- 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 합니다.
- 매개변수로 객체가 전달되는 경우가 발생합니다.

## review
### Student.java
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
### Taxi.java
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

### TakeTransTest.java
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
- 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 데이터 영역에 메모리가 할당되고 프로그램이 다 끝나고 메모리에서 unload되는 순간에 소멸됩니다.
- 클래스 변수, 정적 변수라고도 합니다.(vs 인스터스 변수)
- 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조합니다.
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

### EmployeeTest.java
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
```console
1000
1001
1001
```
- 2개의 인스턴스가 하나의 메모리를 공유합니다. (static 변수는 인스턴스에서 공통으로 사용하는 영역입니다.)

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
```console
1001
Lim님의 사번 : 1001
Woo님의 사번 : 1002
```

### 출력 결과
```console
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

- 클래스 이름으로 호출 가능합니다. (클래스 메서드, 정적 메서드)
```java
System.out.println(employeeLim.serialNum);
```

## static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없습니다.
- static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있습니다.
- 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없습니다.

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
- 변수의 유효 범위(Scope)와 생성과 소멸(life style)은 각 변수의 종류마다 다릅니다.
- 지역변수, 멤버변수 클래스 변수는 유효 범위와 life style, 사용하는 메모리도 다릅니다.

변수 유형 | 선언 위치 | 사용 범위 | 메모리 | 생성과 소멸
-- | -- | -- | -- | -- 
지역 변수(로컬 변수) | 함수 내부에 선언 | 함수 내부에서만 사용 | 스택 | 함수가 호출될 때 생성, 함수가 끝나면 소멸
멤버 변수(인스턴스 변수) | 클래스 멤버 변수로 선언 | 클래스 내부에서 사용하고 private가 아니면 참조 변수로 다른 클래스에서 사용 가능 | 힙 | 인스턴스가 생성될 때 힙에 생성, 가비지 컬렉터가 메모리를 수거할때 소멸
static 변수(클래스 변수) | static 예약어를 사용하여 클래스 내부에 선언 | 클래스 내부에서 사용하고 private가 아니면 클래스 이름으로 다른 클래스에서 사용 가능 | 데이터 영역 | 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성, 프로그램이 끝나고 메모리를 해제할 때 소멸

- static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않습니다.
- 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋습니다.
- 멤버 변수가 너무 많으면 인스턴스 생성시 쓸데없는 메모리가 할당 됩니다.
- 상황에 적절하게 변수를 사용해야 합니다.

# static 응용 - 싱글톤 패턴
## 싱글톤 패턴이란?
- 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴입니다.
- static 변수, 메서드를 활용하여 구현 할 수 있습니다.

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
## CarFactory.java
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
## Car.java
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
## CarFactoryTest.java
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
- 인덱스 연산자[]를 사용하여 빠른 참조 가능합니다.
- 물리적 위치와 논리적 위치가 동일합니다.
- 배열의 순서는 0부터 시작합니다.
- 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용합니다.

## 배열 선언과 초기화
### 배열 선언
```java
int[] arr1 = new int[10];
int arr2[] = new int[10];
```

### 배열 초기화
- 배열은 선언과 동시에 자료형에 따라 초기화 됩니다.(정수는 0, 실수는 0.0, 객체는 null)
- 필요에따라 초기값을 지정할 수 있습니다.
```java
int[] number = new int[] {10, 20, 30}; // 개수 생략해야 함
int[] number2 = {10, 20, 30}; // new int[] 생략 가능
int[] ids;
ids = new int[] {10, 20, 30} // 선언 후 배열을 생성하는 경우는 new int[] 생략할 수 없음
```

## 배열 사용하기
- [] 인덱스 연산자 활용 : 배열요소가 저장된 메모리의 위치를 연산하여 찾아줍니다.

## 배열을 이용하여 합 구하기
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
```console
55
```

## 배열의 길이와 요소의 개수는 동일하지 않습니다.
- 배열을 선언하면 개수만큼 메모리에 할당되지만, 실제 요소(데이터)가 없는 경우도 있습니다.
- 배열의 length속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다릅니다.
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
배열의 n개 요소를 0부터 n-1까지 순차적으로 순회할 때 간단하게 사용할 수 있습니다.
```textarea
for (변수 : 배열) {
	...
}
```
### ArrayTest2.java
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
```console
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
- 기본 자료형 배열은 선언과 동시에 배열의 크기 만큼 메모리가 할당되지만, 객체 배열의 경우에는 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 합니다.

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
```console
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
- 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정됩니다.
- 즉, 두 배열이 같은 객체를 가리킵니다.

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
```console
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
- 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 합니다.

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
```console
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

# 2차원 배열 사용하기
## 다차원 배열
- 2차원 이상으로 구현된 배열입니다.
- 평면(2차원 배열)이나 공간(3차원 배열)을 활용한 프로그램 구현

## 2차원 배열 예제
```java
int[][] arr = new int[2][3];
int[][] arr = {{1, 2, 3}, {4, 5, 6}};
```

###  TwoDimenstionTest.java
```java
public class TwoDimenstionTest {

	public static void main(String[] args) {
//	int[][] arr = {{1, 2, 3}, {1, 2, 3, 4}};
//	int[][] arr = new int[3][4];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\t" + arr[i].length);
		}
	}

}
```
### 주석 1번 출력결과
```console
1 2 3 	3
1 2 3 4 	4
```
### 주석 2번 출력결과
```console
0 0 0 0 	4
0 0 0 0 	4
0 0 0 0 	4
```

# 객체 배열을 구현한 클래스 ArrayList
## java.util 패키지에서 제공되는 ArrayList
- 기존의 배열 선언과 사용방식은 배열의 길이를 정하고 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야했습니다.
- 배열의 요소를 추가하거나 삭제하면 다른요소들의 이동에대한 구현을 해야했습니다.
- ArrayList는 객체배열을 좀 더 효율적으로 관리하기 위해 자바에서 제공해주는 클래스입니다.
- 이미 많은 메서드들이 최적의 알고리즘으로 구현되어 있어 각 메서드의 사용방법만 익히면 유용하게 사용할 수 있다.

## ArrayList의 주요 메서드
메서드 | 설명
-- | --
boolean add(E e) | 요소 하나를 배열에 추가. E는 요소의 자료형을 의미
int size() | 배열에 추가된 요소 전체 개수를 반환
E get(int index) | 배열의 index위치에 있는 요소 값을 반환
E remove(int index) | 배열의 index위치에 있는 요소 값을 제거하고 그 값을 반환
boolean isEmpty() | 배열이 비어있는지 확인

### ArrayListTest.java
```java
import java.util.ArrayList;

import ch18.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("책1", "SJ"));
		library.add(new Book("책2", "SJ"));
		library.add(new Book("책3", "SJ"));
		library.add(new Book("책4", "SJ"));
		library.add(new Book("책5", "SJ"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}
}
```

# ArrayList를 이용한 간단한 성적 산출 프로그램

## Student.java
```java
public class Student {
	
	int studentID;
	String studentName;
	
	ArrayList<Subject> subjectList;

	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}

	
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}

	public void showInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println(studentName + "학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "입니다.");
		}
		
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
```

## Subject.java
```java
public class Subject {

	private String name;
	private int scorePoint;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
}
```

## SubjectScoreTest.java
```java
public class SubjectScoreTest {

	public static void main(String[] args) {
		Student studentLim = new Student(1001, "Lim");
		
		studentLim.addSubject("국어", 100);
		studentLim.addSubject("수학", 50);
		
		Student studentWoo = new Student(1002, "Woo");
		
		studentWoo.addSubject("국어", 70);
		studentWoo.addSubject("수학", 85);
		studentWoo.addSubject("영어", 100);
		
		studentLim.showInfo();
		System.out.println("===============================");
		studentWoo.showInfo();
	}
}
```

## 출력결과
```console
Lim학생의 국어 과목의 성적은 100입니다.
Lim학생의 수학 과목의 성적은 50입니다.
Lim 학생의 총점은 150점 입니다.
===============================
Woo학생의 국어 과목의 성적은 70입니다.
Woo학생의 수학 과목의 성적은 85입니다.
Woo학생의 영어 과목의 성적은 100입니다.
Woo 학생의 총점은 255점 입니다.
```

# JavaStudy 3차
# 객체 간의 상속의 의미
## 클래스 상속
- 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속 받아서 속성이나 기능을 확장하여 클래스를 구현합니다.
- 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속합니다.

```textarea
상속하는 클래스 : 상위 클래스, parent class, base class, super class
상속받는 클래스 : 하위 클래스, child class, derived class, sub class
```

- 상속의 문법
```java
class B extends A {
	...
}
```

```textarea
extends 키워드 뒤에는 단 하나의 클래스만 올 수 있습니다.

C++같은 경우는 여러개가 올 수 있는데 이러면 모호성이 발생할 수 있기 때문에

자바는 단일 상속(single inheritance)만을 지원합니다.
(자세한건 나중에)
```

## 상속을 구현하는 경우
- 상위클래스는 하위클래스보다 더 일반적인 개념과 기능을 가집니다.
- 하위클래스는 상위클래스보다 더 구체적인 개념과 기능을 가집니다.
- 하위클래스가 상위클래스의 속성과 기능을 확장(extends)한다는 의미입니다.

# 상속을 활용한 멤버쉽 클래스 구현하기
## 멤버쉽 시나리오
```textarea
회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객과 이보다 충성도가 높은 우수고객에 따른 서비스를
제공하고자 합니다.

물품을 구매할 때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다릅니다.
여러 멤버쉽에 대한 각각 다양한 서비스를 제공할 수 있습니다.
멤버쉽에 대한 구현을 클래스 상속을 활용하여 구현합니다.
```
## 일반 고객 클래스 구현
- 고객의 속성 : 고객 아이디, 이름, 등급, 보너스 포인트, 보너스 포인트 적립비율
- 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립

### Customer.java
```java
public class Customer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
```

## 우수 고객 구현
```textarea
매출에 더 많은 기여를 하는 단골 고객입니다.

제품을 살 때 10%를 할인해 줍니다.

보너스 포인트는 제품 가격의 5%를 적립해 줍니다.

담당 전문 상담원이 배정됩니다.
```
- Customer 클래스에 추가해서 구현하는 것은 좋지않습니다.
- VIPCustomer 클래스를 따로 구현합니다.
- 이미 Customer에 구현된 내용이 중복되므로 Customer를 확장하여 구현합니다.(상속)

### Customer.java
```java
public class Customer {
//	protected : 상위 클래스에서는 외부 클래스가 접근할 수 없지만 하위 클래스에서는 접근할 수 있게 해줌
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
```

### VIPCustomer.java
```java
public class VIPCustomer extends Customer {
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agentID;
	}
}
```

## protected 접근 제어자
- 상위 클래스에 선언된 private 멤버변수는 하위 클래스에서 접근 할 수 없습니다.
- 외부 클래스는 접근할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근제어자를 사용합니다.

### CustomerTest.java
```java
public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLim = new Customer();
		customerLim.setCustomerName("Seong Jun");
		customerLim.setCustomerID(10010);
		customerLim.bonusPoint = 1000;
		
		System.out.println(customerLim.showCustomerInfo());
		
		VIPCustomer customerWoo = new VIPCustomer();
		customerWoo.setCustomerName("Woo");
		customerWoo.setCustomerID(10011);
		customerWoo.bonusPoint = 10000;
		customerWoo.showCustomerInfo();

		System.out.println(customerWoo.showCustomerInfo());
	}
}
```

### 출력결과
```console
Seong Jun님의 등급은 SILVER이며, 보너스 포인트는 1000입니다.
Woo님의 등급은 VIP이며, 보너스 포인트는 10000입니다.
```

# 상속에서 클래스 생성과정과 형 변환
## 하위 클래스가 생성되는 과정
- 하위 클래스를 생성하면 상위 클래스가 먼저 생성됩니다.
- new VIPCustomer()를 호출하면 Customer()가 먼저 호출 됩니다.
- 클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출합니다.

### Customer.java
```java
public Customer() {
	customerGrade = "SILVER";
	bonusRatio = 0.01;
	
	System.out.println("Customer() 생성자 호출");
}
```
### VIPCustomer.java
```java
public VIPCustomer() {
	bonusRatio = 0.05;
	salesRatio = 0.1;
	customerGrade = "VIP";
	
	System.out.println("VIPCustomer() 생성자 호출");
}
```

### CustomerTest.java
```java
public class CustomerTest {

	public static void main(String[] args) {
		VIPCustomer customerWoo = new VIPCustomer();
		customerWoo.setCustomerName("Woo");
		customerWoo.setCustomerID(10011);
		customerWoo.bonusPoint = 10000;
		customerWoo.showCustomerInfo();

		System.out.println(customerWoo.showCustomerInfo());
	}
}
```
### 위와 같이 수정한 후 출력결과
### 출력결과
```console
Customer() 생성자 호출
VIPCustomer() 생성자 호출
Woo님의 등급은 VIP이며, 보너스 포인트는 10000입니다.
```

- VIPCustomer은 Customer를 상속을 받고 있습니다.
- 그렇기 때문에 Customer의 생성자(constructer)를 호출해야합니다.
- 그런데 상위 클래스의 생성자를 호출하는 코드가 없습니다.
- 그렇기 때문에 컴파일러는 아래와 같은 코드를 넣어줍니다.

```java
public VIPCustomer() {
	super();
	
	bonusRatio = 0.05;
	salesRatio = 0.1;
	customerGrade = "VIP";
}
```
## super() 키워드
- 하위 클래스가 상위 클래스 인스턴스의 참조값을 가집니다.
- 상위 클래스의 기본 생성자를 호출할 수 있는 기능이 있습니다.
- 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출 됩니다. (이때 반드시 상위 클래스의 기본 생성자가 존재해야 합니다.)
- 상위 클래스에 기본 생성자가 없는 경우 (다른 생성자가 있는 경우)하위 클래스의 생성자에서는 super를 이용하여 명시적으로 상위 클래스의 생성자를 호출 합니다.
- super는 생성된 상위 클래스 인스턴스의 참조값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있습니다.

## default 생성자는 제공하고 싶지 않고 새로운 생성자를 만들었을 때
### Customer.java
```java
/*
public Customer() {
	customerGrade = "SILVER";
	bonusRatio = 0.01;
}
*/

public Customer(int customerID, String customerName) {
	this.customerID = customerID;
	this.customerName = customerName;
}
```
```textarea
이렇게 수정하면 VIPCustomer에서 오류가 생깁니다.

하위 클래스에서 오류가 생기는 이유는 아무런 생성자를 호출하고 있지 않으면
컴파일러가 super()를 넣어주는데 default생성자를 주석처리 했으므로
super()가 호출하는 코드가 없습니다.

그렇기때문에 이런 경우는 상위 클래스의 생성자를 하위클래스에서 명시적으로 호출을 해야합니다.
```
### 하위클래스에서 명시적으로 호출하는 방법 2가지
- 1
```java
public class VIPCustomer extends Customer {
	double salesRatio;
	String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}
}
```
- 2
```java
public class VIPCustomer extends Customer {
	double salesRatio;
	String agentID;
	
	public VIPCustomer() {
		super(0, "No-Name"); 
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}
}
```
- 1번을 추천!
- 1번으로 수정을 하면 Test쪽에서 오류가 생깁니다. 아래와 같이 수정해줍니다.

```java
public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLim = new Customer(10010, "Seong Jun");
		customerLim.bonusPoint = 1000;
		
		System.out.println(customerLim.showCustomerInfo());
		
		VIPCustomer customerWoo = new VIPCustomer(10011, "Woo");
		customerWoo.bonusPoint = 10000;

		System.out.println(customerWoo.showCustomerInfo());
	}
}
```

### 출력결과
```console
Customer(int, String) 생성자 호출
Seong Jun님의 등급은 SILVER이며, 보너스 포인트는 1000입니다.
Customer(int, String) 생성자 호출
VIPCustomer(int, String) 생성자 호출
Woo님의 등급은 VIP이며, 보너스 포인트는 10000입니다.
```

## 상속에서 인스턴스 메모리의 상태
- 항상 상위 클래스의 인스턴스가 먼저 생성되고 하위 클래스의 인스턴스가 생성됩니다.

## 형 변환(업 캐스팅)
- 상위 클래스로 변수를 선언하고 하위 클래스의 생성자로 인스턴스를 생성합니다.
Customer customerLim = new VIPCustomer();
- 상위 클래스 타입의 변수에 하위 클래스 변수가 대입 <br/>
VIPCustomer vCustomer = new VIPCustomer();
addCustomer(vCustomer);
int addCustomer(Customer customer) { }
- 하위 클래스는 상위 클래스의 타입을 내포하고 있으므로 상위 클래스로의 묵시적 형 변환이 가능합니다.
- 상속관계에서 모든 하위 클래스는 상위 클래스로 형 변환이 됩니다. (그 역은 성립하지 않습니다.)

## 형 변환과 메모리
- Customer vc = new VIPCustomer();에서 vc가 가리키는 것은?
- VIPCustomer() 생성자에 의해 VIPCustomer 클래스의 모든 멤버 변수에 대한 메모리는 생성되었지만,
  변수의 타입은 Customer이므로 실제 접근 가능한 변수나 메서드는 Customer의 변수와 메서드입니다.
	
![img1](./src/img/img1.PNG)

# 메서드 재정의 하기(Overriding)
## 하위 클래스에서 메서드 재정의 하기
- 오버라이딩 : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현한 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있습니다.
- VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않았습니다.
- 재정의하여 구현해야 합니다.

### VIPCustomer.java
```java
@Override
public int calcPrice(int price) { // Override된 메서드이기 때문에 이름이 바뀌면 error
	bonusPoint += price * bonusRatio;
	return price - (int)(price * salesRatio);
}
```

## @overriding 애노테이션(annotation)
- 애노테이션은 원래 주석이라는 의미입니다.
- 컴파일러에게 특별한 정보를 제공해주는 역할입니다.

애노테이션 | 설명
-- | --
@Override | 재정의된 메서드라는 정보 제공합니다.
@FunctionallInterface | 함수형 인터페이스라는 정보 제공합니다.
@Deprecated | 이후 버전에서 사용되지 않을 수 있는 변수, 메서드에 사용합니다.
@SuppressWarnings | 특정 경고가 나타나지 않도록 합니다.<br />(예)@SuppressWarnings("deprecation")는 @Deprecated가 나타나지 않도록 합니다.

- @overriding 애노테이션은 재정의된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러가 발생합니다.

## 형 변환과 오버라이딩 메서드 호출
Customer vc = new VIPCustomer();
vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer()입니다.
자바에서는 항상 인스턴스의 메서드가 호출됩니다. (가상메서드의 원리)
자바의 모든 메서드는 가상 메서드입니다.

### CustomerTest.java
```java
Customer vc = new VIPCustomer(12345, "No-Name");
System.out.println(vc.calcPrice(1000));
```
### 출력결과
```console
900
```

# 메서드 재정의와 가상 메서드 원리
## 메서드가 어떻게 호출되고 실행 되는가?
- 메서드의 이름은 주소값을 나타냅니다.
- 메서드는 명령어의 set이고 프로그램이 로드되면 메서드 영역(코드영역)에 명령어 set이 위치합니다.
- 해당 메서드가 호출되면 명령어 set이 있는 주소를 찾아 명령어가 실행됩니다.
- 이때 메서드에서 사용하는 변수들은 스택 메모리에 위치 하게 됩니다.
- 따라서 다른 인스턴스라도 같은 메서드의 코드는 같으므로 같은 메서드가 호출됩니다.(다만 변수 값은 다릅니다.)
- 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만 메서드 명령어 set은 처음 한번만 로드됩니다.
```java
public class TestMethod {
   int num;
   
   void aaa() {
      System.out.println("aaa() 호출");
   }
   
   public static void main(String[] args) {
      TestMethod a1 = new TestMethod();
      a1.aaa();
      
      TestMethod a2 = new TestMethod();
      a2.aaa();
   }
}
```

![img2](./src/img/img2.png)

## 가상 메서드의 원리
- 가상 메서드 테이블에서 해당 메서드에 대한 address를 가지고 있습니다.
- 재정의된 경우는 재정의 된 메서드의 주소를 가리킵니다.

![img3](./src/img/img3.png)

# 다형성과 다형성을 사용하는 이유
## 다형성이란?
- 하나의 코드가 여러 자료형으로 구현되어 실행되는 것입니다.
- 같은 코드에서 여러 다른 실행 결과가 나옵니다.
- 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나입니다.
- 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들 수 있습니다.

## 다형성의 예
```java
class Animal {
	 // 공통적으로 사용하는 메서드는 상위 클래스에 선언합니다.
   public void move() {
      System.out.println("동물이 움직입니다.");
   }
}

class Human extends Animal {

   @Override
   public void move() {
      System.out.println("사람이 걷습니다.");
   }
   
   public void readBook() {
      System.out.println("사람이 책을 읽습니다.");
   }
   
}

class Tiger extends Animal {

   @Override
   public void move() {
      System.out.println("호랑이가 네발로 뜁니다.");
   }
   
   public void hunting() {
      System.out.println("호랑이가 사냥을 합니다.");
   }
   
}

class Eagle extends Animal {

   @Override
   public void move() {
      System.out.println("독수리가 하늘을 날아 다닙니다.");
   }
   
   public void flying() {
      System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
   }
   
}

public class AnimalTest {

   public static void main(String[] args) {
      Animal h = new Human();
      Animal t = new Tiger();
      Animal e = new Eagle();
      
      AnimalTest test = new AnimalTest();
      test.moveAnimal(h);
      test.moveAnimal(e);
      test.moveAnimal(t);
			
			System.out.println("==============================");
			
			ArrayList<Animal> animalList = new ArrayList<>();
      animalList.add(h);
      animalList.add(e);
      animalList.add(t);
      
      for (Animal animal : animalList) {
         animal.move();
      }
   }
   
   public void moveAnimal(Animal animal) {
      animal.move();
   }

}
```

### 출력결과
```console
사람이 걷습니다.
독수리가 하늘을 날아 다닙니다.
호랑이가 네발로 뜁니다.
==============================
사람이 걷습니다.
독수리가 하늘을 날아 다닙니다.
호랑이가 네발로 뜁니다.
```

- 코드는 한 줄 인데 어떤 데이터형이 들어갔느냐에 따라(어떤 인스턴스형이 들어갔느냐에 따라) move()의 실행이 달라집니다. 이것이 다형성입니다.
- 상속을 하게 되면 하위 클래스들을 상위 클래스 하나의 타입으로 모두 핸들링 할 수 있습니다. 클래스간의 결합도가 굉장히 높아집니다.
- 하지만 상위 클래스를 바꾸면 하위 클래스에 영향을 미칠 수 있습니다. 그래서 상속을 설계할 때는 꼭 필요한 경우 신중하게 설계를 해야합니다.

## 다형성을 사용하는 이유?
- 다른 동물을 추가하는 경우
- 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있습니다.
- 그렇지 않는 경우 많은 if-else if문이 구현되고 코드의 유지보수가 어려워 집니다.
- 상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 각 클래스에 맞는 기능을 구현합니다.
- 여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있습니다.

## 다형성을 활용한 멤버쉽 프로그램 확장
- 일반 고객과 VIP 고객 중간 멤버쉽 만들기
```textarea
고객이 늘어 일반 고객보다는 많이 구매하고 VIP보다는 적게 구매하는 고객에게도 혜택을 주는 경우

GOLD 고객 등급을 만들고 혜택은 다음과 같습니다.
1. 제품을 살때는 10%를 할인해줍니다.
2. 보너스 포인트는 2%를 적립해줍니다.
```

### GoldCustomer.java
```java
public class GoldCustomer extends Customer {

   double salesRatio;
   
   public GoldCustomer(int customerID, String customerName) {
      super(customerID, customerName);
      
      salesRatio = 0.1;
      bonusRatio = 0.02;
      customerGrade = "Gold";
   }

   @Override
   public int calcPrice(int price) {
      bonusPoint += price * bonusRatio;
      return price - (int)(price * salesRatio);
   }
}
```

### CustomerTest.java(수정)
```java
ArrayList<Customer> customerList = new ArrayList<>();
Customer customerL = new Customer(10010, "Lim");
Customer customerT = new Customer(10020, "Tom");
Customer customerW = new GoldCustomer(10030, "Woo");
Customer customerK = new GoldCustomer(10040, "Kim");
Customer customerJ = new VIPCustomer(10050, "Jam");

customerList.add(customerJ);
customerList.add(customerK);
customerList.add(customerW);
customerList.add(customerT);
customerList.add(customerL);

for(Customer customer : customerList) {
	 System.out.println(customer.showCustomerInfo());
}

int price = 10000;

for(Customer customer : customerList) {
	 int cost = customer.calcPrice(price);
	 System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
	 System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
}
```

### 출력결과
```console
Jam님의 등급은 VIP이며, 보너스 포인트는 0입니다.
Kim님의 등급은 Gold이며, 보너스 포인트는 0입니다.
Woo님의 등급은 Gold이며, 보너스 포인트는 0입니다.
Tom님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
Lim님의 등급은 SILVER이며, 보너스 포인트는 0입니다.
Jam님이 9000원 지불하셨습니다.
Jam님의 현재 보너스 포인트는 500입니다.
Kim님이 9000원 지불하셨습니다.
Kim님의 현재 보너스 포인트는 200입니다.
Woo님이 9000원 지불하셨습니다.
Woo님의 현재 보너스 포인트는 200입니다.
Tom님이 10000원 지불하셨습니다.
Tom님의 현재 보너스 포인트는 100입니다.
Lim님이 10000원 지불하셨습니다.
Lim님의 현재 보너스 포인트는 100입니다.
```

# 상속은 언제 사용하나
## IS-A관계(is a realationship : inheritance)
- 일반적인 개념과 구체적인 개념과의 관계
- 상위 클래스 : 하위 클래스보다 일반적인 개념(예 : Employee)
- 하위 클래스 : 상위 클래스보다 더 구체적인 개념(예 : Engineer, Manager, ...)
- 상속은 클래스간의 결합도가 높은 설계입니다.
- 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있습니다.
- 계층구조가 복잡하거나 계급(hierarchy)이 높으면 좋지 않습니다.

## HSA-A관계(composition)
- 클래스가 다른 클래스를 포함하는 관계(변수로 선언)입니다.
- 코드 재사용의 가장 일반적인 방법입니다.
- Student가 Subject를 포함하는 예제와 같은 경우입니다.
- Library를 구현할 때 ArrayList를 생성하여 사용하였습니다.
- 상속하지 않았습니다.

# 다운 캐스팅과 instanceof
## 다운캐스팅
- 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환입니다.
- 하위 클래스로의 형 변환은 명시적으로 해야합니다.

```java
Customer vc = new VIPCustomer(); // 묵시적
VIPCustomer vCustomer = (VIPCustomer)vc; // 명시적
```

## instanceof를 이용하여 인스턴스의 형 체크
- 원래의 인스턴스의 형이 맞는지 여부를 체크하는 키워드입니다.
- 맞으면 true 아니면 false를 반환합니다.

### AnimalTest.java
```java
import java.util.ArrayList;

class Animal {
   // 공통적으로 사용하는 메서드는 상위 클래스에 선언합니다.
   public void move() {
      System.out.println("동물이 움직입니다.");
   }
}

class Human extends Animal {

   @Override
   public void move() {
      System.out.println("사람이 걷습니다.");
   }
   
   public void readBook() {
      System.out.println("사람이 책을 읽습니다.");
   }
   
}

class Tiger extends Animal {

   @Override
   public void move() {
      System.out.println("호랑이가 네발로 뜁니다.");
   }
   
   public void hunting() {
      System.out.println("호랑이가 사냥을 합니다.");
   }
   
}

class Eagle extends Animal {

   @Override
   public void move() {
      System.out.println("독수리가 하늘을 날아 다닙니다.");
   }
   
   public void flying() {
      System.out.println("독수리가 양날개를 쭉 펴고 날아 다닙니다.");
   }
   
}

public class AnimalTest {

   public static void main(String[] args) {
      Animal h = new Human();
      Animal t = new Tiger();
      Animal e = new Eagle();
      
      AnimalTest test = new AnimalTest();
      
      ArrayList<Animal> animalList = new ArrayList<>();
      animalList.add(h);
      animalList.add(e);
      animalList.add(t);
      
      for (Animal animal : animalList) {
         animal.move();
      }
      
      test.testDownCasting(animalList);
      
   }
   
   public void testDownCasting(ArrayList<Animal> list) {
      for(int i = 0; i< list.size(); i++) {
         Animal animal = list.get(i);
         
         if(animal instanceof Human) {
            Human human = (Human)animal;
            human.readBook();
         }
         else if(animal instanceof Tiger) {
            Tiger tiger = (Tiger)animal;
            tiger.hunting();
         }
         else if(animal instanceof Eagle) {
            Eagle eagle = (Eagle)animal;
            eagle.flying();
         }
         else {
            System.out.println("X");
         }
      }
   }
   
   public void moveAnimal(Animal animal) {
      animal.move();
   }
}
```

### 출력결과
```console
사람이 걷습니다.
독수리가 하늘을 날아 다닙니다.
호랑이가 네발로 뜁니다.
사람이 책을 읽습니다.
독수리가 양날개를 쭉 펴고 날아 다닙니다.
호랑이가 사냥을 합니다.
```

- 다운캐스팅을 사용하면 코드가 많이 지저분해지고 각 타입으로 다시 되돌려야하는 경우가 많이 있습니다.
- 다형성을 사용하는 방법이 더 좋지만 반드시 원래 타입으로 되돌여야하는 경우는 instanceof를 사용하여 확인한 다음에 하면 됩니다.

# 추상 클래스란?
- 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스입니다.
- 메서드 선언(declaration): 반환타입, 메서드 이름, 매개변수로 구성합니다.
- 메서드 정의(definition): 메서드 구현과 동일한 의미 구현부를 가집니다.
- 예시
	```java
	int add(int x, int y); // 선언
	int add(int x, int y){} // 구현부 o, 추상메서드 x
	```
- abstract 예약어를 사용합니다.
- 추상 클래스는 new할 수 없습니다.(인스턴스화 할 수 없습니다.)

## 추상클래스 구현하기
- 메서드에 구현 코드가 없으면 abstract로 선언합니다.
- abstract로 선언된 메서드를 가진 클래스는 abstract로 선언합니다.
- 모든 메서드가 구현된 클래스라도 abstract로 선언되면 추상클래스로 인스턴스화 할 수 없습니다.
- 추상 클래스의 추상메서드는 하위 클래스가 상속하여 구현합니다.
- 추상 클래스 내의 추상 메서드 : 하위 클래스가 구현해야 하는 메서드입니다.
- 추상 클래스 내의 구현된 메서드 : 하위 클래스가 공통으로 사용하는 메서드(필요에 따라 하위 클래스에서 재정의 합니다.)

### Computer.java
```java
public abstract class Computer {
   // 추상 클래스는 상속을 위한 클래스
   
   public abstract void display();
   public abstract void typing();
   
   public void turnOn() {
      System.out.println("전원을 켭니다.");
   }
   
   public void turnOff() {
      System.out.println("전원을 끕니다.");
   }
}
```

### Desktop.java
```java
public class Desktop extends Computer {

   // Desktop 클래스를 abstract를 사용하여 추상 클래스로 선언할 수 있습니다.
   // 하지만 추상 클래스로 선언하게 되면 이 클래스는 new를 할 수 없습니다.
   // 추상 클래스는 상속을 하기 위해서 만든 클래스입니다.
   // 추상 클래스안에 구현하는 메서드들은 일부는 구현을 할 수 있도 있고 일부는 구현을 안할 수도 있습니다. 어떤 경우는 다 안할 수도 있습니다.
   // 이 클래스는 상속만을 하기 위한 클래스입니다.
   
   @Override
   public void display() {
      System.out.println("Desktop display");      
   }

   @Override
   public void typing() {
      System.out.println("Desktop typing");
   }

   @Override
   public void turnOff() {
      System.out.println("Desktop turnOff");
   }
}
```

### NoteBook.java
```java
public abstract class NoteBook extends Computer{

   @Override
   public void display() {
      System.out.println("NoteBook display");
   }

}
```

### MyNoteBook.java
```java
public class MyNoteBook extends NoteBook {

   @Override
   public void typing() {
      System.out.println("MyNoteBook typing");
   }

}
```

### ComputerTest.java
```java
public class ComputerTest {

   public static void main(String[] args) {
      Computer desktop = new Desktop();
//    Computer computer = new Computer(); error
      
      desktop.display();
   }

}
```

# 추상 클래스의 응용 - 템플릿 메서드 패턴
## 템플릿 메서드
- 추상 메서드나 구현된 메서드를 활용하여 코드의 흐름(시나리오)을 정의하는 메서드입니다.
- final로 선언하여 하위 클래스에서 재정의 할 수 없게 합니다. (흐름을 가지고 있기 때문에)
- 프레임워크에서 많이 사용되는 설계 패턴
- 추상 클래스로 선언된 상위 클래스에서 템플릿 메서드를 활용하여 전체적인 흐름을 정의하고 하위 클래스에서 다르게 구현되어야 하는 부분은 추상 메서드로 선언하여 하위 클래스에서 구현 하도록 합니다.

**final 키워드가 변수로 쓰이면 상수, 메서드에 쓰이면 재정의를 못하는 메서드, 클래스에 쓰이면 상속이 안되는 클래스**

## 템플릿 메서드 예제
### Car.java
```java
public abstract class Car {
   public abstract void drive();
   public abstract void stop();
   public abstract void wiper();
   
   public void startCar() {
      System.out.println("시동을 켭니다.");
   }
   
   public void turnOff() {
      System.out.println("시동을 끕니다.");
   }
   
   public void washCar() {} // 추상메서드가 아니라 구현된 메서드인데 구현 내용이 없는 것. 필요한 경우 재정의를 하여 사용.
   
   final public void run() {
      startCar();
      drive();
      wiper();
      stop();
      turnOff();
      washCar();
   }
}
```

### AICar.java
```java
public class AICar extends Car {

   @Override
   public void drive() {
      System.out.println("자율 주행을 합니다.");
      System.out.println("자동차가 스스로 방향을 바꿉니다.");
   }

   @Override
   public void stop() {
      System.out.println("장애물 앞으로 스스로 멈춥니다.");
   }

   @Override
   public void wiper() {
      
   }

   @Override
   public void washCar() { // 훅메서드. 필요한 경우에 상위 클래스에서 써놓은 메서드를 재정의해서 사용.
      System.out.println("자동 세차를 합니다.");
   }
}
```

### ManualCar.java
```java
public class ManualCar extends Car {

   @Override
   public void drive() {
      System.out.println("사람이 운전합니다.");
      System.out.println("사람이 핸들을 조작합니다.");
   }

   @Override
   public void stop() {
      System.out.println("장애물 앞에서 브레이크를 밟아서 정지합니다.");
   }

   @Override
   public void wiper() { }

}
```

### CarTest.java
```java
public class CarTest {

   public static void main(String[] args) {
      Car aiCar = new AICar();
      aiCar.run();
      
      System.out.println("===================");
      
      Car mCar = new ManualCar();
      mCar.run();
   }
}
```

### 출력결과
```console
시동을 켭니다.
자율 주행을 합니다.
자동차가 스스로 방향을 바꿉니다.
장애물 앞으로 스스로 멈춥니다.
시동을 끕니다.
자동 세차를 합니다.
===================
시동을 켭니다.
사람이 운전합니다.
사람이 핸들을 조작합니다.
장애물 앞에서 브레이크를 밟아서 정지합니다.
시동을 끕니다.
```

## final예약어
- final 변수 : 값이 변경될 수 없는 상수
```java
public static final double PI = 3.14;
```
- final메서드 : 하위 클래스에서 재정의할 수 없는 메서드
- final클래스 : 상속할 수 없는 클래스

## 여러 자바 파일에서 사용하는 상수 값 정의
### Define.java
```java
public class Define {
	public static final int MIN = 1;
	public static final int MAX = 999999;
	public static final double PI = 3.14;
	public static final String GREETING = "Good Morning";
	public static final int MATH_CODE = 1001;
	public static final int CHEMISTRY_CODE = 1002;
}
```
### UsingDefine.java
```java
public class UsingDefine {
	public static void main(String[] args) {
		System.out.println(Define.GREETING);
		System.out.println(Define.MIN);
		System.out.println(Define.MAX);
		System.out.println(Define.MATH_CODE);
		System.out.println(Define.CHEMISTRY_CODE);
		System.out.println("원주율은 " + Define.PI + "입니다.");
 }
}
```

# 인터페이스(interface)
## 인터페이스란?
- 모든 메서드가 추상 메서드로 선언됩니다. public abstract
- 모든 변수는 상수로 선언됩니다.

```java
interface 인터페이스 이름 {
	public static final float pi = 3.14F;
	public void makeSomething();
}
```
- 자바8 부터 디폴트 메서드(default method)와 정적 메서드(static method)기능의 제공으로 일부 구현 코드가 있습니다.

## 인터페이스 정의와 구현하기
선언된 메서드들은 당연히 구현코드가 없습니다.

### Calc.java
```java
public interface Calc {
   double PI = 3.14;
   int ERROR = -9999999;
   
   int add(int num1, int num2);
   int substract(int num1, int num2);
   int times(int num1, int num2);
   int divide(int num1, int num2);
}
```

### Calculator.java
```java
public abstract class Calculator implements Calc {

//   4개의 메서드를 다 구현하지 않기 때문에 abstract가 되어야 합니다.
   @Override
   public int add(int num1, int num2) {
      return num1 + num2;
   }
   @Override
   public int substract(int num1, int num2) {
      return num1 - num2;
   }
}
```

### CompleteCalc.java
```java
public class CompleteCalc extends Calculator {

   @Override
   public int times(int num1, int num2) {
      return num1 * num2;
   }

   @Override
   public int divide(int num1, int num2) {
      if(num2 == 0) {
         return ERROR;
      }
      return num1 / num2;
   }
   
   public void showInfo() {
      System.out.println("모두 구현");
   }

}
```

### CalculatorTest.java
```java
public class CalculatorTest {

   public static void main(String[] args) {
      
      int n1 = 10;
      int n2 = 2;
      
      Calc calc = new CompleteCalc();
      
      System.out.println(calc.add(n1, n2));
      System.out.println(calc.substract(n1, n2));
      System.out.println(calc.times(n1, n2));
      System.out.println(calc.divide(n1, n2));
   }

}
```

### 출력결과
```console
12
8
20
5
```

## 인터페이스 구현과 형 변환
- 인터페이스를 구현한 클래스는 인터페이스 형으로 선언한 변수로 형 변환할 수 있습니다.
```java
Calc calc = new CompleteCalc();
```
- 상속에서의 형 변환과 동일한 의미입니다.
- 클래스 상속과 달리 구현코드가 없으므로 여러 인터페이스를 구현할 수 있습니다. (cf. extends)
- 형 변환되는 경우 인터페이스에 선언된 메서드만을 사용가능합니다.

# 인터페이스를 사용하는 이유
## 인터페이스가 하는 일
- 클래스나 프로그램이 제공하는 기능을 명시적으로 선언합니다.
- 일종의 클라이언트 코드와의 약속이며 클래스나 프로그램이 제고앟는 명세입니다.
- 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있습니다.
- 어떤 객체가 하나의 인터페이스 타입이라는 것은 그 인터페이스가 제공하는 모든 메서드를 구현했다는 의미입니다.
- 인터페이스를 구현한 다양한 객체를 사용합니다. (다형성)
- 예) JDBC 인터페이스

# 인터페이스를 활용한 다형성 구현 (dao 구현하기)
## 인터페이스와 다형성
하나의 인터페이스를 여러 객체가 구현하게되면 클라이언트 프로그램은 인터페이스의 메서드를 활용하여 여러 객체의 구현을 사용할 수 있습니다. (다형성)

## 인터페이스를 활용한 dao구현하기
- DB에 회원 정보를 넣는 dao(data access object)를 여러 DB제품이 지원될 수 있게 구현합니다.
- 환경파일(db.properties)에서 DB의 종류에 대한 정보를 읽고 그 정보에 맞게 dao인스턴스를 생성하여 실행될 수 있게 합니다.

![img4](./src/img/img4.PNG)

### UserInfo.java
```java
package ch30.domain.userinfo;

public class UserInfo {
	private String userID;
	private String userPW;
	private String userName;
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
```

### UserInfoDao.java
```java
package ch30.domain.userinfo.dao;

import ch30.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);
	void deleteUserInfo(UserInfo userinfo);
}
```

### UserInfoMySqlDao.java
```java
package ch30.domain.userinfo.dao.mysql;

import ch30.domain.userinfo.UserInfo;
import ch30.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into MySQL DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into MySQL DB userID = " + userinfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from MySQL DB userID = " + userinfo.getUserID());
	}

}
```

### UserInfoOracleDao.java
```java
package ch30.domain.userinfo.dao.oracle;

import ch30.domain.userinfo.UserInfo;
import ch30.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {
		System.out.println("Insert into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		System.out.println("Update into Oracle DB userID = " + userinfo.getUserID());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		System.out.println("Delete from Oracle DB userID = " + userinfo.getUserID());
	}

}
```

### UserInfoClient.java
```java
package ch30.domain.userinfo.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch30.domain.userinfo.UserInfo;
import ch30.domain.userinfo.dao.UserInfoDao;
import ch30.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch30.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("12345");
		userInfo.setUserPW("54321");
		userInfo.setUserName("SJ");
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
```

### db.properites (프로젝트 안에 파일 생성)
```textarea
DBTYPE=ORACLE
```

# 인터페이스의 여러가지 요소
## 상수
- 모든 변수는 상수로 변환됩니다. (public static final)

```java
double PI = 3.14;
int ERROR = -999999;
```

## 추상 메서드
- 모든 선언된 메서드는 추상 메서드 (public abstract)

## 디폴트 메서드 (자바 8이후)
- 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드입니다.
- default 키워드를 사용합니다.

```java
default void description() {
	System.out.println("정수 계산기를 구현합니다.");
	myMethod();
}
```

- 구현하는 클래스에서 재정의 할 수 있습니다.

```java
@Override
public void description() {
	System.out.println("CompleteCalc에서 재정의한 default 메서드");
	// super.description();
}
```
- 인터페이스를 구현한 클래스의 인스턴스가 생성되어야 사용 가능합니다.

## 정적 메서드 (자바 8이후)
- 인스턴스 생성과 상관없이 인터페이스 타입으로 사용할 수 있는 메서드입니다.

```java
static int total(int[] arr) {
	int total = 0;
	
	for(int i: arr) {
		total += i;
	}
	
	mystaticMethod();
	return total;
}
```

## private 메서드 (자바 9이후)
- 인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없습니다.
- 인터페이스 내부에서만 사용하기 위해 구현하는 메서드입니다.
- default 메서드나 static메서드에서 사용합니다.

```java
private void myMethod() {
	System.out.println("private method");
}


private static void myStaticMethod() {
	System.out.println("private static method");
}
```

# 여러 인터페이스 구현하기, 인터페이스의 상속
## 여러 인터페이스 구현
- 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스를 구현할 수 있습니다. (자바에서 클래스는 다중 상속이 가능하지 않습니다. - Diamond Problem)
- 디폴트 메서드가 중복되는 경우는 구현하는 클래스에서 재정의 하여야 합니다.
- 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능 합니다.

### Buy.java
```java
public interface Buy {
	void buy();
	
	default void order() {
		System.out.println("buy order");
	}
}
```

### Sell.java
```java
public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("sell order");
	}
}
```

### Customer.java
```java
public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void hello() {
		System.out.println("hello");
	}
}
```

### CustomerTest.java
```java
public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
	}
}
```

### 출력결과
```console
customer buy
customer sell
customer order
hello
customer buy
customer order
customer sell
customer order
```

## 인터페이스의 상속
- 인터페이스 사이에도 상속을 사용할 수 있습니다.
- extends 키워드를 사용합니다.
- 인터페이스는 다중 상속이 가능하고 구현 코드의 상속이 아니므로 타입 상속이라고 합니다.

### X.java
```java
public interface X {
	void x();
}
```

### Y.java
```java
public interface Y {
	void y();
}
```

### MyInterface.java
```java
public interface MyInterface extends X, Y { // void x()와 void y()를 모두 선언하겠다는 의미
	void myMethod();
}
```

### MyClass.java
```java
public class MyClass implements MyInterface {
	@Override
	public void x() {
		System.out.println("x()");
	}
	
	@Override
	public void y() {
		System.out.println("y()");
	}
	
	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
}
```

### MyClassTest.java
```java
public class MyClassTest {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		MyClass iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}
}
```

## 클래스 상속과 인터페이스 구현 함께 쓰기
- 실무에서 프레임워크나 오픈소스와 함께 연동되는 구현을 하게 되면 클래스 상속과 인터페이스의 구현을 같이 사용하는 경우가 많습니다.

![img5](./src/img/img5.png)

- 책이 순서대로 대여가 되는 도서관 구현
- 책을 보관하는 자료 구조가 Shelf에 구현됩니다. (ArrayList)
- Queue 인터페이스를 구현합니다. (FIFO)
- Shelf 클래스를 상속받고 Queue를 구현합니다.

### Shelf.java
```java
import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
```

### Queue.java
```java
public interface Queue {
	void enQueue(String title);
	String deQueue();
	
	int getSize();
}
```

### BookShelf.java
```java
public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
```

### BookShelfTest.java
```java
public class BookShelfTest {

	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		
		bookQueue.enQueue("책 1");
		bookQueue.enQueue("책 2");
		bookQueue.enQueue("책 3");
		bookQueue.enQueue("책 4");
		bookQueue.enQueue("책 5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
```

### 출력 결과
```java
5
책 1
책 2
책 3
책 4
책 5
```

# Review
## 추상 클래스와 템플릿 메서드
```textarea
Player가 있고 Player는 GameLevel 속성을 가집니다. 각 GameLevel 단계마다 run(), jump(), turn() 세 가지 기능이 업그레이드 됩니다.
초보자 레벨 : 천천히 달립니다. run()만 가능
중급자 레벨 : 빠르게 달리고 점프할 수 있습니다. run(), jump() 가능
고급자 레벨 : 엄청 빠르게 달리고 높게 점프하고 턴할 수 있습니다. run(), jump(), turn() 가능

Player는 한번에 하나의 레벨 상태만을 가질 수 있습니다.

Player가 play() 중에 레벨에 있는 go(int count)라는 메서드를 호출하면 run()하고 count() 횟수만큼 jump()하고 turn()합니다.
다음 클래스 다이어그램을 참고하여 각 레벨에서 go()가 호출 될 때 다음과 같이 출력되도록 하세요.
```

![img6](./src/img/img6.png)

### Player.java
```java
public class Player {
	private PlayerLevel level; // 보안을 위해 private로 선언
	
	public Player() { // 초기 레벨 설정
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void play(int i) {
		level.go(i);
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level; // 현재 level에 main에서 생성한 생성자가 upgradeLevel메서드를 호출하고 매개변수값을 받아서 그 변수값을 대입한다.
		level.showLevelMessage();
	}
}
```

### PlayerLevel.java
```java
public abstract class PlayerLevel {
	public abstract void run();
	
	public abstract void jump();
	
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	final void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
```

### BeginnerLevel.java
```java
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("못합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 초급자 레벨 =====");
	}

}
```

### AdvancedLevel.java
```java
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("못합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 중급자 레벨 =====");
	}

}
```

### SuperLevel.java
```java
public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("===== 상급자 레벨 =====");
	}

}
```

### MainBoard.java
```java
public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
		
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
	}

}
```

### 출력결과
```console
===== 초급자 레벨 =====
천천히 달립니다.
못합니다.
못합니다.
===== 중급자 레벨 =====
빨리 달립니다.
높이 jump 합니다.
높이 jump 합니다.
못합니다.
===== 상급자 레벨 =====
엄청 빨리 달립니다.
높이 jump합니다.
높이 jump합니다.
높이 jump합니다.
turn 합니다.
```

## 인터페이스를 활용한 정책 프로그래밍
```textarea
고객 센터에 전화 상담을 하는 상담원들이 있습니다. 일단 고객에게서 전화가 오면 대기열에 저장되고 각 상담원에게 배분됩니다.
배분이 되는 정책은 크게 세 가지가 있습니다.
	1. 모든 상담원이 동일한 상담 건수를 처리하도록 상담원 순서대로 배분합니다.
	2. 쉬고 있거나 상담원에게 할당된 통화 수가 가장 적은 상담원에게 배분합니다.
	3. 고객의 등급에 따라 등급이 높은 고객은 업무 능력이 우수한 상담원에게 배분합니다.
세 가지 정책은 필요에 따라 바뀌어 운영될 수 있습니다. 다음 클래스 다이어드램을 참고하여 각 배분 규칙이 적용되도록 구현해 보세요
```

![img7](./src/img/img7.png)

테스트 프로그램은 문자를 입력받아 입력되는 문자에 따라 배분 규칙을 수행하도록 합니다.
### SchedulerTest.java
```java
import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례대로");
		System.out.println("L : 대기가 적은 상담원 우선");
		System.out.println("P : 우선순위가 높은 고객 우선 숙련도 높은 상담원");
		
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
```

### Scheduler.java
```java
public interface Scheduler {

	void getNextCall();

	void sendCallToAgent();

}
```

### RoundRobin.java
```java
public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음순서의 상담원에게 배분합니다.");
	}

}
```

### LeastJob.java
```java
public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 대기가 적은 상담원에게 배분합니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원에게 배분합니다.");
	}

}
```

### PriorityAllocation.java
```java
public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 우선순위가 높은 고객순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("숙련도 높은 상담원에게 배분합니다.");
	}

}
```

### 출력결과
```console
전화 상담원 할당 방식을 선택하세요.
R : 한명씩 차례대로
L : 대기가 적은 상담원 우선
P : 우선순위가 높은 고객 우선 숙련도 높은 상담원
l
상담전화를 대기가 적은 상담원에게 배분합니다.
대기가 적은 상담원에게 배분합니다.
```

# JavaStudy 4차
# Object 클래스 - 모든 클래스의 최상위 클래스
## java.lang 패키지
- 프로그래밍 시 import하지 않아도 자동으로 import됩니다.
- import.java.lang.*;
- 많이 사용하는 기본 클래스들이 속한 패키지
- String, Integer, System, ...

## 모든 클래스는 Object클래스를 상속 받습니다.
- java.lang.Object클래스
- 모든 클래스의 최상위 클래스
- 모든 클래스는 Object에서 상속받고, Object 클래스의 메서드 중 일부는 재정의해서 사용할 수 있습니다.
- 컴파일러가 extends Object를 추가합니다.

class Student => class Student extends Object

## toString() 메서드
- 객체의 정보를 String으로 바꾸어서 사용할 때 쓰입니다.
- String이나 Integer 클래스는 이미 재정의 되어 있습니다.

```java
class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("책 1", "SJ");
		
		System.out.println(book); // ch33.Book@7de26db8 -> toString() 메서드를 사용하면 입력한 값이 출력됩니다.
		
		String str = new String("test");
		System.out.println(str); // test
	}

}
```

### toString을 사용하지 않은 출력결과
```console
ch33.Book@7de26db8
test
```

### toString()을 사용한 출력결과
```console
책 1,SJ
test
```

# Object 클래스의 메서드 활용
## equals() 메서드
- 두 인스턴스의 주소값을 비교하여 true / false를 반환합니다.
- 재정의하여 두 인스턴스가 논리적으로 동일함의 여부를 구현합니다.
- 인스턴스가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의할 수 있습니다. (같은 학번, 같은 사번, 같은 아이디의 회원, ...)

## hashCode() 메서드
- hashCode()는 인스턴스의 저장 주소를 반환합니다.
- 힙 메모리에 인스턴스가 저장되는 방식이 hash방식입니다.
- hash : 정보를 저장, 검색하는 자료구조입니다.
- 자료의 특정 값(키 값)에 대한 저장 위치를 반환해주는 hash함수를 사용합니다.

```java
public class Student {
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum; // 이렇게 해주면 원래는 다른 값이 나오는데 같은 값이 나오게 됩니다.
	}
}
```

```java
public class EqualsTest {

	public static void main(String[] args) {
		Student std1 = new Student(100, "SJ");
		Student std2 = new Student(100, "SJ");
		Student std3 = std1;
		
		System.out.println(std1 == std2); // false
		System.out.println(std1 == std3); // true
		
		System.out.println(std1.equals(std2)); // false이지만 Student에서 주소는 다르지만 논리적으로 같다는 것을 재정의해주면 true가 출력됩니다.
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// 다른값이 나옵니다.
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); // true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100
	}

}
```

### 출력결과
```console
false
true
true
100
100
2111991224
292938459
true
96354
96354
100
```

## clone()
- 객체의 원본을 복제하는데 사용하는 메서드입니다.
- 생성과정의 복잡한 과정을 반복하지않고 복제할 수 있습니다.
- clone()메서드를 사용하면 객체의 정보(멤버변수 값등 ... )가 동일한 또 다른 인스턴스가 생성되는 것이므로, 객체 지향 프로그램에서의 정보은닉, 객체 보호의 관점에서 위배될 수 있습니다.
- 해당 클래스의 clone()메서드의 사용을 허용한다는 의미로 cloneable 인터페이스를 명시해 줍니다.

### Student.java
```java
public class Student implements Cloneable {
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public String toString() {
		return studentNum + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum) {
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		return studentNum; // 이렇게 해주면 원래는 다른 값이 나오는데 같은 값이 나오게 됩니다.
	}
}
```

### EualsTest.java
```java
public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "SJ");
		Student std2 = new Student(100, "SJ");
		Student std3 = std1;
		
		System.out.println(std1 == std2); // false
		System.out.println(std1 == std3); // true
		
		System.out.println(std1.equals(std2)); // false이지만 Student에서 주소는 다르지만 논리적으로 같다는 것을 재정의해주면 true가 출력됩니다.
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
//	다른값이 나옵니다.
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		
		std1.setStudentName("Woo");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}

}
```

### 출력결과
```console
false
true
true
100
100
2111991224
292938459
100,Woo
```


# String, StringBuilder, StringBuffer 클래스, text block
## String 클래스
- String 선언하기

```java
String str1 = new String("abc"); // 힙 메모리에 생성
String str2 = "abc"; // 상수 풀에 생성. 상수 풀에 abc라는 string이 있고 그거에 주소만 가리키는 것.

// 즉 위의 두 개의 인스턴스는 다른 것이다.
```
- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법이 있습니다.
- 힙 메모리는 생성될때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가집니다.

```java
String str1 = new String("abc");
String str2 = new String("abc");

System.out.println(str1 == str2); // false. 힙에 따로 잡힘.

String str3 = "abc";
String str4 = "abc";

System.out.println(str3 == str4); // true. 상수 풀에 있는 것을 가리키는 것.
```

- 한번 생성된 String은 불변(immutable)
- String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성됩니다. (메모리 낭비가 발생할 수도 있습니다.)

### StringTest
```java
public class StringTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		// String클래스를 new해서 생성하게되면 Character 배열안에 들어가게 됨.
		// final로 선언됨. 즉, 해당 String은 변할 수 없다.
		// 상수 값도 변할 수 없다.
		
		System.out.println(System.identityHashCode(java));
		java = java.concat(android);
		
		System.out.println(java);
		
		System.out.println(System.identityHashCode(java));
	}

}
```

### 출력결과
```console
305808283
javaandroid
2111991224
```

## StringBuilder, StringBuffer 활용하기
- 내부적으로 가변적인 char[]를 멤버변수로 가집니다.
- 문자열을 여러번 연결하거나 변경할 때 사용하면 유용합니다.
- 새로운 인스턴스를 생성하지 않고 char[]를 변경합니다.
- StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)를 보장합니다. (두개 이상의 쓰레드가 같은 메모리를 접근할 때 순서가 정해집니다.)
- 단일 쓰레드 프로그램에서는 StringBuilder 사용을 권장합니다.
- toString() 메서드로 String을 반환합니다.

### StringBuilderTest.java
```java
public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(java));
		
		buffer.append(android);
		System.out.println(System.identityHashCode(java));
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
```

### 출력결과
```console
305808283
305808283
javaandroid
```

## text block 사용하기(java 13)
- 문자열 """ """ 사이에 이어서 만들 수 있습니다.
- html, json 문자열을 만드는데 유용하게 사용할 수 있습니다.

### TextBlockTest.java
```java
public class TextBlockTest {

	public static void main(String[] args) {
		String textBlocks = """
				Hello,
				hi,
				how r u
				""";
		
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
	}
	
	public static String getBlockOfHtml() {
		return """
				<html>
					<body>
						<span>example text</span>
					</body>
				</html>
				""";
	}

}
```
### 출력결과
```console
Hello,
hi,
how r u

<html>
	<body>
		<span>example text</span>
	</body>
</html>
```

# Class 클래스 사용하기
## Class 클래스
- 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성됩니다.
- CLass 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고, 정보를 가져오는 메서드가 제공됩니다.
- Class.forName("클래스 이름") 메서드로 클래스를 동적으로 로드합니다.

```java
Class c = Class.forName("java.lang.String");
```
- 클래스 이름으로 직접 Class 클래스 가져오기

```java
Class c = String.class;
```
- 생성된 인스턴스에서 Class 클래스 가져오기

```java
String s = new String();
Class c = s.getClass(); // Object 메서드
```

## 동적 로딩
- 컴파일 시에 데이터 타입이 binding 되는 것이 아닌, 실행(runtime)중에 데이터 타입을 binding 하는 방법이 있습니다.
- 프로그래밍 시에는 문자열 변수로 처리했다가 런타임시에 원하는 클래스를 로딩하여 binding할 수 있다는 장점이 있습니다.
- 컴파일 시에 타입 감지가 되지 않아서 만약 런타임 때 불렀는데 라이브러리나 클래스가 로컬에 없거나 스펠링이 틀리다면 시스템이 다운될 수도 있다는 단점이 있습니다.
- 컴파일 시에 타입이 정해지지 않으므로 동적 로딩시 오류가 발생하면 프로그램의 심각한 장애가 발생 가능합니다.

## Class의 newInstance()메서드로 인스턴스 생성
- new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성할 수 있습니다.

## 클래스 정보 알아보기
- reflection 프로그래밍 : Class 클래스를 사용하여 클래스의 정보(생성자, 변수, 메서드) 등을 알 수 있고 인스턴스를 생성하고, 메서드를 호출하는 방식의 프로그래밍입니다.
- 로컬 메모리에 객체가 없는 경우, 원격 프로그래밍, 객체의 타입을 알 수 없는 경우에 사용합니다.
- java.lang.reflect 패키지에 있는 클래스를 활용하여 프로그래밍합니다.
- 일반적으로 자료형을 알고 있는 경우엔 사용하지 않습니다.

### StringTest.java
```java
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("java.lang.String");
		
		Constructor<String>[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		System.out.println("==================");
		
		Method[] m = c.getMethods();
		
		for(Method mth : m) {
			System.out.println(mth);
		}
	}

}
```

### Person.java
```java
package ch36;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name;
	}
}
```

### ClassTest.java
```java
package ch36;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
		IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c1 = Class.forName("ch36.Person");
		
		Person person = (Person)c1.newInstance();
		
		person.setName("Lim");
		System.out.println(person); // Lim
		
		Class c2 = person.getClass(); // getClass를 사용하려면 이미 인스턴스가 있는 상태이어야 한다.
		Person p = (Person)c2.newInstance();
		
		System.out.println(p); // null
		
		
		// Person woo = new Person("woo"); <- 위의 Class를 가져오는 17번째 줄의 코드와 아래 5줄의 코드랑 같은 의미
		// 보통 아래처럼 사용하지 않는다. 아래와 같은 코드는 로컬에 Person이 없을때 사용한다.
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Woo"};
		Person woo = (Person)cons.newInstance(initargs);
		System.out.println(woo);
		
	}

}
```


# JavaStudy 5차
# 여러가지 자료구조
## 자료구조란 무엇인가? (Data Structure)
- 프로그램에서 사용할 많은 데이터를 메모리 상에서 관리하는 여러 구현 방법들입니다.
- 효율적인 자료구조가 성능 좋은 알고리즘의 기반이 됩니다.
- 자료의 효율적인 관리는 프로그램의 수행속도와 밀접한 관련이 있습니다.
- 여러 자료 구조 중에서 구현하려는 프로그램에 맞는 최적의 자료구조를 활용해야 하므로 자료구조에 대한 이해가 중요합니다.

## 자료구조의 종류
- **선형 자료구조**

### 배열 (Array)
선형으로 자료를 관리, 정해진 크기의 메모리를 먼저 할당받아 사용하고, 자료의 물리적 위치와 논리적 위치가 같습니다.<br />
몇 번째 항을 찾가아가는데에 걸리는 시간이 빠릅니다.<br />
자료의 추가/삭제에 드는 비용이 많습니다. 하지만 위치를 알 경우 자료를 꺼내오거나 검색하는데에 드는 비용은 적습니다.
![img8](./src/img/img8.png)

### 연결리스트 (LinkedList)
선형으로 자료를 관리, 자료가 추가될 때마다 메모리를 할당 받고 자료는 링크로 연결됩니다. 자료의 물리적 위치와 논리적 위치가 다를 수 있습니다.<br />
몇 번째 항을 찾을때 무조건 맨 처음부터 찾아야하기 때문에 걸리는 시간이 오래 걸립니다. <br />
자료를 조정하는데에 걸리는 시간은 적지만 위치를 찾는데에 소요되는 시간은 더 많이 걸립니다.

- 리스트에 자료 추가하기
![img9](./src/img/img9.png)

- 리스트에 자료 삭제하기
![img10](./src/img/img10.png)

### 스택(Stack)
가장 나중에 입력된 자료가 가장 먼저 출력되는 자료구조 (Last In First Out - LIFO)
![img12](./src/img/img12.png)

### 큐(Queue)
가장 먼저 입력된 자료가 가장 먼저 출력되는 자료구조(First In First Out - FIFO)
![img11](./src/img/img11.png)


- **비선형 자료구조**
### 트리 (Tree)
부모 노드와 자식 노드간의 연결로 이루어진 자료구조
![img13](./src/img/img13.png)

### 힙 (Heap)
Priority queue를 구현 (우선순위 큐)
- Max heap : 부모 노드는 자식 노드보다 항상 크거나 같은 값을 갖는 경우
- Min heap : 부모 노드는 자식 노드보다 항상 작거나 같은 값을 갖는 경우
- heap 정렬에 활용할 수 있습니다.

### 이진 트리(Binary Tree)
부모 노드에 자식 노드가 두 개 이하인 트리
![img14](./src/img/img14.png)

### 이진 검색 트리 (Binary Search Tree)
![img15](./src/img/img15.png)

```textarea
자료(key)의 중복을 허용하지 않습니다. (key는 유일한 값)
왼쪽 자식 노드는 부모 노드보다 작은 값, 오른쪽 자식 노드는 부모 노드모다 큰 값을 가집니다.
자료 검색에 걸리는 시간이 평균 log(n)입니다.
inorder traversal 탐색을 하게 되면 자료가 정렬되어 출력됩니다.
```

- 예) 23, 10, 28, 15, 7, 22, 56 순으로 자료를 넣을 때
![img16](./src/img/img16.png)

jdk 클래스 : TreeSet, TreeMap (Tree로 시작되는 클래스는 정렬을 지원합니다.)

### 그래프 (Graph)
- 정점과 간선들의 유한 집합 G = (V, E)
- 정점(vertex) : 여러 특성을 가지는 객체, 노드(node)
- 간선(edge): 이 객체들을 연결 관계를 나타냅니다. 링크(Link)
- 간선은 방향성이 있는 경우와 없는 경우가 있습니다.
- 그래프를 구현하는 방법 : 인접 행렬(adjacency matrix), 인접 리스트(adjacency list)
- 그래프를 탐색하는 방법 : BFS(Bread First Search), DFS(Depth First Search)
- 그래프의 예)
![img17](./src/img/img17.png)

### 해싱 (Hashing)
- 자료를 검색하기 위한 자료 구조
- 키(key)에 대한 자료를 검색하기 위한 사전(dictionary)개념의 자료 구조
- key는 유일하고 이에 대한 value를 쌍으로 저장합니다.
- index = h(key): 해시 함수가 key에 대한 인덱스를 반환해주면 해당 인덱스 위치에 자료를 저장하거나 검색하게 됩니다. 
- 해시 함수에 의해 인덱스 연산이 산술적으로 가능합니다. O(1)
- 저장되는 메모리 구조를 해시 테이블이라 합니다.

jdk클래스: HashMap, Properties

### 해시 테이블
![img18](./src/img/img18.png)


### 체이닝
![img19](./src/img/img19.png)

# 배열 구현하기
## 배열의 특징
- 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조입니다.
- 정해진 크기가 있습니다.
- 요소의 추가와 제거시 다른 요소들의 이동이 필요합니다.
- 배열의 i번째 요소를 찾는 인덱스 연산이 빠릅니다.
- jdk클래스 : ArrayList, Vector

## 배열 구현
### MyArray.java
```java
public class MyArray {
	int[] intArr;
	int count; // 개수
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -9999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {
		// 이동의 수는 요소의 개수에 비례하게 됨.
		// 개수는 고려하지 않는다. 차수만 고려한다.
		
		int i;
		
		if(position < 0 || position > count) {
			return;
		}
		
		if (count >= ARRAY_SIZE) {
			return;
		}
		
		for(i = count-1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position) {
		int ret = ERROR_NUM;
		
		if(isEmpty()) {
			System.out.println("Array is empty");
			return ret;
		}
		if(position < 0 || position > count - 1) {
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i < count - 1; i++) {
			intArr[i] = intArr[i+1];
		}
		count--;
		
		return ret;
	}
	
	public int getSize() {
		return count;
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
```

### MyArrayTest.java
```java
public class MyArrayTest {

	public static void main(String[] args) {
		MyArray array = new MyArray();
		array.addElement(10);
		array.addElement(20);
		array.addElement(30);
		array.insertElement(1, 50);
		array.printAll();
		
		System.out.println("===============");
		array.removeElement(1);
		array.printAll();
		System.out.println("===============");
			
		array.addElement(70);
		array.printAll();
		System.out.println("===============");
		array.removeElement(1);
		array.printAll();
		
		System.out.println("===============");
		System.out.println(array.getElement(2));
	}

}
```

### 출력결과
```console
10
50
20
30
===============
10
20
30
===============
10
20
30
70
===============
10
30
70
===============
70
```

# 연결리스트(LinkedList) 구현하기
## 연결리스트 특징
- 동일한 데이터 타입을 순서에 따라 관리하는 자료구조입니다.
- 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있습니다.
- 자료가 추가될 때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결합니다.(정해진 크기가 없습니다.)
- 연결 리스트의 i번째 요소를 찾는데 걸리는 시간은 요소의 개수에 비례합니다. (O(n))
- jdk 클래스 : LinkedList

## 연결리스트 구현
### MyListNode.java
```java
public class MyListNode {

	private String data; // 자료
	public MyListNode next; // 다음 노드를 가리키는 링크
	
	public MyListNode() {
		data = null;
		next = null;
	}
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.next = link;
	}
	
	public String getData() {
		return data;
	}
}
```

### MyLinkedList.java
```java
public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement( String data ) {
		
		MyListNode newNode;
		if(head == null) { //맨 처음일때
			newNode = new MyListNode(data);
			head = newNode;
		}
		else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			while(temp.next != null) {
				//맨 뒤로 가서
				temp = temp.next;
			}
			temp.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode insertElement(int position, String data ) {
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count ) {
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0) {  //맨 앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	
			for(i = 0; i < position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	public MyListNode removeElement(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
			return null;
		}
		
		if(position == 0){ //맨 앞을 삭제
			head = tempNode.next;
		}
		else{
			MyListNode preNode = null;	
			for(i = 0; i < position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0) { //맨 인 경우

			return head.getData();
		}
		
		for(i = 0; i < position; i++) {
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position) {
		int i;
		MyListNode tempNode = head;
		
		if(position >= count) {
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0) {  //맨 인 경우

			return head;
		}
		
		for(i = 0; i < position; i++){
			tempNode = tempNode.next;
		}
		return tempNode;
	}

	public void removeAll() {
		head = null;
		count = 0;
		
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp != null) {
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
```

### MyLinkedListTest.java
```java
public class MyLinkedListTest {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("B");
		list.addElement("C");
		list.printAll();
		list.insertElement(3, "D");
		list.printAll();
		list.removeElement(0);
		list.printAll();
		list.removeElement(1);
		list.printAll();
						
		list.insertElement(0, "A-1");
		list.printAll();
		System.out.println(list.getSize());
		
		list.removeElement(0);
		list.printAll();
		System.out.println(list.getSize());
		
		list.removeAll();
		list.printAll();
		list.addElement("A");
		list.printAll();
		System.out.println(list.getElement(0));
		list.removeElement(0);
	}
}
```

# 스택(Stack) 구현하기
## Stack의 특징
- 맨 마지막의 위치(top)에서만 자료를 추가, 삭제, 꺼내올 수 있습니다. (중간의 자료를 꺼낼 수 없습니다.)
- Last In First Out (후입선출)구조입니다.
- 택배상자가 쌓여 있는 모양이라고 생각하면 이해하기 쉽습니다.
- 가장 최근의 자료를 찾아오거나 게임에서 히스토리를 유지하고 이르 무를때 사용할 수 있습니다.
- 함수의 메모리는 호출 순서에 따른 stack구조입니다.
- jdk 클래스: Stack

## 배열을 활용하여 Stack 구현하기
### MyArrayStack.java
```java
import ch37.MyArray;

public class MyArrayStack {
	MyArray arrayStack;
	int top;
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size) {
		top = 0;
		arrayStack = new MyArray(size);
	}
	
	public void push(int data) {
		// 배열일 경우는 꽉 찼는지 확인을 해야한다.
		if(isFull()) {
			System.out.println("Stack is Full");
			return;
		}
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {
		if(isEmpty()) { // 데이터가 비어있을 경우
			System.out.println("Stack is Empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.removeElement(--top);
	}
	
	public int peek() {
		if(isEmpty()) { // 데이터가 비어있을 경우
			System.out.println("Stack is Empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(--top);
	}
	
	public boolean isFull() {
		if(top == arrayStack.ARRAY_SIZE) {
			return true;
		}
		else return false;
	}
	
	public boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		else return false;
	}
	
	public void printAll() {
		arrayStack.printAll();
	}
}
```

### MyArrayStackTest.java
```java
public class MyArrayStackTest {

	public static void main(String[] args) {
		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		stack.printAll();
		
		System.out.println("==========");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("==========");
		System.out.println(stack.peek());
	}

}
```

### 출력 결과
```console
Stack is Full
10
20
30
==========
30
20
==========
10
```

# 큐(Queue) 구현하기
## Queue의 특징
- 맨 앞(front)에서 자료를 꺼내거나 삭제하고 맨 뒤(rear)에서 자료를 추가합니다.
- First In First Out (선입선출)구조입니다.
- 일상 생활에서 일렬로 줄 서 있는 모양을 생각하면 이해하기 쉽습니다.
- 순차적으로 입력된 자료를 순서대로 처리하는데 많이 사용되는 자료구조입니다.
- 콜센터에 들어온 문의 전화, 메세지 큐 등에 활용됩니다.
- jdk 클래스: ArrayList

## 연결리스트를 활용하여 Queue 구현하기
### MyLinkedQueue.java
```java
import ch38.MyLinkedList;
import ch38.MyListNode;

interface Queue {
	public void enQueue(String data);
	public String deQueue();
	public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue {

	MyListNode front;
	MyListNode rear;
	
	@Override
	public void enQueue(String data) {
		MyListNode newNode;
		if(isEmpty()) {
			// 비어있는 큐에 맨 처읆으로 들어가는 경우
			newNode = addElement(data);
			front = newNode;
			rear = newNode;
		}
		else {
			// 맨 뒤로 들어가는 경우
			newNode = addElement(data);
			rear = newNode;
		}
		
		System.out.println(newNode.getData() + " added");
	}

	@Override
	public String deQueue() {
		if(isEmpty()) {
			return null;
		}
		String data = front.getData();
		front = front.next;
		
		if(front == null) { // 마지막 항목이라는 의미
			rear = null;
		}
		return data;
	}

	@Override
	public void printQueue() {
		printAll();
	}

}
```

### MyListQueueTest.java
```java
public class MyListQueueTest {

	public static void main(String[] args) {
		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		
		listQueue.printAll();
		
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());
	}

}
```

### 출력 결과
```console
Aadded
Badded
Cadded
A->B->C
A
B
```

# 무엇이든 담을 수 있는 제네릭(Generic) 프로그래밍
## 제네릭 자료형 정의
- 클래스에서 사용하는 변수의 자료형이 여러개일 수 있고, 그 기능(메서드)은 동일한 경우 클래스의 자료형을 특정하지 않고 추후 해당 클래스를 사용할 때 지정할 수 있도록 선언합니다.
- 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식입니다.
- 컬렉션 프레임워크에서 많이 사용되고 있습니다.
- 제네릭 타입을 사용하지 않는 경우의 예

### 재료가 Powder인 경우
```java
public class ThreeDPrinter1 {
	private Powder material;
	
	public void setMeterial(Powder material) {
		this.material = material;
	}
	
	public Powder getMaterial() {
		return material;
	}
}
```

### 재료가 Plastic인 경우
```java
public class ThreeDPrinter2 { // 클래스에 1, 2같은 숫자 사용하는거 별로 좋은거 아니지만 이것은 예제여서 상관 x
	private Plastic material;
	
	public void setMeterial(Plastic material) {
		this.material = material;
	}
	
	public Plastic getMaterial() {
		return material;
	}
}
```

### 여러타입을 대체하기 위해 Object를 사용할 수 있습니다.
```java
public class ThreeDPrinter3 { // 클래스에 1, 2같은 숫자 사용하는거 별로 좋은거 아니지만 이것은 예제여서 상관 x
	// 이 printer는 재료가 뭐든지 다 적용
	
	private Object material;
	
	public void setMeterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
}
```

### Object를 사용하는 경우 형 변환을 해줘야 합니다.
```java
Powder powder = new Powder();
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		printer.setMeterial(powder);
		
		Powder p = (Powder)printer.getMaterial(); // 이때 반환되는 값이 Object이기 때문에 앞에 (Powder)를 써줘서 형변환을 해야한다.
```

### GenericPrinter.java
```java
public class GenericPrinter<T> { // T자리에 실제적으로 사용할 자료형을 쓴다. 나중에 쓸 때
	private T material;
	
	public void setMeterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
```
- 자료형 매개변수 T(Type Parameter): 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정, static 변수는 사용할 수 없습니다.
- GenericPrinter: 제네릭 자료형
- E: element, K: key, V: value 등 여러 알파벳을 의미에 따라 사용 가능합니다.

## 제네릭 클래스 사용하기
### Powder.java
```java
public class Powder {
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}
```

### Plastic.java
```java
public class Plastic {
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
}
```

### GenericPrinter.java
```java
public class GenericPrinter<T> {  // T자리에 실제적으로 사용할 자료형을 쓴다. 나중에 쓸 때
	private T material;
	
	public void setMeterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
}
```

### GenericPrinterTest.java
```java
public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // <> : 다이아몬드 연산자
		powderPrinter.setMeterial(powder);
		
		Powder p = powderPrinter.getMaterial(); // 형변환을 하지 않는다.
		// 형변환을 하지 않는 이유 : GenericPrinter<Powder>이렇게 작성하면 컴파일될 때 GenericPrinter 클래스에 있는 모든 T가 Powder로 바뀜.
		
		System.out.println(powderPrinter.toString());
		
	}

}
```

### 출력 결과
```console
재료는 Powder 입니다.
```

## 다이아몬드 연산자 - <>
- ArrayList list = new ArrayList<>(); // 다이아몬드 연산자 내부에서 자료형은 생략가능 합니다.
- 제네릭에서 자료형 추론(자바 10부터)

```java
ArrayList list = new ArrayList<>() => var list = new ArrayList()
```

# <T extends 클래스> 사용하기
## 상위 클래스의 필요성
- T자료형의 범위를 제한할 수 있습니다.
- 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있습니다.
- 상속을 받지 않는 경우 T는 Object로 변환되어 Object 클래스가 기본으로 제공하는 메서드만 사용 가능합니다.

## T extends를 사용한 프로그래밍
- GenericPrinter에 material 변수의 자료형을 상속받아 구현합니다.
- 전의 예제에서 어떤 재료를 넣어도 다 출력이 되는 형식이였는데 이렇게되면 물과 같은 재료를 넣어도 정상작동이 됩니다.
- 그렇기 때문에 T에 무작위 클래스가 들어갈 수 없게 Material 클래스를 상속받은 클래스로 한정합니다.

### Material.java
```java
public abstract class Material { // 직접 쓸일은 없기 때문에 abstract로 만듭니다.
	/*
	 * T가 사용할 여러 메서드들을 추상클래스 상위 클래스에서 미리선언을 해놓고
	 * 이것을 구현하도록 할 수도 있고 공통되는 기능을 구현해 놓을 수도 있다.
	 * extends T를 사용함으로써 써야하는 재료에 대해서 한정을 두고
	 * 어떤 클래스 기반에 한 것만 넣을 수 있다는 제약도 있다.
	 */
	
	public abstract void doPrinting();
}
```

### Powder.java
```java
public class Powder extends Material {
	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
}
```

### Plastic.java
```java
public class Plastic extends Material {
	public String toString() {
		return "재료는 Plastic 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
}
```

# 제네릭 메서드 활용하기
## 제네릭 메서드란?
- 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드입니다.
- 자료형 매개변수가 하나 이상인 경우도 있습니다.
- 제네릭 클래스가 아니어도 내부에 제네릭 메서드는 구현하여 사용할 수 있습니다.
- public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개벼수 ...) {}

## 제네릭 메서드의 활용 예
- 두 점(top, bottom)을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메서드
- 두 점은 정수인 경우도 있고, 실수인 경우도 있으므로 제네릭 타입을 사용하여 구현합니다.

### Point.java
```java
public class Point<T, V> {
	T x;
	V y;
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
```

### GenericMethod.java
```java
public class GenericMethod {
	
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}

	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0); // <>안에 생략가능
		
		double size = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		
		System.out.println(size);
	}

}
```

### 출력 결과
```console
100.0
```

# 자바에서 제공되는 자료구조 구현 클래스들 - 컬렉션 프레임워크
## 컬렉션 프레임워크
- 프로그램 구현에 필요한 자료구조를 구현해 놓은 JDK라이브러리
- java.util 패키지에 구현되어 있습니다.
- 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있습니다.
- 여러 구현 클래스와 인터페이스의 활용에 대한 이해가 필요합니다.

![img20](./src/img/img20.png)

## Collection Interface
- 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스
- 하위에 List와 Set 인터페이스가 있습니다.

### List Interface
- 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
- 자료구조 리스트(배열, 연결리스트)의 구현을 위한 인터페이스
- 중복을 허용합니다.
- ArrayList, Vector, LinkedList, Stack, Queue, ...

### Set Interface
- 순서와 관계없이 중복을 허용하지 않고 유일한 값을 관리하는데 필요한 메서드가 선언됩니다.
- 아이디, 주민번호, 사번등을 관리하는데 유용합니다.
- 저장된 순서와 출력되는 순서는 다를 수 있습니다.
- HashSet, TreeSet, ...

## Map Interface
- 쌍(pair)으로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스
- 객체는 key-value의 쌍으로 이루어집니다.
- key는 중복을 허용하지 않습니다.
- HashTable, HashMap, Properties, TreeMap 등이 Map 인터페이스를 구현합니다. 

# 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용
## 멤버쉽 관리하기
- Member 클래스를 만들고, 아이디와 이름을 멤버 변수로 선언합니다.
- Member 클래스로 생성된 인스턴스들을 관리하는 클래스를 컬렉션 프레임워크 클래스들을 활용하여 구현합니다.

## ArrayList 활용하기
- 멤버를 순차적으로 관리합니다.

### Member.java
```java
public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
```

### MemberArrayList.java
```java
import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			
			if(tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
```

### MemberArrayListTest.java
```java
public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberLee = new Member(1002, "Lee");
		Member memberWoo = new Member(1003, "Woo");
		Member memberKim = new Member(1004, "Kim");
		
		memberArrayList.addMember(memberLim);
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberWoo);
		memberArrayList.addMember(memberKim);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberKim.getMemberId());
		memberArrayList.showAllMember();
		
	}

}
```

### 출력 결과
```console
Lim 회원님의 아이디는 1001입니다.
Lee 회원님의 아이디는 1002입니다.
Woo 회원님의 아이디는 1003입니다.
Kim 회원님의 아이디는 1004입니다.

Lim 회원님의 아이디는 1001입니다.
Lee 회원님의 아이디는 1002입니다.
Woo 회원님의 아이디는 1003입니다.
```

# Collection 요소를 순회하는 Iterator
## 요소의 순회란?
- 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것입니다.
- 순서가 있는 List인터페이스의 경우는 Iterator를 사용하지 않고 get(i) 메서드를 활용할 수 있습니다.
- Set 인터페이스의 경우 get(i)메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회합니다.

## Iterator 사용하기
- boolean hasNext(): 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환합니다.
- E next(): 다음에 있는 요소를 반환합니다.

### MemberArrayList.java의 removeMember()메서드를 Iterator를 활용하여 구현합니다.
```java
	public boolean removeMember(int memberId) { // 멤버 아이디를 매개변수로, 삭제 여부를 반환
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i);
//			
//			int tempId = member.getMemberId();
//			
//			if(tempId == memberId) {
//				arrayList.remove(i);
//				return true;
//			}
//		}
		Iterator<Member> ir = arrayList.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { // 멤버 아이디가 매개변수와 일치하면
				arrayList.remove(member); // 해당 멤버 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
```

# 중복되지 않게 자료를 관리하는 Set 인터페이스를 구현한 클래스와 그 활용
## HashSet 클래스
- Set 인터페이스를 구현한 클래스
- 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야 합니다.
- 동일성 구현을 위해 필요에 따라 equals()와 hashCode() 메서드를 재정의합니다.

### MemberHashSetTest.java
```java
public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberLee = new Member(1002, "Lee");
		Member memberWoo = new Member(1003, "Woo");
		Member memberKim = new Member(1004, "Kim");
		
		memberHashSet.addMember(memberLim);
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberWoo);
		memberHashSet.addMember(memberKim);
		
		Member memberHong = new Member(1004, "Hong");
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
		
	}

}
```

### MemberHashSet.java
```java
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		Iterator<Member> ir = hashSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { // 멤버 아이디가 매개변수와 일치하면
				hashSet.remove(member); // 해당 멤버 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
```

### Member.java
```java
public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
```

### 출력 결과
```console
Lim 회원님의 아이디는 1001입니다.
Lee 회원님의 아이디는 1002입니다.
Woo 회원님의 아이디는 1003입니다.
Kim 회원님의 아이디는 1004입니다.
```

# 정렬을 위해 Comparable과 Comparator 인터페이스 구현하기
## TreeSet 클래스 활용하기
- 객체의 정렬에 사용하는 클래스
- Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있습니다.
- 내부적으로 이진검색트리(binary search tree)로 구현됩니다.
- 이진검색트리에 저장하기 위해 각 객체를 비교해야 합니다.
- 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현해야 TreeSet에 추가될 수 있습니다.
- String, Integer 등 JDK의 많은 클래스들이 이미 Comparable을 구현했습니다.

### TreeSetTest.java
```java
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Lim");
		set.add("Woo");
		set.add("Kim");
		
		System.out.println(set); // [Kim, Lim, Woo]
```
String 클래스는 이미 Comparable 인터페이스가 구현되어 있으므로 오름차순으로 정렬되어 출력됩니다. <br />

### MemberTreeSet.java
```java
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) { // 멤버 아이디를 매개변수로, 삭제 여부를 반환
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) { // 멤버 아이디가 매개변수와 일치하면
				treeSet.remove(member); // 해당 멤버 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
```

### MemberTreeSetTest.java
```java
public class MemberTreeSetTest {

	public static void main(String[] args) {
				
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberWoo = new Member(1002, "Woo");
		Member memberAnna = new Member(1003, "Anna");
		Member memberKim = new Member(1004, "Kim");
		Member memberHong = new Member(1005, "Hong");
		
		memberTreeSet.addMember(memberLim);
		memberTreeSet.addMember(memberWoo);
		memberTreeSet.addMember(memberAnna);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember(); 
		
	}

}
```

- Member클래스가 아이디 오름차순으로 정렬되게 하기 위해 Comparable 인터페이스를 구현해야 합니다.

### Member.java
```java
public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public Member() {}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

//	implements Comparable<Member> 일 경우
	@Override
	public int compareTo(Member member) { // 자기 자신과 비교
		if(this.memberId > member.memberId) {
			return 1;
		}
		else if(this.memberId < member.memberId) {
			return -1;
		}
		else {
			return 0;
		}
		return (this.memberId - member.memberId); // 오름차순
		// return (this.memberId - member.memberId) * (-1); // 내림차순
		
	}
}
```

### 출력 결과
```console
Lim 회원님의 아이디는 1001입니다.
Woo 회원님의 아이디는 1002입니다.
Anna 회원님의 아이디는 1003입니다.
Kim 회원님의 아이디는 1004입니다.
Hong 회원님의 아이디는 1005입니다.
```

- Comparator로 구현

```java
import java.util.Comparator;

public class Member implements Comparator<Member> {
	
	. . .
	
	@Override
	public int compare(Member m1, Member m2) { // 자기 자신하고 비교대상과 비교
		
		return (m1.memberId - m2.memberId);
	}
}
```

### MemberTreeSet.java
```java
public MemberTreeSet() {
	treeSet = new TreeSet<Member>(new Member()); // Comparator를 사용할 때는 꼭 이 부분에 내가 어떤 것으로 구현을 했는지 대상을 넣어줘야 한다.
}
```

- Comparator의 활용 : 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현할 수 있습니다.

```java
import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) * (-1);
	}
}

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("Lim");
		set.add("Woo");
		set.add("Kim");
		
		System.out.println(set); // [Kim, Lim, Woo]		
	}
}
```

### 출력 결과
```console
[Woo, Lim, Kim]
```

# 쌍(pair)으로 자료를 관리하는 Map 인터페이스를 구현한 클래스와 그 활용
## HashMap 클래스 활용하기
- Map 인터페이스를 구현한 클래스
- 가장 많이 사용되는 Map 인터페이스 기반 클래스
- key - value를 쌍으로 관리하는 메서드를 구현합니다.
- 검색을 위한 자료구조입니다.
- key를 이용하여 값을 저장하고 key를 이용하여 값을 꺼내오는 방식 (hash 알고리즘으로 구현됩니다.)
- key가 되는 객체는 중복될 수 없고 객체의 유일성을 비교를 위한 equals()와 hashCode()메서드를 구현해야 합니다.

### MemberHashMap.java (Member.java는 기존 Comparable과 Comparator를 하지 않은 것과 동일)
```java
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		System.out.println("no element");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			
			System.out.println(member);
		}
	}
}
```

### MemberHashMapSetTest.java
```java
import java.util.HashMap;

public class MemberHashMapSetTest {

	public static void main(String[] args) {
				
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLim = new Member(1001, "Lim");
		Member memberWoo = new Member(1002, "Woo");
		Member memberAnna = new Member(1003, "Anna");
		Member memberKim = new Member(1004, "Kim");
		Member memberHong = new Member(1005, "Hong");
		
		memberHashMap.addMember(memberLim);
		memberHashMap.addMember(memberWoo);
		memberHashMap.addMember(memberAnna);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember(); 
		
		System.out.println();
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1001, "1");
		hashMap.put(1002, "2");
		hashMap.put(1003, "3");
		hashMap.put(1004, "4");
		
		System.out.println(hashMap);
		
	}

}
```

### 출력 결과
```console
Lim 회원님의 아이디는 1001입니다.
Woo 회원님의 아이디는 1002입니다.
Anna 회원님의 아이디는 1003입니다.
Kim 회원님의 아이디는 1004입니다.
Hong 회원님의 아이디는 1005입니다.

{1001=1, 1002=2, 1003=3, 1004=4}
```

## TreeMap 클래스
- Map 인터페이스를 구현한 클래스이고 key에 대한 정렬을 구현할 수 있습니다.
- key가 되는 클래스에 Comparable이나 Comparator 인터페이스를 구현함으로써 key-value 쌍의 자료를 key값 기준으로 정렬하여 관리할 수 있습니다.

# 여러 내부 클래스의 정의와 유형
## 내부 클래스란? (inner class)
- 클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관이 있는 경우가 많고, 다른 외부 클래스에서 사용할 일이 거의 없는 경우에 내부 클래스로 선언해서 사용합니다.
- 중첩 클래스라고도 합니다.
- 내부 클래스의 종류 : 인스턴스 내부 클래스, 정적(static) 내부 클래스, 지역(local) 내부 클래스, 익명(anonymous) 내부 클래스 (많이 사용합니다.)

## 인스턴스 내부 클래스
- 내부적으로 사용할 클래스를 선언합니다. (private으로 선언하는 것을 권장합니다.)
- 외부 클래스가 생성된 후 생성됩니다. (정적 내부 클래스와 다릅니다.)
- private이 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있습니다.

```java
OutClass outClass = new OutClass();
OutClass.InClass inClass = outClass.new InClass();
```

### 인스턴스 내부 클래스의 예
```java
class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass(); // 내부 클래스 생성
	}
	
	private class InClass {
		int iNum = 100;
		// static int sInNum = 200; // Error
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
		// InClass가 private이 아닌 경우
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
	}

}
```

## 정적 내부 클래스
- 외부 클래스 생성과 무관하게 사용할 수 있습니다.
- 정적 변수, 정적 메서드을 사용합니다.

### 정적 내부 클래스 예
```java
class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	private class InClass {
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			// System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); // error
			// 정적 클래스가 외부 클래스와 상관없이 만들어 질 수 있기 때문에 외부 클래스의 인스턴스 변수를 사용할 수 없습니다.(static 변수도 마찬가지이다.)
			System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 static 변수)");
		}
		
		static void sTest() { // static 변수만 호출 가능
			// System.out.println("OutClass num = " + iNum + "(내부 클래스의 인스턴스 변수)"); // error
			// static 클래스의 static 메서드는 정말 이 클래스가 생성되지 않아도 호출될 수 있다. 그때는 이 변수가 생성이 안되었을 수도 있다. 그래서 사용할 수 없다.
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
			System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 static 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// 인스턴스 내부 클래스
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		
		// private이 아닌 경우
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		// 정적 내부 클래스
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();
	}

}
```

## 지역 내부 클래스
- 지역 변수와 같이 메서드 내부에서 정의하여 사용하는 클래스
- 메서드의 호출이 끝나면 메서드에 사용된 지역 변수의 유효성은 사라집니다.
- 메서드 호출 이후에도 사용해야 하는 경우가 있을 수 있으므로 지역 내부 클래스에서 사용하는 메서드의 지역 변수나 매개 변수는 final로 선언됩니다.

### Outer2.java
```java
class Outer2 {
	
	int outNum = 100; // 멤버 변수는 생성자에서 하는게 좋은 방법이지만 예제이기 때문에 그냥 함.
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // i는 stack 메모리에 생성
		int num = 10; // num은 stack 메모리에 생성
		
		class MyRunnable implements Runnable {
			
			int localNum = 1000;
			
			@Override
			public void run() {
				
//				i = 50; // error
//				num = 20; // error
//				가져다 출력할 때는 error가 생기지 않는다.
//				하지만 값을 바꾸려고 하면 error가 생긴다.
//				Error가 생기는 이유는 getRunnable() 메서드가 호출되는 시점이랑 MyRunnable클래스가 생성 주기가 다르기 때문이다.
//				getRunnable 메서드의 호출이 끝나면 Stack 메모리에 잡힌 i와 num은 없어진다.
//				하지만 run()메서드는 getRunnable을 받고나면 나중에 또 호출될 수 있다.
//				그런데 또 호출되었을 때 i, num은 없을 수도 있다.
//				없으면 그 값을 assign을 못한다. 그러면 값을 바꿔줄 수 없다.
//				즉, i와 num은 stack메모리에 생성이 되는건데 stack에 잡히면 안된다.
//				그래서 컴파일러가 자동으로 final로 처리한다.
//				외부 메서드에서 있는 변수를 익명 내부 클래스안에서 쓸 때 오류가 난다.
//				예전에는 final로 선언하라고 했지만 지금은 컴파일러가 자동으로 final로 변환해준다.
//				즉, 스택에 잡히지 않는다. 상수메모리에 잡힌다. 그래서 값을 바꿀 수 없다.
				
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
		}
		
		return new MyRunnable();
	}
}

public class AnonumousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
	}

}
```

### 출력 결과
```console
i = 100
num = 10
localNum = 1000
outNum = 100(외부 클래스 인스턴스 변수)
Outer.sNum = 200(외부 클래스 정적 변수)
```

## 익명 내부 클래스
- 이름이 없는 클래스 (위 지격 내부 클래스의 MyRunnable 클래스 이름은 실제로 호출되는 경우가 없습니다.)
- 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환합니다.
- 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환할 수 있습니다.
- widget의 이벤트 핸들러에 활용됩니다.

```java
class Outer2 {
	
	int outNum = 100; // 멤버 변수는 생성자에서 하는게 좋은 방법이지만 예제이기 때문에 그냥 함.
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // i는 stack 메모리에 생성
		int num = 10; // num은 stack 메모리에 생성
		
		return new Runnable() {
			
			int localNum = 1000;
			
			@Override
			public void run() {
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);

				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
		};
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable class");
		}
		
	};
}

public class AnonumousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
```

### 출력 결과
```console
i = 100
num = 10
localNum = 1000
outNum = 100(외부 클래스 인스턴스 변수)
Outer.sNum = 200(외부 클래스 정적 변수)
Runnable class
```

# 람다식(Lambda expression)
## 함수형 프로그래밍과 람다식
- 자바는 객체 지향 프로그래밍 : 기능을 수행하긴 위해서는 객체를 만들고 그 객체 내부에 멤버 변수를 선언하고 기능을 수행하는 메서드를 구현합니다.
- 자바 8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라고 합니다.
- 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식입니다.
- 함수형 프로그래밍(Functional Programming: FP)
```textarea
함수형 프로그래밍은 순수함수(pure function)를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)를 주지 않도록 구현하는 방식입니다.
순수 함수란 매개변수만을 사용하여 만드는 함수입니다. 즉, 함수 내부에서 함수 외부에 있는 변수를 사용하지 않아 함수가 수행되더라도 외부에는 영향을 주지 않습니다.

함수를 기반으로 하는 프로그래밍이고 입력받는 자료 이외에 외부 자료를  사용하지 않아 여러 자료가 동시에 수행되는 병렬 처리가 가능합니다.
함수형 프로그래밍은 함수의 기능이 자료에 독립적임을 보장합니다. 이는 동일한 자료에 대해 동일한 결과를 보장하고, 다양한 자료에 대해 같은 기능을 수행할 수 있습니다.
```

## 람다식 문법
- 익명 함수 만들기
- 매개 변수와 매개변수를 이용한 실행문 (매개 변수) -> {실행문;}
- 두 수를 입력 받아 더하는 add() 함수 예

```java
int add(int x, int y) {
	return x + y;
}
```
- 람다식으로 표현

```java
(int x, int y) -> {return x + y;}
```

- 매개 변수가 하나인 경우 자료형과 ()생략 가능합니다.

```java
str -> {System.out.println(str);}
```

- 매개변수가 두 개 이상인 경우 ()를 생략할 수 없습니다.

```java
x, y -> {System.out.println(x + y);} // 오류
```

- 실행문이 한 문장인 경우 중괄호 생략 가능합니다.

```java
str -> System.out.println(str);
```

- 실행문이 한 문장이라도 return문(반환문)은 중괄호를 생략할 수 없습니다.

```java
str -> return str.length(); // 오류
```

- 실행문이 한 문장의 반환문인 경우엔 return과 중괄호를 모두 생략합니다.

```java
(x, y) -> x + y;
str -> str.length;
```

### 예제
```java
public interface Add {
	public int add(int x, int y);
	
}
```
```java
public class AddTest {

	public static void main(String[] args) {
		Add addL = (x, y) -> {return (x + y);};
		
		System.out.println(addL.add(2, 3));
	}

}
```
```console
5
```

# 함수형 인터페이스와 람다식 구현하여 사용하기
## 함수형 인터페이스 선언하기
- 람다식을 선언하기 위한 인터페이스
- 익명 함수와 매개 변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야합니다.
- @FunctionalInterface 애노테이션(annotation)<br/>
  함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하며 에러납니다.
	```java
	@FunctionalInterface
	public interface MyNumber { // Error
		int getMax(int n1, int n2);
		int add(int x, int y);
	}
	```
	
- 람다식 구현과 호출
```java
@FunctionalInterface
public interface MyNumber {
	int getMax(int n1, int n2);
}
```
```java
public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber myNumber = (x, y) -> x > y? x : y;
		
		System.out.println(myNumber.getMax(10, 20));
	}

}
```

# 스트림(Stream)
## 스트림이란?
- 자료의 대상과 관계없이 동일한 연산을 수행합니다.<br />
  배열, 컬렉션을 대상으로 연산을 수행합니다.<br />
  일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 합니다.<br />
  자료 처리에 대한 추상화가 구현되었다고 합니다.
- 한번 생성하고 사용한 스트림은 재사용할 수 없습니다. <br />
  자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모됩니다.<br />
  다른 연산을 수행하기 위해서는 스트림을 다시 생성해야 합니다.
- 스트림 연산은 기존 자료를 변경하지 않습니다.<br />
  자료에 대한 스트림을 생성하면 스트림이 사용하는 메모리 공간은 별도로 생성되므로 연산이 수행되도 기존 자료에 대한 변경은 발생하지 않습니다.
- 스트림 연산은 중간 연산과 최종 연산으로 구분 됩니다.<br />
  스트림에 대해 중간 연산은 여러 개의 연산이 적용될 수 있지만 최종 연산은 마지막에 한 번만 적용됩니다.<br />
  최종연산이 호출되어야 중간 연산에 대한 수행이 이루어 지고 그 결과가 만들어 집니다.<br />
  따라서 중간 연산에 대한 결과를 연산 중에 알 수 없습니다.<br />
  이를 '지연 연산'이라 합니다.

## 스트림 생성하고 사용하기
- 정수 배열에 스트림 생성하여 연산을 수행하는 예
```java
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		
		is.forEach(n -> System.out.println(n));
		
		System.out.println();
		
//		is. 코드 상 에러라고 뜨지는 않지만 출력했을 때 error가 생김. 왜냐면 한번 연산이 시행되고 나면 소모가 되기 떄문.
		
		int sum = Arrays.stream(arr).sum(); // 그렇기 때문에 또 다른 연산을 사용하기 위해서는 스트림을 다시 생성하여야 함.
		System.out.println(sum);		
	}

}
```

## 중간 연산과 최종 연산
- 중간 연산의 예 - filter(), map(), sorted() 등<br />
  조건에 맞는 요소를 추출(filter)하거나 요소를 변환 합니다.(map)
- 최종 연산이 호출될 때 중간 연산이 수행되고 결과가 생성 됩니다.


문자열 리스트에서 문자열의 길이가 5 이상인 요소만 출력하기
```java
sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
```
fliter()는 중간 연산이고, forEach()는 최종 연산입니다.

고객 클래스 배열에서 고객 이름만 가져오기
```java
customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(c));
```
map()은 중간 연산이고, forEach()는 최종 연산입니다.

- 중간 연산과 최종 연산에 대한 구현은 람다식을 활용합니다.
- 최종 연산의 예 - forEach(), count(), sum() 등 <br />
  스트림이 관리하는 자료를 하나씩 소모해가며 연산이 수행됩니다.<br />
  최종 연산 후에 스트림은 더 이상 다른 연산을 적용할 수 없습니다. <br />
  forEach(): 요소를 하나씩 꺼내 옵니다. <br />
  count(): 요소의 개수 <br />
  sum(): 요소들의 합

## ArrayList 객체에 스트림 생성하고 사용하기
- ArrayList에 문자열 자료(이름)을 넣고 이에 대한 여러 연산을 수행해보기

```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		sList.add("Aaksdn");
		sList.add("Caklsndl");
		sList.add("Baj");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		System.out.println();
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s + "\t"));
		
	}

}
```

- 새로운 연산을 수행하기 위해서는 기존의 스트림은 재사용할 수 없고 stream() 메서드를 호출하여 스트림을 다시 생성하여야 합니다.

# 객체지향 프로그래밍 vs 람다식 구현
## 객체지향 프로그래밍과 람다식 비교
- 문자열 두 개를 연결하여 출력하는 예제를 두 가지 방식으로 구현
- 인터페이스 선언
```java
public interface StringConcat {
	public void makeString(String s1, String s2);
}
```

- 객체지향 프로그래밍으로 구현

### 인터페이스를 구현한 클래스 만들기
```java
public class StringConCatImpl implements StringConcat {
	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
}
```

### 클래스를 생성하고 메서드 호출하기
```java
public class StringConcatTest {

	public static void main(String[] args) {
		// 람다식 이전에 클래스를 사용하는 방식
		String s1 = "Hello";
		String s2 = "World";
		StringConCatImpl strImpl = new StringConCatImpl();
		strImpl.makeString(s1, s2);
}
```

### 람다식으로 구현하기
```java
public class StringConcatTest {

	public static void main(String[] args) {
//	@FunctionalInterface을 StringConcat.java에 선언하고
		String s1 = "Hello";
		String s2 = "World";
		
		StringConCatImpl strImpl = new StringConCatImpl();
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = (s, v) -> System.out.println(s + ", " + v);
		// 람다식을 이렇게 쓰게 되면 이게 아래 익명 클래스로 바뀐다 그렇기 때문에 메서드도 하나만 만들어야한다.
		concat.makeString(s1, s2);
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "...." + s2);
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
```

### 출력결과
```console
Hello, World
Hello, World
Hello....World
```

## 익명 객체를 생성하는 람다식
- 자바에서는 객체없이 메서드가 호출될 수 없습니다.
- 람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명객체가 생성됩니다.

```java
StringConcat concat2 = new StringConcat() {
			
		@Override
		public void makeString(String s1, String s2) {
			System.out.println(s1 + "...." + s2);
		}
	};

	concat2.makeString(s1, s2);
}
```
- 익명 내부 클래스에서와 마찬가지로 람다식 내부에서도 외부에 있는 지역 변수의 값을 변경하면 오류가 발생합니다.

## 함수를 변수처럼 사용하는 람다식
```textarea
변수는

특정 자료형으로 변수를 선언한 후 값을 대입합니다.	int a = 10;

매개 변수로 전달하여 사용합니다.	int add(int x, int y)

메서드의 반환 값으로 반환 합니다.	return num;
```

- 인터페이스형 변수에 람다식 대입하기

### 함수형 인터페이스
```java
interface PrintString {
	void showString(String str);
}
```

```java
PrintString lamdaStr = s -> System.out.println(s); // 람다식을 변수에 대입
lamdaStr.showString("hello lamda_1");
```
- 매개변수로 전달하는 람다식

```java
showMyString(lamdaStr);

public static void showMyString(PrintString p) {
	p.showString("hello lamda_2");
}
```

- 반환 값으로 쓰이는 람다식

```java
public static PrintString returnString() { // 반환 값으로 사용
	return s -> System.out.println(s + "world");
}

PrintString reStr = returnString();
reStr.showString("hello ");
```

# 연산 수행에 대한 구현을 할 수 있는 reduce()연산
## reduce() 연산
- 정의된 연산이 아닌 프로그래머가 직접 구현한 연산을 적용합니다.

```java
T reduce(T identify, BinaryOperator<T> accumulator)
```
- 최종 연산으로 스트림의 요소를 소모하며 연산을 수행합니다.
- 배열의 모든 요소의 합을 구하는 reduce() 연산 구현 예

```java
Arrays.stream(arr).reduce(0, (a, b) -> a + b);
```
- reduce() 메서드의 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행할 수 있습니다.
- 람다식을 직접 구현하거나 람다식이 긴 경우 BinaryOperator를 구현한 클래스를 사용합니다.

## BinaryOperator를 구현하여 배열에 여러 문자열이 있을 때 길이가 가장 긴 문자열 찾기 예
```java
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		String greetings[] = {"안녕하세요", "hello", "Good morning", "반갑습니다^^"};
		
		System.out.println(
			Arrays.stream(greetings).reduce("", (s1, s2) -> {
				if(s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;
			}
		));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
```

### 출력결과
```console
Good morning
Good morning
```

# 스트림을 활용하여 패키지 여행 비용 계산하기

## 문제 정의
```textarea
여행사에 패키지 여행 상품이 있습니다. 여행 비용은 15세 이상은 100만원, 그 미만은 50만원 입니다.
고객 세 명이 패키지 여행을 떠난다고 했을 때 비용 계산과 고객 명단 검색 등에 대한 연산을 스트림을 활용하여 구현해 봅니다.
고객에 대한 클래스를 만들고 ArrayList로 고객을 관리 합니다.

고객 정보는 다음과 같습니다.

CustomerLee
이름: 이순신
나이: 40
비용: 100

CustomerKim
이름: 김유신
나이: 20
비용: 50

CustomerHong
이름: 홍길동
나이: 13
비용: 50
```

## 고객 클래스
```java
public class TravelCustomer {
	private String name; // 이름
	private int age; // 나이
	private int price; // 가격
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
```

### TravelCustomerTest.java
```java
import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("고객 명단 출력");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("여행 비용 값");
		System.out.println(customerList.stream().mapToInt(c -> c.getPrice()).sum());
		System.out.println();
		
		System.out.println("20세 이상");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		System.out.println();
		
	}

}
```

### 출력 결과
```console
고객 명단 출력
이순신
김유신
홍길동

여행 비용 값
250

20세 이상
김유신
이순신
```

# 예외처리를 하는 이유와 자바에서 제공되는 클래스들
## 프로그램에서의 오류
### 컴파일 오류
- 프로그램 코드 작성 중 발생하는 문법적 오류
- 최근에는 개발 환경에서 대부분의 컴파일 오류는 detection 됩니다.

### 실행 오류
- 실행 중인 프로그램이 의도 하지 않은 동작(bug)을 하거나 프로그램이 중지되는 오류
- 실행 오류는 비정상 종료가 되는 경우 시스템의 심각한 장애가 발생할 수 있습니다.

## 예외 처리의 중요성
- 프로그램의 비정상 종료를 피하여 시스템이 원할이 실행되도록 합니다.
- 실행 오류가 발생한 경우 오류의 과정을 재현하는 것은 현실적으로 힘듭니다.
- 오류가 발생한 경우 log를 남겨서 추후 log분석을 통해 그 원인을 파악하여 bug를 수정하는 것이 중요합니다.

## 오류와 예외 클래스
### 시스템 오류
- 가상 머신에서 발생, 프로그래머가 처리할 수 없는 오류입니다.
- 동적 메모리가 없는 경우, 스택 메모리 오버플로우 등

### 예외(Exception)
- 프로그램에서 제어할 수 있는 오류
- 읽어 들이려는 파일이 존재하지 않거나, 네트워크나 DB연결이 안되는 경우 등

### 자바는 안전성이 중요한 언어로 대부분 프로그램에서 발생하는 오류에 대해 문법적으로 예외 처리를 해야합니다.

## 예외 클래스들
- 모든 예외 클래스의 최상위 클래스는 Exception 클래스

[img21](./src/img/img21.png)

- 자바에서는 다양한 예외들에 대해 그 처리르 위한 클래스가 제공되고 있습니다.

[img22](./src/img/img22.png)

- Arithmetic Exception: 정수를 0으로 나눈 경우 발생
- NullPointerException: 초기화 되지 않은 Object를 사용하는 경우

```java
Dog d = null;
System.out.println(dog);
```

- ArrayIndexOutOfBoundsException: 배열의 크기를 넘어선 위치를 참조하려는 경우
- FileNotFoundException: 참조하는 파일이 지정된 위치에 존재하지 않는 경우
- ClassNotFoundException
```java
Class.forName("sis.studentinfo.Student"); // 클래스가 로드되지 않은 경우
```
- InterruptedException: Thread.sleep(), join().Object의 wait()로 non-runnable 상태인 thread를 Runnable하게 만들 수 있도록 사용할 수 있습니다.

# 예외 처리하기와 미루기
## try-catch문
- try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고 try 블록 안에서 예외가 발생하는 경우 catch 블록이 수행됩니다.

```java
try {
	// 예외가 발생할 수 있는 코드 부분
} catch {
	// try 블록 안에서 예외가 발생했을 때 예외를 처리하는 부분
}
```

- 프로그래머가 예외를 처리해줘야 하는 예 (배열의 오류 처리)

```java
public class ArrayIndexException {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

}
```

### 출력 결과
```console
1
2
3
4
5
Index 5 out of bounds for length 5
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
```

## try-catch-finally 문
- finally 블록에서 파일을 닫거나 네트워크를 닫는 등의 리소스 해제 구현을 합니다.
- try {} 블록이 수행되는 경우, finally {} 블록은 항상 수행됩니다.
- 여러 개의 예외 블록이 있는 경우 각각에서 리소스를 해제하지 않고 finally 블록에서 해제하도록 구현합니다.
- 컴파일러에 의해 예외가 처리되는 예 (파일 에러 처리)

```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e);
			return;
		} finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		
		System.out.println("end");
	}

}
```
```console
java.io.FileNotFoundException: a.txt (지정된 파일을 찾을 수 없습니다)
finally
```

## try-with-resources문
- 리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 합니다.
- 자바 7부터 제공되는 구문입니다.
- 리소스를 try() 내부에서 선언해야만 합니다.
- close()를 명시적으로 호출하지 않아도 try{} 블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제 됩니다.
- 해당 리소스 클래스가 AutoCloseable 인터페이스를 구현해야 합니다.
- FileInputStream의 경우에는 AutCloseable을 구현하고 있습니다.
- 자바 9부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj)와 같이 사용할 수 있습니다.

### AutoCloseable 인터페이스 구현 실습
```java
public class AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}
}
```

```java
public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj) {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
		
		System.out.println("End");
		
	}
}
```

### 출력 결과
```console
리소스가 close() 되었습니다.
예외 부분입니다.
End
```

## 예외 처리 미루기
- 예외 처리는 예외가 발생하는 문장에서 try-catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두 가지가 있습니다.
- throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있습니다.

```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		// throws는 미루겠다는 의미
		// 이 Exception들은 여기서 발생할 수 있지만 여기서 핸들링 하지 않겠다는 의미
		// loadClass를 쓰는 쪽에서 핸들을 한다
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("END");
		
	}

}
```

## 하나의 try{} 블록에서 예외가 여러 개 발생하는 경우
- 여러 개의 예외가 발생하는 경우 예외를 묶어서 하나의 방법으로 처리할 수도 있고,
```java
try {
	test.loadClass("a.txt", "java.lang.String");
} catch (FileNotFoundException | ClassNotFoundException e) {
	System.out.println(e);
}
```
- 각각의 예외를 따로 처리할 수도 있습니다.

```java
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
//			또 다른 Exception이 발생할 수 있는데 그것이 무엇인지는 모를 때
//			그거에 대해 디폴트로 핸들링 하고 싶을때 default로 핸들링을 하고싶으면
//			최상위 Exception을 넣음 
//			중요한 것은 Default Exception을 맨 위에 작성하면 Error
		}
```
- Exception 클래스를 활용하여 default를 처리를 할 때 Exception 블록은 맨 마지막에 위치해야 합니다.

# 사용자 정의 예외 클래스와 그 활용
## 사용자 정의 예외 클래스 구현하기
- 자바에서 제공되는 예외 클래스외에 프로그래머가 직접 만들어야 하는 예외가 있을 수 있습니다.
- 기존 예외 클래스 중 가장 유사한 예외 클래스에서 상속 받아 사용자 정의 예외 클래스를 만듭니다.
- 기본적으로 Exception 클래스를 상속해서 만들 수 있습니다.

## 패스워드에 대한 예외 처리하기
- 패스워드를 입력할 때 다음과 같은 경우 오류처리를 합니다.

```textarea
비밀번호는 null일 수 없습니다.

비밀번호의 길이는 5이상입니다.

비밀번호는 문자로만 이루어져서는 안됩니다. (하나 이상의 숫자나 특수문자를 포함합니다.)
```

```java
public class PasswordException extends Exception {
	public PasswordException(String message) {
		super(message);
	}
}
```
```java
public class PasswordTest {
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		if (password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}
		else if (password.length() < 5) {
			throw new PasswordException("비밀번호는 5자리 이상이어야 합니다.");
		}
		else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		
		try {
			test.setPassword(password);
			System.out.println("오류없음 1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcd";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음 2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음 3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcd#1";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음 4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
```

### 출력결과
```console
비밀번호는 null일 수 없습니다.
비밀번호는 5자리 이상이어야 합니다.
비밀번호는 숫자나 특수문자를 포함해야 합니다.
오류없음 4
```

# 오류의 로그를 남기기 - java.util.logging.Logger 활용
## logging
- 시스템 운영에 대한 기록
- 오류가 발생했을 때 그 오류에 대한 기록을 남겨 디버깅을 용이하게 합니다.
- 로그 파일에 기록하는 코드를 추가하여 필요한 정보가 로그로 남을 수 있도록 합니다.
- 디버깅, 시스템 에러 추적, 성능, 문제점 향상들을 위해 사용합니다.
- 어느정도까지 로그를 남길 것인가요?
	- 너무 적은 로그 : 정확한 시스템의 상황을 파악하기 어렵습니다.
	- 너무 많은 로그 : 빈번한 I/O의 오버헤드와 로그 파일의 백업 문제 등...

## java.util.logging
- 자바에서 기본적으로 제공되는 log 패키지
- 파일이나 콘솔에 로그 내용을 출력할 수 있습니다.
- jre/lib/logging.properties 파일을 편집하여 로그의 출력방식 로그 레벨을 변경할 수 있습니다.
- logging 패키지에서 제공하는 로그 레벨은 severe, warning, info, config, fine, finer, finest 입니다.
- 오픈 소스로는 log4j를 많이 사용하고 있습니다.

### Handler
- 화면에 출력해주는 console 핸들러
- 파일 핸들러

## Logger 만들기
- 시나리오

```textarea
학생 정보 시스템에 로그를 기록하도록 합니다.

학생의 이름에 오류가 있는 경우 예외 처리를 하고 예외 상황을 로그로 남깁니다.

학생의 이름은 null이거나 중간에 space가 3개 이상인 경우 오류가 발생합니다.
```
- 구현하기

```java
Logger 인스턴스를 생성합니다.

로그를 남기기 위한 FIleHandler를 생성합니다.

FileHandler의 level을 지정하고

Logger에 생성된 addHandler()메서드로 FileHandler를 추가합니다.
```

### MyLooger.java
```java
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;
	
	private MyLogger() {
		try {
			logFile = new FileHandler(errorLog, true);
			warningFile = new FileHandler(warningLog, true);
			fineFile = new FileHandler(fineLog, true);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logFile.setFormatter(new SimpleFormatter());
		warningFile.setFormatter(new SimpleFormatter());
		fineFile.setFormatter(new SimpleFormatter());
		
		logger.setLevel(Level.ALL);
		fineFile.setLevel(Level.FINE);
		warningFile.setLevel(Level.WARNING);
		
		logger.addHandler(logFile);
		logger.addHandler(warningFile);
		logger.addHandler(fineFile);
	}
	
	public static MyLogger getLogger() {
		return instance;
	}
	
	public void log(String msg){
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
		
	}
	
	public void fine(String msg){
		logger.fine(msg);
	}
	
	public void warning(String msg){
		logger.warning(msg);
	}
}
```

### LoggerTest.java
```java
public class LoggerTest {

	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getLogger();
		
		myLogger.log("test");
	}

}
```

### 출력 결과
```console
12월 17, 2021 2:38:33 오후 ch59.MyLogger log
INFO: test
12월 17, 2021 2:38:33 오후 ch59.MyLogger log
WARNING: test
12월 17, 2021 2:38:33 오후 ch59.MyLogger log
SEVERE: test
```

### Student.java
```java
public class Student {
	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){

		if(studentName == null){
			throw new StudentNameFormatException("name must not be null");
		}
		if( studentName.split(" ").length > 3) {
			throw new StudentNameFormatException("이름이 너무 길어요");
		}
		
		this.studentName = studentName;
	}

	
	public String getStudentName() {
		
		myLogger.fine("begin getStudentName()");
		
		return studentName;
	}
}
```

### StudentNameFormatException.java
```java
public class StudentNameFormatException extends IllegalArgumentException {
	public StudentNameFormatException(String message){
		super(message);
	}
}
```

### StudentTest.java
```java
public class StudentTest {

	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getLogger();
		
		String name = null;
		try{
			Student student = new Student(name);
		} catch( StudentNameFormatException e ){
			myLogger.warning(e.getMessage());
		}
		
		try{
			Student student = new Student("Edward Jon Kim Test");
		} catch ( StudentNameFormatException e){
			myLogger.warning(e.getMessage());
		}
		
		Student student = new Student("James");
		
		String sName = student.getStudentName();
	}

}
```

### 출력결과
```console
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: name must not be null
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: 이름이 너무 길어요
```

### fine.txt
```textarea
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: name must not be null
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: 이름이 너무 길어요
12월 17, 2021 2:40:17 오후 ch59.MyLogger fine
FINE: begin getStudentName()
```

### log.txt
```textarea
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: name must not be null
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: 이름이 너무 길어요
12월 17, 2021 2:40:17 오후 ch59.MyLogger fine
FINE: begin getStudentName()
```

### warning.txt
```textarea
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: name must not be null
12월 17, 2021 2:40:17 오후 ch59.MyLogger warning
WARNING: 이름이 너무 길어요
```

- Exception 상황에서는 반드시 log를 남겨야합니다.
- 그 log를 레벨별로 잘 알 수 있도록 해야합니다.

# 자바의 입출력을 위한 I/O Stream
## 입출력 스트림
- 네트워크에서 자료의 흐름이 물의 흐름과 같다는 비유에서 유래됩니다.
- 자바는 다양한 입출력 장치에 독립적으로 일관성있는 입출력을 입출력 스트림을 통해 제공합니다.
- 입출력이 구현되는 곳: 파일 디스크, 키보드, 마우스, 네트워크, 메모리 등 모든 자료가 입력되고 출력되는 곳

## 입출력 스트림의 구분
- 대상 기준 : 입력 스트림 / 출력 스트림
	- 자료가 들어가는 길이랑 나오는 길은 따로있습니다.
	- 즉, 입출력을 같이 사용할 수 없습니다.
- 자료의 종류 : 바이트 스트림 / 문자 스트림 
	- 원래 자료는 바이트 단위입니다.
	- 문자를 워낙 많이 사용해서 문자용 스트림이 따로 있습니다. 이때 인코딩이 중요합니다.
- 기능 : 기반 스트림 / 보조 스트림

## 입력 스트림과 출력 스트림
- 입력 스트림 : 대상으로부터 자료를 읽어 들이는 스트림
- 출력 스트림 : 대상으로 자료를 출력하는 스트림

![img24](./src/img/img24.png)

- 스트림의 종류

종류 | 예시
-- | --
입력 스트림 | FileInputStream(이걸로 읽으면 한글이 깨집니다.), FileReader(문자단위로 읽고 한글처리가 잘됩니다.), BufferedInputStream, BufferedReader 등
출력 스트림 | FileOutputStream, FileWriter, BufferedOutputStream, BufferedWriter 등

## 바이트 단위 스트림과 문자 단위 스트림
- 바이트 단위 스트림 : 동영상, 음악 파일, 실행 파일 등의 자료를 읽고 쓸 때 사용합니다.
- 문자 단위 스트림 : 바이트 단위로 자료를 처리하면 문자는 깨집니다. 인코딩에 맞게 2바이트 이상으로 처리하도록 구현된 스트림입니다.

![img23](./src/img/img23.png)

- 스트림의 종류

종류 | 예시
-- | --
바이트 스트림 | FileInputStream, FileOutputStream, BufferedInputStream, BufferedOutputStream 등
문자 스트림 | FileReader, FileWriter, BufferedReader, BufferedWriter 등

## 기반 스트림과 보조 스트림
- 기반 스트림 : 대상에 직접 자료를 읽고 쓰는 기능의 스트림
- 보조 스트림 : 직접 읽고 쓰는 기능은 없이 추가적인 기능을 더해주는 스트림
- 보조 스트림은 직접 읽고 쓰는 기능은 없으므로 항상 기반 스트림이나 또 다른 보조 스트림을 생성자의 매개 변수로 포함합니다.

**기반스트림 + 보조 스트림A + 보조스트림B**

- 스트림의 종류

종류 | 예시
-- | --
기반 스트림 | FileInputStream, FileOutputStream, FileReader, FileWriter 등
보조 스트림 | InputStreamReader(읽은 거를 문자로 변환해주는 Stream), OutputStreamWriter, BufferedInputStream, BufferedOutputStream 등

# 표준 입출력 스트림
## System 클래스의 표준 입출력 멤버
```java
public class System {
	public static PrintStream out;
	public static InputStream in;
	public static PrintStream err;
}
```

### System.out
표준 출력(모니터) 스트림 <br />
System.out.println("출력 메세지");

### System.in
표준 입력(키보드) 스트림 <br />
int d = System.in.read(); // 한 바이트 읽기

### System.err
표준 에러 출력(모니터) 스트림 <br />
System.err.println("에러 메세지");

```java
import java.io.IOException;

public class SystemInTest11 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			while((i = System.in.read()) != '\n') {
//				System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
```
### 출력결과
```console
알파벳 여러 개를 쓰고 [Enter]를 누르세요
ansjdnasld
ansjdnasld
```

- 위의 코드는 한글은 깨집니다.
- 아래와 같이 수정해줍니다.

```java
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {
//				System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
```

### 출력결과
```console
알파벳 여러 개를 쓰고 [Enter]를 누르세요
안녕하세요
안녕하세요
```

# 바이트 단위 입출력 스트림
## InputStream
- 바이트 단위 입력 스트림 최상위 추상 클래스
- 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현합니다.
- 주요 하위 클래스

스트림 클래스 | 설명
-- | --
FileInputStream | 파일에서 바이트 단위로 자료를 읽습니다.
ByteArrayInputStream | byte 배열 메모리에서 바이트 단위로 자료를 읽습니다.
FIlterInputStream | 기반 스트림에서 자료를 읽을 때 추가 기능을 제공하는 보조 스트림의 상위 클래스

- 주요 메서드

메서드 | 설명
-- | --
int read() | 입력 스트림으로부터 한 바이트의 자료를 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
int read(byt b[]) | 입력 스트림으로부터 b[] 크기의 자료를 b[]에 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
int read(byte b[], int off, int len) | 입력 스트림으로부터 b[]의 off변수 위치부터 저장하며 len 만큼 읽습니다. 읽은 자료의 바이트 수를 반환합니다.
void close() | 입력 스트림과 연결된 대상 리소스를 닫습니다. (표준 입출력은 close를 하지 않습니다.)

AutoClose

## FileInputStream 예제
- 파일에서 한 바이트 씩 자료 읽기
```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch(Exception e2) { // null인데 close를 할 경우 문제가 되기 때문에 Exception을 하나 걸어둔다
				System.out.println(e2);
			}
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e2) { // null인데 close를 할 경우 문제가 되기 때문에 Exception을 하나 걸어둔다
				System.out.println(e2);
			}
		}
		
		System.out.println("END");
	}
}
```
### input.txt
```textarea
ABC
```

### 출력 결과
```console
A
B
C
END
```

- 파일의 끝까지 한 바이트씩 자료 읽기
```java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input.txt")) { // AutoClose가 됨.
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
```

- 파일에서 바이트 배열로 자료 읽기

```java
import java.io.FileInputStream;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		int i;
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			
			while((i = fis.read(bs, 1, 9)) != -1) {
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "byte를 읽음");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
```

### input2.txt
```textarea
ABCDEFGHIJKLMNOPQRSTUVWXYZ
```

### 출력 결과
```console
 ABCDEFGH : 9byte를 읽음
 JKLMNOPQ : 9byte를 읽음
 STUVWXY : 8byte를 읽음
```

# OutputStream
- 바이트 단위 출력 스트림 최상위 추상 클래스
- 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현합니다.
- 주요 하위 클래스

스트림 클래스 | 설명
-- | --
FileOutputStream | 파일에서 바이트 단위로 자료를 씁니다.
ByteArrayOutputStream | byte 배열 메모리에서 바이트 단위로 자료를 씁니다.
FilterOutputStream | 기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스

- 주요메서드

메서드 | 설명
-- | --
int write() | 한 바이트를 출력합니다.
int write(byte b[]) | b[] 크기의 자료를 출력합니다.
int write(byte b[], int off, int len) | b[] 배열에 있는 자료의 off 위치부터 len 개수만큼 자료를 출력합니다.
void flush() | 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력합니다.
void close() | 출력 스트림과 연결된 대상 리소를 닫습니다. 출력 버퍼가 비워집니다.

## FileOutputStream 예제
- 파일에 한 바이트씩 쓰기

```java
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")) { // 해당 파일이 없으면 만들어 준다.
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
```
### output.txt
```textarea
ABC
```
### 출력 결과
```console
end
```

- byte[] 배열에 A-Z까지 넣고 배열을 한꺼번에 파일에 쓰기
```java
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
				
		try(fos) { // 해당 파일이 없으면 만들어 준다.
			byte[] bs = new byte[26];
			
			byte data = 65;
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 10); // 배열의 2번째 위치부터 10개 바이트 출력하기
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}

}
```
### output2.txt
```textarea
CDEFGHIJKL
```
### 출력 결과
```console
end
```

## flush()와 close() 메서드
- 출력 버퍼를 비울때 flush() 메서드 사용합니다.
- close() 메서드 내부에서 flush()가 호출되므로 close()메서드가 호출되면 출력 버퍼가 비워집니다.

# 문자 단위 입출력 스트림
## Reader
- 문자 단위 입력 스트림 최상위 추상 클래스
- 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현합니다.
- 주요 하위 클래스

클래스 | 설명
-- | --
FileReader | 파일에서 문자 단위로 읽는 스트림 클래스입니다.
InputStreamReader | 바이트 단위로 읽은 자료를 문자로 변환해주는 보조 스트림 클래스입니다.
BufferedReader | 문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공하는 보조 스트림입니다.

- 주요메서드

메서드 | 설명
-- | --
int read() | 파일로부터 한 문자를 읽습니다. 읽은 문자를 반환합니다.
int read(char[] buf) | 파일로부터 buf 배열에 문자를 읽습니다.
int read(char[] buf, int off, int len) | 파일로부터 buf 배열의 off 위치로부터 len 개수만큼의 문자를 읽습니다.
void close() | 입력 스트림과 연결된 대상 리소스를 닫습니다.

## FileReader
- 파일에서 문자 읽기

### reader.txt
```textarea
안녕하세요
```

```java
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("reader.txt")) {
			int i;
			
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			
		}
	}

}
```

**이렇게 하면 한글이 다 깨집니다.**<br /><br /><br />

```java
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")) {
			int i;
			
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			
		}
	}

}
```

**이렇게 FileReader로 바꿔주면 한글이 깨지지 않습니다.**<br /><br /><br />

## Writer
- 문자 단위 출력 스트림 최상위 추상 클래스
- 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현합니다.
- 주요 하위 클래스

클래스 | 설명
-- | --
FileWriter | 파일에서 문자 단위로 출력하는 스트림 클래스입니다.
OutputStreamWriter | 바이트 단위의 자료를 문자로 변환해 출력해주는 보조 스트림 클래스입니다.
BufferedWriter | 문자로 쓸 때 배열을 제공하여 한꺼번에 쓸 수 있는 기능을 제공하는 보조 스트림입니다.

- 주요 메서드

메서드 | 설명
-- | --
int write(int c) | 한 문자를 파일에 출력합니다.
int write(char[] buf) | 문자 배열 buf의 내용을 출력합니다.
int write(char[] buf, int off, int len) | 문자 배열 buf의 off위치에서부터 len 개수의 문자를 출력합니다.
int write(String str) | 문자열 str을 출력합니다.
int write(String str, int off, int len) | 문자열 str의 off번째 문자로부터 len 개수만큼 출력합니다.
int flush() | 출력하기 전에 자료가 있는 공간(출력 버퍼)을 비워 출력하도록 합니다.
void close() | 스트림과 연결된 리소스를 닫습니다. 출력 버퍼도 비워집니다.

## FileWriter
- 파일에 문자 쓰기

### writer.txt
```text
ABCDEFG안녕하세요. 잘 써지네요CD65
```

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');    // 문자 하나 출력
			char buf[] = {'B','C','D','E','F','G'};
			
			fw.write(buf); //문자 배열 출력
			fw.write("안녕하세요. 잘 써지네요"); //String 출력
			fw.write(buf, 1, 2); //문자 배열의 일부 출력
			fw.write("65");  //숫자를 그대로 출력
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다.");
	}
}
```

# 여러가지 보조 스트림 클래스들
## 보조 스트림
- 실제 읽고 쓰는 스트림이 아닌 보조 기능을 제공하는 스트림
- FilterInputStream과 FilterOutputStream이 보조 스트림의 상위 클래스들 (FilterInputStream과 FilterOutputStream은 추상 클래스)
- 혼자 돌아갈 수 없기 때문에 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가집니다.
- Decorator Pattern으로 구현됩니다.
- 상위 클래스 생성자

생성자 | 설명
-- | --
protected FilterInputStream과 (InputStream in) | 생성자의 매개변수로 InputStream을 받습니다.
public FilterOutputStream(OutputStream out) | 생성자의 매개변수로 OutputStream을 받습니다.

**바이트 단위 파일 입력 스트림(기반 스트림) + 문자로 변환 기능 추가(보조 스트림) + 버퍼링 기능 추가(보조 스트림)**

## InputStreamReader와 OutputStreamWriter
- 바이트 단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조스트림
- FileInputStream으로 읽은 자료를 문자로 변환해주는 예

```java
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			
			while ((i = isr.read()) != -1) {
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
```

## BufferedInputStream과 BufferedOutputStream
- 약 8k의 배열이 제공되어 입출력이 빠르게 하는 기능이 제공되는 보조 스트림
- BufferedReader와 BufferedWriter는 문자용 입출력 보조 스트림
- BufferedInputStream과 BufferedOutputStream을 이용하여 파일 복사하는 예
```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){
		
			millisecond = System.currentTimeMillis();
			
			int i;
			while( ( i = fis.read()) != -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사 하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}
}
```

```java
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millsecond = 0;
		
//		FileInputStream, FileOutputStream으로 하면 한 바이트씩 읽으니깐 굉장히 오래 걸림
//		그래서 BufferedInputStream, BufferedOutputStream으로 묶어 준다
//		134803 소요 -> 379 소요로 많이 줄어듬
		
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			
			millsecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millsecond = System.currentTimeMillis() - millsecond;
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millsecond + " 소요되었습니다.");
		
		Socket socket = new Socket();
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// inputStream이든 ouputStream이든 byte단위로만 처리되기때문에 영어로만 작성해야함.
		// 그래서 InputStreamReader로 감싸줌. 그럼 한글도 가능
		// 근데 속도가 느리기때문에 속도를 향상시키기 위해 BufferedReader로 감싸준다
	}

}
```

## DataInputStream과 DataOutputStream
- 자료가 메모리에 저장된 상태 그대로 읽거나 쓰는 스트림
- DataInputStream 메서드

메서드 | 설명
-- | --
byte readByte() | 1바이트를 읽어 반환합니다.
boolean readBoolean() | 읽은 자료가 0이 아니면 true, 0이면 false를 반환합니다.
char readChar() | 한 문자를 읽어 반환합니다.
short readShort() | 2바이트를 읽어 정수 값을 반환합니다.
int readInt() | 4바이트를 읽어 정수 값을 반환합니다.
long readLong() | 8바이트를 읽어 정수 값을 반환합니다.
float readFloat() | 4바이트를 읽어 실수 값을 반환합니다.
double readDouble() | 8바이트를 읽어 실수 값을 반환합니다.
String readUTF() | 수정된 UTF-8 인코딩 기반으로 문자열을 읽어 반환합니다.

- DataOutputStream 메서드

메서드 | 설명
-- | --
void writeByte(int v) | 1바이트의 자료를 출력합니다.
void writeBoolean(boolean v) | 1바이트 값을 출력합니다.
void writeChar(int v) | 2바이트를 출력합니다.
void writeShort(int v) | 2바이트를 출력합니다.
void writeInt(int v) | 4바이트를 출력합니다.
void writeLong(long v) | 8바이트를 출력합니다.
void writeFloat(float v) | 4바이트를 출력합니다.
void writeDouble(double v) | 8바이트를 출력합니다.
void writeUTF(String v) | 수정된 UTF-8 인코딩 기반으로 문자열을 출력합니다.


```java
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {


		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch(IOException e) {
			e.printStackTrace();
		}

		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {

			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
```
### 출력 결과
```console
100
A
10
3.14
Test
```

# 직렬화(Serialization)
## 직렬화란?
- 인스턴스의 상태를 그대로 파일에 저장하거나 네트워크로 전송하고(직렬화) 이를 다시 복원(Deserializtion)하는 방식입니다.
- 자바에서는 보조 스트림을 활용하여 제공합니다.
- ObjectInputStream과 ObjectOutputStream

생성자 | 설명
-- | --
ObjectInputStream(InputStream in) | InputStream을 생성자의 매개변수로 받아 ObjectInputStream을 생성합니다.
ObjectOutputStream(OutputStream out) | OutputStream을 생성자의 매개변수로 받아 ObjectOutputStream을 생성합니다.


## Serializable 인터페이스
- 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 합니다.
- 구현 코드가 없는 market interface
- transient : 직렬화 하지 않으려는 멤버 변수에 사용합니다. (Socket등 직렬화 할 수 없는 객체)

```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable { // Serializable는 구현코드 x. 이 객체가 직렬화 가능하다라는 것을 명시. 마크 인터페이스라고도 함.
	String name;
	transient String job;
//	직렬화가 안되는 멤버를 가지고 있을 경우 해당 멤버 앞에 transient를 작성
//	그럴 경우 복원할 때 넣어 주는 값은 디폴트 값이다

	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "대장");
		Person personLim = new Person("Lim", "왕");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// writeObject를 할 때 Serializable 인터페이스가 명시되어 있지 않으면 error가 생기기 때문에 꼭 Serializable를 명시해줘야 한다
			oos.writeObject(personLee);
			oos.writeObject(personLim);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)) {
			Person pLee = (Person)ois.readObject();
			Person pLim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pLim);
		} catch(IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
```

### 출력 결과
```console
이순신, 대장
Lim, 왕
```

### 출력 결과 (transient를 작성했을 때)
```console
이순신, null
Lim, null
```

## Externalizable 인터페이스
- writerExternal()과 readExternal()메서드를 구현해야 합니다.
- 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현할 수 있습니다.

```java
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Person implements Externalizable { // Serializable는 구현코드 x. 이 객체가 직렬화 가능하다라는 것을 명시. 마크 인터페이스라고도 함.
	String name;
	String job;
//	transient String job;
//	직렬화가 안되는 멤버를 가지고 있을 경우 해당 멤버 앞에 transient를 작성
//	그럴 경우 복원할 때 넣어 주는 값은 디폴트 값이다
	
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;
	}

	
	// 직렬화를 어떻게 할 것인지 직접 구현
	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		obj.writeUTF(name);
		obj.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		name = obj.readUTF();
		job = obj.readUTF();
		
	}
	
}

public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("이순신", "대장");
		Person personLim = new Person("Lim", "왕");
		
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// writeObject를 할 때 Serializable 인터페이스가 명시되어 있지 않으면 error가 생기기 때문에 꼭 Serializable를 명시해줘야 한다
			oos.writeObject(personLee);
			oos.writeObject(personLim);
		} catch(IOException e) {
			System.out.println(e);
		}
		
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)) {
			Person pLee = (Person)ois.readObject();
			Person pLim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pLim);
		} catch(IOException e) {
			System.out.println(e);
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
```

### 출력 결과
```console
이순신, 대장
Lim, 왕
```

# 그 외 여러가지 입출력 클래스들
## File 클래스
- 파일 개념을 추상화한 클래스
- 입출력 기능은 없고, 파일의 이름, 경로, 읽기 전용 등의 속성을 알 수 있습니다.
- 이를 지원하는 여러 메서드들이 제공됩니다.

```java
import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\hi5k1\\Desktop\\Seong-Jun\\Java-Study\\JavaStudy\\newFile.txt"); // 파일은 없어도 디렉토리 경로는 있어야함.
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
	}
}
```

## RandomAccessFile 클래스
- 입출력 클래스 중 유일하게 파일에 대한 입력과 출력을 동시에 할 수 있는 클래스
- 파일 포인터가 있어서 읽고 쓰는 위치의 이동이 가능합니다.
- 다양한 메서드가 제공됩니다.
- 중간중간 어느 부분으로 이동을 해서 읽거나 쓰는 용도로 사용합니다.

```java
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos: " + rf.getFilePointer());
		rf.writeUTF("안녕하세요"); // 한 글자당 3byte 즉, 3*5 = 15 마지막에 null이 있다 null이 2byte 그래서 17이다. 12 + 17은 29
		System.out.println("pos: " + rf.getFilePointer());
		
		rf.seek(0);
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
```

# 데코레이터 패턴을 활용한 커피 머신 프로그램
## Decorator Pattern
- 자바의 입출력 스트림은 decorator pattern입니다.
- 여러 decorator들을 활용하여 다양한 기능을 제공합니다.
- 상속보다 유연한 구현 방식입니다.
- 데코레이터는 다른 데코레이터나 또는 컴포넌트를 포함해야합니다.
- 지속적인 기능의 추가와 제거가 용이합니다.
- decorator와 component는 동일한 것이 아닙니다. (기반 스트림 클래스가 직접 읽고 쓸 수 있습니다. 보조 스트림은 추가적인 기능을 제공합니다.)

![img25](./src/img/img25.png)

```textarea
Decorator Pattern을 활용하여 커피 만들기

아메리카노

카페라떼 = 아메리카노 + 우유

모카커피 = 아메리카노 + 우유 + 모카시럽

크림 올라간 모카커피 = 아메리카노 + 우유 + 모카시럽 + whipping cream

커피 = 컴포넌트

우유, 모카시럽, whipping cream = decorator
```

## 예제
### Coffee.java
```java
public abstract class Coffee {
	public abstract void brewing();
}
```

### EtiopiaAmericano.java
```java
public class EtiopiaAmericano extends Coffee {

	@Override
	public void brewing() {
		System.out.print("EtiopiaAmericano");
	}

}
```

### Decorator.java
```java
public abstract class Decorator extends Coffee {
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}

}
```

### Latte.java
```java
public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		// 상위 클래스에서 Default constructor가 없으면
		// 하위 클래스는 반드시 매개변수가 있는 constructor가 super를 명시적으로 호출해야함. 
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print(" Adding Milk");
	}
}
```

### Mocha.java
```java
public class Mocha extends Decorator {

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Mocha syrup");
	}

}
```

### KeyaAmericano.java
```java
public class KeyaAmericano extends Coffee {

	@Override
	public void brewing() {
		System.out.print("Keya Americano");
	}

}
```

### WhippingCream.java
```java
public class WhippingCream extends Decorator {

	public WhippingCream(Coffee coffee) {
		super(coffee);
	}

	public void brewing() {
		super.brewing();
		System.out.print(" Adding Whipping Cream");
	}
}
```

### CoffeeTest.java
```java
public class CoffeeTest {

	public static void main(String[] args) {
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		etiopiaCoffee.brewing();
		
		System.out.println();
		
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		
		System.out.println();
		
		Coffee mochaEtiopia = new Mocha(new Latte(new EtiopiaAmericano()));
		mochaEtiopia.brewing();
		
		System.out.println();
		
		Coffee keyaCoffee = new WhippingCream(new Mocha(new Latte(new KeyaAmericano())));
		keyaCoffee.brewing();
	}

}
```

### 출력 결과
```console
EtiopiaAmericano
EtiopiaAmericano Adding Milk
EtiopiaAmericano Adding Milk Adding Mocha syrup
Keya Americano Adding Milk Adding Mocha syrup Adding Whipping Cream
```

# 자바에서 Thread 만들기
## Thread란?
- process : 실행 중인 프로그램이 실행되면 OS로 부터 메모리를 할당받아 프로세스 상태가 됩니다.
- thread : 하나의 프로세스는 하나 이상의 thread를 가지게 되고, 실제 작업을 수행하는 단위는 thread입니다.

## multi-threading
- 여러 thread가 동시에 수행되는 프로그래밍, 여러 작업이 동시에 실행되는 효과
- thread는 각각 자신만의 작업 공간을 가집니다. (context)
- 각 thread 사이에서 공유하는 자원이 있을 수 있습니다. (자바에서는 static instance)
- 여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 race condition이 발생할 수 있습니다.
- 이렇게 여러 thread가 공유하는 자원 중 경쟁이 발생하는 부분을 crtical section 이라고 합니다.
- critical section에 대한 동기화(일종의 순차적 수행)를 구현하지 않으면 오류가 발생할 수 있습니다.


## Thread 만들기
```java
class MyThread extends Thread {
	public void run() {
		int i;
		
		for(i = 1; i <= 200; i++) {
			System.out.print(i + " ");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
//		총 3개의 스레드가 돌아감.
//		main, th1, th2
//		main Thread는 Thread 2개 생성하고 start하고 end
		
		
	}

}
```

### 출력 결과
```console
Thread[main,5,main]start
Thread[main,5,main]end
1 2 3 4 5 6 7 8 1 9 2 10 3 11 4 12 5 13 6 14 7 15 8 16 9 17 10 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 11 39 40 41 12 42 13 43 14 44 15 45 16 17 18 19 20 21 22 23 24 46 25 47 26 48 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 110 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 111 112 113 114 115 116 117 118 119 120 121 122 123 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 200 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 200
```

### 이미 다른 것을 extends 했을 경우(Runnable 인터페이스 구현하여 만들기)
- 자바는 다중 상속이 허용되지 않으므로 이미 다른 클래스를 상속한 경우 thread를 만들기 위해 Runnable interface를 구현해서 만듭니다.
```java
class MyThread implements Runnable {

	@Override
	public void run() {
		int i;
		
		for(i = 1; i <= 200; i++) {
			System.out.print(i + " ");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
	}

}
```

### 또 다른 방법
```java
class MyThread implements Runnable {

	@Override
	public void run() {
		int i;
		
		for(i = 1; i <= 200; i++) {
			System.out.print(i + " ");
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "start");
		
		MyThread runnable = new MyThread();
		
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
		// 간단하게 돌리는 방법
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
		
	}

}
```

### 출력 결과
```console
Thread[main,5,main]start
Thread[main,5,main]end
1 2 3 4 5 6 7 8 9 10 11 12 13 14 run
15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 200 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 200
```

![img26](./src/img/img26.png)

# Thread 클래스의 여러 메서드들
## Thread 우선순위
- Thread.MIN_PRIORITY(=1) ~ Thread.MAX_PRIORITY(=10)
- 디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)
- 우선순위가 높은 Thread가 CPU의 배분을 받을 확률이 높습니다.(확률이 높은거지 반드시 먼저 수행되는 것은 아닙니다.)
- setPriority()/getPriority()
- Thread 우선순위 예제

```java
class PriorityThread extends Thread{
	
	public void run(){
	
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println( t + "start");
		
		for(int i =0; i<=1000000; i++){
			
			sum += i;
		}
		
		System.out.println( t.getPriority() + "end");
	}
}


public class PriorityTest {

	public static void main(String[] args) {

		int i;
		for(i=Thread.MIN_PRIORITY; i<= Thread.MAX_PRIORITY; i++){
			
			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();
		
		}
	}

}
```

### 출력 결과(결과는 계속 다릅니다.)
```console
Thread[Thread-1,2,main]start
Thread[Thread-2,3,main]start
Thread[Thread-3,4,main]start
Thread[Thread-4,5,main]start
Thread[Thread-5,6,main]start
Thread[Thread-9,10,main]start
Thread[Thread-8,9,main]start
Thread[Thread-7,8,main]start
Thread[Thread-6,7,main]start
10end
9end
8end
7end
5end
6end
4end
2end
3end
Thread[Thread-0,1,main]start
1end
```

```java
class PriorityThread extends Thread{
	
	public void run(){
	
		int sum = 0;
		
		Thread t = Thread.currentThread();
		System.out.println( t + "start");
		
		for(int i =0; i<=1000000; i++){
			
			sum += i;
		}
		
		System.out.println( t.getPriority() + "end");
	}
}


public class PriorityTest {

	public static void main(String[] args) {

		PriorityThread pt1 = new PriorityThread();
		PriorityThread pt2 = new PriorityThread();
		PriorityThread pt3 = new PriorityThread();
		
		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}

}
```

### 출력 결과
```console
Thread[Thread-2,10,main]start
Thread[Thread-1,5,main]start
10end
5end
Thread[Thread-0,1,main]start
1end
```

## join()
- 동시에 두 개 이상의 Thread가 실행될 때 다른 Thread의 결과를 참조하여 실행해야 하는 경우 join() 함수를 사용합니다.
- join() 함수를 호출한 Thread가 not-runnable 상태로 갑니다.
- 다른 Thread의 수행이 끝나면 runnable 상태로 돌아옵니다.

[!img27](./src/img/img27.png)

- 1부터 50, 51부터 100까지의 합을 구하는 두 개의 Thread를 만들어 그 결과를 확인

```java
public class JoinTest extends Thread {

	int start;
	int end;
	int total;
	// 특별히 초기화하지 않아도 기본값 0으로 초기화됨. 이유는 멤버 변수이기 때문이다. 지역변수일 경우에는 반드시 초기화 해야함.
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start; i <= end; i++) {
			total += i;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + "start");
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lastTotal = jt1.total + jt2.total;
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		System.out.println("lastTotal = " + lastTotal);

		System.out.println(Thread.currentThread() + "end");
//		main, jt1, jt2 3개의 Thread가 돌아가는 상태.
//		main은 jt1, jt2 Thread를 생성하고 start함.
//		lastTotal을 확인을 할때에는 jt1, jt2가 끝나지 않은 상태.
//		즉, lastTotal에 두개의 total값을 더하는 명령을 수행할때 더한 값을 출력.
//		이 값은 출력할때마다 바뀔 수 있음.
//		main이 필요한 것은 jt1, jt2의 결과다.
//		그래서 main이 도는 동안 join을 건다.
//		join을 걸면 main은 수행을 하지않는다. join걸고 끝날때까지 not runnable상태로 빠지기때문에 기다린다.
	}

}
```

## interrupt()
- 다른 Thread에 예외를 발생시키는 interrupt를 보냅니다.
- Thread가 join(), sleep(), wait() 함수에 의해 not-runnable 상태일 때 interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있습니다.

## Thread 종료하기
- Thread를 종료할 때 사용합니다.
- 무한 반복의 경우 while(flag)의 flag 변수 값을 false로 바꾸어 종료를 시킵니다.
- Thread 종료하기 예제

```textarea
새 개의 thread를 만듭니다.
각각 무한 루프를 수행하게 합니다.
작업 내용 this.sleep(100);

'A'를 입력 받으면 첫 번째 thread를
'B'를 입력 받으면 두 번째 thread를
'C'를 입력 받으면 세 번째 thread를
'M'을 입력 받으면 모든 thread와 main() 함수를 종료합니다.
```

```java
import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;
	int i;
	
	public TerminateThread(String name){
		super(name);
	}
	
	public void run(){
		
		
		while(!flag){
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println( getName() + " end" );
		
	}
	
	public void setFlag(boolean flag){
		this.flag = flag;
	}
	
	
	public static void main(String[] args) throws IOException {

		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if ( in == 'A'){
				threadA.setFlag(true);
			} else if(in == 'B'){
				threadB.setFlag(true);
			} else if( in == 'C'){
				threadC.setFlag(true);
			} else if( in == 'M'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			} else{
				System.out.println("type again");
			}
		}
		
		System.out.println("main end");
		
	}

}
```

# 멀티 Thread 프로그래밍에서의 동기화
## critical section과 semaphore
- critical section 두 개 이상의 thread가 동시에 접근하는 경우 문제가 생길 수 있기 때문에 동시에 접근할 수 없는 영역입니다.
- semaphore는 특별한 형태의 시스템 객체이며 get/release 두 개의 기능이 있습니다.
- 한 순간 오직 하나의 thread만이 semaphore를 얻을 수 있고, 나머지 thread들은 대기(blocking) 상태가 됩니다.
- semaphore를 얻은 thread만이 critical section에 들어갈 수 있습니다.

[!img28](./src/img/img28.png)

- Park과 ParkWife가 동시에 Bank 자원에 접근하여 작업이 이루어지는 경우의 예제
- shared resource는 money지만 자바에서는 객체로 봅니다. 그래서 bank가 shared resource가 됩니다.
- save money, minus money가 임계영역에 들어가는 critical section입니다.
```java
class Bank {
	private int money = 10000;
	
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m - minus);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

class Park extends Thread {
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("save3000 : " + SyncMain.myBank.getMoney());
	}
}

class ParkWife extends Thread {
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minus1000 : " + SyncMain.myBank.getMoney());
	}
}

public class SyncMain {
	
	public static Bank myBank = new Bank();
	public static void main(String[] args) {
		Park p = new Park();
		p.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ParkWife pw = new ParkWife();
		pw.start();
	}

}
```

### 출력 결과
```console
start save
start minus
save3000 : 13000
minus1000 : 12000
```

## 동기화(synchronization)
- 두 개의 thread가 같은 객체에 접근 할 경우, 동시에 접근 함으로써 오류가 발생합니다.
- 동기화는 임계영역에 접근한 경우 공유자원을 lock하여 다른 thread의 접근을 제어합니다.
- 동기화를 잘못구현하면 deadlock에 빠질 수 있습니다.

## 자바에서는 synchronized 메서드나 synchronized 블럭을 사용합니다.
### synchronized 블럭
- 현재 객체 또는 다른 객체를 lock으로 만듭니다.

```java
synchronized(참조형 수식) {
	수행문;
}
```

### synchronized 메서드
- 객체의 메서드에 synchronized 키워드를 사용합니다.
- 현재 이 메서드가 속해 있는 객체에 lock을 겁니다.
- 자바에서는 deadlock을 방지하는 기술이 제공되지 않으므로 되도록이면 synchronized 메서드에서 다른 synchronized 메서드는 호출하지 않도록 합니다.
- deadlock 예

[!img29](./scr/img/img29.png)


# wait() / notify() 메서드를 활용한 동기화 프로그래밍
- 리소스가 어떤 조건에서 더 이상 유효하지 않은 경우 리소스를 기다리기 위해 Thread가 wait()상태가 됩니다.
- wait() 상태가 된 Thread는 notify()가 호출 될 때까지 기다립니다.
- 유효한 자원이 생기면 notify()가 호출되고 wait()하고 있는 Thread 중 무작위로 하나의 Thread를 재시작하도록 합니다.
- notifyAll()이 호출되는 경우 wait()하고 있는 모든 Thread가 재시작 됩니다.
- 이 경우 유효한 리소스만큼의 Thread만이 수행될 수 있고 자원을 갖지 못한 Thread의 경우는 다시 wait() 상태로 만듭니다.
- 자바에서는 notifyAll() 메서드의 사용을 권장합니다.
- 도서관에서 책을 빌리는 예제

## notify()를 사용하는 경우
```java
import java.util.ArrayList;

class FastLibrary {
	public ArrayList<String> shelf = new ArrayList<>();
	
	public FastLibrary() {
		shelf.add("book1");
		shelf.add("book2");
		shelf.add("book3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
		while(shelf.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait(); // throws해도 되는 이유는 사용하는 곳에서 InterruptedException을 핸들링하고 있기 때문이다.
			System.out.println(t.getName() + " waiting end");
		}
		
		if(shelf.size() > 0) {
			String book = shelf.remove(0);
			System.out.println(t.getName() + ":" + book + " lend.");
			return book;
		}
		else return null;
	}
	
	public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		
		shelf.add(book);
//		notify();
		notifyAll(); // 권장
		System.out.println(t.getName() + ":" + book + " return.");
	}
}

class Student extends Thread {
	
	public Student(String name) {
		super(name);
	}
	public void run() {
		try {
			String title = LibraryMain.library.lendBook();
			
			if(title == null) {
				System.out.println(getName() + "빌리지 못했습니다.");
				return;
			}
			sleep(5000);
			LibraryMain.library.returnBook(title);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
}

public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		Student std1 = new Student("std1 ");
		Student std2 = new Student("std2 ");
		Student std3 = new Student("std3 ");
		Student std4 = new Student("std4 ");
		Student std5 = new Student("std5 ");
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
	}

}
```















