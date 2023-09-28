package mvc;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		ClaseModelo modelo = new ClaseModelo();
		ClaseVista vista = new ClaseVista();
		ClaseControlador controlador = new ClaseControlador(modelo,vista);
		
		int opcion;
		String nueva_tarea;
		int indice_tarea;
		
		
		do {
			System.out.println(".---------------------------------.");
			System.out.println("| Bienvenido a la Lista de Tareas |");
			System.out.println("|                                 |");
			System.out.println("| 1. Agregar Tarea                |");
			System.out.println("| 2. Eliminar Tarea               |");
			System.out.println("| 3. Mostrar Todas las Tareas     |");
			System.out.println("| 4. Salir                        |");
			System.out.println("'---------------------------------'");
			System.out.println("	Seleccione una opcion: ");
			opcion = key.nextInt();
			
			switch(opcion){
			case 1: 
					key.nextLine();
					System.out.println("\nEscriba la Tarea: ");
					nueva_tarea = key.nextLine();
					controlador.agregarTarea(nueva_tarea);
					System.out.println("\n-- Agregada Satisfactoriamente \n");
					break;
			case 2:
				if(modelo.obtenerTareas().isEmpty()) {
						System.out.println("\nLa lista esta Vacia, Nada que eliminar...");
						break;
				}else {
					try {
						key.nextLine();
						System.out.println("\nEscriba el numero de Tarea: ");
						indice_tarea = key.nextInt();
						if(indice_tarea-1 >=0 && indice_tarea-1<modelo.obtenerTareas().size()) {
							controlador.eliminarTarea(indice_tarea-1);
							System.out.println("\n -- Tarea Eliminada Correctamente");
						}else {
							System.out.println("---Numero de tarea invalido");
						}
					}catch(NumberFormatException e) {
						System.out.println("\n--- Error, Debes ingresar un numero entero ---");
						}
					break;
				}
			
			case 3:
				if(modelo.obtenerTareas().isEmpty()) {
					System.out.println("\nLa lista esta Vacia...");
				}else {
					controlador.actualizarVista();
				}
				break;
			case 4:
				System.out.println("\nChaito...");
				break;
				
			default:
				System.out.println("\nOpcion no Existente");

				
			}
		
		}while(opcion!=4);
		key.close();
		
	}

}
