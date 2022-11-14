/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class sınavaCalışma3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcının İsmini girin");
        String a = input.nextLine();
        int s = 0;
        while(s<10){
            
            s++;
            System.out.println(a+" Kullanıcı");
        }
    }
    
}
