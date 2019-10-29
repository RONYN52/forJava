package hm;

import hm.Enum.e;

public class Priority {
	String [] sumA;
	
	Priority(String bufA[]){
		sumA=bufA;
		}
public float priority(String sumA[]) {
	System.out.println("method Priority ");
	float result=0;
	int size=0;
	for (int i=0;i<sumA.length;i++) {
	if (sumA[i]!=null) size++;	
	}
	String [] sumB = new String [size];

	for (int i=0;i<sumB.length;i++)
		sumB[i]=sumA[i];
	sumA=protos(revolve(sumB));
	for (int i=0;i<sumA.length;i++)
		System.out.print("~"+sumA[i]+"~");
	result=Float.valueOf(sumA[0]);
	
	return result;

}
public String[] revolve(String revA[]) {
	int size=0;
	

	//String[] revB = new String[size];
	//String[] revC = new String[size];
	String [] revB  = new String[revA.length];
	revB=revA;
	for (int i=0;i<revB.length;i++) {
		System.out.println(" |"+revA[i]+" & vvod revolve");
//	if (revA[i].equals(e.LBKT.getZnak())==true) {
//	while (revA[i+1].equals(e.RBKT.getZnak())==true) if (i<revA.length-1) revB[i]=revA[i]; 
//	for (int d=0;d<revB.length;d++) System.out.print(revB[d]+" % ");
//	revolve(revB);
//}
	if (revB[i].equals(e.MULTIPLY.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Multiply mu = new Multiply(x,y);
		revB[i]=String.valueOf(mu.multiply(x,y));
		revB[i-1]=null;
		revB[i+1]=null;
		System.out.println(revB[i]+" & ");
		revB=cleanBuf(revB);
		revolve(revB);
		
	}
	
	if (revB[i].equals(e.DIVIDE.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Divide di = new Divide(x,y);
		revB[i]=String.valueOf(di.divide(x,y));
		revB[i-1]=null;
		revB[i+1]=null;
		System.out.println(revB[i]+" & ");
		revB=cleanBuf(revB);
		revolve(revB);
	}
	
	
	}
	
	
	return revB;
}
public String[] cleanBuf(String revA[]) {
System.out.println("call Cleaner");
	int size=0;
	for (int j=0;j<revA.length;j++) {
		if (revA[j]!=null) 
			size++;		
		}
	
	String[] revB = new String[size];
	int l=0;
	
	for (int m=0;m<revA.length;m++) {
		if(revA[m]!=null) {
			System.out.print("^l="+l+revA[m]+"^m="+m+"  ");
		revB[l]=revA[m];
		l++;	
		} 
	}
		

		
	return revB;
}
public String[] protos(String revA[]) {
	String [] revB  = new String[revA.length];
	revB=revA;
	for (int i=0;i<revB.length;i++) {
	if (revB[i].equals(e.MINUS.getZnak())) {
		System.out.println(" PROTOS- "+revB[i-1]+"<"+revB[i]+">"+revB[i+1]);
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Minus mi = new Minus(x,y);
		revB[i]=String.valueOf(mi.minus(x,y));
		if (Float.valueOf(revB[i])<-5.0) { 
			
			System.out.println(" PROTOSssss- "+revB[i-1]+"<"+revB[i]+">"+revB[i+1]);
			break; }
		revB[i-1]=null;
		revB[i+1]=null;
		System.out.println(" PROTOS posle- "+revB[i-1]+"<"+revB[i]+">"+revB[i+1]);
		for (int f=0;f<revB.length;f++)
		System.out.println(revB[f]+" minu ");
		revB=cleanBuf(revB);
		
		protos(revB);
		
	}
	
	if (revB[i].equals(e.PLUS.getZnak())) {
		System.out.println(" PROTOS+ ");
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Plus pl = new Plus(x,y);
		
		revB[i]=String.valueOf(pl.plus(x,y));
		revB[i-1]=null;
		revB[i+1]=null;
		System.out.println(" PROTOS posle+ "+revB[i-1]+"<"+revB[i]+">"+revB[i+1]);
		System.out.println(revB[i]+" plu ");
		revB=cleanBuf(revB);
		
		protos(revB);
	}
	}
		
	
	return revB;
	
}
}
