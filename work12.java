/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("metre cinsinden sayıyı girin");
       int m = input.nextInt();
       System.out.println("mm için: 1\n cm için: 2\n dm için: 3\n km için: 4");
       int y = input.nextInt();
        if(y==1){
           int mm = m*1000;
           System.out.println("mm: "+mm);
       }else if(y==2){
           int cm = m*100;
           System.out.println("cm: "+cm);
           
       }else if(y==3){
           int dm = m*10;
           System.out.println("dm: "+dm);
       }else{
           int km = m/1000;
           System.out.println("km: "+km);
       }
       
    }
    
}
