package org.example;

public class Main {
    public static void main(String[] args) {
        Entrepreneur entrepreneur = new Entrepreneur();
        entrepreneur.setName("Mahendra Silva");
        entrepreneur.setAge(30);
        entrepreneur.setStaffCount(20);

        Business business = new Business();
        business.setBusiness1("Online cake business");
        business.setBusiness2("Graphic design business");
        business.setBusiness3("house Plan business");
        entrepreneur.setBusiness(business);
        entrepreneur.showEntrepreneurDetails();
    }
}