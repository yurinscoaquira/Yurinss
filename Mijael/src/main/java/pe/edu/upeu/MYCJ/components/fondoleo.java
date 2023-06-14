/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.MYCJ.components;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pe.edu.upeu.MYCJ.util.UtilsX;

/**
 *
 * @author Lab Software
 */
public class fondoleo extends JPanel{
    private Image image;
    public String nombreImg="";
    UtilsX obj=new UtilsX();

    public fondoleo() {
    }
        
    @Override
    public void paint(Graphics g){
        image=new ImageIcon(obj.getFile("elena.png")).getImage();
        
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    
   
    
}
