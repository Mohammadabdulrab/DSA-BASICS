package function;

import java.util.Scanner;

public class SuperHero {

//    Super Hero
//    You have given a string name of user. The user gives his name as to you and
//    your task is to return string "name" is a Super Hero.
//
//    You have to complete ModifyName function which consists of single string
//    name as input and return the string as mentioned above as output

    public static String ModifyName( String name){
       String s=name+" is a Super Hero";
       return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(ModifyName(name));
    }
}
