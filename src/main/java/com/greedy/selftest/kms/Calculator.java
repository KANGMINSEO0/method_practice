package com.greedy.selftest.kms;

public class Calculator {
    public void checkMethodStart() {

        System.out.println("메소드 호출 확인...");
    }

    public int multiple(int num1, int num2) {
//        int num1 = 31;
//        int num2 = 39;

        int result1 = (num1 % 3 == 0)? num1 : num2;

        return result1;
    }


    public String checkAge(int ageA){


        String result2 = (ageA > 20)? "어른" : "청소년";

        return result2;
    }

    public void checkMethodEnd() {

        System.out.println("메소드 호출 종료...");
    }
}
