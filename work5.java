/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mertcan
 */import java.util.Scanner;
public class work5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Maddenin kütlesini girin");
        int m = input.nextInt();
        System.out.println("Maddenin hızını girin");
        int v = input.nextInt();
        System.out.println("Maddenin yüksekliğini girin");
        int h = input.nextInt();
        double kE = (double) 1/2*m*Math.pow(v,2);
        double pE = (double) m*10*h;
        System.out.println(kE+ " Kinetik Enerjisi\n" +pE+" Potansiyel Enerjisi" );
    }
    
}
