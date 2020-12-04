/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116415.miaaisyahf.no1;

import java.util.Scanner;

/**
 * Nama : MIA AISYAH F
 * Kelas: PBO-2
 * NIM  : 10116415
 * Deskripsi Program : Uts Program nomor 1 TANDANYA KAMU
 */
public class UTSIF210116415MIAAISYAHFNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Age age = new Age(2020);

        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Tahun lahir anda : ");
        age.setYearBirth(scn.nextInt());
        
        System.out.println("======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth(0));
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "
                + age.hitungUmur()+ " tahun");
        System.out.println("Tandanya Kamu : "+ age.tandanyaKamu(age.hitungUmur()));
    

    }
    
}
