/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class CountSlash {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        n = input.nextInt();
        for (int i = 1;i<=n;i++) {
            if (i % 5 == 0) {
                System.out.print("/");
            }else {
                System.out.print("|");
            }
        }
    }
}
