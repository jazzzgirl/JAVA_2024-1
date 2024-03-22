/*
 * 작성일 : 
 * 작성자 :
 * 설명 : 내포된 if문 실습.
 * 		 점수를 입력받아 학점을 출력하시오.
 * 		 점수는 0~100점 사이 입니다.
 * 		 점수 범위를 벗어나면 "잘못된 점수입니다." 출력하시오.
 * 
 * 문제분석 : 입력받은 점수가 0~100 사이인가?
 * 			점수가 0~100 사이가 아니면?
 * 			90점 이상이면 A학점
 * 			80점 이상이면 B학점
 * 			70점 이상이면 C학점
 * 			60점 이상이면 D학점
 * 			60점 미만이면 F학점
 * 			점수는 정수로 입력 받는다.
 * 
 * 알고리즘 : 1. 점수(정수)를 입력받는다.
 * 			2. if 점수의 범위가 0~100 사이인가?
 * 				1) A
 * 				2) B
 * 				   :
 * 			3. else 아닌가?
 * 				1) "잘못된 점수입니다." 출력
 */

import java.util.Scanner;

public class NestedIfTest1 {

	public static void main(String[] args) {
		// Scanner 객체 생성.
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 점수를 입력 받는다.
		System.out.print("점수 입력 : ");
		int score = stdIn.nextInt();
		
		if(score >= 0 && score <= 100) {
			// 학점
		}
		else {
			// 잘못된 점수
		}
		
		//////////////
		if(score < 0 || score > 100) {
			// 잘못된 점수
		}
		else {
			// 학점 
		}
	}

}


/*
나이가 18~25
나이가 18세 이상이고, 나이가 25세 이하.

if((age >= 18) && (age <= 25))
	
(gender == "남자" && age >= 18) && ()(gender == "남자" && age <= 25)

score1, score2, score3
jumsu1, jumsu2, jumsu3
kor, eng, math

kor, eng, math >= 70
국어 점수가 70점 이상이고, 영어 점수도 70점 이상이고, 수학점수도 70점 이상
모두 => 다 만족하야 한다.

kor >= 70 && eng >= 70 && math >= 70

(kor >= 70 && eng >= 70 && math >= 70) || (sum >= 240)

total = age1 + age2

total >= 40 && total <= 49   ( < 50 )


두 수가 모두 짝수인 경우
num1, num2
짝수?? 2로 나눈 나머지가 0이다.  %
(num1 % 2 == 0) && (num2 % 2 == 0)
*/
















