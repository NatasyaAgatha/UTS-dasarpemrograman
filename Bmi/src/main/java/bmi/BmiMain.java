/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author WINDOWS 10
 */
public class BmiMain {
    public static void main(String[] args) {
        // Set nilai langsung dalam kode
        Bmi bmiLakiLaki = new Bmi(70, 1.75, "laki-laki");
        bmiLakiLaki.tampilkanHasil();

        System.out.println("\n"); // Pemisah antar hasil

        Bmi bmiPerempuan = new Bmi(55, 1.60, "perempuan");
        bmiPerempuan.tampilkanHasil();
    }
}
