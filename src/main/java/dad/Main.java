package dad;

import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombre, apellido, edad;
		Persona p = new Persona();
		
		System.out.println("Nombre: ");
		nombre = entrada.nextLine();
		p.setNombre(nombre);
		
		System.out.println("Apellido: ");
		apellido = entrada.nextLine();
		p.setApellido(apellido);
		
		System.out.println("Edad: ");
		edad = entrada.nextLine();
		p.setEdad(edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		entrada.close();
	}

}
