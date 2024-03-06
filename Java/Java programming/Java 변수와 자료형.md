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

```java
// 1. 자료형 - 숫자
System.out.println("== 숫자 ==");
// 1-1. 정수
int intNum = 10;
System.out.println("intNum = " + intNum);

System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);

int intNum2 = Integer.MAX_VALUE;
System.out.println("intNum2 = " + intNum2);
int intNum3 = Integer.MAX_VALUE + 1;
System.out.println("intNum3 = " + intNum3);
long longNum = (long)Integer.MAX_VALUE + 1;
System.out.println("longNum = " + longNum);

// 1-2. 실수
float floatNum = 1.23f;
double doubleNum = 1.23;
System.out.println(Float.MAX_VALUE);
System.out.println(Double.MAX_VALUE);

// 1-3. 2진수 / 8진수 / 16진수
int numBase2 = 0b1100;
System.out.println("numBase2 = " + numBase2);
int numBase8 = 014;
System.out.println("numBase8 = " + numBase8);
int numBase16 = 0xC;
System.out.println("numBase16 = " + numBase16 );

System.out.println("0b" + Integer.toBinaryString(numBase2));
System.out.println("0" + Integer.toOctalString(numBase8));
System.out.println("0x" + Integer.toHexString(numBase16));

// 2. 자료형 - 부울
System.out.println("== 부울 ==");
boolean isPass = true;
boolean isOk = false;

System.out.println("isPass = " + isPass);
System.out.println("isOk = " + isOk);

// 3. 자료형 - 문자
System.out.println("== 문자 ==");
char keyFirst = 'a';
char keyLast = 'z';

System.out.println("keyFirst = " + keyFirst);
System.out.println("keyLast = " + keyLast);
System.out.println((int)keyFirst);
System.out.println((int)keyLast);
```

- 자료형 - 문자열 (String)
  - 문자들로 이루어진 집합
  - 문자열 메소드
    - equals, indexOf, replace, substring, toUpperCase
- 자료형 - StringBuffer
  - 문자열을 자주 추가하거나 변경할 때 사용하는 자료형
  ```java
  StringBuffer sb1 = new Stringbuffer("Hello World!");
  ```
  - StringBuffer 메소드
    - append, insert, substring
- 자료형 - 배열 (Array)
  - 많은 수의 데이터를 담을 수 있는 자료형
  ```java
  int[] myArray1 = {1, 2, 3, 4, 5};
  char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
  ```

```java
// 1. 자료형 - 문자열
System.out.println("== 문자열 ==");
String s1 = "Hello World!";
System.out.println("s1 = " + s1);
String s2 = "01234";
System.out.println("s2 = " + s2);

// 1-1. equals
String s3 = "Hi";
String s4 = "Hi"; // s3와 s4는 동일한 객체
System.out.println(s3.equals(s4));
System.out.println(s3 == s4);
String s5 = new String("Hi"); // 새로운 메모리(객체) 생성
System.out.println(s3.equals(s5)); // 값 비교 연산자
System.out.println(s3 == s5); // 객체 비교 연산자

// 1-2. indexOf
String s6 = "Hello! World!";
System.out.println(s6.indexOf("!"));
System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));

// 1-3. replace
String s7 = s6.replace("Hello", "Bye");
System.out.println("s7 = " + s7);

// 1-4. substring
System.out.println(s7.substring(0, 3));
System.out.println(s7.substring(0, s7.indexOf("!") + 1));

// 1-5. toUpperCase
System.out.println(s7.toUpperCase());

// 2. 자료형 - StringBuffer
System.out.println("== StringBuffer ==");
StringBuffer sb1 = new StringBuffer();
sb1.append("01234");
System.out.println("sb1 = " + sb1);
sb1.append("56789");
System.out.println("sb1 = " + sb1);

String a = "01234"; // 데이터가 변경될 때마다 새로운 객체 생성됨 (StringBuffer와의 차이점)
String b = "56789";
String bak = a;
System.out.println(a == bak);

a += b;
System.out.println(a);
System.out.println(a == bak);

// 3. 자료형 - 배열
System.out.println("== 배열 ==");
int[] myArray1 = {1, 2, 3, 4, 5};
System.out.println(myArray1[0]);
System.out.println(myArray1[1]);
System.out.println(myArray1[2]);
System.out.println(myArray1[3]);
System.out.println(myArray1[4]);

char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
System.out.println(myArray2[2]);

String[] myArray3 = new String[3];
myArray3[0] = "Hello";
myArray3[1] = " ";
myArray3[2] = "World!";
System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
```
- 자료형 - 리스트 (List)
  - 배열과 같이 여러 데이터를 담을 수 있는 자료형
  - 추가로 여러가지 메소드를 제공

  ```java
  ArrayList l1 = new ArrayList();
  l1.add(1);
  ```
  - 리스트 메소드
    - add, get, size, remove, clear, sort, contains
