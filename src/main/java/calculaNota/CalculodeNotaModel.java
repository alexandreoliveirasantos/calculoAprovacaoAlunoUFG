package calculaNota;

public class CalculodeNotaModel {
	
	 int frequencia;
	 String nome;
	 
	public static String calculaResultado(String nome, float frequencia, float notaFinal){
		String resultado = "";
		if(frequencia > 60 && notaFinal > 6.0){
			resultado = nome +" :APROVADO";
		}
		else if(frequencia > 60 && notaFinal < 6.0){
			resultado = nome +" :REPROVADO POR MÉDIA";
		}
		else if(frequencia < 60 && notaFinal > 6.0){
			resultado = nome +" :REPROVADO POR FALTA";
		}
		else{
			resultado = nome +": REPROVADO POR MÉDIA E POR FALTA";
		}
		return resultado;
	}
}
