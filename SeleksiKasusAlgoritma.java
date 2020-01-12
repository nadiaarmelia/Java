/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

/**
 *mencetak bilangan terbesar dan terkecil dari 5 bilangan
 * menggunakan tambahan 1 variabel bantu
 * @author ACER
 */
public class SeleksiKasusAlgoritma {
    public static void main(String[] args){
        Scanner Baca = new Scanner(in);
        int B1, B2, B3, B4, B5, B;
        out.println("B1 = "); B1= Baca.nextInt();
        out.println("B2 = "); B2= Baca.nextInt();
        out.println("B3 = "); B3= Baca.nextInt();
        out.println("B4 = "); B4= Baca.nextInt();
        out.println("B5 = "); B5= Baca.nextInt();
        
        B=B1;
        
        if (B<B2) B=B2;
        if (B<B3) B=B3;
        if (B<B4) B=B4;
        if (B<B5) B=B5;
        
        out.println("Bilangan Terbesar = "+B);
        
        B=B1;
        
        if (B>B2) B=B2;
        if (B>B3) B=B3;
        if (B>B4) B=B4;
        if (B>B5) B=B5;
        
        out.println("Bilangan Terkecil = "+B);
        
    }
}
