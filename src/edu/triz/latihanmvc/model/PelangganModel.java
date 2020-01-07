/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.triz.latihanmvc.model;

import edu.triz.latihanmvc.event.pelangganListener;
import javax.swing.JOptionPane;

/**
 * 
 * Nama : Taufiq Rizky
 * NIM  : 10118080
 * Kls  : IF2/S1/3
 * 
 * @author USER
 */
public class PelangganModel {
    private String nama,email,telp;
    private pelangganListener pelangganListener;

    public pelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(pelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    
      

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganListener != null) {
            pelangganListener.onChange(this);
            
        }
    }
    
    public void  resetForm(){
        setNama("");
        setEmail("");
        setTelp("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    }
    
}
