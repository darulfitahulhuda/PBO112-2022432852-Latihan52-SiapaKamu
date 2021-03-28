/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112b.pkg2022432852.latihan52.siapakamu;

/**
 *
 * @author Mini 
 * Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : Siapa Kamu
 */
public class PBO112B2022432852Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen d = new Dosen();
        d.setNip("41227829930");
        System.out.println("NIP DOSEN : " + d.getNip());
        d.siapaKamu();
        d.mengajarApa();

        System.out.println("");

        Mahasiswa m = new Mahasiswa();
        m.setNim("10110269");
        System.out.println("NIM MAHASISWA : " + m.getNim());
        m.siapaKamu();
        m.kelasApa();
    }

}
