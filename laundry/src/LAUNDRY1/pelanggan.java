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

public class pelanggan {
    private Integer kode_pelanggan;
    private String nama_pelanggan;
    private String alamat_pelanggan;
    private String telepon_pelanggan;
    private ArrayList<String> status_pelanggan;

    public pelanggan(Integer kode_pelanggan, String nama_pelanggan, String alamat_pelanggan, String telepon_pelanggan ) {
        this.kode_pelanggan = kode_pelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.alamat_pelanggan = alamat_pelanggan;
        this.telepon_pelanggan = telepon_pelanggan;
        status_pelanggan= new ArrayList<String>();
    }

    public Integer getKodepelanggan(){
        return kode_pelanggan;
    }
    public void setKodepelanggan(Integer kode_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
    }
            
    public String getNamapelanggan() {
        return nama_pelanggan;
    }

    public void setNamapelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamatpelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamatpelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }

    public String getTelepon_pelanggan() {
        return telepon_pelanggan;
    }

    public void setTeleponpelanggan(String telepon_pelanggan) {
        this.telepon_pelanggan = telepon_pelanggan;
    }
    
    
    public void insertStatuspelanggan(String isi) {
        this.status_pelanggan.add(isi);
    }
    
    public ArrayList<String> getrecordStatus_pelanggan() {
        return this.status_pelanggan;
    }
    
    public void tampilkanpelanggan() {
        System.out.println("kode pelanggan: " + kode_pelanggan);
        System.out.println("nama pelanggan: " + nama_pelanggan);
        System.out.println("alamat pelanggan: " + alamat_pelanggan);
        System.out.println("telepon pelanggan: " + telepon_pelanggan);
       
    }
    
   
   
   
 }
