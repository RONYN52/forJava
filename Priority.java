package hm;

import hm.Enum.e;

public class Priority {
	String [] sumA;
	Priority(String bufA[]){
		sumA=bufA;
		}
public String priority(String sumA[]) {
	String result="";
	int size=0;
	if (sumA.length==1) {
		result=sumA[0];
		return result;
	}
	for (int i=0;i<sumA.length;i++) {
	if (sumA[i]!=null) size++;	
	}
	String [] sumB = new String [size];

	for (int i=0;i<sumB.length;i++)
		sumB[i]=sumA[i];
	String [] sumC = new String [1];
	sumC=protos(revolve(sumB));
	System.out.print(sumC[0]);
	result=sumC[0];
	
	return result;

}
public String[] revolve(String revA[]) {
	int size=0;
	String [] revB  = new String[revA.length];
	revB=revA;
	if (revA.length==1)	return revA;

	for (int i=0;i<revB.length;i++) {

//	if (revA[i].equals(e.LBKT.getZnak())==true) {
//	while (revA[i+1].equals(e.RBKT.getZnak())==true) if (i<revA.length-1) revB[i]=revA[i]; 
//	for (int d=0;d<revB.length;d++) System.out.print(revB[d]+" % ");
//	revolve(revB);
//}
		if (revB[i]==null) revB=cleanBuf(revB);
		if (revB.length>2)
			if (i>0)
		if (revB[i].equals(e.MULTIPLY.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Multiply mu = new Multiply(x,y);
		revB[i]=String.valueOf(mu.multiply(x,y));
		revB[i-1]=null;
		revB[i+1]=null;
		if (revB.length>1)
		revB=cleanBuf(revB);
		revolve(revB);
		
	}
		if (revB[i]==null) revB=cleanBuf(revB);
		if (revB.length>2)
			if (i>0)
	if (revB[i].equals(e.DIVIDE.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Divide di = new Divide(x,y);
		revB[i]=String.valueOf(di.divide(x,y));
		revB[i-1]=null;
		revB[i+1]=null;
		if (revB.length>1)
		revB=cleanBuf(revB);
		revolve(revB);
	}
	
	
	}
	
	
	return revB;
}
public String[] cleanBuf(String revA[]) {
	int size=0;
	if (revA.length==1)
		return revA;

	if (revA.length==3) if (revA[0]==null) if (revA[2]==null) {
		String[] revB = new String[1];
		revB[0]=revA[1];
		return revB;
	}
	for (int j=0;j<revA.length;j++) {
		if (revA[j]!=null) 
			size++;	
		}
		
	String[] revB = new String[size];
	int l=0;
	
	for (int m=0;m<revA.length;m++) {
		if(revA[m]!=null) {	
		revB[l]=revA[m];

			l++;
		} 
	}
		

		
	return revB;
}
public String[] protos(String revA[]) {
	String [] revB  = new String[revA.length];
	revB=revA;

	if (revA.length==1) return revA;

		else {
			if (revA.length == 3) {
				String[] revC = new String[1];
				if (revB[1].equals(e.MINUS.getZnak())) {
					float x = 0;
					float y = 10;
					x = Float.valueOf(revB[0]);
					y = Float.valueOf(revB[2]);
					Minus mi = new Minus(x, y);
					revC[0] = String.valueOf(mi.minus(x, y));
				}
				if (revB[1].equals(e.PLUS.getZnak())) {
					float x = 0;
					float y = 10;
					x = Float.valueOf(revB[0]);
					y = Float.valueOf(revB[2]);
					Plus pl = new Plus(x, y);
					revC[0] = String.valueOf(pl.plus(x, y));
				}
				System.out.print("TOTAL = " + revC[0] + "\n");
				return revC;
		}
		if (revB[0]!=null) { 
				for (int i = 0; i < revB.length; i++) {
					if (revB[i] == null)
						revB = cleanBuf(revB);
					if (revB.length > 2)
						if (revB[i].equals(e.MINUS.getZnak())) {
							float x = 0;
							float y = 10;
							x = Float.valueOf(revB[i - 1]);
							y = Float.valueOf(revB[i + 1]);
							Minus mi = new Minus(x, y);
							revB[i] = String.valueOf(mi.minus(x, y));
							revB[i - 1] = null;
							revB[i + 1] = null;
							if (revB.length > 1)
								revB = cleanBuf(revB);
							if (revB.length == 1)
								return revB;
							if (revB.length > 2)
								protos(revB);

	}
					if (i==revB.length) System.exit(0);
	if (revB[i]==null) revB=cleanBuf(revB);
	if (revB.length>2)
		if (i>0)
			if (i<revB.length)
	if (revB[i].equals(e.PLUS.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revB[i-1]); y=Float.valueOf(revB[i+1]);
		Plus pl = new Plus(x,y);
		revB[i]=String.valueOf(pl.plus(x,y));
		revB[i-1]=null;
		revB[i+1]=null;
		if (revB.length>1)
		revB=cleanBuf(revB);
		if (revB.length==1) return revB;
		if (revB.length>2)
		protos(revB); 
	} 
	}
	
}  
	return revB; 
}
}
}
