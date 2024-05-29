package estacionamiento;
import java.util.ArrayList;
import java.util.*;
public class piso {
	int id;
	int numero;
	String pnom;
	Scanner sc= new Scanner (System.in);
	ArrayList<espacio> espacios= new ArrayList<espacio>();
	piso(){}
	piso(String nombre){
		this.pnom=nombre;
	}
	piso(int num){
		this.numero=num;
	}
	public void agregarespacio(int num) {
		this.espacios.add(new espacio(num));
	}
	public void llenarespacio(espacio e) {
		System.out.print("Nombre: ");
		String nombre=sc.next();
		System.out.print("placa: ");
		String placa=sc.next();
		carro cdesechable= new carro(nombre,placa);
		e.ocupado=true;
		e.car=cdesechable;
		e.tentrada();
	}
	public void mostrartodo() {
		for (espacio e:espacios){
			e.verificar();
		}
	}
	public void eocupados() {
		for(espacio e:espacios) {
			if (e.ocupado==true) {
				e.verificar();
			}
		}
	}
	public void evacios() {
		for(espacio e:espacios) {
			if (e.ocupado==false) {
				e.verificarsimple();
			}
		}
	}
}
