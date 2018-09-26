/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Pasien.daftarPasienKlinik;
import java.util.ArrayList;

/**
 *
 * @author Satrio
 */
public class Pasien {

    private String noRekamMedis, nama, alamat, tempatLahir; //Pendeklarasian variabel bertipe data String
    private int tanggalLahir, bulanLahir, tahunLahir; //Pendeklarasian variabel bertipe data integer
    public static ArrayList <Pasien> daftarPasienKlinik = new ArrayList<Pasien>();
    
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String noRekamMedis) {//menambahkan konstruktor, Konsktruktor adalah method yang memiliki nama yang sama dengan nama kelas
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }

    public Pasien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public String getNoRekamMedis() { //membuat method bernama getNoRekamedis yang akan mereturn variabel noRekamMedis yang bertipe data String
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException { //membuat method void dengan menambahkan fungsi throws NumberFormatException
        if (noRekamMedis.toCharArray().length>=6) { //Method ini menyeleksi array baru, yang panjangnya harus sesuai dengan yang ditentukan sebelumnya
            this.noRekamMedis = noRekamMedis;
        }else{
                throw new NumberFormatException("Nomor Rekam Medis Salah"); //NumberFormatException berfungsi untuk memberitahu kesalahan user dalam format penulisan angka.
                }
    }

    public String getNama() { //membuat method baru yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) { //membuat method baru yang digunakan untuk memasukkan data dari parameter nama kedalam variabel nama
        this.nama = nama;
    }

    public String getAlamat() { //membuat method baru yang akan mereturn variabel bertipe data String
        return alamat;
    }

    public void setAlamat(String alamat) { //membuat method baru yang digunakan untuk memasukkan data dari parameter alamat kedalam variabel alamat
        this.alamat = alamat;
    }

    public String getTempatLahir() {//membuat method baru yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) { //membuat method baru yang digunakan untuk memasukkan data dari parameter tempatLahir kedalam variabel tempatLahir
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {//membuat method baru yang akan mereturn variabel bertipe data integer
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception { //membuat method void dengan menambahkan fungsi throws NumberFormatException
        if (tanggalLahir > 0 && tanggalLahir < 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception(" Tanggal Lahir Anda Tidak Valid "); //berfungsi untuk memberitahu kesalahan user dalam menginputkan tanggal lahir.
        }
    }

    public int getBulanLahir() {//membuat method baru yang akan mereturn variabel bertipe data integer
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception { //membuat method void dengan menambahkan fungsi throws NumberFormatException
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahir Anda Tidak Valid "); //berfungsi untuk memberitahu kesalahan user dalam menginputkan bulanLahir.
        }
    }

    public int getTahunLahir() {//membuat method baru yang akan mereturn variabel bertipe data integer
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {//membuat method void dengan menambahkan fungsi throws NumberFormatException
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception(" Tahun Lahir Anda Tidak Valid "); //berfungsi untuk memberitahu kesalahan user dalam menginputkan tahunLahir.
        }
    }
    
    
    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }
    
    public static Pasien cariPasien(String string) {
        for (int i = 0; i < daftarPasienKlinik.size();i++) {
            if (daftarPasienKlinik.get(i).noRekamMedis== string) {
                return daftarPasienKlinik.get(i);
            }
            
        }
        return null;
        
    }

    public void setNik(String text) throws Exception{
     
        if (text.length()== 6) {
            this.noRekamMedis=text;
        }else{
    
            throw new Exception("NIK harus terdiri dari 6 digit");
        }
    }
}
