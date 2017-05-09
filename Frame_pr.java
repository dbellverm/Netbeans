/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


/**
 *
 * @author dani_
 */
public class Frame_pr extends JFrame {
    static  connection c1= new connection(); 
    static JLabel jl_logo,jl_mprin,jl_resul,jl_foot;
    static JPanel jp_header,jp_nav,jp_section,jp_foot;
    
  public Frame_pr(){
    
     c1.setConex();
     this.getVentanapr();
     this.setVisible(true);
    
      
      
  }

    /**
     *
     */
    public void getVentanapr(){
      
  
      
      
    this.setLayout(new BorderLayout());
  
    
    
    
  
    jl_logo=new JLabel("PROGRAMA");
    jl_mprin=new JLabel("Menu Principal");
    jl_resul=new JLabel("Resultados");
    jl_foot=new JLabel("Dbellverm");
    
    jp_header.setLayout(new FlowLayout(FlowLayout.CENTER));
    jp_nav.setLayout(new GridLayout(5,1));
    jp_section.setLayout(new BorderLayout());
    jp_foot.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    
    
  
  
  
  
    jp_header.add(jl_logo);
    jp_nav.add(jl_mprin);
    jp_foot.add(jl_foot);
  
    
    
    
    this.add(jp_header,BorderLayout.NORTH);
    this.add(jp_nav,BorderLayout.WEST);
    this.add(jp_section,BorderLayout.CENTER);
    this.add(jp_foot, BorderLayout.SOUTH);
  
  
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(400,300);
    this.setSize(800,600);
    this.setVisible(true);
    
            
  }
  
  
  public void getventana2(){
      
      
  }
    
}
