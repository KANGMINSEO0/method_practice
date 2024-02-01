package com.greedy.selftest.kys;

public class Application {

    public static void main(String[] args) {
        /* 오늘 먹은 점심식사 식당의 정보에 대해서 입력하고 출력하시오
         *   ----- 출력예시 -----
         *   식당 이름 :   , 메뉴 :  , 가격 :    , 평점 :
         * (평점은 5점만점으로 소수점까지 기입 가능하도록 하시오.*/

        Application app = new Application();
        app.lunchInformation("콩나물 국밥", "황태 콩나물 국밥", 9000, 4.5f);



    }

    public void lunchInformation(String restaurantName, String menu, long price, float point) {

        System.out.println("식당 이름 : " + restaurantName + ", 메뉴 : " + menu + ", 가격 : " + price + ", 평점 : " + point);

    }
}
