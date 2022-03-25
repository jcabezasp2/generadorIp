package generadorIp;

import java.util.Random;

public class GeneradorIp {

	Random random = new Random();
	
	public int generarNumero(int min, int max) {
		
		int resultado =  random.nextInt(max + 1) + min;
		
		
		return resultado;
	}
	
	public String generarIp() {
		StringBuilder sb = new StringBuilder();
		
		
			sb.append(generarNumero(1, 254));
			sb.append(".");
			sb.append(generarNumero(0, 254));
			sb.append(".");
			sb.append(generarNumero(0, 254));
			sb.append(".");
			sb.append(generarNumero(1, 254));
		
		
		return sb.toString();
	}
}
