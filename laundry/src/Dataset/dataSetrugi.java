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
    public class dataSetrugi {
    private ArrayList<Integer> kode_transaksi;
    private ArrayList<String> kode_tarif;
    private ArrayList<String> jumlah;
    private ArrayList<String> uangrugi;
    
    
    //constructor
    public dataSetrugi (){
        kode_transaksi= new ArrayList<Integer>();
        kode_tarif= new ArrayList<String>();
        jumlah= new ArrayList<String>();
        uangrugi= new ArrayList<String>();
        
    }
    
     public void tambahkode_transaksi(Integer value){
        kode_transaksi.add(value);
    }
     public ArrayList<Integer> getDatasetkode_transaksi(){
        return this.kode_transaksi;
    }
     
     public void tambahkode_tarif(String value){
        kode_tarif.add(value);
    }
     public ArrayList<String> getDatasetkode_tarif(){
        return this.kode_tarif;
    }
     
     public void tambahjumlah(String value){
        jumlah.add(value);
    }
     public ArrayList<String> getDatasetjumlah(){
        return this.jumlah;
    }
     
     public void tambahuangrugi(String value){
        uangrugi.add(value);
    }
     public ArrayList<String> getDatasetuangrugi(){
        return this.uangrugi;
    }

    public Object getDatasetalamat_pelanggan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
