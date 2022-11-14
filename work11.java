/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("sayıyı girin");
       int n = input.nextInt();
       int t = 0;
        for (int s = 1; s <=n; s++) {
            t = t+(s*s);
            
        }System.out.println(t);
               
    }
    
}
