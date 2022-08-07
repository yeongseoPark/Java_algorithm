# Java_algorithm

> 문제를 풀면서 자주 사용하는 문법을 정리합니다.

## 배열
- __Arrays.Stream(arr).average().getAsDouble()__ : [예시](https://github.com/yeongseoPark/Java_algorithm/blob/master/src/LeetCode_ProgrammingSkills/AverageSalaryExcludingMinAndMax/AverageSalarayExcludingMinAndMax.java) 
  - OptionalDouble : average()가 리턴하는 타입. double값을 가지고 있을 수 있는 컨테이너 객체
    - 이를 double로 바꾸는 방법
      1. getAsDouble()
      2. orElse()로 값이 없을시 기본값 지정

## 수
- __Integer.MAX_VALUE__ : 32비트(4byte)로 표현할 수 있는 정수의 최대 값 2,147,483,647
- __Integer.MIN_VALUE__ : 32비트에서 정수 최소값 -2,147,483,648
- Integer.toBinaryString(정수) : 정수의 32비트의 2진수로 변환한다(String)


## 문자열
- __for-each 루프를 문자열에 적용하기__
  - for (char ch: "xyz".toCharArray()) 
    - 배열을 복사하는 비용 든다
  - for (String s: "xyz".split("")) 
    - 이모티콘이 중간에 껴있을 경우,split으로 각 문자를 정확히 나눌 수 없다

## 비트 
- ">>>" : 피연산자의 비트열을 오른쪽으로 이동, 빈공간은(왼쪽) 0으로 채움 [예시]()
- ">>"  : 피연산자의 비트열을 오른쪽으로 이동, 빈공간은 음수의 경우에 1, 양수의 경우에 0으로 채움(최상위 비트에 따라)
- & : 대응되는 두 비트가 모두 1일때만 1반환 