package pronosticos.deportivos;

import java.io.FileWriter;
import java.io.IOException;

class Escritura{
	public void escribirPronostico() {
		
		String partido ="Mariana;Argentina;true;false;false;Arabia Saudita\n"// Escribimos los pronósticos
					+ "Mariana;Polonia;false;true;false;Mexico\n"
					+ "Mariana;Argentina;true;false;false;Mexico\n"
					+ "Mariana;Arabia Saudita;false;false;true;Polonia\n"
					+ "Pedro;Argentina;true;false;false;Arabia Saudita\n"
					+ "Pedro;Polonia;false;false;true;Mexico\n"
					+ "Pedro;Argentina;true;false;false;Mexico\n"
					+ "Pedro;Arabia Saudita;false;true;false;Polonia";

		try {
			FileWriter archivo = new FileWriter("C:\\Users\\pingo\\eclipse-workspace\\ArgentinaPrograma\\src\\pronósticosDeportivos\\pronostico.csv");
			
			for(int i=0; i< partido.length(); i++) {
				archivo.write(partido.charAt(i));
			}
			archivo.close();
		} catch (IOException e) {
			System.out.println("El archivo no se pudo escribir");
			e.printStackTrace();
		}
		
	}
	public void escribirResultados() {
		
		String partido ="1;Argentina;1;2;Arabia Saudita\n"// Escribimos los resultados
					  + "1;Polonia;1;1;Mexico\n"
					  + "1;Argentina;2;0;Mexico\n"
					  + "1;Arabia Saudita;0;2;Polonia";
		
		try {
			FileWriter archivo = new FileWriter("C:\\Users\\pingo\\eclipse-workspace\\ArgentinaPrograma\\src\\pronósticosDeportivos\\resultadoS.csv");
			
			for(int i=0; i< partido.length(); i++) {
				archivo.write(partido.charAt(i));
			}
			archivo.close();
		} catch (IOException e) {
			System.out.println("El archivo no se pudo escribir");
			e.printStackTrace();
		}
		
	}
}

