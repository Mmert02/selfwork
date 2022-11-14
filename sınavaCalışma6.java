/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */
import java.util.Scanner;

public class sınavaCalışma6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 0;
        int t = 0;
        while (s < 10) {
            s++;
            System.out.println("sayıyı girin");
            int a = input.nextInt();
            if (a % 2 == 0) {
                t = t + a;

            }
        }
            System.out.println(t);
    }

}
