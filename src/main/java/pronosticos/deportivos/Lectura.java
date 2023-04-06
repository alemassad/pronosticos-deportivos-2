package pronosticos.deportivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Lectura {
	
	String[] pronosticos= new String[8];//Para guardar la cantidad de partidos con pronosticos del archivo	
	List<Pronostico> pronoList;
	List<Resultado> resultaList;
	int puntaje = 0;
	int puntaje2 = 0;
	int puntos=0;
	String participante = null;
	String particiPunto1 = null;
	String particiPunto2 = null;
	String ronda = null;
	String resultado1 = "0";
	String resultado2 = "0";
	String []prono1=new String[2];
	String []prono2=new String[2];
	String []prono3=new String[2];
	String []prono4=new String[2];
	String []prono5=new String[2];
	String []prono6=new String[2];
	String []prono7=new String[2];
	String []prono8=new String[2];
	String pro1;
	String pro2;
	String pro3;
	String pro4;
	String pro5;
	String pro6;
	String pro7;
	String pro8;
	String resp1="";	
	String[] letraSeparada;
	int i = 0;
	String equipo1 = null;
	String equipo2 = null;
	String tipoPronostico1 = "", tipoPronostico2 = "";
	
	public void leerPronosticos() {
		pronoList = new ArrayList<Pronostico>();
		
		FileReader lectura = null;
		try {
			lectura = new FileReader("C:\\Users\\pingo\\eclipse-workspace\\ArgentinaPrograma\\src\\pronósticosDeportivos\\pronostico.csv");
			
			BufferedReader buffer = new BufferedReader(lectura);
			String letras= "";
			int indice=0;
			
			while(letras!=null) {//null representa salto de linea
				letras = buffer.readLine();
				
				if(letras!=null) {// IF para no imprimir el null de la última linea
					
					pronosticos[indice]= letras; 									
					indice++;
				}
			}
			buffer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				lectura.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		int parti = 1;		
		for(String palabras : pronosticos) { // Ciclo donde leemos las lineas
			System.out.println();		
			int indice = 0;
			System.out.println(" PRONOSTICO "+parti);
			
			letraSeparada= palabras.split(";"); // Separamos las palabras 
			
			for(String coso : letraSeparada) {// Cliclo donde leemos las palabras
				
				switch (indice) {// Asignamos valores a las variables
					case 0:
						participante=coso;
					case 1:
						equipo1=coso;
					case 2:
						if(coso.contains("true") && indice==2) {
							tipoPronostico1 = "G";
							tipoPronostico2 = "P";
						}
					case 3:
						if(coso.contains("true") && indice==3) {
							tipoPronostico1 = "E";
							tipoPronostico2 = "E";
							}
					case 4:						
						if(coso.contains("true") && indice==4) {
							tipoPronostico1 = "P";
							tipoPronostico2 = "G";
							}
					case 5:
						equipo2=coso;
				}
				indice++;				
				
			}							
			
			Equipo equipoLocal = new Equipo();
			Equipo equipoVisitante = new Equipo();
			Pronostico pronostico = new Pronostico();
			
			equipoLocal.setNombre(equipo1);
			equipoVisitante.setNombre(equipo2);	
			pronostico.setNumeroPro(parti);
			pronostico.setEquipoLocal(equipoLocal);
			pronostico.setEquipoVisitante(equipoVisitante);						
			pronostico.setResLocal(tipoPronostico1);				
			pronostico.setResVisitante(tipoPronostico2);
			
			parti++;
			
			System.out.println("Participante: "+ participante +" Equipo1 : " +equipo1 + " => " + tipoPronostico1);
		
			System.out.println("Participante: "+ participante +" Equipo2 : " +equipo2 + " => " + tipoPronostico2);
			
			if(i==0) {
				prono1[0]=tipoPronostico1+tipoPronostico2;// Combinamos los resultados de ambos equipos
				prono1[1]=participante;			
				i++;				
				pronostico.setConvinaRes(prono1[0]);
				pronostico.setParticipante(prono1[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}else if(i==1) {
				prono2[0]=tipoPronostico1+tipoPronostico2;				
				prono2[1]=participante;
				i++;
				pronostico.setConvinaRes(prono2[0]);
				pronostico.setParticipante(prono2[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}	else if(i==2) {
				prono3[0]=tipoPronostico1+tipoPronostico2;				
				prono3[1]=participante;
				i++;
				pronostico.setConvinaRes(prono3[0]);
				pronostico.setParticipante(prono3[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}else if(i==3) {
				prono4[0]=tipoPronostico1+tipoPronostico2;				
				prono4[1]=participante;
				i++;
				pronostico.setConvinaRes(prono4[0]);
				pronostico.setParticipante(prono4[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}else if(i==4) {
				prono5[0]=tipoPronostico1+tipoPronostico2;				
				prono5[1]=participante;
				i++;
				pronostico.setConvinaRes(prono5[0]);
				pronostico.setParticipante(prono5[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}else if(i==5) {
				prono6[0]=tipoPronostico1+tipoPronostico2;				
				prono6[1]=participante;
				i++;
				pronostico.setConvinaRes(prono6[0]);
				pronostico.setParticipante(prono6[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}else if(i==6) {
				prono7[0]=tipoPronostico1+tipoPronostico2;				
				prono7[1]=participante;
				i++;
				pronostico.setConvinaRes(prono7[0]);
				pronostico.setParticipante(prono7[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}else if(i==7) {
				prono8[0]=tipoPronostico1+tipoPronostico2;				
				prono8[1]=participante;
				i++;
				pronostico.setConvinaRes(prono8[0]);
				pronostico.setParticipante(prono8[1]);
				System.out.println(pronostico.getParticipante()+" Clave=> "+pronostico.getCombinaRes());
				pronoList.add(pronostico);
			}
			
		}
	}
	
	public void leerResultados() {
		resultaList = new ArrayList<>();
		puntaje = 0;
		puntaje2 = 0;
		
		String[] resultados= new String[4];//Para guardar la cantidad de partidos con pronosticos del archivo
		FileReader lectura = null;
		try {
			lectura = new FileReader("C:\\Users\\pingo\\eclipse-workspace\\ArgentinaPrograma\\src\\pronósticosDeportivos\\resultados.csv");
			BufferedReader buffer = new BufferedReader(lectura);
			String letras= "";
			int indice=0;
			
			while(letras!=null) {//null representa salto de linea
				letras = buffer.readLine();
				
				if(letras!=null) {// IF para no imprimir el null final
					
					resultados[indice]= letras; 									
					indice++;
				}
			}
			buffer.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				lectura.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
		letraSeparada=null;		
		equipo1 = "";
		equipo2 = "";
		int index=1;
		
		for(String palabras : resultados) {
			
			System.out.println();
			int indice = 0;
			System.out.println(" PARTIDO  "+index);				
			
			letraSeparada= palabras.split(";"); // Separamos las palabras 
			
			for(String coso : letraSeparada) {
				
				switch (indice) {// Asignamos valores a las variables
					case 0:
						ronda=coso;
					case 1:
						equipo1=coso;
					case 2:						
						resultado1= coso;						
					case 3:					
						resultado2= coso;						
					case 4:
						equipo2=coso;
				}			
						
				indice++;
			}
			
			int resul1 = Integer.parseInt(resultado1); // Pasamos los resultados a Enteros
			int resul2 = Integer.parseInt(resultado2); // para despues poder compararlos
			Resultado resulta = new Resultado();
			Equipo equipoLocal = new Equipo();
			Equipo equipoVisitante = new Equipo();
			
			equipoLocal.setNombre(equipo1);
			equipoVisitante.setNombre(equipo2);
			resulta.setNumeroPartido(index);
			resulta.setEquipoLocal(equipoLocal);
			resulta.setEquipoVisitante(equipoVisitante);
			resulta.setGolesLocal(resul1);
			resulta.setGolesVisitante(resul2);
						
			System.out.println("Ronda nº " + ronda + " ==> Equipo1 : " + resulta.getEquipoLocal().getNombre() + " => "+ resulta.getGolesLocal());
			System.out.println("Ronda nº " + ronda + " ==> Equipo2 : " + resulta.getEquipoVisitante().getNombre() + " => "+ resulta.getGolesVisitante());
			
			if(resul1 > resul2) {
				resultado1 = "G";
				resultado2 = "P";
				System.out.println(equipo1 +" "+ resultado1);
				System.out.println(equipo2 +" "+ resultado2);
				resp1 = resultado1 + resultado2;
				resulta.setCombinaRes(resp1);
				System.out.println("Clave=> "+resp1);	
				
			}else if(resul1 < resul2) {
				resultado1 = "P";
				resultado2 = "G";
				System.out.println(equipo1 +" "+ resultado1);
				System.out.println(equipo2 +" "+ resultado2);
				resp1 = resultado1 + resultado2;
				resulta.setCombinaRes(resp1);
				System.out.println("Clave=> "+resp1);	
			}else {
				resultado1 = "E";
				resultado2 = "E";
				System.out.println(equipo1 +" "+ resultado1);
				System.out.println(equipo2 +" "+ resultado2);				
				resp1 = resultado1 + resultado2;		
				System.out.println("Clave=> "+resp1);	
				resulta.setCombinaRes(resp1);
			}	
			
			resultaList.add(resulta);
			
			index++;	
			
		}

	}
	
	public void leerPuntaje() {
		
		
		// Comparamos los Resultados con los Pronosticos para asignar puntaje
		for (int i=0; i < pronoList.size(); i ++) {
	           
	            for (Resultado re : resultaList) {
	                    if (pronoList.get(i).getCombinaRes().equals(re.getConvinaRes())) {//Si la Clave convinada del Pronóstico es = a la Clave del Resultado
	                    	
	                        if(pronoList.get(i).getNumeroPro()==re.getNumeroPartido()) { // y Si el número de Pronóstico es = al número del partido
	                        	
	                        	puntaje ++;
	                        	particiPunto1= pronoList.get(i).getParticipante();
	                        }
	                        if((pronoList.get(i).getNumeroPro())==re.getNumeroPartido()+4) { // Si el número de Pronóstico es = al número del partido + 4(porque son 4 resultados contra 8 pronosticos)
		                    	
		                        puntaje2 ++;
		                        particiPunto2= pronoList.get(i).getParticipante();
		                       }
	                    } 
	            }	      
	           
	      }	
				
		if((puntaje == 1 || puntaje == 0) & (particiPunto1 != null)) {// Verificamos si el resultado es plural o singular para mostrarlo
			System.out.println("Acierto de "+particiPunto1+": "+puntaje+ " punto");
		}else {
			System.out.println("Aciertos de "+particiPunto1+": "+puntaje+ " puntos ");
		}
		if((puntaje2 == 1 || puntaje2 == 0) & (particiPunto2  != null)) {// Verificamos si el resultado es plural o singular para mostrarlo
			System.out.println("Acierto de "+particiPunto2+": "+puntaje2+ " punto");
		}else {
			System.out.println("Aciertos de "+particiPunto2+": "+puntaje2+ " puntos ");
		}
		
	}
	
}
