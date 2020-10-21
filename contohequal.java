/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moch Lutfi
 */
public class contohequal {
  public static void main(String[] args) {
        int value = 5;
        int anotherValue = 5;
        //String status="Cantik";
        //String Statusdua="Cantik";
        boolean result;
        //boolean resultcantik;
       // resultcantik=status==statusdua;
        //System.out.println("hasilnya:"+resultcantik);
        result = value == anotherValue;
        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();
        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'result <= anotherValue' adalah " + result);
        System.out.println();
    }  
}
