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


public class pembayaranmember {
    private Integer kode_vip;
    private Integer kode_pelanggan;
    private String tanggal_pembayaran;
    private Integer pembayaran;
    private String status_pembayaran;
    private Integer kode_user;
    private ArrayList<String> tanggal_tempo;

    // Constructor
    public pembayaranmember(Integer kode_vip, Integer kode_pelanggan, String tanggal_pembayaran, Integer Pembayaran, String status_pembayaran, Integer kode_user ) {
        this.kode_vip = kode_vip;
        this.kode_pelanggan = kode_pelanggan;
        this.tanggal_pembayaran = tanggal_pembayaran;
        this.pembayaran = Pembayaran;
        this.status_pembayaran = status_pembayaran;
        this.kode_user = kode_user;
        tanggal_tempo= new ArrayList<String>();
    }

    // Getter dan Setter untuk properti
    public Integer getkode_vip() {
        return kode_vip;
    }

    public void setkode_vip(Integer kode_vip) {
        this.kode_vip = kode_vip;
    }

    public int getkode_pelanggan() {
        return kode_pelanggan;
    }

    public void setkode_pelanggan(Integer kode_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
    }

    public String gettanggal_pembayaran() {
        return tanggal_pembayaran;
    }

    public void settanggal_pembayaran(String tanggal_pembayaran) {
        this.tanggal_pembayaran = tanggal_pembayaran;
    }

    public Integer getpembayaran() {
        return pembayaran;
    }

    public void setpembayaran(Integer pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getstatus_pembayaran() {
        return status_pembayaran;
    }

    public void setstatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }
    
    public Integer getkode_user() {
        return kode_user;
    }

    public void setkode_user(Integer kode_user) {
        this.kode_user = kode_user;
    }
    
     public void inserttanggal_tempo(String isi) {
        this.tanggal_tempo.add(isi);
    }
    
    public ArrayList<String> getrecordtanggal_tempo() {
        return this.tanggal_tempo;
    }
    
    // Method lain yang relevan
    public void pembayaranmember() {
        System.out.println("kode_vip: " + kode_vip);
        System.out.println("kode_pelanggan: " + kode_pelanggan);
        System.out.println("Tanggal Pembayaran: " + tanggal_pembayaran);
        System.out.println("pembayaran: " + pembayaran);
        System.out.println("status_pembayaran: " + status_pembayaran);
        System.out.println("kode_user: " + kode_user);
    }
    }    

