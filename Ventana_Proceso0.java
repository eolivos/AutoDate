package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

public class Ventana_Proceso0 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4, menuitem5, menuitem6;
  private JTextField textfield1;
  private JLabel label1, label_imagen3;
  private JButton boton1;

  public Ventana_Proceso0(){

    setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
            
        label_imagen3 = new JLabel();
        label_imagen3.setIcon(new ImageIcon(getClass().getResource("images/carro.png")));
        label_imagen3.setBounds(260,130,420,200);
        add(label_imagen3);
   
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
        
   label1 = new JLabel ("Ingrese la placa del vehiculo al cual desea añadir un proceso");
   label1.setBounds(200,20,1000,100);
   add(label1);

   textfield1 = new JTextField();
   textfield1.setBounds(320,100,150,20);
   add(textfield1);

   boton1 = new JButton("Siguiente");
   boton1.setBounds(350,350,100,30);
   add(boton1);
   boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
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
    
    
   if(e.getSource() == boton1){
    Ventana_Proceso1 VentanaProceso1 = new Ventana_Proceso1();
    VentanaProceso1.setBounds(0,0,800,500);
    VentanaProceso1.setVisible(true);
    VentanaProceso1.setResizable(false);
    VentanaProceso1.setLocationRelativeTo(null);
    this.setVisible(false);
   }
  }

  public static void main(String args[]){
  Ventana_Proceso0 VentanaProceso0 = new Ventana_Proceso0();
  VentanaProceso0.setBounds(0,0,800,500);
  VentanaProceso0.setVisible(true);
  VentanaProceso0.setResizable(false);
  VentanaProceso0.setLocationRelativeTo(null);
 }
}