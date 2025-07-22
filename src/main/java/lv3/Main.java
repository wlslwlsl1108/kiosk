package lv3;

import java.util.ArrayList;
import java.util.List;
//(입력제외) import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 리스트 선언 및 초기화 //
        List<MenuItem> menuItems = new ArrayList<>();
        // 인터페이스인 List타입으로 menuItems 라는 변수 생성
        // ArrayList 라는 실제 객체 생성
        // add로 값을 추가하면 menuItems 변수에 저장
        // 리스트를 사용하기 위해서 객체를 생성

        // add 함수 이용해 new MenuItem(이름, 가격, 설명) List 삽입
        menuItems.add(new MenuItem("1. ShackBurger ", 6.9, "토마토 양상추 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("2. SmokeShack  ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("3. CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("4. HamBurger   ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        //
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();


        //Scanner 선언//
        // Scanner scanner = new Scanner(System.in);

        //반복문 활용해 List 안에 있는 MenuItem 출력 //
       // for (MenuItem item : menuItems ){
            //  for (데이터타입 변수이름 : 데이터(리스트) )
            //  여기서는 데이터 타입으로 MenuItem(클래스) 명시
            //  변수이름(원하는이름으로)
            //  데이터(리스트)= List 선언 시 만든 변수명  => 이 리스트 요소들 하나씩 꺼냄
           // System.out.println(item.name + " | " + item.price +" | "+ item.description);
        }
        //System.out.println("0. 종료      | 종료");


        }



