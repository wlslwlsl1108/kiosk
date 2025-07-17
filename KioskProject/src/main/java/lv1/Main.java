package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner 객체 생성 //
        Scanner scanner = new Scanner(System.in);

        // 반복문 //
        while(true){
            // 입력 시작//
            //입력 안내문구
            System.out.println("[  SHAKESHACK MENU  ]");
            System.out.println("1. ShackBurger   | w 6.9 | 토마토 양상추 쉑소스가 토핑된 치즈버거");
            System.out.println("2. SmokeShack    | w 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
            System.out.println("3. CheeseBurger  | w 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
            System.out.println("4. HamBurger     | w 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            System.out.println("0. 종료           | 종료");

            int number = scanner.nextInt();

            switch (number){
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
}
