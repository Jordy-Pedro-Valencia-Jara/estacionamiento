package estacionamiento;
import java.util.*;
public class menu {
	public static void main (String []args) {
		Scanner sc= new Scanner (System.in);
		int a;
		int actividad=0;
		System.out.println("Ingresar nombre del edificio:  ");
		String nom=sc.next();
		edificio e= new edificio(nom);
		System.out.print("N° Pisos: ");
		int nump = sc.nextInt();
		for (int i =0;i<nump;i++) {
			e.agregarpiso();
		}
		do {
			System.out.println("1.mostrar todos los pisos");
			System.out.println("2.Asignar espacios en los pisos ");
			System.out.println("3.editar piso ");
			a =sc.nextInt();
		switch(a){
		case 1:
			e.mostrarpisos();
			System.out.println("=================================");break;
		case 2:
			System.out.println("Elegir piso entre 0 y "+e.pisos.size()+" : ");
			for (piso p:e.pisos) {
				if(p.espacios.size()==0) {
					System.out.println("Pisos disponibles : "+p.numero);
				}
			}
			int piso=sc.nextInt();
			e.llenarpiso(e.pisos.get(piso-1));
			;break;
		case 3:
			System.out.print ("Escoger piso: ");
			
			int episo=sc.nextInt();
			int pisoele=episo-1;
			if (episo<=e.pisos.size() && episo>0) {
				do {
					System.out.println("1.- Llenar espacio ");
					System.out.println("2.- vaciar espacio ");
					System.out.println("3.- reporte de piso ");
					System.out.println("4.- menu anterior ");
					actividad=sc.nextInt();
					switch(actividad) {
					case 1:
						do {
							System.out.println("Espacios disponibles : ");
							e.pisos.get(pisoele).evacios();
							System.out.println("Cual espacio desea llenar ?");
							//llenar datos del carro 
							int eelec=sc.nextInt()-1;
							System.out.println("Ingresar el nombre del dueño: ");
							String Dueño=sc.next();
							System.out.println("Ingrese la placa: ");
							String placa=sc.next();
							e.pisos.get(pisoele).espacios.get(eelec).llenarespacio(Dueño,placa);
							System.out.println("El espacio es llenado con exito ......");
							e.pisos.get(pisoele).espacios.get(eelec).verificar();
							System.out.println("Desea seguir llenando?... \n1.Llenar espacio\n0.salir");
						}while(sc.nextInt()!=0);
						;break;
					}
					
					
				}while(actividad!=4);
			}else {
				System.out.println("El piso asignado no existe ... retrocediendo ...");
				break;
			}
			
			try {}
			catch(InputMismatchException ex){};
			;break;
		}
		
		
		
		}while(actividad!=4);
	}
}
