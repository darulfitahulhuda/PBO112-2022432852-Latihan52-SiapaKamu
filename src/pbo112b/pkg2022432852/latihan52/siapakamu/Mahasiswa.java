/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112b.pkg2022432852.latihan52.siapakamu;

/**
 *
 * @author Mini Pc
 */
public class Mahasiswa extends Manusia {
    protected String nim;
    protected String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void kelasApa() {
        System.out.println("Saya Nindi umur 17 tahun sedang belajar di kelas PBO2");
    }

    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
