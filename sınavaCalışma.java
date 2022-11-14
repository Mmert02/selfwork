/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class sınavaCalışma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        int a = input.nextInt();
        System.out.println("İkinci  sayıyı girin");
        int b = input.nextInt();
        if(a>b){
            System.out.println(a+": En büyük sayıdır");
        }else if(b>a){
            System.out.println(b+": En büyük sayıdır ");
        }else{
            System.out.println("sayılar birbirine eşittir");
        }
                
    }
    
}
