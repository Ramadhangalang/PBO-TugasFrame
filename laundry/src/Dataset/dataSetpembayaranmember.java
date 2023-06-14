/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class dataSetpembayaranmember {
    private ArrayList<Integer> kode_vip;
    private ArrayList<Integer> kode_pelanggan;
    private ArrayList<String> tanggal_pembayaran;
    private ArrayList<Integer> pembayaran;
    private ArrayList<String> status_pembayaran;
    private ArrayList<Integer> kode_user;
    private ArrayList<String> tanggal_tempo;
    
    
    //constructor
    public dataSetpembayaranmember (){
        kode_vip = new ArrayList<Integer>();
        kode_pelanggan = new ArrayList<Integer>();
        tanggal_pembayaran = new ArrayList<String>();
        pembayaran = new ArrayList<Integer>();
        status_pembayaran = new ArrayList<String>();
        kode_user = new ArrayList<Integer>();
        tanggal_tempo = new ArrayList<String>();
        
    }
    
     public void tambahkode_vip(Integer value){
        kode_vip.add(value);
    }
     public ArrayList<Integer> getDatasetkode_vip(){
        return this.kode_vip;
    }
     
     public void tambahkode_pelanggan(Integer value){
        kode_pelanggan.add(value);
    }
     public ArrayList<Integer> getDatasetkode_pelanggan(){
        return this.kode_pelanggan;
    }
     
     public void tambahtanggal_pembayaran(String value){
        tanggal_pembayaran.add(value);
    }
     public ArrayList<String> getDatasettanggal_pembayaran(){
        return this.tanggal_pembayaran;
    }
     
     public void tambahpembayaran(Integer value){
        pembayaran.add(value);
    }
     public ArrayList<Integer> getDatasetpembayaran(){
        return this.pembayaran;
    }
     
     public void tambahstatus_pembayaran(String value){
        status_pembayaran.add(value);
    }
     public ArrayList<String> getDatasetstatus_pembayaran(){
        return this.status_pembayaran;
    }
     
     public void tambahkode_user(Integer value){
        kode_user.add(value);
    }
     public ArrayList<Integer> getDatasetkode_user(){
        return this.kode_user;
    }
     
     public void tambahtanggal_tempo(String value){
        tanggal_tempo.add(value);
    }
     public ArrayList<String> getDatasettanggal_tempo(){
        return this.tanggal_tempo;
    }
    
}
