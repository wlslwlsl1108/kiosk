package lv2;

import java.util.List;
import java.util.ArrayList;

public class MenuItem {
    String name;  // 이름 필드 선언
    int price;   // 가격 필드 선언
    String description; // 설명 필드 선언

    private final List<MenuItem> menuItems = new ArrayList<>();

}
