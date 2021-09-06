package week14;

public class C2F extends Converter {
	
	@Override
	protected double convert(double src) {
		return ((9.0/5)*src + 32);
	}

	@Override
	protected String srcString() { return "�����µ�"; }

	@Override
	protected String destString() { return "ȭ���µ�"; }
	
	public static void main(String args[]) {
		C2F toF = new C2F(); 
		toF.run();
	}
}
