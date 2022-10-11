package com.bridgelab;

public class JavaGenericDemo {
    //compareTo method for Checking Maximum from 3 Integer Object
    public static Integer compareTo(Integer a,Integer b,Integer c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    //compareTo method for Checking Maximum from 3 Float Object
    public static Float compareTo(Float a,Float b,Float c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
    //Method to compare String
    public static String compareTo(String str1,String str2,String str3) {
        if(str1.compareTo(str2) > 0) {
            if(str1.compareTo(str3) > 0) {
                return str1;
            } else {
                return str3;
            }
        } else {
            if(str2.compareTo(str3) > 0) {
                return str2;
            } else {
                return str3;
            }
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Welcome to Java Core - Generics Test Maximum.");

        System.out.println("Maximum from 3 Integer Object : "+compareTo(90,120,20));
        System.out.println("Maximum from 3 Float Object : "+compareTo(90.0F,120.0F,190.0F));
        System.out.println("Maximum from 3 String Object : "+compareTo("Apple","Peach","Banana"));
    }
}
