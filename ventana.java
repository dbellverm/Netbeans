/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dani_
 */
public class ventana extends JFrame {
      static JLabel logo,foot;
      static JMenuBar JMB_barramenu;
      static JMenu JM_archivo,JM_ajustes;
      static JMenuItem abrir,guardar_proyecto,guardar_proyecto_como,guardar_foto;
    
   
public ventana() {
        initVentanaPrincipal();
        initMenuInicial();
    }

    private void initVentanaPrincipal() {
        logo= new JLabel("MANAGER");
        foot= new JLabel("Creado por dani bellver martinez");
        JMB_barramenu= new JMenuBar();
        
         
         
    }
    private void initMenuInicial() {
        
    }

   
    
    
}

 
