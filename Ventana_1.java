package autodate;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//ventana ingreso del vehiculo
public class Ventana_1 extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menu1, menu2;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;
    private JTextField textfield_Fecha, textfield_titular, textfield_marca, textfield_modelo, textfield_motor, textfield_color, textfield_contacto, textfield_Observaciones;
    private JLabel label_inicio, label_Fecha, label_titular, label_marca, label_modelo, label_motor, label_color, label_contacto, label_Observaciones, label_imagen;
    private JButton boton_verificación;
    
    public Ventana_1(){
        
        setLayout(null);
        setTitle("Autodate");
        getContentPane().setBackground(new Color(174,214,241));
        setIconImage(new ImageIcon(getClass().getResource("images/carro.png")).getImage());
        
        label_imagen = new JLabel();
        label_imagen.setIcon(new ImageIcon(getClass().getResource("images/carro.png")));
        label_imagen.setBounds(25,100,420,200);
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
        
        label_inicio = new JLabel("Porfavor ingrese la informacion del vehiculo. Complete TODOS los espacios.");
        label_inicio.setBounds(200,20,450,30);
        add(label_inicio);
        label_Fecha = new JLabel("Fecha de ingreso:");
        label_Fecha.setBounds(250,50,100,30);
        add(label_Fecha);
        label_titular = new JLabel("Titular:");
        label_titular.setBounds(250,80,100,30);
        add(label_titular);
        label_marca = new JLabel("Marca:");
        label_marca.setBounds(250,110,100,30);
        add(label_marca);
        label_modelo = new JLabel("Modelo:");
        label_modelo.setBounds(250,140,100,30);
        add(label_modelo);
        label_motor = new JLabel("Tipo de motor:");
        label_motor.setBounds(250,170,100,30);
        add(label_motor);
        label_color = new JLabel("Color:");
        label_color.setBounds(250,200,100,30);
        add(label_color);
        label_contacto = new JLabel("Contacto:");
        label_contacto.setBounds(250,230,100,30);
        add(label_contacto);
        label_Observaciones = new JLabel("Observaciones:");
        label_Observaciones.setBounds(250,260,100,30);
        add(label_Observaciones);
        
        
        textfield_Fecha = new JTextField();
        textfield_Fecha.setBounds(370,57,150,20);
        add(textfield_Fecha);
        textfield_titular = new JTextField();
        textfield_titular.setBounds(370,87,150,20);
        add(textfield_titular);
        textfield_marca = new JTextField();
        textfield_marca.setBounds(370,117,150,20);
        add(textfield_marca);
        textfield_modelo = new JTextField();
        textfield_modelo.setBounds(370,147,150,20);
        add(textfield_modelo);
        textfield_motor = new JTextField();
        textfield_motor.setBounds(370,177,150,20);
        add(textfield_motor);
        textfield_color = new JTextField();
        textfield_color.setBounds(370,207,150,20);
        add(textfield_color);
        textfield_contacto = new JTextField();
        textfield_contacto.setBounds(370,237,150,20);
        add(textfield_contacto);
        textfield_Observaciones = new JTextField();
        textfield_Observaciones.setBounds(370,267,300,100);
        add(textfield_Observaciones);
        
        
        boton_verificación = new JButton("Ingresar Información");
        boton_verificación.setBounds(350,400,200,30);
        add(boton_verificación);
        boton_verificación.addActionListener(this);
 }

 public void actionPerformed(ActionEvent e){
    
     Container fondo = this.getContentPane();
//barra de herramientas
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
       System.exit(0);
    }
    //botones
    if(e.getSource() == boton_verificación){    
        System.exit(0);
    }
 } 
 
//Ventana y caract
 public static void main(String args[]){
    
    Ventana_1 formulario1 = new Ventana_1();
    formulario1.setBounds(0,0,800,500);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);
    }
}
