/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Principal;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Trabajador trabajador = new Trabajador ();
        
        System.out.println("Registro de datos");
        System.out.println();
        
        System.out.print("Ingrese el codigo: ");
        int codigoTrabajador = input.nextInt();
        trabajador.setCodigo(codigoTrabajador);
        
        System.out.print("Ingrese el Nombre: ");
        input.nextLine();
        String nombreEmpleado = input.nextLine();
        trabajador.setNombre(nombreEmpleado);
        
        System.out.print("Ingrese el apellido 1: ");
        input.nextLine();
        String apellido1Empleado = input.nextLine();
        trabajador.setApellido1(apellido1Empleado);
        
        System.out.print("Ingrese el apellido 2: ");
        input.nextLine();
        String apellido2Empleado = input.nextLine();
        trabajador.setApellido2(apellido2Empleado);
        
        System.out.println("");
        
        
        System.out.print("Ingrese el Salario Mensual: ");
        double SalarioMensualTrabajador = input.nextDouble();
        trabajador.setSalarioMensual(SalarioMensualTrabajador);
        
        trabajador.calculoSalarioDiario(SalarioMensualTrabajador);
        
        System.out.println("");
        
        System.out.println("El salario diario del empleado" + " "+trabajador.getNombre() + " es $" + trabajador.getSalarioDiario());
        
        
    }
}
