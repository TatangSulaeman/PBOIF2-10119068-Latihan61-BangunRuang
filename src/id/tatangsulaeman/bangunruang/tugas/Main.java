/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.bangunruang.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Bangun Ruang
 * 
 */
public class Main {
    public static void main(String[]args){
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(10,21);
        Kerucut kerucut = new Kerucut(9,14);
        
        bola.hasil();
        tabung.hasil();
        kerucut.hasil();
    }
}
