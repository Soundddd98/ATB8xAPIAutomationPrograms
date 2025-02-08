package com.testingacademy;

// Builder Pattern - .Step1().Step2() can be used, not in APITesting3 case, this is because we are return "this" and using the class.

public class APITest004_BuilderPattern {
    public APITest004_BuilderPattern Step1(){
        System.out.println("Step 1 started");
        System.out.println("Step 1 completed");
        return this;
    }
    public APITest004_BuilderPattern Step2(){
        System.out.println("Step 2 started");
        System.out.println("Step 2 completed");
        return this;
    }
    public APITest004_BuilderPattern Step3(String name){
        System.out.println("Step 1 started");
        System.out.println("Step 1 completed by -> " + name);
        return this;
    }

    public static void main(String[] args) {
        System.out.println("Printing main");
        APITest004_BuilderPattern bp = new APITest004_BuilderPattern();
        bp.Step1().Step2().Step3("Soundar");
    }
}
