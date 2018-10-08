/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10117061.latihan31.objectoriented.perkenalanmahasiswa;

/**
 * Nama     : Fachrian harits Pratama
 * NIM      : 10117061
 * Kelas    : IF-2
 * Deskripsi program: Menampilkan nama berdasarkan objek orientasi
 * 
 */
public class PB0210117061Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10110269";
        mhs1.nama = "Bang";
        mhs1.perkenalkanDiri(mhs1.nim , mhs1.nama);
        
        Mahasiswa mhs2 =  new Mahasiswa();
        mhs2.nim = "1011070";
        mhs2.nama = "Ousama";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
    
        Mahasiswa mhs3 =  new Mahasiswa();
        mhs3.nim = "1011061";
        mhs3.nama = "Ouja";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
    }

}
