/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khaopad
 */
import java.util.*;
public class CircleArea {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        area = Math.PI * (radius * radius);
        System.out.println(area);
    }
}
