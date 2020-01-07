/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.triz.latihanmvc.controller;

import edu.triz.latihanmvc.model.PelangganModel;
import edu.triz.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 * 
 * Nama : Taufiq Rizky
 * NIM  : 10118080
 * Kls  : IF2/S1/3
 * 
 * @author USER
 */
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String tlp = view.getTxtTelpon().getText();
        String email = view.getTxtEmail().getText();
        
        if (nama.equals("") && tlp.equals("") && email.equals("")) {
            
        }else{
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String tlp = view.getTxtTelpon().getText();
        String email = view.getTxtEmail().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Nama Masih Kosong");
            
        }else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Email Masih Kosong");
            
        }else if (tlp.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "No Telpon Masih Kosong");
            
        }else{
            model.simpanForm();
        }
    }
}
