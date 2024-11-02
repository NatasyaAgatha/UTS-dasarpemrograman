/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author WINDOWS 10
 */
public class Bmi {
       // Variabel untuk berat, tinggi, dan gender
    private double beratBadan;
    private double tinggiBadan;
    private String gender;

    // Konstruktor untuk mengatur nilai variabel
    public Bmi(double beratBadan, double tinggiBadan, String gender) {
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
        this.gender = gender;
    }

    // Metode untuk menghitung BMI
    public double hitungBMI() {
        return beratBadan / (tinggiBadan * tinggiBadan);
    }

    // Metode untuk menentukan kategori BMI
    public String kategoriBMI() {
        double bmi = hitungBMI();
        
        if (gender.equals("laki-laki")) {
            if (bmi < 18.5) return "Kurus";
            else if (bmi < 24.9) return "Normal";
            else if (bmi < 29.9) return "Berat Badan Lebih";
            else return "Obesitas";
        } else {
            if (bmi < 17.5) return "Kurus";
            else if (bmi < 23.9) return "Normal";
            else if (bmi < 29.9) return "Berat Badan Lebih";
            else return "Obesitas";
        }
    }

    // Metode untuk menampilkan hasil
    public void tampilkanHasil() {
        System.out.println("Berat Badan : " + beratBadan + " kg");
        System.out.println("Tinggi Badan: " + tinggiBadan + " m");
        System.out.println("Gender      : " + gender);
        System.out.println("BMI         : " + hitungBMI());
        System.out.println("Kategori    : " + kategoriBMI());
    }
}
