/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayıyı gitin");
        int a = input.nextInt();
        if(a<0){
        System.out.println(a +" sayısı negatiftir");    
        }else if(a>0){
            System.out.println(a+ " sayısı poitiftir");
            
        }else{
            System.out.println(a + " sayısı 0'a eşittir");
        }
    }
    
}
