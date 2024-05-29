package estacionamiento;
import java.util.*;
public class edificio {
	Scanner sc= new Scanner (System.in);
	int id;
	int num=1;
	String nombre;
	ArrayList<piso> pisos= new ArrayList<piso>();
	edificio(){}
	edificio(String nom){
		this.nombre=nom;
	}
	public void agregarpiso() {
		this.pisos.add(new piso(num));
		num++;
	}
	public void llenarpiso(piso p) {
		System.out.print("Nombre del piso: ");
		String nom= sc.next();
		p.pnom=nom;
		System.out.println("Numero de espacios: ");
		int esp=sc.nextInt();
		for (int i =0;i<esp;i++) {
			p.agregarespacio(i+1);
			
		}
	}
	//este metodo debe mostrar el total de pisos del edificio y mostrar 
	//cuantos espacios tiene y cuantos estan ocupados y cuantos vacios 
	public void mostrarpisos() {
		System.out.println("El total de pisos es: "+ this.pisos.size());
		int cont=1;
		int ocu=0;
		int vac=0;
		for (piso p:pisos) {
			System.out.println("============== Piso N°: "+cont+ " =============== ");
			System.out.println("Nombre Piso: "+ p.pnom);
			System.out.println("total de espacios: "+p.espacios.size());
			for(espacio e:p.espacios) {
				if(e.ocupado==true) {
					ocu++;
				}
				else {
					vac++;
				}
			}
			System.out.println("Espacios vacios : "+ vac);
			System.out.println("Espacios ocupados : "+ ocu);
			vac=0;
			ocu=0;
			cont++;
			System.out.println("=================================================");
		}
	}
}
