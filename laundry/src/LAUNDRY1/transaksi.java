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

import java.util.Date;

public class transaksi {
    private ArrayList<Integer> kode_transaksi;
    private Integer idPelanggan;
    private Integer idLayanan;
    private String tanggalTransaksi;
    private String totalHarga;

    // Constructor
    public transaksi( Integer idPelanggan, Integer idLayanan, String tanggalTransaksi, String totalHarga) {
        kode_transaksi= new ArrayList<Integer>();
        this.idPelanggan = idPelanggan;
        this.idLayanan = idLayanan;
        this.tanggalTransaksi = tanggalTransaksi;
        this.totalHarga = totalHarga;
    }

    // Getter dan Setter untuk properti
    public void insertkode_transaksi(Integer isi) {
        this.kode_transaksi.add(isi);
    }

     public ArrayList<Integer> getrecordkode_tansaksi() {
        return this.kode_transaksi;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(Integer idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(Integer idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Method lain yang relevan
    public void tampilkantransaksi() {
        
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("ID Layanan: " + idLayanan);
        System.out.println("Tanggal Transaksi: " + tanggalTransaksi);
        System.out.println("Total Harga: " + totalHarga);
    }
}
