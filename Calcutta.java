package hm;

  class  Calcutta {
	String inData= new String();
	
	Calcutta (String primer) {	
		inData=primer;
		
				}
	  String[] massiv() {
		  String[] a = new String[inData.length()];
		  int i = 0,j=0,k=0;
		  String buf="";
		  while (i<a.length)  {
			  TypeS ts = new TypeS(inData.substring(i, i+1));
			  j=i+1;
			  if ((ts.typeS(inData.substring(i, i+1))==true)  & (i<a.length+1)) {
				  buf=buf+inData.substring(i, i+1);
				  if ((j+1)<a.length)
				 while  ((ts.typeS(inData.substring(j, j+1))==true) & (j<a.length+1))  
				 {
					buf=buf+inData.substring(j, j+1);
				j=j+1;
				 }
					i=j;
					a[k]=buf;
					k++;
					buf="";
			  } else if (k<a.length) {
				  a[k]=inData.substring(i, i+1);
				  k++;
				  i=j;
			  } else break;
		  
	} for (int s=0;s<a.length;s++) {
		}
		  return a;
	  }
	
	public static void main(String[] args) {
		Calcutta prn = new Calcutta("1+2+1*(10-2)/2+16*1-1");
		System.out.println(prn.inData);
		System.out.println("Load Array ");
		String[] bufA = new String[prn.inData.length()];	
		bufA=prn.massiv();
		for (int i=0;i<bufA.length;i++) {
			if (bufA[i]!=null)
		System.out.print(bufA[i]+" ");
		}

}

  } 
