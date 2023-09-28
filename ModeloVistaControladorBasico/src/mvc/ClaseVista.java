package mvc;

import java.util.List;

public class ClaseVista {
	//metodo para recorrer cada elemento de el arreglo dinamico
	public void mostrarTareas(List<String> tareas) {
		System.out.println("--Listado de tarea--");
		for(int i=0; i<tareas.size(); i++) {
			System.out.println(i+1 + ". " + tareas.get(i));
		}
	}

}
