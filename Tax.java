/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import java.util.Scanner;
/**
 *
 * @author khaopad
 */
public class Tax {
    public static void main(String[] args) {
        double result, salary;
        Scanner input = new Scanner(System.in);
        salary = input.nextDouble();
        if (salary > 50000){
            result = salary * 1 / 10;
        } else {
            result = salary * 0.5 / 10;
        }
        System.out.println(result);
    }
}
