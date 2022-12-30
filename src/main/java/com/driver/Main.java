package com.driver;

public class Main {
     public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        obj.name = "PARTHA";
//         java: name has private access in com.driver.RWOnly
         obj.setName("PARTHA");
         System.out.println(obj.getName());
    }
  
}