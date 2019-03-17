package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamsApp {

	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp(){
		lista = new ArrayList<>();
		lista.add("Munoz");
		lista.add("Robledo");
		lista.add("Daniel");

		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
	}
	
	public void filtrar(){
		lista.stream().filter(x -> !x.startsWith("R")).forEach(System.out::println);
	}
	
	public void ordenar(){
		// lista.stream().sorted().forEach(System.out::println); // ORDENA ASC
		   lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println); // DESC
	}
	
	public void transformar(){
		//lista.stream().map(String::toUpperCase).forEach(System.out::println); ME IMPRIME TODOS EN MAYUSCULAS
		/*for(String x : numeros){ --- FORMA IMPERATIVA
			int num = Integer.parseInt(x) + 1;
			System.out.println(num);
		}*/
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println); // FORMA DECLARATIVA
	}
	
	public void limitar(){
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar(){
		long x = lista.stream().count();

		System.out.printf("%s", (double)  x);

	}
		
	public static void main(String[] args) {
		StreamsApp app = new StreamsApp();
		app.filtrar();
		app.ordenar();
		app.transformar();
		app.limitar();
		app.contar();
		
	}
}
