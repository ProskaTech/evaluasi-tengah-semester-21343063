/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;
import java.util.Scanner;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class soal_2 {
    public static void main(String[]args){
        int bil;
        Scanner in = new Scanner(System.in);
         
        System.out.println("Masukkan jumlah baris ");
        bil = in.nextInt();
        
        for(int i=0;i<=bil;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=bil-i;k++){
                System.out.print(" #");
            }
           System.out.println();
        }
        for(int i=1;i<=bil;i++){
           for(int j=1;j<=bil-i;j++){
               System.out.print(" ");
           }
            for (int k=1; k<=i; k++){
                System.out.print(" *");
                  
            }
           System.out.println("");
        }
    }
}
