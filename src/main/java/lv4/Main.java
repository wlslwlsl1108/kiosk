package lv4;

import java.util.ArrayList;
import java.util.List;
//(입력제외) import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Menu - 리스트 선언 및 초기화 //
        List<Menu> menus = new ArrayList<>();

        // Menu - 객체 생성 (이름 설정)
        // 상위 항목 추가시 1. 새로운 메뉴항목 작성
        Menu burgerMenu = new Menu("1. BURGERS");
        Menu drinkMenu = new Menu("2. Drinks");
        Menu dessertMenu = new Menu("3. Desserts");
        // MenuItem - 리스트 선언 및 초기화 //

        // add 함수 이용해 new MenuItem(이름, 가격, 설명) List 삽입
        // menuItems.add  ->  bergerMenu.addMenuItem 변경
        // MenuItem 단독 리스트를 상위카테고리(Menu) 안으로 변경
        burgerMenu.addMenuItem(new MenuItem("1. ShackBurger ", 6.9, "토마토 양상추 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("2. SmokeShack  ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("3. CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerMenu.addMenuItem(new MenuItem("4. HamBurger   ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // "Burgers" 카테고리를 menus 리스트에 상위 메뉴로 등록
        // 상위 항목 추가시 2. add로 메뉴항목 추가
        menus.add(burgerMenu);
        menus.add(drinkMenu);
        menus.add(dessertMenu);

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menus);

        // Kiosk 내 시작하는 함수 호출
        kiosk.start();

    }
}