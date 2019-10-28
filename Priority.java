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
	result=Float.valueOf(revolve(sumB)[0]);
	
	return result;

}
public String[] revolve(String revA[]) {
	int size=0;
	
	for (int k=0;k<revA.length;k++)
		size++;
	String[] revB = new String[size];
	String[] revC = new String[size];
	for (int i=0;i<revB.length;i++) {
		System.out.println(revA[i]+" & "+e.LBKT.getZnak());
	if (revA[i].equals(e.LBKT.getZnak())==true) {
	while (revA[i+1].equals(e.RBKT.getZnak())==true) if (i<revA.length-1) revB[i]=revA[i]; 
	for (int d=0;d<revB.length;d++) System.out.print(revB[d]+" % ");
	revolve(revB);
	}
	if (revA[i].equals(e.MULTIPLY.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revA[i-1]); y=Float.valueOf(revA[i+1]);
		Multiply mu = new Multiply(x,y);
		revA[i]=String.valueOf(mu.multiply(x,y));
		revA=cleanBuf(revA);
		revolve(revA);
	}
	
	if (revA[i].equals(e.DIVIDE.getZnak())) {
		float x=0; float y=0;
		x=Float.valueOf(revA[i-1]); y=Float.valueOf(revA[i+1]);
		Divide mu = new Divide(x,y);
		revA[i]=String.valueOf(mu.divide(x,y));
		revA=cleanBuf(revA);
		revolve(revA);
	}
	
	
	}
	
	return revB;
}
public String[] cleanBuf(String revA[]) {
	int size=0;
	for (int j=0;j<revA.length;j++) 
		if (revA[j].equals(null)==false) size++;
	String[] revB = new String[size];
	int m=0;
	for (int l=0;l<revB.length;l++) {
		if(revA[m].equals(null)==false) {
		revB[l]=revA[m];
		m++;	
		} else {
			m++;
		}
		for (int i=0;i<revB.length;i++)
			revA[i]=revB[i];
	}
		
	return revA;
}
}
