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
public class detail_transaksi {
    private Integer kode_transaksi;
    private Integer kode_tarif;
    private ArrayList<Integer> jumlah;

    // Constructor
    public detail_transaksi(Integer kode_transaksi, Integer kode_tarif) {
        this.kode_transaksi = kode_transaksi;
        this.kode_tarif = kode_tarif;
        jumlah=new ArrayList<Integer>();
        
    }

    // Getter dan Setter untuk properti
    public Integer getkode_transaksi() {
        return kode_transaksi;
    }

    public void setkode_transaksi(Integer kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }


     public Integer getkode_tarif() {
        return kode_tarif;
    }

    public void setkode_tarif(Integer kode_tarif) {
        this.kode_tarif= kode_tarif;
    }
    
    
    public void insertjumlah(Integer isi) {
        this.jumlah.add(isi);
    }

   public ArrayList<Integer> getrecordjumlah() {
        return this.jumlah;
    }

   

    public void detail_transaksi() {
        System.out.println("kode_transaksi: " + kode_transaksi);
        System.out.println("kode_tarif: " + kode_tarif);
        
        
    }

    public detail_transaksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

