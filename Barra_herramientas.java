import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Barra_herramientas extends JFrame implements ActionListener{
 
  private JMenuBar menubar;
  private JMenu menu1;
  private JMenuItem menuitem1, menuitem2, menuitem3;

  public Barra_herramientas(){
    setLayout(null);
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
  }  

  public static void main(String args[]){
   Barra_herramientas formulario1 = new Barra_herramientas();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
  }
}