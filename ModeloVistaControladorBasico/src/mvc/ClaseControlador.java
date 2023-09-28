package mvc;

import java.util.List;

//Creo la clase controlador 
public class ClaseControlador {
	private ClaseModelo modelo;
	private ClaseVista vista;
	
	//constructor de la clase
	public ClaseControlador(ClaseModelo modelo, ClaseVista vista) {
		this.modelo=modelo;
		this.vista=vista;
	}
	
	//metodos necesarios para las acciones a realizar
	public void agregarTarea(String tarea) {
		modelo.agregarTarea(tarea);
	}
	
	public void eliminarTarea(int indice) {
		modelo.eliminarTarea(indice);
	}
	
	public void actualizarVista() {
		List<String> tareas = modelo.obtenerTareas();
		vista.mostrarTareas(tareas);
	}

}
