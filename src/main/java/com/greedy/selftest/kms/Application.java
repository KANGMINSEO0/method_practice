package com.greedy.selftest.kms;

public class Application {

    public static void main(String[] args) {

        /* non-static 메소드를 호출하여 아래와 같이 출력하시오.
        *
        * ------ 출력 예시 -------
        * 메소드 호출 확인...
        * 두 수 중 3의 배수는 39입니다.
        * 홍길동은 어른, 심청이는 청소년 입니다.
        * 메소드 호출 종료...
        * -----------------------
        * 1. class 명 : Calculator
        *    method   : checkMethodStart() : void
        *               multiple(): int
        *               semesterScore() : char
        *               checkAge() : String
        *               checkEnd() : void
        * 2. class 명 : Application
        *    method   : main(args:String[]) : void
        *
        * */

        Calculator calc = new Calculator();

        calc.checkMethodStart();

        int multipleNum = calc.multiple(31,39);
        System.out.println("두 수 중 3의 배수는 " + multipleNum + "입니다.");

        String strAgeA = calc.checkAge(50);
        String strAgeB = calc.checkAge(19);
        System.out.println("홍길동은 " + strAgeA + ", 심청이는 " + strAgeB + "입니다.");

        calc.checkMethodEnd();

    }
}
