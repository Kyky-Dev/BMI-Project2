package com.mycompany.bmi2;

    import java.util.Scanner;

public class BMI2 {

    public static void main(String[] args) {
        
        Scanner masukkan = new Scanner(System.in);
        
        int jk;
        float berat, tinggi, bmi, parameter;
        
        System.out.println("Perhitungan BMI");
        System.out.println("Masukkan Jenis Kelamin (1. Laki-laki) (2. Perempuan)");
        jk = masukkan.nextInt();
        
        System.out.println("Masukkan Berat Badan");
        berat = masukkan.nextFloat();
        System.out.println("Masukkan Tinggi Badan");
        tinggi = masukkan.nextFloat();
        
        parameter = tinggi/100;
        bmi = (berat/(parameter*parameter));
        
        System.out.println("Hasil BMI = " + bmi);
        
        if (bmi < 18){
            System.out.println("Berat Terlalu ringan !!!");
            System.out.println("Ayo makan lebih banyak");
        }
        else if(bmi > 18 && bmi <= 24){
            System.out.println("Beratmu Sudah Cukup !!!");
            System.out.println("Pertahankan pola makanmu");
        }
        else if(bmi > 24 && bmi <= 29){
            System.out.println("Beratmu Sedikit Terlalu Tinggi !!!");
            System.out.println("Lakukan diet");
        }
        else if(bmi > 29){
            System.out.println("Parah mennnnn Obesitas ini !!!");
            System.out.println("Olahraga woyyyy");
        }
        
    }
}