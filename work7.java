/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 ile 7 arasında sayı girin");
        int a = input.nextInt();
        while(1<=a && a<=7){
            if(a==1){
                System.out.println("Pazartesi");
            }else if(a==2){
                System.out.println("Salı");
            }else if(a==3){
                System.out.println("Çarşamba");
            }else if(a==4){
                System.out.println("Perşembe");
            }else if(a==5){
                System.out.println("Cuma");
            }else if(a==6){
                System.out.println("Cumartesi");
            }else{
                System.out.println("Pazar");
            }
        break;}
        
    }
    
}
