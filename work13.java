/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("sayıyı girin");
       int x = input.nextInt();
       int y = (x*x)-(5*x)+3;
       if(y==0){
           System.out.println("fonksiyon 0'a eşittir");
           
       }else if(y>0){
           System.out.println("fonksiyon pozitiftir");
       }else{
           System.out.println("fonksiyon negatiftir");
       }
    }
    
}
