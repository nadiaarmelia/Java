/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import static java.lang.System.out;
/**
 * penggunaan penyataan for, do while, while
 * @author ACER
 */
public class PengulanganLoop {
    public static void main(String[] args){
       int i,n,total;
       Scanner Baca = new Scanner(System.in);
       out.println("Banyaknya suku= "); n=Baca.nextInt();
       out.println("for:");
       total=0;
       for(i=1;i<n;i++){
           total+=i;//total=total+i
           out.print(i+"+");
       }
       total+=i;
       out.println(i+"="+total+"\n");
       out.println("while:");
       i=1;total=0;
       while (i<n){
           total+=i;//total=total+i
           out.print(i+"+");
           i++;
       }
       total+=i;
       out.println(i+"="+total+"\n");
       out.println("do while:");
       i=1; total=0;
       do{
           total+=i;//total=total+i
           out.print(i+"+");
           i++;
       }
       while(i<n);
       total+=i;
       out.println(i+"="+total+"\n");
    }
}
