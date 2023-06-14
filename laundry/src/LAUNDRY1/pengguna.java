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
    public class pengguna {
    private ArrayList<Integer> kode_user;
    private String nama_user;
    private String username;
    private String password;
  
    // Constructor
    public pengguna(String nama_user, String username, String password) {
        kode_user= new ArrayList<Integer>();
        this.nama_user = nama_user;
        this.username = username;
        this.password = password;
    }
  
    // Getter dan Setter untuk properti
    public void insertkode_user(Integer isi) {
        this.kode_user.add(isi);
    }
    
    public ArrayList<Integer> getrecordkode_user() {
        return this.kode_user;
    }
  
    public String getnama_user() {
        return nama_user;
    }
  
    public void setnama_user(String nama_user) {
        this.nama_user = nama_user;
    }
  
    public String getUsername() {
        return username;
    }
  
    public void setUsername(String username) {
        this.username = username;
    }
  
    public String getPassword() {
        return password;
    }
  
    public void setPassword(String password) {
        this.password = password;
    }
  
    // Method lain yang relevan
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
  
    public void tampilkanpengguna() {
        
        System.out.println("nama_user: " + nama_user);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

