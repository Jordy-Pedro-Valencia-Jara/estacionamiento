package estacionamiento;
import java.util.Timer;
import java.util.TimerTask;
import java.time.LocalTime;
public class espacio{
	int id;
	int ocu=1;
	public int numero;
	public boolean ocupado=false;
	public carro car= new carro();
	public tiempo inicio = new tiempo();
	public tiempo fin;
	public tiempo total=new tiempo();
	public double pago;
	int cont=0;
	Timer time= new Timer();
	public espacio(int num) {
		this.numero=num;
		this.ocupado=false;
		
	}
	public espacio(carro c,tiempo ini) {
		this.ocupado=true;
		this.car=c;
		this.inicio=ini;
	}
	public espacio(carro c) {
		this.ocupado=true;
		this.car=c;
	}
	public boolean getocupado() {
		return this.ocupado;
	}public void setocupado(boolean ocupado) {
		this.ocupado=ocupado;
	}
	public void contar() {
		TimerTask ts= new TimerTask() {
			public void run() {
				cont++;
			}
		};
		time.schedule(ts,10,1000);
	}
	/*
	public tiempo tentrada() {
		LocalTime t=LocalTime.now();
		inicio.hor=t.getHour();
		inicio.min=t.getMinute();
		inicio.seg=t.getSecond();
		contar();
		return inicio;
	}
	*/
	public void tentrada() {
		this.inicio.actual();
		contar();
	}
	public tiempo tsalida() {
		this.fin= new tiempo();
		LocalTime t= LocalTime.now();
		fin.hor=t.getHour();
		fin.min=t.getMinute();
		fin.seg=t.getSecond();
		time.cancel();
		return fin;
	}
	
	public carro llenarespacio(String Nombre,String placa) {
		this.ocupado=true;
		this.car= new carro(Nombre,placa);
		this.tentrada();
		return car;
	}
	public void vaciarespacio() {
		this.ocupado=false;
		this.car=new carro();
		this.inicio=new tiempo();
		
		
	}
	
	public void verificar() {
		System.out.println("Espacio "+this.numero+" :"+this.ocupado );
		System.out.println("Due\u00f1o: "+this.car.dueño);
		System.out.println("Placa: "+this.car.placa);
		System.out.println("Incio: "+this.inicio.toString());
		System.out.println("T. transcurrido: "+this.total.sumarseg(cont).toString());
		if (ocu==1) {
			ocu++;
		}if (this.fin!=null) {
			System.out.println("Final "+this.fin.toString());
			System.out.println(cont);

		}
		
	}
	public void verificarsimple() {
		System.out.println("=============================");
		System.out.println("Espacio "+numero+"  === Ocupado: "+this.ocupado);
	}
	public void verificartiempo() {
		System.out.println("T. transcurrido: "+this.total.sumarseg(cont).toString());
	}
	public void anumero(int num) {
		this.numero=num;
	}
}

