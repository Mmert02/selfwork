/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Derece cinsinden sayıyı girin");
       int a = input.nextInt();
       double radyan = (double) a*Math.PI/180;
       double gradyan = (double) a*10/9;
       System.out.println(radyan+ " Radyan\n" + gradyan+" Gradyan");
    
}}
