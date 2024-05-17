/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatFormP4;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author DELL
 */
public class DemoGui extends JFrame{
    JPanel jp= new JPanel();
    JTextField jt= new JTextField();
    JLabel jl= new JLabel("Contoh Tabel");
    
    public DemoGui(){
        add(jl);
        add(jt);
        add(jp);
        jl.setBounds(10,20,80,25);
        jt.setBounds(120,20,80,25);  
    }
    
    public static void main(String[] args){
        DemoGui demo=new DemoGui();
        
        demo.setTitle("Form dengan label dan textfield");
        demo.setSize(300,300);
        demo.setVisible(true);
    }
}
