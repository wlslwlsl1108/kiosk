package lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    // 상위 카테고리 도입

    // 상위 카테고리 정의//
    String categoryName;  // 필드 선언

    // 생성자 // - MenuItem 클래스의 객체 생성 시 호출되는 메서드
    public Menu(String categoryName) {
        this.categoryName = categoryName;
        // items 초기화 -> 초기화안하면 NullPointerException 오류 발생가능성 있음
        this.items = new ArrayList<>();
    }

    // 하위 항목 필드 선언
    public List<MenuItem> items;

    // 하위 항목 추가(연결)
    public void addMenuItem(MenuItem item){
        items.add(item);
    }
}