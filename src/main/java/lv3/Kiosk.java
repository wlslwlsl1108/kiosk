package lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // MenuItem을 관리하는 리스트(필드) //
    public List<MenuItem> menuItems;

    // 생성자 추가
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public void start() {

        // 입력 //
        Scanner scanner = new Scanner(System.in);


        // 반복문 //
        for (MenuItem item : menuItems) {
            System.out.println(item.name + " | " + item.price + " | " + item.description);
        }
        System.out.println("0. 종료      | 종료");

        // 숫자 입력 안내문 //
        System.out.print("메뉴를 번호로 선택하세요: ");

        // 숫자 입력받기 //
        int number = scanner.nextInt();

        // 입력된 숫자에 따른 처리 //
        switch (number) {
            case 1:
                System.out.println("선택한 메뉴 : 1. ShackBurger   | w 6.9 | 토마토 양상추 쉑소스가 토핑된 치즈버거");
                break;

            case 2:
                System.out.println("선택한 메뉴 : 2. SmokeShack    | w 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                break;

            case 3:
                System.out.println("선택한 메뉴 : 3. CheeseBurger  | w 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                break;

            case 4:
                System.out.println("선택한 메뉴 : 4. HamBurger     | w 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                break;

            case 0:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;

        }
    }
}