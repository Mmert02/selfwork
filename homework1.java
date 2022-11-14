/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayıyı girin");
        int a = input.nextInt();
        for (int b = 0; b <=a; b++) {
            for (int c = 0; c <=a; c++) {
                if(a == b*b + c*c){
                    System.out.println(b+" "+ c);
                
            }
            
        }
        
        
             
            
        }
}}
