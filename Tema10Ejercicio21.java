package ejemplosHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Tema10Ejercicio21 {
	
	/*La asociación “Amigos de los anfibios” nos ha encargado una aplicacióm
	 * educativa sobre estos animalitos. Crea un programa que pida al usuario 
	 * el tipo de anfibio y que, a continuación, nos muestre su hábitat y su 
	 * alimentación. Si el tipo de anfibio introducido no existe, se debe 
	 * mostrar el mensaje “Ese tipo de anfibio no existe”.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> anfibioHabitat = new HashMap<String, String>();
		HashMap<String, String> anfibioAlimentacion = new HashMap<String, String>();
		
		
		
		anfibioHabitat.put("rana", "Rana: En los trópicos y cerca de las zonas húmedas y acuáticas.");
		anfibioHabitat.put("salamandra", "Salamandra: Ecosistemas húmedos.");
		anfibioHabitat.put("sapo", "Sapo: En cualquier sitio salvo el desierto y la antártida.");
		anfibioHabitat.put("tritón", "Tritón: América y África.");
		anfibioAlimentacion.put("rana", " Se alimenta de larvas e insectos.");		
		anfibioAlimentacion.put("salamandra", " Se alimenta de pequeños crustáceos e insectos.");
		anfibioAlimentacion.put("sapo", " Se alimenta de insectos, lombrices y pequeños roedores.");
		anfibioAlimentacion.put("tritón", " Se alimenta de insectos.");
		
		System.out.print("Introduzca el anfibio que le interese: ");
		
		String anfibio = sc.nextLine().toLowerCase();
		
		
		if (anfibioHabitat.containsKey(anfibio)) {
			System.out.print(anfibioHabitat.get(anfibio)); 
			System.out.println(anfibioAlimentacion.get(anfibio));
		} else {
			System.out.print("La información introducida no se encuentra en este diccionario.");
		}
		
		
	}

}
