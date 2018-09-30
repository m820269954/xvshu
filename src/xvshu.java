
public class xvshu {
	private int realpart;
	private int imaginarypart;
	
	public xvshu(){
		this.imaginarypart=0;
		this.realpart=0;
	}
	//a + bi ; -a-bi;
	public xvshu(String a){
		int temp1,temp2;
		String real,imaginary;
		temp2=a.indexOf('i');
		
		if(a.indexOf('+')==-1){//¶Áµ½¼õºÅ¡£
			temp1=a.indexOf('-',1);
			imaginary=a.substring(temp1+1,temp2);
			real=a.substring(0,temp1);
			this.imaginarypart=-Integer.parseInt(imaginary);
		}
		else {//¶Áµ½¼ÓºÅ¡£
			temp1 = a.indexOf('+');
			imaginary=a.substring(temp1+1,temp2);
			real=a.substring(0,temp1);
			this.imaginarypart=Integer.parseInt(imaginary);
		}
		
		
		if(temp1==-1||temp2==-1)
		{	
			System.out.println("error form!");
			return ;
		}
		this.realpart=Integer.parseInt(real);
	}
	

	public static xvshu add(xvshu x1,xvshu x2){
		xvshu x3 = new xvshu();
		x3.realpart=x1.realpart+x2.realpart;
		x3.imaginarypart= x1.imaginarypart+x2.imaginarypart;
		return x3;
	}
	
	public static xvshu sub(xvshu x1,xvshu x2){
		xvshu x3= new xvshu();
		x3.realpart=x1.realpart-x2.realpart;
		x3.imaginarypart=x1.imaginarypart-x2.imaginarypart;
		return x3;
	}
	
	public String toString(){
		return this.realpart+"+"+this.imaginarypart+"i";
	}
	
	public static boolean isequal(xvshu x1,xvshu x2){
		if(x1.realpart==x2.realpart&&x1.imaginarypart==x2.imaginarypart)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		xvshu x1 =new xvshu("-50-70i");
		xvshu x2 = new xvshu("20+60i");
		xvshu x3 =new xvshu();
		System.out.println("x1:"+x1.toString());
		System.out.println("x2:"+x2.toString());
		x3=add(x1, x2);
		System.out.println("x1+x2="+x3.toString());
		x3=sub(x1, x2);
		System.out.println("x1-x2="+x3.toString());
		System.out.println("x1==x2?:"+isequal(x1,x2));
		
	}

}
