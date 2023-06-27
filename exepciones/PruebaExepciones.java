package exepciones;

public class PruebaExepciones {

	public PruebaExepciones() {
		// TODO Auto-generated constructor stub
	}
	
	public static int sumarPo(int a, int b)throws NumeroPositivoException {
		if(a< || b<0) {
			throw new NumeroPositivoException ("primer parametro  positivos");
		}
	}if(b>0) {
		throw new NumeroPositivoException ("segundo parametro positivos");
	}
	return a + b;

}
