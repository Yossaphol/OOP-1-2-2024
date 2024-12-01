/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class Petrol {
    public static void main(String[] args) {
        double liter, result;
        Scanner input = new Scanner(System.in);
        liter = input.nextDouble();
        result = liter * 30;
        System.out.println(result);
    }
}
