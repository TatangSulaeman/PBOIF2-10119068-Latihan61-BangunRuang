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
public abstract class BangunRuang {
    private int r;
    
    public BangunRuang(int r){
        this.r = r;
    }

    public int getR() {
        return r;
    }
    
    public abstract double volume();
    public abstract void hasil();
}
