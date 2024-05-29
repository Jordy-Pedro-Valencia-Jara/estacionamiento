package estacionamiento;
import java.text.DecimalFormat;
import java.time.LocalTime;

public class tiempo {
	int seg;
	int min;
	int hor;
	tiempo(int hor,int min, int seg){
		this.hor=hor;
		this.min=min;
		this.seg=seg;
	}
	public tiempo(){
		this.hor=0;
		this.min=0;
		this.seg=0;
	}
	tiempo(tiempo a){
		this.hor=a.hor;
		this.min=a.min;
		this.seg=a.seg;
	}
	public tiempo sumarseg(int segundos) {
		int segt=segundos%60;
		int mint=(int)segundos/60;
		int hort=0;
		if(mint>60) {
			hort=(int)mint/60;
			mint=mint%60;
		}
		//System.out.println("segundos: "+ segt);
		//System.out.println("minutos: "+ mint);
		//System.out.println("horas: "+ hort);
		//System.out.println("=======================");
		tiempo t= new tiempo(hort,mint,segt);
		return t;
	}
	public void  aumentar() {
		this.seg++;
		if(this.seg>59) {
			this.seg=0;
			this.min++;
		}
		if(this.min>59) {
			this.min=0;
			this.hor++;
		}
	}
	public void aumentarcont(int a) {
		this.seg=a;
		if(this.seg>59) {
			this.seg=0;
			this.min++;
		}
		if(this.min>59) {
			this.min=0;
			this.hor++;
		}
	}
	public tiempo sumtiempos(tiempo fin) {
		int segn;
		int minn=0;
		int horn=0;
		segn=this.seg+fin.seg;
		if(segn>60) {
			minn=(int)segn/60;
			segn=segn%60;
		}
		minn=minn+fin.min;
		if(minn>60){
			horn=(int)minn/60;
			minn=minn%60;
		}
		horn=horn+fin.hor;
		//System.out.println("segundos: "+ segn);
		//System.out.println("minutos: "+ minn);
		//System.out.println("horas: "+ horn);
		tiempo n= new tiempo(horn,minn,segn);
		return n;
	}
	public tiempo actual() {
		LocalTime t=LocalTime.now();
		this.hor=t.getHour();
		this.min=t.getMinute();
		this.seg=t.getSecond();
		return this;
	}
	public String toString() {
		return this.hor+" : "+this.min+" : "+this.seg;
	}
	public String dftoString() {
		DecimalFormat df = new DecimalFormat("00");
		return df.format(this.hor)+" : "+df.format(this.min)+" : "+df.format(this.seg);
	}
	
}
