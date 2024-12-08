/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author khaopad
 */
import java.util.*;
public class Salary {
    public static void main(String[] args) {
        String name;
        int age;
        double weight, working, absent, salary = 0, bonus = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = input.next();
        System.out.print("Please insert your age : ");
        age = input.nextInt();
        System.out.print("Please insert number of working days : ");
        working = input.nextDouble();
        System.out.print("Please insert number of absent days : ");
        absent = input.nextDouble();
        System.out.print("Please insert your body weight : ");
        weight = input.nextDouble();
        if (21 <= age && age <= 30) {
            salary = (working * 300) - (absent * 50);
        } else if (31 <= age && age <= 40) {
            salary = (working * 500) - (absent * 50);
        } else if (41 <= age && age <= 50) {
            salary = (working * 1000) - (absent * 25);
        } else if (51 <= age && age <= 60) {
            salary = (working * 3000);
        }
        if (10 <= weight && weight <= 60) {
            bonus = salary + 5000;
        } else if (61 <= weight && weight <= 90) {
            bonus = salary + (5000 - ((weight - 60) * 10));
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        System.out.println("Your salary and bonus is "+bonus+" Baht");
    }
}
