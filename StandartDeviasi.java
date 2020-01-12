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
public class StandartDeviasi {
    public static void main(String[] args){
        int n,adr;
        float[] x;
        float min,temp;
        
        Scanner Baca = new Scanner(System.in);
        System.out.print("Banyaknya data= "); n=Baca.nextInt();
        x = new float[n];
        for (int i=0;i<n;i++){
            System.out.print("data ke "+(i+1)+" = ");
            x[i]=Baca.nextInt();
        }
        System.out.println("\nData sebelum diurut: ");
        for (int i=0;i<n;i++) System.out.print(x[i]+" ");
        System.out.println(" ");
        for (int i=0;i<(n-1);i++){
            min=x[i];adr=i;
            for (int j=i+1;j<n;j++)
                if (min>x[j]){min=x[j];adr=j;}
            temp=x[i];x[i]=x[adr];x[adr]=temp;
        }
        System.out.println("\nData sesudah diurut: ");
        for (int i=0;i<n;i++) System.out.print(x[i]+" ");
        System.out.println(" ");
    }
}
