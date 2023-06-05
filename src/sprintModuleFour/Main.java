package sprintModuleFour;
import sprintModuleFour.entity.Administrative;
import sprintModuleFour.entity.Customer;
import sprintModuleFour.entity.Professional;
import sprintModuleFour.entity.Training;
import sprintModuleFour.service.Container;

import java.util.Scanner;

/**
 * 
 * @author Jorge Moraga C.
 * Gustavo Ruiz S.
 * Juan Pino C.
 * Harold Klapp
 * 
 * @version 1.0 23-05-2023
 *
 */

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Customer customer = null;
        Training training = null;
        Professional professional;
        Administrative administrative;
        Scanner sc = new Scanner(System.in);
       
/**
* 
* Bucle do-while que es el punto de inicio del programa, muestra el menu y realiza las operaciones seleccionadas por el usuario.
* 
* @param option Numero entero corresponde a opcion escogida por el usuario para realizar un accion en el programa. 
*/
        
        int option;
        do{
            System.out.println("======= Menu Principal =======");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitacion");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opcion: ");
            option = sc.nextInt();
            sc.nextLine();
            
            switch (option){
                case 1:
                    String names, lastNames;
                    do {
                        System.out.print("Ingrese nombres del cliente: ");
                        names = sc.nextLine();
                    }while(names.length() < 5 || names.length() > 30);
                    do {
                        System.out.print("Ingrese apellidos del cliente: ");
                        lastNames = sc.nextLine();
                    }while(lastNames.length() < 5 || lastNames.length() > 30);
                    System.out.print("Ingrese fecha de nacimiento del cliente (dd-mm-yyyy): ");
                    String birthDate = sc.nextLine();
                    while(birthDate.length() == 0){
                        System.out.print("Ingrese fecha de nacimiento del cliente (dd-mm-yyyy): ");
                        birthDate = sc.nextLine();
                    }
                    System.out.print("Ingrese rut del cliente (menor a 99999999): ");
                    int rut = sc.nextInt();
                    sc.nextLine();
                    while(rut > 99999999){
                        System.out.print("Ingrese rut del cliente (menor a 99999999): ");
                        rut = sc.nextInt();
                    }
                    System.out.print("Ingrese el telefono del cliente: ");
                    String phone = sc.nextLine();
                    while(phone.length() == 0){
                        System.out.print("Ingrese el telefono del cliente: ");
                        phone = sc.nextLine();
                    }
                    System.out.print("Ingrese AFP del cliente: ");
                    String afp = sc.nextLine();
                    while(afp.length() < 4 || afp.length() > 30){
                        System.out.print("Ingrese AFP del cliente: ");
                        afp = sc.nextLine();
                    }
                    System.out.print("Ingrese sistema de salud del cliente. 1. Fonasa || 2. Isapre: ");
                    int healthSystem = sc.nextInt();
                    sc.nextLine();
                    while (healthSystem < 1 || healthSystem > 2){
                        System.out.print("Ingrese sistema de salud del cliente. 1. Fonasa || 2. Isapre: ");
                        healthSystem = sc.nextInt();
                    }
                    System.out.print("Ingrese direccion del cliente: ");
                    String address = sc.nextLine();
                    while(address.length() > 70){
                        System.out.print("Ingrese direccion del cliente: ");
                        address = sc.nextLine();
                    }
                    System.out.print("Ingrese comuna del cliente: ");
                    String comuna = sc.nextLine();
                    while(comuna.length() > 50){
                        System.out.print("Ingrese comuna del cliente: ");
                        comuna = sc.nextLine();
                    }
                    customer = new Customer(names, lastNames, birthDate, rut, phone, afp, healthSystem, address, comuna);
                    //customer.showAge();
                    container.storeCustomer(customer);
                    break;
                    
                case 2:
                    System.out.print("Ingrese nombres del profesional: ");
                    names = sc.nextLine();
                    System.out.print("Ingrese apellidos del profesional: ");
                    lastNames = sc.nextLine();
                    System.out.print("Ingrese fecha de nacimiento del profesional (dd-mm-yyyy): ");
                    birthDate = sc.nextLine();
                    System.out.print("Ingrese rut del profesional: ");
                    rut = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese titulo del profesional: ");
                    String degree = sc.nextLine();
                    System.out.print("Ingrese fecha de ingreso del profesional: ");
                    String dateOfAdmission = sc.nextLine();
                    professional = new Professional(names, lastNames, birthDate, rut, degree, dateOfAdmission);
                    container.storeProfessional(professional);
                    break;
                    
                case 3:
                    System.out.print("Ingrese nombres del administrativo: ");
                    names = sc.nextLine();
                    System.out.print("Ingrese apellidos del administrativo: ");
                    lastNames = sc.nextLine();
                    System.out.print("Ingrese fecha de nacimiento del administrativo (dd-mm-yyyy): ");
                    birthDate = sc.nextLine();
                    System.out.print("Ingrese rut del administrativo: ");
                    rut = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese area del administrativo: ");
                    String area = sc.nextLine();
                    System.out.print("Ingrese experiencia del administrativo: ");
                    String experience = sc.nextLine();
                    administrative = new Administrative(names, lastNames, birthDate, rut, area, experience);
                    container.storeAdministrative(administrative);
                    break;
                    
                case 4:
                    System.out.print("Ingrese identificacion de la capacitacion: ");
                    String id = sc.nextLine();
                    System.out.print("Ingrese el dia de la capacitacion: ");
                    String day = sc.nextLine();
                    System.out.print("Ingrese hora de la capacitacion (HH:MM): ");
                    String hour = sc.nextLine();
                    System.out.print("Ingrese el lugar de la capacitacion: ");
                    String place = sc.nextLine();
                    System.out.print("Ingrese duracion de la capacitacion: ");
                    String duration = sc.nextLine();
                    System.out.print("Ingrese la cantidad de asistentes: ");
                    int attendees = sc.nextInt();
                    sc.nextLine();
                    training = new Training(id, day, hour, place, duration, attendees, customer.getRut());
                    container.storeTraining(training);
                    break;
                    
                case 5:
                    System.out.print("Ingrese rut del usuario a eliminar: ");
                    rut = sc.nextInt();
                    sc.nextLine();
                    container.deleteUser(rut);
                    break;
                    
                case 6:
                    container.listUsers();
                    break;
                    
                case 7:
                    System.out.print("Ingrese tipo de usuario a listar: ");
                    String type = sc.nextLine();
                    container.listUsersByType(type);
                    break;
                    
                case 8:
                    container.showTrainings(training);
                    break;
                    
                case 9:
                    System.out.println("=====================================");
                    System.out.println("Saliendo...");
                    System.out.println("Gracias por usar el sistema");
                    System.out.println("=====================================");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 9);
        
        sc.close();
    }
}
