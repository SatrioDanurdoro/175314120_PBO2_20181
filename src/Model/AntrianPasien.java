/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Satrio
 */
public class AntrianPasien {
    private int tanggalAntrian, bulanAntrian, tahunAntrian; //Pendeklarasian variabel bertipe data integer
    private Klinik klinik; //Pendeklarasian variabel bertipe data Klinik 
    private Pasien daftarPasienAntri[]; // pendeklarasian array bertipe data pasien 
    private AntrianPasien daftarAntrian[];

    public Klinik getKlinik() {//membuat method baru yang akan mereturn variabel bertipe data klinik
        return klinik;
    }

    public void setKlinik(Klinik klinik) {//membuat method baru yang digunakan untuk memasukkan data dari parameter klinik kedalam variabel klinik
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {//membuat method baru yang akan mereturn variabel bertipe data aray pasien
        return daftarPasienAntri;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {//membuat method baru yang digunakan untuk memasukkan data dari parameter daftarPasien kedalam variabel daftarPasien
        this.daftarPasienAntri = daftarPasien;
    }
    
    
    public void mendaftar(Pasien pasien, int tanggal, int bulan, int tahun){
    
    }
    
    
    public static AntrianPasien cariPasien (String noRM){
        
    }
    
    
    public static Pasien cariPasien(String noRM, int tanggal, int bulan, int tahun){
        
    }
    
    
    public static void buatAntrian ( int tanggal, int bulan, int tahun, Klinik klinik){
        
    }
}
    
