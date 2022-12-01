package FRACTION;
import java.util.Scanner;
public class fraction {
	protected int num,deno;
	
	public fraction() {
		this.num=0;
		this.deno=0;
	}
	public fraction(int a, int b) {
		this.num=a;
		this.deno=b;
	}
	public int getNum() {
		return num;
	}
	public int getDeno() {
		return deno;
	}
	public void setNum(int a) {
		this.num=a;
	}
	public void setDeno(int b) {
		this.deno=b;
	}
	public void show() {
		System.out.println(" la fraction est "+num+"/"+deno);
	}
	public void show1() {
		System.out.println(" la fraction est "+num);
	}
	static int addnum(fraction a , fraction b) {
		int n;
		n = a.num * b.deno + a.deno * b.num;
		return n;
	}
	static int adddeno(fraction a , fraction b) {
		int d;
		d = a.deno * b.deno;
		return d;
	}
	static int sousnum(fraction a , fraction b) {
		int n;
		n = a.num * b.deno - a.deno * b.num;
		return n;
	}
	static int sousdeno(fraction a , fraction b) {
		int d;
		d = a.deno * b.deno;
		return d;
	}
	static int mulnum(fraction a , fraction b) {
		int n;
		n = a.num * b.num;
		return n;
	}
	static int muldeno(fraction a , fraction b) {
		int d;
		d = a.deno * b.deno;
		return d;
	}
	static int divnum(fraction a , fraction b) {
		int n;
		n = a.num * b.deno;
		return n;
	}
	static int divdeno(fraction a , fraction b) {
		int d;
		d = a.deno * b.num;
		return d;
	}
	static int numsim(fraction a) {
		int n = 0;
		if(a.num<a.deno) {
			for(int i = 2 ; i<= a.num ;i++) {
				if((a.num % i)==0 && (a.deno % i)==0) {
					a.num = a.num / i;
					a.deno	= a.deno / i;
					i = i;
					
				}
				n=a.num;
			}
			
		}else {
			for(int i = 2 ; i<= a.deno ;i++) {
				if((a.num % i)==0 && (a.deno % i)==0) {
					a.num = a.num / i;
					a.deno	= a.deno / i;
					i = i;
				}
			}
			n=a.num;
		}
		
		return n;
	}
	static int denosim(fraction a) {
		int d = 0;
		if(a.num<a.deno) {
			for(int i = 2 ; i == a.num ;i++) {
				if((a.num % i)==0 && (a.deno % i)==0) {
					a.deno = a.deno / i;
					a.num = a.num / i;
					i = i;
				}
				d =a.deno;
			}
		}else {
			for(int i = 2 ; i<= a.deno ;i++) {
				if((a.num % i)==0 && (a.deno % i)==0) {
					a.deno = a.deno / i;
					a.num = a.num / i;
					i = i;
				}
			}
			d =a.deno;
		}
		
		return d;
	}	
	public static void main(String[] args) throws negatif {
		fraction[] f = new fraction[3];
		fraction p = new fraction();
		Scanner sc = new Scanner(System.in);
		int c,i;
		for(i =0 ; i<2 ; i++) {
			Scanner s = new Scanner(System.in);
			f[i] = new fraction();
			System.out.print("entrer votre numerateur "+(i+1)+" : ");
			f[i].setNum(s.nextInt());
			try {
				System.out.print("entrer votre denominateur "+(i+1)+" : ");
				f[i].setDeno(s.nextInt());
				if(f[i].getDeno()==0) {
					throw new negatif();
				}
			}catch (negatif e) {
				e.show();
				System.out.print("entrer votre denominateur "+(i+1)+" : ");
				f[i].setDeno(s.nextInt());
			}
			
		}
		f[0].show();
		f[1].show();
		p = new fraction();
		System.out.println("1 = addition");
		System.out.println("2 = soustraction");
		System.out.println("3 = mulitplication");
		System.out.println("4 = division");
		System.out.print("avez qui voulez vous travailler : ");
		c = sc.nextInt();
		if(c==1) { ; 
			p.num = addnum(f[0],f[1]);
			p.deno = adddeno(f[0],f[1]);
			System.out.print(+f[0].num+"/"+f[0].deno+ " + " +f[1].num+"/"+f[1].deno);
			p.show();
			p.num = numsim(p);
			p.deno = denosim(p);
			if(p.deno==1) p.show1();
			else p.show();
		}else if(c==2) {
			p.num = sousnum(f[0],f[1]);
			p.deno = sousdeno(f[0],f[1]);
			System.out.print(+f[0].num+"/"+f[0].deno+ " - " +f[1].num+"/"+f[1].deno);
			p.show();
			p.num = numsim(p);
			p.deno = denosim(p);
			if(p.deno==1) p.show1();
			else p.show();
		}else if(c==3) {
			p.num = mulnum(f[0],f[1]);
			p.deno = muldeno(f[0],f[1]);
			System.out.print(+f[0].num+"/"+f[0].deno+ " * " +f[1].num+"/"+f[1].deno);
			p.show();
			p.num = numsim(p);
			p.deno = denosim(p);
			if(p.deno==1) p.show1();
			else p.show();
		}else if(c==4) {
			p.num = divnum(f[0],f[1]);
			p.deno = divdeno(f[0],f[1]);
			System.out.print(+f[0].num+"/"+f[0].deno+ " / " +f[1].num+"/"+f[1].deno);
			p.show();
			p.num = numsim(p);
			p.deno = denosim(p);
			if(p.deno==1) p.show1();
			else p.show();
		}else {
			System.out.print("erreur ");
		}
	}
}
