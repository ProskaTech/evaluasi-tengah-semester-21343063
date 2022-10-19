/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts;

/**
 *
 * created by 21343063_Nurul Husna
 */
public class soal_1 {
    public static void main(String args[]){
        int bil=5,angka=1;
        
        for(int z=1;z<=1;z++){
            for(int x=1;x<=z;x++){
                System.out.print(" ");
            }
            for(int y=2;y<=5;y++){
                System.out.print(y);
                if(y==2-1){
                    System.out.print(" ");
                }
                if(y==3){
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int a=0;a<1;a++){
            for (int b=1;b==0;b--){
                System.out.print(" ");
            }
            for(int c=1;c<=2*(bil-a)-2;c++){
                if(c==5){
                    System.out.print(" ");
                }
                System.out.print(c);
            }
            System.out.println();
        }
        for (int i=0;i<=bil;i++){ 
            for (int j=1; j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(bil-i)-1;k++){
               System.out.print(angka++);
            }
            System.out.println();
            angka=1;
        }
    }
}