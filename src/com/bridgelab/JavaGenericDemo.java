package com.bridgelab;

public class JavaGenericDemo   <T extends Comparable<T>>{
    T a,b,c;
    //Generic Constructor for Handling Different Type Object
    JavaGenericDemo(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //compareTo method for Checking Maximum from 3 Integer Object
    public T compareTo() {
        if(a.compareTo(b) > 0){
            if(a.compareTo(c) > 0) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b.compareTo(c) > 0) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Java Core - Generics Test Maximum Developed.");
        //Creating Generic Integer Object for Integer Comparison
        JavaGenericDemo<Integer> integerComparison = new JavaGenericDemo(90,120,190);
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo());
        //Creating Generic Float Object for Float Comparison
        JavaGenericDemo<Float> floatComparison = new JavaGenericDemo(90.0F,120.0F,190.0F);
        System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo());
        //Creating Generic String Object for String Comparison
        JavaGenericDemo<String> stringComparison = new JavaGenericDemo("Apple","Peach","Banana");
        System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo());
    }
}
