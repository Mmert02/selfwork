/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı girin");
        int a = input.nextInt();
        System.out.println("2. sayıyı girin");
        int b = input.nextInt();
        int t = 0;
        while(b>0){
            b--;
            t = t*a;
            
        }
    }
    
}
