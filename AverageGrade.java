/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args) {
        double x, y, z, average;
        Scanner input = new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();
        average = (x + y + z) / 3;
        System.out.println(average);
    }
}
