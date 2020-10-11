
package autodate;
import java.util.Scanner;

public class Autodate {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario = "", contraseña = ""; 
        int menu1 = 0;
        
            //falta interfaz grafica
            //Acá debe salir la imagen del programa antes de saludar
        
        System.out.println("*********************************************************************");
        System.out.println("**Bienvenido al servicio de registro y consulta de autos, AUTODATE.**");
        System.out.println("*********************************************************************\n\n");
        
        System.out.println("Ingrese su usuario, porfavor:");
        usuario=entrada.nextLine();
        System.out.println("Ingrese su usuario, porfavor:");
        contraseña=entrada.nextLine();
        
        if (usuario==usuario && contraseña==contraseña){
        
            System.out.println("¡Bienvenido señor operador!\n\n\n");
            System.out.println("¿Que desea realizar el dia de hoy?");
            System.out.println("1 -> Consultar vehiculo existente\n\n");
            System.out.println("2 -> Ingresar vehiculo nuevo\n\n");
        
        } else { 
            System.out.println("Usuario o contraseña son incorrectos, por favor intentelo de nuevo");
            
        }
        
    }
    
}
