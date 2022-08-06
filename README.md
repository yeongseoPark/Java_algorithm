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
  
      
