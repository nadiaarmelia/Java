/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import static java.lang.System.out;
/**
 *
 * @author Nadia Armelia Amanda
 * NIM 19360012
 */
public class RangkaianSeriParalel {
    private static double seri (double R1,double R2,double R3) {
        return (R1+R2+R3);
    }
    private static double paralel (double R1,double R2,double R3) {
        return (1/(1/R1+1/R2+1/R3));
    }
    public static void main(String[] args) {
       Scanner Baca = new Scanner(System.in);
        double R1,R2,R3,RS,RP;
        out.print("R1 = "); R1= Baca.nextDouble();
        out.print("R2 = "); R2= Baca.nextDouble();
        out.print("R3 = "); R3= Baca.nextDouble();
        RS=R1+R2+R3; RP=R1*R2*R3/(R2*R3+R1*R3+R1*R3);
        out.println("RS = "+RS);
        out.println("RP = "+RP); 
    }
}
