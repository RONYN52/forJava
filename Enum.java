package hm;

public class Enum {
enum e{
	PLUS("+"),
	MINUS("-"),
	MULTIPLY("*"),
	DIVIDE("/"),
	LBKT("("),
	RBKT(")");
	private String znak;
	e(String znak){
		this.znak=znak;
	}
	public String getZnak() {
		return znak;
	}
}
}
