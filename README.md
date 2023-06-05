# Ejercicio final modulo 4 Java SE-17
Tema: Programación Orientada a Objetos
### Integrantes:
+ Juan Pino C. :octocat:https://github.com/Jvbass/SprintFinalModulo4
+ Jorge Moraga C. :octocat:https://github.com/JorgeMoragaCalvo
+ Harold Klapp :octocat:https://github.com/HaroldKlapp
## :bulb:Descripcion 
  Proyecto para dar solucion a una empresa ficticia que se dedica a la asesoria en prevencion de riesgos. Este sistema permite al usuario planificar y almacenar capacitaciones, guardar usuarios de diferentes tipos con datos especificos por cada tipo de usuario, mostrar listas de usuarios y capacitaciones y borrar usuarios segun su rut.

## :wrench:Recursos utilizados
- `Java JDK 17.0.6`
- `JavaDoc`
- `Eclipse IDE`
- `Debugger`
- `Modificadores de acceso; encapsulamiento de clases`
- `Polimorfismo, herencia y simplicidad`
- `Principios SOLID`
- `Google Drive`
- `Zoom meetings`
- `Slack`
- `Diagrama de clases - Lucid Chart`

## :hammer:Funcionalidades del proyecto
  - Almacenar Cliente: Agrega un usuario de tipo Cliente
  - Almacenar Profesional: Agrega un usuario de tipo Profesional
  - Almacenar Administrativo: Agrega un usuario de tipo Administrativo
  - Almacenar Capacitacion: Guarda una capacitacion
  - Eliminar Usuario: Elimina un usuario segun su RUT
  - Listar Usuarios: Muestra una lista de todos los usuarios almacenados
  - Listar Usuarios por tipo: Pide el tipo de usuario a listar y los muestra
  - Listar Capacitaciones: Muestra una lista con todas las capacitaciones almacenadas

## :notebook:Guia de uso
Para usar este proyecto recomendamos tener instalada la version de Java 17.0.6, pare verificar cual version tienes instalada abre tu consola de comandos preferida e ingresa "java -version". Ademas recomendamos instalar el IDE Eclipse para importar el proyecto y utilizarlo. En esta guia se utliza el IDE Eclipse, si bien la mayoria tienen funcionalidades parecidas la interfaz de usuario puede ser diferente.

1. Clona o descarga el zip del proyecto desde Github
	- Guardalo en una carpeta, si descargaste el zip descomprimelo
	
2. Importa el proyecto en Eclipse
	- Dirigete a File -> Open Projects from File Sistem...
	- En la ventana que se despliega haz click en el boton "Directory" y busca la carpeta donde guardaste el proyecto
	- Luego haz click en finish
	
3. En la pantalla principal de Eclipse al costado izquierdo se podra ver el proyecto con su nombre SprintModulo4
	- Haz click en la flecha al costado de la carpeta para que se desplieguen sus subcarpetas
	- Ve a la subcarpeta src y luego abre el package sprintModuleFour, dentro se encuentra la clase Main que es el punto de entrada del sistema.
	- Abre la clase Main.java

4. Para correr el proyecto
	- Haz click derecho en cualquier parte de la clase Main.java y dirigete a "Run As -> Java Aplication
	- Se abrira una consola donde podras ver el Menu Principal, ingresa una opcion y presiona enter
		
## :mag:Datos de prueba 
-	Datos para cargar informacion en el sistema. Ingresa 3 usuarios de cada tipo y 3 capacitaciones.

	- :construction:Importante:construction:
	**Ingresa estos datos en la linea 30, despues crear las variables y objetos**
	
	    ```
			//Datos de prueba (linea 30)
        // Cargar 3 clientes
        customer = new Customer("Cliente 1", "Apellido 1", "01-01-1990", 12345678, "+56923456789", "AFP 1", 1, "Dirección 1", "Comuna 1");
        container.storeCustomer(customer);

        customer = new Customer("Cliente 2", "Apellido 2", "02-02-1991", 23456789, "+56987654321", "AFP 2", 2, "Dirección 2", "Comuna 2");
        container.storeCustomer(customer);

        customer = new Customer("Cliente 3", "Apellido 3", "03-03-1992", 34567890, "+56956789012", "AFP 3", 1, "Dirección 3", "Comuna 3");
        container.storeCustomer(customer);

        // Cargar 3 profesionales
        professional = new Professional("Profesional 1", "Apellido 1", "04-04-1993", 45678901, "Título 1", "01-01-2020");
        container.storeProfessional(professional);

        professional = new Professional("Profesional 2", "Apellido 2", "05-05-1994", 56789012, "Título 2", "02-02-2020");
        container.storeProfessional(professional);

        professional = new Professional("Profesional 3", "Apellido 3", "06-06-1995", 67890123, "Título 3", "03-03-2020");
        container.storeProfessional(professional);

        // Cargar 3 administrativos
        administrative = new Administrative("Administrativo 1", "Apellido 1", "07-07-1996", 78901234, "Área 1", "Experiencia 1");
        container.storeAdministrative(administrative);

        administrative = new Administrative("Administrativo 2", "Apellido 2", "08-08-1997", 89012345, "Área 2", "Experiencia 2");
        container.storeAdministrative(administrative);

        administrative = new Administrative("Administrativo 3", "Apellido 3", "09-09-1998", 90123456, "Área 3", "Experiencia 3");
        container.storeAdministrative(administrative);

        // Cargar 3 capacitaciones
        training = new Training("Capacitación 1", "01-01-2023", "10:00", "Lugar 1", "1 hora", 10, customer.getRut());
        container.storeTraining(training);

        training = new Training("Capacitación 2", "02-02-2023", "11:00", "Lugar 2", "2 horas", 20, customer.getRut());
        container.storeTraining(training);

        training = new Training("Capacitación 3", "03-03-2023", "12:00", "Lugar 3", "3 horas", 30, customer.getRut());
        container.storeTraining(training);

    	//Fin Datos de prueba



