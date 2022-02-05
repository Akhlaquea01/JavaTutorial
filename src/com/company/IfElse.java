package com.company;

public class IfElse {
    public static void main(String[] args){
        int a = 29;
        if (a>18) {
            System.out.println("You can Drive");
        }
        else{
            System.out.println("You are underage!");
        }

//        Logical Operator
        System.out.println("For Logical AND...");
        boolean a1 = true;
        boolean b = false;
//        if (a1 && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical OR...");

//        if (a1 || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a1);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
