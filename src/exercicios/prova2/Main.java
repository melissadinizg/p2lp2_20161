package exercicios.prova2;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		EstoqueDePratos e = new EstoqueDePratos();
		e.adicionaPrato(e.criaPratoTriangular(10, Personalizacao.FOTO, 2, 4));
		e.adicionaPrato(e.criaPratoCircular(10, Personalizacao.ESTAMPA, 2));
		e.adicionaPrato(e.criaPratoCircular(5, Personalizacao.ESTAMPA, 2));
		imprimePratos(e.getPratosOrdenados());
	}

	private static void imprimePratos(List<PratoPersonalizado> lista) {
		for(PratoPersonalizado p: lista){
			System.out.println(p + " " + String.format("%.2f", p.precoTotal()));
		}
		
	}

}
