### Java 변수와 자료형
##### :laughing: 변수 (Variable)
- 데이터를 저장하는 메모리 공간에 붙여준 이름
- 표기법
  - 카멜 표기법 ex) myName, iPhone, powerPoint
  - 파스칼 표기법 ex) MyName, IPhone, PowerPoint
  
```java
// 1. 변수 사용하기
System.out.println("== 변수 사용하기 ==");
int age = 10;
System.out.println(age);
String country = "Korea";
System.out.println(country);

// 2. 변수 이름 규칙
System.out.println("== 변수 이름 규칙 ==");
// 2-1. 문자, 숫자, _(underscore), $ 사용 가능
int apple = 2000;
int apple3 = 2000;
int _apple = 2000;
int $apple = 2000;
System.out.println($apple);
System.out.println("$apple = " + $apple);
// 2-2. 숫자로 시작 x
// int 3apple = 2000;
// 2-3. 대소문자 구분
int apple5 = 1000;
int Apple5 = 2000;

// 2-4. 공백 사용 x
int one_apple = 1000;
int oneApple = 1000;

// 2-5. 예약어 사용 x
// 예약어 예시: true, false, if, switch, for, continue, break, ...
// int true = 1;

// 참고) 한글 사용 가능
int 사과 = 1000;
System.out.println("사과 = " + 사과);


// 3. 표기법
// 3-1. 카멜 표기법 (camelCase)
// 변수, 함수
int myAge = 10;
int oneApplePrice = 1000;

// 3-2. 파스칼 표기법 (PascalCase)
// 클래스
int MyAge = 10;
int OneApplePrice = 1000;

// 참고) 스네이크 표기법 (snake_case)
// 사용 x
int my_age = 10;
int one_apple_price = 1000;
```

##### :laughing: 자료형 (Data Type)
- 변수의 종류, 단위
  - 숫자, 부울, 문자, 문자열
- 변수의 종류에 따라 담을 수 있는 데이터의 타입과 크기가 다름
- 자료형 - 숫자 (Number)
  - 숫자 형태의 자료형
    - 정수 / 실수 / 2진수, 8진수, 16진수
    - 정수: int, long
    - 실수: float, double
- 자료형 - 부울 (Boolean)
  - 참과 거짓을 나타내는 자료형
- 자료형 - 문자 (Character)
  - 한 개의 문자 표현에 사용하는 자료형
