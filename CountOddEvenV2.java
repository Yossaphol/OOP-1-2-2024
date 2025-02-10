/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.*;
public class CountOddEvenV2 {
    public static void main(String[] args) {
        int n, countOdd = 0, countEven = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        while (n != -1) {
            n = input.nextInt();
            if (n % 2 == 0) {
                countEven += 1;
            } else {
                countOdd += 1;
            }
        }
        System.out.println("Odd number = "+ countOdd+ " and Even number = "+countEven);
    }
}
