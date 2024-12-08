/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class Computer {
    public static void main(String[] args) {
        int size, dvd, printer;
        double price = 375.99;
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your monitor size 38 or 43 only");
        size = input.nextInt();
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        dvd = input.nextInt();
        System.out.println("Do you want printer? 1 is yes / 0 is No");
        printer = input.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("* Computer >>> 375.99$");
        if (size == 38) {
            System.out.println("* 38'Monitor >>> 75.99$");
            price += 75.99;
        } else {
            System.out.println("* 43'Monitor >>> 99.99$");
            price += 99.99;
        }
        if (dvd == 1) {
            System.out.println("* DVD-Rom >>> 65.99$");
            price += 65.99;
        }
        if (printer == 1) {
            System.out.println("* Printer >>> 125.00$");
            price += 125;
        }
        System.out.println("======= Total price >>> "+price+" =======");
    }
}
