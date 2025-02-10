/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.*;

public class CountOddEven {
    public static void main(String[] args) {
        int n,countOdd = 0,countEven = 0;
        Scanner input = new Scanner(System.in);
        do {
            n = input.nextInt();
            if (n % 2 == 0){
                countEven += 1;
            } else {
                countOdd += 1;
            }
        } while (n != -1);
        System.out.println("Odd number = "+(countOdd - 1)+" and Even number = "+countEven);
    }
}
