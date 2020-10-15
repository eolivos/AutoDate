import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//ventana ingreso del vehiculo
public class Ventana_1 extends JFrame implements ActionListener{

    private JMenuBar mb;
    private JMenu Opciones, Volver;
    private JTextField textfield_Fecha, textfield_titular, textfield_marca, textfield_modelo, textfield_motor, textfield_color, textfield_contacto, textfield_Observaciones;
    private JLabel label_inicio, label_Fecha, label_titular, label_marca, label_modelo, label_motor, label_color, label_contacto, label_Observaciones;
    private JButton boton_verificación;
    String usuario="1", contraseña="2";
    
    public Ventana_1(){
        
        setLayout(null);
        setTitle("Autodate");
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
