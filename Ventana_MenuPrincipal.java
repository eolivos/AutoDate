package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
//ventana ingreso del vehiculo
public class Ventana_MenuPrincipal extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6;
    private JLabel label_operacion1, label_saludo, label_imagen;
    private JButton boton_consultar, boton_ingresar, boton_proceso;
    
    public Ventana_MenuPrincipal(){
        
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
        
        menuitem4 = new JMenuItem("Menú principal");
        menuitem4.addActionListener(this);
        menu1.add(menuitem4);
        
        menuitem5 = new JMenuItem("Cerrar Sesión");
        menuitem5.addActionListener(this);
        menu1.add(menuitem5);
        
        menuitem6 = new JMenuItem("Salir");
        menuitem6.addActionListener(this);
        menu1.add(menuitem6);
        
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
        boton_proceso = new JButton("Ingresar procedimiento a un vehiculo del sistema.");
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
       Ventana_MenuPrincipal VentanaMenuPrincipal = new Ventana_MenuPrincipal();
        VentanaMenuPrincipal.setBounds(0,0,800,500);
        VentanaMenuPrincipal.setVisible(true);
        VentanaMenuPrincipal.setResizable(false);
        VentanaMenuPrincipal.setLocationRelativeTo(null);
        this.setVisible(false);
    } 
    if(e.getSource() == menuitem5){
        Ventana_Usuario VentanaUsuario = new Ventana_Usuario();
        VentanaUsuario.setBounds(0,0,800,500);
        VentanaUsuario.setVisible(true);
        VentanaUsuario.setResizable(false);
        VentanaUsuario.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    if(e.getSource() == menuitem6){
        System.exit(0);
    }
     //botones
    if(e.getSource() == boton_consultar){
        Ventana_Consulta1 VentanaConsulta1 = new Ventana_Consulta1();
        VentanaConsulta1.setBounds(0,0,800,500);
        VentanaConsulta1.setVisible(true);
        VentanaConsulta1.setResizable(false);
        VentanaConsulta1.setLocationRelativeTo(null);
        this.setVisible(false);
    }
    if(e.getSource() == boton_ingresar){
        Ventana_Registro1 VentanaRegistro1 = new Ventana_Registro1();
        VentanaRegistro1.setBounds(0,0,800,500);
        VentanaRegistro1.setVisible(true);
        VentanaRegistro1.setResizable(false);
        VentanaRegistro1.setLocationRelativeTo(null);
        this.setVisible(false);
    
    }
    if(e.getSource() == boton_proceso){
        System.exit(0);
    }
 }
 
//Ventana y caract
 public static void main(String args[]){
    
    Ventana_MenuPrincipal VentanaMenuPrincipal = new Ventana_MenuPrincipal();
    VentanaMenuPrincipal.setBounds(0,0,800,500);
    VentanaMenuPrincipal.setVisible(true);
    VentanaMenuPrincipal.setResizable(false);
    VentanaMenuPrincipal.setLocationRelativeTo(null);
    }
}
