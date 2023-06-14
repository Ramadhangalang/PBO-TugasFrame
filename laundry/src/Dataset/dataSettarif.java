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
public class dataSettarif {
    private ArrayList<Integer> kode_tarif;
    private ArrayList<String> nama_pakaian;
    private ArrayList<Integer> tarif;
    private ArrayList<String> jenis_laundry;
    private ArrayList<String> paket;
    
    
    //constructor
    public dataSettarif (){
        kode_tarif = new ArrayList<Integer>();
        nama_pakaian = new ArrayList<String>();
        tarif = new ArrayList<Integer>();
        jenis_laundry = new ArrayList<String>();
        paket= new ArrayList<String>();
        
    }
     
     public void tambahkode_tarif(Integer value){
        kode_tarif.add(value);
    }
     public ArrayList<Integer> getDatasetkode_tarif(){
        return this.kode_tarif;
    }
     
     public void tambahnama_pakaian(String value){
        nama_pakaian.add(value);
    }
     public ArrayList<String> getDatasetnama_pakaian(){
        return this.nama_pakaian;
    }
     
     public void tambahtarif(Integer value){
        tarif.add(value);
    }
     public ArrayList<Integer> getDatasettarif(){
        return this.tarif;
    }
     
     public void tambahjenis_laundry(String value){
        jenis_laundry.add(value);
    }
     public ArrayList<String> getDatasetjenis_laundry(){
        return this.jenis_laundry;
    }
     
     public void tambahpaket(String value){
        paket.add(value);
    }
     public ArrayList<String> getDatasetpaket(){
        return this.paket;
    }

   
    
}
