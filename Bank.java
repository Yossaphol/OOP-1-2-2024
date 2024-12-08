/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import java.util.*;
/**
 *
 * @author khaopad
 */
public class Bank {
    public static void main(String[] args) {
        double money, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        money = input.nextDouble();
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        char type = input.next().charAt(0);
        switch (type) {
            case 'A': case 'C':
                result = money + (money * 1.5 / 100);
                break;
            case 'B':
                result = money + (money * 2 / 100);
                break;
            case 'X':
                result = money + (money * 5 / 100);
                break;
        }
        System.out.println("Your total money in one year = "+ result);
    }
}
