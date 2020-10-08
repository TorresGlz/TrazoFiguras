/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrazoFiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aldair
 */
public class Figuras extends JPanel {

    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;

    public Figuras() {
// inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 


       
        //Trazo de lineas
        g.setColor(Color.red);//color de la linea
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        g.setColor(Color.GRAY);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
        //Trazo de rectangulos
        g.setColor(Color.blue);
        g.drawRect(280, 50, 100, 50);
        
        //Trazo de rectangulo con relleno de color azul
        g.fillRect(280, 110, 100, 50);
        
        //Trazo de rectangulos redondeados (ovalos)
        g.setColor(Color.black);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        //Trazo de circulos
        g.setColor(Color.yellow);
        g.drawOval(100, 200, 80, 80);
        g.fillOval(100, 290, 50, 50);
        
        //Trazo de ovalos a traves de circunferencias
        g.setColor(Color.green);
        g.drawOval(280, 200, 80, 40);
        g.fillOval(200, 290, 40, 80);
        //g.fillOval(300, 200, 40, 40);
        
        //Trazo de triangulo
        g.setColor(Color.pink);
        g.drawLine(450, 300, 550, 300);
        g.drawLine(450, 300, 500, 250);
        g.drawLine(550, 300, 500, 250);
        
        //Dibujo de cadenas de texto
        g.setColor(Color.black);
        g.drawString("Ejemplo de trazo de figuras basicas", 200, 400);
        
        //Trazo de arcos normales
        //Figura 1: Solo contorno
        g.setColor(Color.red);
        g.drawArc(300, 350, 150, 200, 300, 200);
        //Figura 1: relleno0
        g.setColor(Color.yellow);
        g.fillArc(600, 350, 150, 200, 600, 270);
        g.setColor(Color.white);
        g.fillOval(520, 430, 90, 90);
        
        
        
    }
    
    
}
