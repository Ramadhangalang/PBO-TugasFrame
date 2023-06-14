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

public class tarif {
    private int kode_tarif;
    private String nama_pakaian;
    private Integer tarif;
    private String jenis_laundry;
    private ArrayList<String> paket;

    public tarif(int kode_tarif, String nama_pakaian, int tarif, String jenis_laundry ) {
        this.kode_tarif = kode_tarif;
        this.nama_pakaian = nama_pakaian;
        this.tarif = tarif; 
        this.jenis_laundry = jenis_laundry;
        paket= new ArrayList<String>();
    }

    public int getkode_tarif() {
        return kode_tarif;
    }

    public void setkode_tarif(int kode_tarif) {
        this.kode_tarif = kode_tarif;
    }

    public String getnama_pakaian() {
        return nama_pakaian;
    }

    public void setnama_pakaian (String nama_pakaian) {
        this.nama_pakaian = nama_pakaian;
    }
    
    public int gettarif() {
        return tarif;
    }

    public void settarif (int tarif) {
        this.tarif = tarif;
    }
    
    public String getjenis_laundry() {
        return jenis_laundry;
    }

    public void setjenis_laundry (String jenis_laundry) {
        this.jenis_laundry = jenis_laundry;
    }
    
     public void insertpaket(String isi) {
        this.paket.add(isi);
    }
    
    public ArrayList<String> getrecordpaket() {
        return this.paket;
    }

    public void tampilkantarif() {
        System.out.println("kode tarif: " + kode_tarif);
        System.out.println("nama pakaian: " + nama_pakaian);
        System.out.println("tarif: " + tarif);
        System.out.println("jenis laundry: " + jenis_laundry);
    }
}
