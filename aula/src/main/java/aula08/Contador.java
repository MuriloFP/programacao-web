package aula08;
import java.util.Date;

public class Contador {

	private static int contagem;
	
	public static void NovoAcesso() {
		contagem += 1;
	}
	public static int getQuantidadeAcessos() {
		return contagem;
	}
	
	public static Date data_inicial = new Date();
	public static Date ultimo_acesso = new Date();
	
	public static Object getDataInicial() {
		return data_inicial;
	}
	
	public static Object getUltimoAcesso() {
		if (contagem > 1)
			return ultimo_acesso;
		return data_inicial;
	}
	
	public static void updateUltimoAcesso() {
		if (contagem > 1)
			ultimo_acesso = new Date();
	}
	
}
