package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

	private List<String> lista;

	public void llenarLista() {
		lista = new ArrayList<>();

		lista.add("Munoz");
		lista.add("Robledo");
		lista.add("Daniel");
	}

	public void usarForEach() {
		/*for(String elemento : lista){
			System.out.println(elemento);
		}*/
		
		// lista.forEach(x -> System.out.println(x));
		lista.forEach(System.out::println);
		
	}

	public void usarRemoveIf() {
		/*for(String elemento : lista){ ---- java.util.ConcurrentModificationException
			if(elemento.equalsIgnoreCase("daniel")){
				lista.remove(elemento);
			}
		}*/

		Iterator<String> it = lista.iterator();
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("daniel")){
				it.remove();
			}
		}
		
		// lista.removeIf(x -> x.equalsIgnoreCase("Code"));
	}

	public void usarSort() {
		lista.sort((x,y)-> x.compareTo(y));
	}

	public static void main(String... args) {
		ColeccionApp app = new ColeccionApp();
		app.llenarLista();		
		app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();
	}

}
