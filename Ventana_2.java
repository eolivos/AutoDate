import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
//ventana ingreso del vehiculo
public class Ventana_2 extends JFrame implements ActionListener{

    private JLabel label_operacion1, label_saludo;
    private JButton boton_consultar, boton_ingresar, boton_proceso;
    
    public Ventana_2(){
        
        setLayout(null);
        setTitle("Autodate");
        setBackground(new Color(80,20,20));
        
        
        label_saludo = new JLabel("Ingreso exitoso. Bienvenido de nuevo operador.");
        label_saludo.setBounds(250,150,450,30);
        add(label_saludo);
        label_operacion1 = new JLabel("Seleccione el proceso a realizar");
        label_operacion1.setBounds(300,200,450,30);
        add(label_operacion1);
        
        boton_consultar = new JButton("Consultar estado de un vehiculo en el sistema.");
        boton_consultar.setBounds(250,250,300,30);
        add(boton_consultar);
        boton_consultar.addActionListener(this);
        boton_ingresar = new JButton("Ingresar vehiculo nuevo al sistema.");
        boton_ingresar.setBounds(250,300,300,30);
        add(boton_ingresar);
        boton_ingresar.addActionListener(this);
        boton_proceso = new JButton("Ingresar vehiculo nuevo al sistema.");
        boton_proceso.setBounds(250,350,300,30);
        add(boton_proceso);
        boton_proceso.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
    
    if(e.getSource() == boton_consultar){
        System.exit(0);
    }
    if(e.getSource() == boton_ingresar){
        System.exit(0);
    }
    if(e.getSource() == boton_proceso){
        System.exit(0);
    }
 }
 
//Ventana y caract
 public static void main(String args[]){
    
    Ventana_2 formulario1 = new Ventana_2();
    formulario1.setBounds(0,0,800,500);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
    }
}
