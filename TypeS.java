package hm;

public class TypeS {
	String str;
	TypeS(String inStr){
		str=inStr;
	}
	public boolean typeS(String str){
		if (str.equals("+") | str.equals("-") | str.equals("*") | str.equals("/") | str.equals("(") | str.equals(")")) {		
		return false; }
		else  {
			return true;
		}
	}

}
