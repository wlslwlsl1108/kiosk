package lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Kiosk {

    // Menu 관리하는 리스트 // -> 선언 및 초기화
    private List<Menu> menus; //- private(캡슐화)

    // 생성자 추가
    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    //Getter//
    public List<Menu> getMenus() {
        return menus;
    }

    //Setter//
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {

        // 입력 //
        Scanner scanner = new Scanner(System.in);


        // 메뉴 종료 후 반복 //
        while (true) {

            // 상위 카테고리 목록 출력
            System.out.println("[ MAIN MENU ]");
            for (int i =0; i < menus.size(); i++) {
                System.out.println(menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료"); // 위치변경

            System.out.print("메뉴 번호 입력: "); // ln 삭제

            // 오류처리 - 문자
            try {
                // number = 상위 메뉴 입력 번호 //
                // 숫자 입력받기 //
                int number = scanner.nextInt();
                scanner.nextLine();


                // 종료문 추가
                if (number == 0){
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                // 오류처리 - 음수, 다른 숫자
                // .size() 사용하면 메뉴 갯수 변경시 영향 x
                // menuItems -> menus 로 변경
                if (number < 1 || number > menus.size()) {
                    System.out.println("없는 메뉴입니다. 숫자를 다시 입력해주세요.\n");
                    //scanner.nextLine();  // 무한반복 안되도록 입력 버퍼 비워주기
                    continue;
                }

                // 선택된 상위 메뉴 가져오기
                Menu selectedMenus = menus.get(number-1);


                while(true){

                // 하위 메뉴 항목 출력
                selectedMenus.printItems();

                System.out.print("메뉴를 번호로 선택하세요: ");

                //하위 try 추가
                    try {
                        // itemNumber = 하위 메뉴 입력 번호 //
                        // 숫자 입력 안내문 //
                        // try 상단에 있으니 상위메뉴 호출 시 같이 호출됨

                        int itemNumber = scanner.nextInt();
                        scanner.nextLine(); // 버퍼 비우기
                        System.out.println();

                        // 뒤로가기 추가
                        if (itemNumber == 0) {
                            System.out.println("이전 메뉴로 돌아갑니다.");
                            System.out.println();
                            break; // while 밖 상위로 이동
                        }

                        // 오류처리 - 음수, 다른 숫자
                        // .size() 사용하면 메뉴 갯수 변경시 영향 x
                        // menuItems -> menus 로 변경
                        if (itemNumber < 1 || itemNumber > selectedMenus.getItems().size()) {
                            System.out.println("없는 메뉴입니다. 숫자를 다시 입력해주세요.");
                            continue;
                        }

                        //선택항목 출력
                        //getter(캡슐화) 추가 후, 변경필요
                        MenuItem chosenItem = selectedMenus.getItems().get(itemNumber - 1);
                        System.out.println("선택한 메뉴: " + chosenItem.getName() + " | w" + chosenItem.getPrice() + " | " + chosenItem.getDescription());
                        continue;

                    }catch (InputMismatchException e){
                        System.out.println("문자는 입력할 수 없습니다. 숫자를 다시 입력해주세요.");
                        scanner.nextLine();  // 입력 버퍼 비우기
                        continue;

                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("문자는 입력할 수 없습니다. 숫자를 다시 입력해주세요.\n");
                scanner.nextLine();  // 입력 버퍼 비우기
                continue; // 재입력 받기
            }
        }
    }
}