- 자료형 - 맵 (Map)
  - key, value 형태로 데이터를 저장하는 자료형
  ```java
  HashMap<String, String> map = new HashMap<String, String>();
  map.put("product", "kiwi");
  map.put("price", "9000");
  ```
  - 맵 메소드
    - put, get, size, remove, containsKey
- 자료형 - 제네릭스 (Generics)
  - 자료형을 명시적으로 지정
  - 제한적일 수 있지만 안정성을 높여주고 형변환을 줄여줌

```java
// 1. 자료형 - 리스트
System.out.println("== 리스트 ==");
ArrayList l1 = new ArrayList();

// 1-1. add
l1.add(1);
l1.add("hello");
l1.add(2);
l1.add(3);
l1.add(4);
l1.add("world!");
System.out.println("l1 = " + l1);

l1.add(0, 1);
System.out.println("l1 = " + l1);

// 1-2. get
System.out.println(l1.get(0));
System.out.println(l1.get(3));

// 1-3. size
System.out.println(l1.size());

// 1-4. remove
System.out.println(l1.remove(0));
System.out.println("l1 = " + l1);

System.out.println(l1.remove(Integer.valueOf(2)));
System.out.println("l1 = " + l1);

// 1-5. clear
l1.clear();
System.out.println("l1 = " + l1);

// 1-6. sort
ArrayList l2 = new ArrayList();
l2.add(5);
l2.add(3);
l2.add(4);
System.out.println("l2 = " + l2);

l2.sort(Comparator.naturalOrder());
System.out.println("l2 = " + l2);
l2.sort(Comparator.reverseOrder());
System.out.println("l2 = " + l2);

// 1-7. contains
System.out.println(l2.contains(1));
System.out.println(l2.contains(3));

// 2. Map
System.out.println("== Map ==");
HashMap map = new HashMap();

// 2-1. put
map.put("kiwi", 9000);
map.put("apple", 10000);
map.put("mango", 12000);
System.out.println("map = " + map); // 순서 보장되지 않음

// 2-2. get
System.out.println(map.get("mandarine"));
System.out.println(map.get("kiwi"));

// 2-3. size
System.out.println(map.size());

// 2-4. remove
System.out.println(map.remove("kiwi"));
System.out.println(map.remove("mandarine"));
System.out.println("map = " + map);

// 2-5. containsKey
System.out.println(map.containsKey("apple"));
System.out.println(map.containsKey("kiwi"));

// 3. Generics
System.out.println("== Generics ==");
ArrayList l3 = new ArrayList();
l3.add(1);
l3.add("hello");
System.out.println("l3 = " + l3);

ArrayList<String> l4 = new ArrayList<String>();
// l4.add(1);
l4.add("hello");
System.out.println("l4 = " + l4);

HashMap map1 = new HashMap();
map1.put(123, "id");
map1.put("apple", 10000);
System.out.println("map1 = " + map1);

HashMap<String, Integer> map2 = new HashMap<>();
// map2.put(123, "id");
map2.put("apple", 10000);
System.out.println("map2 = " + map2);
```
