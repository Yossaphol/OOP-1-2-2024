/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class Vat {
    public static void main(String[] args) {
        double price, result;
        Scanner input = new Scanner(System.in);
        price = input.nextDouble();
        result = price + (price * 7 / 100);
        System.out.println(result);
    }
}
