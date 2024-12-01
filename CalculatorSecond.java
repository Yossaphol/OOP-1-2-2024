/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class CalculatorSecond {
    public static void main(String[] args) {
        int hour, minute, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Hours : ");
        hour = input.nextInt();
        System.out.print("Mins : ");
        minute = input.nextInt();
        result = (hour * 60 * 60) + (minute * 60);
        System.out.println("Secs : " + result);
    }
}
