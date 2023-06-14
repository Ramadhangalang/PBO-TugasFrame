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
public class dataSetpelanggan {
    private ArrayList<Integer> kode_pelanggan;
    private ArrayList<String> nama_pelanggan;
    private ArrayList<String> alamat_pelanggan;
    private ArrayList<String> telepon_pelanggan;
    private ArrayList<String> status_pelanggan;
    
    
    //constructor
    public dataSetpelanggan (){
        kode_pelanggan= new ArrayList<Integer>();
        nama_pelanggan= new ArrayList<String>();
        alamat_pelanggan= new ArrayList<String>();
        telepon_pelanggan= new ArrayList<String>();
        status_pelanggan= new ArrayList<String>();
        
    }
    
     public void tambahkode_pelanggan(Integer value){
        kode_pelanggan.add(value);
    }
     public ArrayList<Integer> getDatasetkode_pelanggan(){
        return this.kode_pelanggan;
    }
     
     public void tambahnama_pelanggan(String value){
        nama_pelanggan.add(value);
    }
     public ArrayList<String> getDatasetnama_pelanggan(){
        return this.nama_pelanggan;
    }
     
     public void tambahalamat_pelanggan(String value){
        alamat_pelanggan.add(value);
    }
     public ArrayList<String> getDatasetalamat_pelanggan(){
        return this.alamat_pelanggan;
    }
     
     public void tambahtelepon_pelanggan(String value){
        telepon_pelanggan.add(value);
    }
     public ArrayList<String> getDatasettelepon_pelanggan(){
        return this.telepon_pelanggan;
    }
     
     public void tambahstatus_pelanggan(String value){
        status_pelanggan.add(value);
    }
     public ArrayList<String> getDatasetstatus_pelanggan(){
        return this.status_pelanggan;
    }
    
}
