/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class sınavaCalışma5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu girin");
        int a = input.nextInt();
        if(85<=a && a<=100){
            System.out.println(a+": 5 Çok iyi ");
        }else if(70<=a && a<=84){
            System.out.println(a+": 4 iyi");
        }
    }
    
}
