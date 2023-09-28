package mvc;
import java.util.List;
import java.util.ArrayList;

public class ClaseModelo{
	//Creo un arreglo dinamico, donde guardaremos las tareas
	private List<String> tareas = new ArrayList<>(); 
	
	//metodos que serviran para manipular los datos del arreglo
	public void agregarTarea(String tarea) {
		tareas.add(tarea);
	}
	
	public void eliminarTarea(int indice) {
		tareas.remove(indice);
	}
	
	public List<String> obtenerTareas(){
		return tareas;
	}

}