package pkgVentanaplayaround;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      TellYaName window = new TellYaName();
      window.setVisible(true);
						
						//Color myColor = Color.YELLOW;
						//System.out.println(myColor);
						
						//for(Color c: Color.values()){
						//		System.out.println(c);
						//}
    
				
				System.out.println("-----Ordenado cadenas de texto-----");
				ArrayList<String> nombres = new ArrayList<>();
				nombres.add("Paco Perez");
				nombres.add("José Alvarado");
				nombres.add("Pepe Argeta");
				nombres.add("Ariel Anonitmo");
				nombres.add("Ariel Maldnoado");
				nombres.add("Zulma Estrada");
				
				
				String a = nombres.get(0).substring(0, 3);
				System.out.println("a: " + a);
		//Si el arraylist es de objetos primitivos como, String, Integer, etc.
		//basta con llamar al metodo sort.
		Collections.sort(nombres);
		
		for(String nombre : nombres){
			System.out.println(nombre);
		}
				}
}
