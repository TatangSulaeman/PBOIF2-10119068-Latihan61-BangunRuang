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
public class Tabung extends BangunRuang {
    private int t;

    public Tabung(int t, int r) {
        super(r);
        this.t = t;
    }

    public int getT() {
        return t;
    }
    
    public double alas(){
        return 3.14 * (getR()*getR());
        
    }
    
    @Override
    public double volume(){
        return alas()*getT();
    }
    
    @Override
    public void hasil(){
        System.out.println("Volume Tabung adalah  = "+volume()+" cm3");
    }
}
