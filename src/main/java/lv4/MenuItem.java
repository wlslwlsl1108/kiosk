package lv4;

import java.util.List;
import java.util.ArrayList;

// 클래스 정의 //
public class MenuItem {

    // 클래스의 필드(멤버 변수) 정의// - private(캡슐화)
    private String name;  // 이름 필드 선언
    private double price;   // 가격 필드 선언
    private String description; // 설명 필드 선언

    // 생성자 // - MenuItem 클래스의 객체 생성 시 호출되는 메서드
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    //Getter//
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }

    //Setter//
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

