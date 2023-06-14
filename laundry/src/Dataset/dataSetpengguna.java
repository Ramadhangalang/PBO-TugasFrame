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
    public class dataSetpengguna {
    private ArrayList<Integer> kode_user;
    private ArrayList<String> nama_user;
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    
    //constructor
        public dataSetpengguna (){
        kode_user= new ArrayList<Integer>();
        nama_user = new ArrayList<String>();
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        
    }
    
     public void tambahkode_user(Integer value){
        kode_user.add(value);
    }
     public ArrayList<Integer> getDatasetkode_user(){
        return this.kode_user;
    }
     
     public void tambahnama_user(String value){
        nama_user.add(value);
    }
     public ArrayList<String> getDatasetnama_user(){
        return this.nama_user;
    }
     
     public void tambahusername(String value){
        username.add(value);
    }
     public ArrayList<String> getDatasetusername(){
        return this.username;
    }
    
     public void tambahpassword(String value){
        password.add(value);
    }
     public ArrayList<String> getDatasetpassword(){
        return this.password;
    }
    
}
