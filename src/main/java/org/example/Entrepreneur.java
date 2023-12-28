package org.example;

public class Entrepreneur {
    private String name;

    private int age;

    private int staffCount;

    private Business business;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public void showEntrepreneurDetails() {
        System.out.println("Entrepreneur name "+  name);
        System.out.println("Entrepreneur age " + age);
        System.out.println("Entrepreneur Staff count " + staffCount);
        System.out.println("Entrepreneur Business1 "+ business.getBusiness1());
        System.out.println("Entrepreneur Business2 "+ business.getBusiness2());
        System.out.println("Entrepreneur Business3 "+ business.getBusiness3());
    }
}
