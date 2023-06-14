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
public class dataSettransaksi {
private ArrayList<Integer> kode_transaksi;
    private ArrayList<Integer> idPelanggan;
    private ArrayList<Integer> idLayanan;
    private ArrayList<String> tanggalTransaksi ;
    private ArrayList<String> totalHarga;
    
    
    
    //constructor
    public dataSettransaksi (){
        kode_transaksi= new ArrayList<Integer>();
        idPelanggan = new ArrayList<Integer>();
        idLayanan= new ArrayList<Integer>();
        tanggalTransaksi = new ArrayList<String>();
        totalHarga = new ArrayList<String>();
        
    }
    
     public void tambahkode_transaksi(Integer value){
        kode_transaksi.add(value);
    }
     public ArrayList<Integer> getDatasetkode_transaksi(){
        return this.kode_transaksi;
    }
     
     public void tambahidPelanggan(Integer value){
        idPelanggan.add(value);
    }
     public ArrayList<Integer> getDatasetidPelanggan(){
        return this.idPelanggan;
    }
     
     public void tambahidLayanan(Integer value){
        idLayanan.add(value);
    }
     public ArrayList<Integer> getDatasetidLayanan(){
        return this.idLayanan;
    }
     
     public void tambahtanggalTransaksi(String value){
        tanggalTransaksi.add(value);
    }
     public ArrayList<String> getDatasettanggalTransaksi(){
        return this.tanggalTransaksi;
    }    
     
     public void tambahtotalHarga(String value){
        totalHarga.add(value);
    }
     public ArrayList<String> getDatasettotalHarga(){
        return this.totalHarga;
    }    
     
}
