/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. kenarı  girin");
        int a = input.nextInt();
        System.out.println("2. kenarı girin");
        int b = input.nextInt();
        System.out.println("3. kenarı girin");
        int c = input.nextInt();
        if(a!=b && a!=c && b!=c){
            System.out.println("Çeşitkenar Üçgen");
        }else if(a==b && a!=c || b==c && b!=a || a==c && a!=b){
            System.out.println("İkizkenar Üçgen");
        }else {
            System.out.println("Eşkenar Üçgen");
        }
    }
    
}
