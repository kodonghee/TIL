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

##### :laughing: 2진법
- 컴퓨터에서 데이터 표현에 사용
- 2를 기반으로 하는 숫자체계

##### :laughing: 2의 보수
- 2의 제곱수에서 빼서 얻은 이진수
- ex) 2진수 3의 2의 보수: 11 -> 01
  - 자리 올림을 위해 필요한 수 (= 음수)
  - 모든 비트 반전 -> +1 -> 2진수의 보수

##### :laughing: 비트 연산자
- 비트 단위로 연산
- 기본 연산자와 비트 연산자 비교
  - 기본 연산자: &&, ||
  - 비트 연산자: &, |
- 각각의 비트를 비교

##### :laughing: 비트 논리 연산자 
- AND 연산자 (&)
  - 두 개의 비트 값이 모두 1인 경우에만 결과 1
- OR 연산자 (|)
  - 두 개의 비트 값 중 하나라도 1이면 결과 1
- XOR 연산자 (^)
  - 두 개의 비트 값이 같으면 0, 다르면 1
- 반전 연산자 (~)
  - 비트 값이 0이면 1로, 1이면 0으로 반전

##### :laughing: 비트 이동 연산자
- "<<" 연산자
  - 비트를 왼쪽으로 이동
- ">>" 연산자
  - 비트를 오른쪽으로 이동
- ">>>" 연산자
  - 비트를 오른쪽으로 이동 (부호비트 상관없이 0으로 채움)

```java
// 1. 비트 논리 연산자
System.out.println("== 비트 논리 연산자 ==");
// 1-1. AND 연산자 (&)
System.out.println("== & ==");
int num1 = 5;
int num2 = 3;
int result = 0;

result = num1 & num2;
System.out.println("result = " + result);
System.out.println(Integer.toBinaryString(num1));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

// 1-2. OR 연산자 (|)
System.out.println("== | ==");

result = num1 | num2;
System.out.println("result = " + result);
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

// 1-3. XOR 연산자 (^)
System.out.println("== XOR ==");

result = num1 ^ num2;
System.out.println("result = " + result);
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

// 1-4. 반전 연산자 (~)
System.out.println("== ~ ==");
num1 = 5;

result = ~num1;
System.out.println("result = " + result);
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
System.out.printf("%s\n", Integer.toBinaryString(result));

// 2. 비트 이동 연산자
System.out.println("== 비트 이동 연산자 ==");
// 2-1. << 연산자
int numA = 3;
result = numA << 1;

System.out.println("result = " + result);
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

// 2-2. >> 연산자
result = numA >> 1;
System.out.println("result = " + result);
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

// 2-3. >>> 연산자
numA = -5;
result = numA >> 1;
System.out.printf("%s\n", Integer.toBinaryString(numA));
System.out.printf("%s\n", Integer.toBinaryString(result));

result = numA >>> 1;
System.out.printf("%s\n", Integer.toBinaryString(numA));
System.out.printf("%s\n", Integer.toBinaryString(result));
```
