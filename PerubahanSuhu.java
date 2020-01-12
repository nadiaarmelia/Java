/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class PerubahanSuhu {
    public static double reamur(double X){
        return(4/5.0*X);
    }
    public static double fahrenheit(double X){
        return(9/5.0*X+32);
    }
    public static double kelvin(double X){
        return(273+X);
    }
    public static void cetak(String s, double X){
        System.out.println(s+" = "+X);
    }
    public static void main(String[] args){
        Scanner Baca = new Scanner(System.in);
        int C;
        System.out.print("Celcius = "); C=Baca.nextInt();
        cetak("celcius",C);
        cetak("reamur", (int) reamur(C));
        cetak("fahrenheit", (int) fahrenheit(C));
        cetak("kelvin", (int) kelvin(C));
    }
}
