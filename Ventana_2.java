package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
//ventana ingreso del vehiculo
public class Ventana_2 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;
    private JLabel label_operacion1, label_saludo, label_imagen;
    private JButton boton_consultar, boton_ingresar, boton_proceso;
    
    public Ventana_2(){
        
        setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
            
        label_imagen = new JLabel();
        label_imagen.setIcon(new ImageIcon(getClass().getResource("images/carro.png")));
        label_imagen.setBounds(0,100,420,200);
        add(label_imagen);
        
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        menuitem1 = new JMenuItem("Blanco");
        menuitem1.addActionListener(this);
        menu1.add(menuitem1);

        menuitem2 = new JMenuItem("Azul");
        menuitem2.addActionListener(this);
        menu1.add(menuitem2);

        menuitem3 = new JMenuItem("Gris");
        menuitem3.addActionListener(this);
        menu1.add(menuitem3);
        
        menuitem4 = new JMenuItem("Volver al inicio");
        menuitem4.addActionListener(this);
        menu1.add(menuitem4);
        
        label_saludo = new JLabel("Ingreso exitoso. Bienvenido de nuevo operador.");
        label_saludo.setBounds(250,50,450,30);
        add(label_saludo);
        label_operacion1 = new JLabel("Seleccione el proceso a realizar");
        label_operacion1.setBounds(300,100,450,30);
        add(label_operacion1);
        
        boton_consultar = new JButton("Consultar estado de un vehiculo en el sistema.");
        boton_consultar.setBounds(250,150,300,30);
        add(boton_consultar);
        boton_consultar.addActionListener(this);
        boton_ingresar = new JButton("Ingresar vehiculo nuevo al sistema.");
        boton_ingresar.setBounds(250,200,300,30);
        add(boton_ingresar);
        boton_ingresar.addActionListener(this);
        boton_proceso = new JButton("Ingresar vehiculo nuevo al sistema.");
        boton_proceso.setBounds(250,250,300,30);
        add(boton_proceso);
        boton_proceso.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
    //barra de herramientas
    Container fondo = this.getContentPane();

    if(e.getSource() == menuitem1){
       fondo.setBackground(new Color(254,254,254));
    }
    if(e.getSource() == menuitem2){
       fondo.setBackground(new Color(174,214,241));
    }
    if(e.getSource() == menuitem3){
       fondo.setBackground(new Color(214,219,223));
    }
    if(e.getSource() == menuitem4){
       Ventana_2 Ventana2 = new Ventana_2();
       Ventana2.setBounds(0,0,800,500);
       Ventana2.setVisible(true);
       Ventana2.setResizable(false);
       Ventana2.setLocationRelativeTo(null);
       this.setVisible(false);
       this.setVisible(false);
    } 
     //botones
    if(e.getSource() == boton_consultar){
    Ventana_03 Ventana03 = new Ventana_03();
    Ventana03.setBounds(0,0,800,500);
    Ventana03.setVisible(true);
    Ventana03.setResizable(false);
    Ventana03.setLocationRelativeTo(null);
    this.setVisible(false);
    }
    if(e.getSource() == boton_ingresar){
    Ventana_02 Ventana02 = new Ventana_02();
    Ventana02.setBounds(0,0,800,500);
    Ventana02.setVisible(true);
    Ventana02.setResizable(false);
    Ventana02.setLocationRelativeTo(null);
    
    }
    if(e.getSource() == boton_proceso){
        System.exit(0);
    }
 }
 
//Ventana y caract
 public static void main(String args[]){
    
    Ventana_2 Ventana2 = new Ventana_2();
    Ventana2.setBounds(0,0,800,500);
    Ventana2.setVisible(true);
    Ventana2.setResizable(false);
    Ventana2.setLocationRelativeTo(null);
    }
}
