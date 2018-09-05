/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Satrio
 */
public class DaftarAntrianDialog extends JDialog{
    private static JLabel judulLabel, namaLabel,normLabel,alamatLabel;
    private static JTextField namaText,normText,alamatText;
    private static JButton saveButton;
    
    public void init(){
        this.setLayout(null);
        
        judulLabel = new JLabel("DAFTAR PASIEN");
        judulLabel.setBounds(100,-30,100,90);
        this.add(judulLabel);
        
        
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(5,10,100,90);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.getText();
        namaText.setBounds(105,40,175,30);
        this.add(namaText);
        
        
        
        normLabel = new JLabel("No Rekam Medis");
        normLabel.setBounds (5,50,100,90);
        this.add(normLabel);
        
        normText = new JTextField();
        normText.getText();
        normText.setBounds(105,80,175,30);
        this.add(normText);
        
        
        
        alamatLabel = new JLabel("Alamat");
        alamatLabel.setBounds (5,90,100,90);
        this.add(alamatLabel);
        
        alamatText = new JTextField();
        alamatText.getText();
        alamatText.setBounds(105,120,175,30);
        this.add(alamatText);
        
        
        
        saveButton = new JButton("SIMPAN");
        saveButton.setBounds (100,180,100,30);
        this.add(saveButton);
        
    }
    
    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
}
    public DaftarAntrianDialog() {
        init();
    }
    
}
