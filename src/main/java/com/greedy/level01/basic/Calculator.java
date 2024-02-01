package com.greedy.level01.basic;

public class Calculator {

    public void checkMethod() {

        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(int one, int two, int three, int four,int five, int six, int seven, int eight, int nine, int ten ) {

        return one + two + three + four +five + six +seven + eight + nine + ten;
    }

    public void checkMaxNumber(int a, int b) {

        System.out.println("두 수 중 큰 수는 " + ((a > b)? a : b) + "이다.");
    }
    public int sumTwoNumber(int a, int b) {

        return a + b;
    }
    public int minusTwoNumber(int a, int b) {

        int i = a - b;
        return i;
    }


}
