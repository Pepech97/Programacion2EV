
public class PruebasDeCodigo {

	public int metodo(boolean a, boolean b, boolean c){
		int ret=0;
				if(a&&b){
					ret = 1;
				}else{
					ret=2;
				}
				return ret;
	}
	public int contar_letra(String cadena, char letra){
		int contador, n, longitud;
		n=0; contador=0;
		longitud=cadena.length();
		if (longitud>0){
			do{
				if (cadena.charAt(contador)==letra){
					n++;
				}
				contador++;
				longitud--;
			}while (longitud > 0);
		}
		return n;
	}
}