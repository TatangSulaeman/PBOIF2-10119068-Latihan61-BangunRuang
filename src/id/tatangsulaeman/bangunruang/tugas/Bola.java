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
public class Bola extends BangunRuang{
    public Bola(int r){
        super(r);
    }
    
    @Override
    public double volume(){
      return (4* 3.14 *(getR()*getR()*getR()))/3;  
    }
    
    @Override
    public void hasil(){
        System.out.println("Volume Bola adalah = "+ volume() + " cm3");
    }
}
