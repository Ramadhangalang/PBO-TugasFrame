/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class rugi {
    private ArrayList<Integer> kode_transaksi;
    private Integer kode_tarif;
    private Integer jumlah;
    private Integer uangrugi;

    public rugi(Integer kode_tarif, Integer jumlah, Integer uangrugi) {
        kode_transaksi= new ArrayList<Integer>();
        this.kode_tarif = kode_tarif;
        this.jumlah = jumlah;
        this.uangrugi = uangrugi;
    }

   public void insertkode_user(Integer isi) {
        this.kode_transaksi.add(isi);
    }
    
    public ArrayList<Integer> getrecordkode_tansaksi() {
        return this.kode_transaksi;
    }
    
    public Integer getkode_tarif() {
        return kode_tarif;
    }

    public void setkode_tarif(Integer kode_tarif) {
        this.kode_tarif = kode_tarif;
    }
    
    public Integer getjumlah() {
        return jumlah;
    }

    public void setjumlahi(Integer jumlah) {
        this.jumlah = jumlah;
    }
    
    public Integer uangrugi() {
        return uangrugi;
    }

    public void setuangrugi(Integer uangrugi) {
        this.uangrugi = uangrugi;
    }
    
    public void tampiluangrugi() {
        System.out.println("kode transaksi: " + kode_transaksi);
        System.out.println("kode tarif: " + kode_tarif);
        System.out.println("nama jumlah: " + jumlah);
        System.out.println("uangrugi: " + uangrugi);
    }
    
}
