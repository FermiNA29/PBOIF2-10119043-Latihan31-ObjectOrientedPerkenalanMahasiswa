/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan31.objectorientedperkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program perkenalan mahasiswa dengan object oriented
 */
public class PBOIF210119043Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10110270";
        mhs2.nama = "Indra Tiola";
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tanzil Ganefi";
        
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        
        mhs1.perkenalanDiri();
        mhs2.perkenalanDiri();
        mhs3.perkenalanDiri();
        mhs4.perkenalanDiri();
    }
    
}
