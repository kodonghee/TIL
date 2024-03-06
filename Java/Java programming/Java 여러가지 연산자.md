### Java 여러가지 연산자
##### :laughing: 항과 연산자
- 단항 연산자: 항이 한 개
- 이항 연산자: 항이 두 개
- 삼항 연산자: 항이 세 개

##### :laughing: 대입 연산자 (=)
- 우측의 데이터를 좌측의 변수에 대입

##### :laughing: 부호 연산자 (+, -)
- 부호를 나타내는 연산자

##### :laughing: 산술 연산자 (+, -, *, /, %)
- 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지

##### :laughing: 증가/감소 연산자 (++, --)
- 값을 1만큼 늘리거나 (++), 1만큼 줄임 (--)

##### :laughing: 관계 연산자
- 두 항의 값 크기 비교
- 결과 값은 비교 결과에 따라 true 또는 false

##### :laughing: 논리 연산자
- 논리식에 대해 참 거짓 판단
- 결과 값은 판단 결과에 따라 true 또는 false

##### :laughing: 복합 대입 연산자
- 대입 연산자와 다른 연산자를 조합한 연산
- 코드를 간결하게 작성할 때 사용
  - ex) num1 += num2;

```java
// 1. 대입 연산, 부호 연산자
int num = 100;
num = +10;
num = 10;
num = -10;

// 2. 산술 연산자, 증가/감소 연산자
System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
int numX = 10;
int numY = 3;
int result = 0;
result = numX + numY;
result = numX - numY;
result = numX * numY;
result = numX / numY;
result = numX % numY;
System.out.println("result = " + result);

int numZ = 1;
System.out.println(numZ++);
System.out.println(numZ);

numZ = 1;
System.out.println(++numZ);
System.out.println(numZ);

numZ = 1;
System.out.println(numZ--);
System.out.println(numZ);

numZ = 1;
System.out.println(--numZ);
System.out.println(numZ);

// 3. 관계 연산자
System.out.println("== 관계 연산자 ==");
int numA = 10;
int numB = 9;

System.out.println(numA > numB);
System.out.println(numA < numB);
System.out.println(numA == numB);
System.out.println(numA != numB);

// 4. 논리 연산자
System.out.println("== 논리 연산자 ==");
System.out.println((10 > 9) && (1 == 0));
System.out.println((10 > 9) || (1 == 0));

// 5. 복합 대입 연산자
System.out.println("== 복합 대입 연산자 ==");
int num1 = 10;
int num2 = 5;
num1 += num2;
// num1 = num1 + num2;
System.out.println("num1 = " + num1);

num1 -= num2;
num1 *= num2;

// 6. 삼항 연산자
System.out.println("== 삼항 연산자 ==");
int a = 100;
String aResult = (a == 100) ? "yes":"no";
System.out.println("aResult = " + aResult);
```
