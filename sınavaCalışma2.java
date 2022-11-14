/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class sınavaCalışma2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci notu girin");
        int a = input.nextInt();
        System.out.println("İkinci notu  girin");
        int b = input.nextInt();
        double ort = (a+b)/2;
        if(ort>70){
            System.out.println(ort+": Notun güzel kanks");
        }else{
            System.out.println(ort+": Notun kötü kanks");
        }
    }
    
}
