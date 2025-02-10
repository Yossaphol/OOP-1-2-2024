/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.*;
public class CountSlash2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        n = input.nextInt();
        for (int i = 1; i <= (int)(n/5); i++) {
            System.out.println("|||||");
        }
        for (int j = 1; j <= (int)(n%5); j++) {
            System.out.print("|");
        }
    }
}
