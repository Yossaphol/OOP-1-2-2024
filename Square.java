/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        double side, result;
        Scanner input = new Scanner(System.in);
        side = input.nextDouble();
        result = Math.pow(side, 2);
        System.out.println(result);
    }
}
