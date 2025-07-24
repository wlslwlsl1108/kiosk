package lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 상위 카테고리 도입

    // 상위 카테고리 정의//
    private String categoryName;  // 필드 선언 - private(캡슐화)

    // 생성자 // - MenuItem 클래스의 객체 생성 시 호출되는 메서드
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        // items 초기화 -> 초기화안하면 NullPointerException 오류 발생가능성 있음
        this.items = new ArrayList<>();
    }

    // 하위 항목 필드 선언
    private List<MenuItem> items; //- private(캡슐화)

    // 하위 항목 추가(연결)
    public void addMenuItem(MenuItem item){
        items.add(item);
    }


    //Getter//
    public String getCategoryName() {
        return categoryName;
    }
    public List<MenuItem> getItems(){
        return items;
    }

    //Setter//
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setItems(List<MenuItem> items) {
        this.items = items;
    }


    public void printItems(){

        // getter 추가해주면서 수정(캡슐화하면서 수정)
        System.out.println();
        System.out.println("[ "+getCategoryName()+" MENU ]");
        for (int i = 0; i < getItems().size(); i++){
            MenuItem item = getItems().get(i);
            System.out.println(item.getName() + " | W " + item.getPrice() + " | " + item.getDescription());
        }
        System.out.println("0. 뒤로가기");
    }

}