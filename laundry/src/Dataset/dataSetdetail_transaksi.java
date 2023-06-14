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
public class dataSetdetail_transaksi {
    private ArrayList<Integer> kode_transaksi;
    private ArrayList<String> kode_tarif;
    private ArrayList<String> jumlah;
    
    
    //constructor
    public dataSetdetail_transaksi (){
        kode_transaksi= new ArrayList<Integer>();
        kode_tarif= new ArrayList<String>();
        jumlah= new ArrayList<String>();
        
    }
    
     public void tambahkode_transaksi(int value){
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

    public void insertkode_transaksi(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void insertkode_tarif(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void jumlah(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
}
    

