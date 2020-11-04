/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
        
/**
 *
 * @author Moch Lutfi
 */
public class inputoputput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("penjumlahan");
        System.out.print("Masukan angka pertama : ");
        int value = scanner.nextInt();         
        System.out.print("Masukan angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value / anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
