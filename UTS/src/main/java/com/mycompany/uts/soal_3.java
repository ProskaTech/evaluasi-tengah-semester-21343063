package com.mycompany.uts;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * created by 21343063_Nurul Husna
 */
public class soal_3 {
    public static void main(String[]args){
        String bil;
        int bil2;
        
        bil = JOptionPane.showInputDialog("Masukkan angka ");
        bil2 = Integer.parseInt(bil); 
        if (bil2 >= 0){
            System.out.println("Bilangan "+bil2+" Merupakan Bilangan Positif!");
            String msg = "Bilangan "+bil2+" Merupakan Bilangan Positif!";
            JOptionPane.showMessageDialog(null, msg);
        }
        else if(bil2 <0){
            System.out.println("Bilangan "+bil2+" Merupakan Bilangan Negatif!");
            String msg = "Bilangan "+bil2+" Merupakan Bilangan Negatif!";
            JOptionPane.showMessageDialog(null, msg);
        }
        else {
            System.out.println("Mohon Masukkan Angka yang Benar!");
            String msg = "Mohon Masukkan Angka yang Benar!";
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
