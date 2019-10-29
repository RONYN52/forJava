package hm;

public class Divide {
	float x;
	float y;
	float result;
	Divide(float a,float b){
		x=a;
		y=b;
		if (y==0) {
			System.out.print("Error! Zero divide");
		} else {
			result=x/y;
		}
		
	}
	float divide(float x,float y){
		return result;
	}

}
