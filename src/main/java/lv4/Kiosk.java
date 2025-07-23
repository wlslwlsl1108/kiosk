package lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Kiosk {

    // Menu 관리하는 리스트 // -> 선언 및 초기화
    public List<Menu> menus;

    // MenuItem을 관리하는 리스트(필드) //
    // 삭제 => Menu에서 관리됨
    // public List<MenuItem> menuItems;

    // 생성자 추가
    // start()함수 호출 시 menuItems 초기화 안해줘서 NULL 오류발생함.
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {

        // 입력 //
        Scanner scanner = new Scanner(System.in);

        // 상위 카테고리 목록 출력
        System.out.println("[ MAIN MENU ]");
        for (int i =0; i < menus.size(); i++) {
            System.out.println(menus.get(i).getCategoryName());
        }
        System.out.println("메뉴 번호 입력: ");

        // 상위 카테고리 출력문 작성 안해줌


        // menus 반복문 추가 - 상위 메뉴(카테고리명)만 출력// - 위랑 중복!
        //for (Menu item : menus) {
        //    System.out.println(item.categoryName);
        //}

        // 반복문 //
        // 삭제 => Menu에서 관리됨
        //for (MenuItem item : menuItems) {
        //    System.out.println(item.name + " | " + item.price + " | " + item.description);
        //}

        System.out.println("0. 종료      | 종료");

        // 메뉴 종료 후 반복 //
        while (true) {

            // 오류처리 - 문자
            try {
                // 숫자 입력 안내문 //
                // try 상단에 있으니 상위메뉴 호출 시 같이 호출됨
                System.out.print("메뉴를 번호로 선택하세요: ");

                // 숫자 입력받기 //
                int number = scanner.nextInt();

                // 오류처리 - 음수, 다른 숫자
                // .size() 사용하면 메뉴 갯수 변경시 영향 x
                // menuItems -> menus 로 변경
                if (number < 1 || number > menus.size()) {
                    System.out.println("없는 메뉴입니다. 숫자를 다시 입력해주세요.");
                    scanner.nextLine();  // 무한반복 안되도록 입력 버퍼 비워주기
                    continue;
                } else {
                    Menu selectedMenus = menus.get(number-1);
                    System.out.println("선택한 메뉴: " + selectedMenus.getCategoryName());
                }

                // 여기부터 삭제 -> switch 문에서 menus.get(number)문으로 변경 예정

                // 입력된 숫자에 따른 처리 //
                //switch (number) {
                //    case 1:
                //        System.out.println("선택한 메뉴 : 1. ShackBurger   | w 6.9 | 토마토 양상추 쉑소스가 토핑된 치즈버거");
                 //       break;

                //    case 2:
                //        System.out.println("선택한 메뉴 : 2. SmokeShack    | w 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                //        break;

                //    case 3:
                //        System.out.println("선택한 메뉴 : 3. CheeseBurger  | w 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                //        break;

                //    case 4:
                //        System.out.println("선택한 메뉴 : 4. HamBurger     | w 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                //        break;

                //    case 0:
                //        System.out.println("프로그램을 종료합니다.");
                //        System.exit(0);
                //        break;

                //}
                // 여기까지 삭제

            }
            catch (InputMismatchException e) {
                System.out.println("문자는 입력할 수 없습니다. 숫자를 다시 입력해주세요.");
                scanner.nextLine();  // 입력 버퍼 비우기
                continue; // 재입력 받기
            }
        }
    }
}