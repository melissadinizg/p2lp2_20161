package exercicios.prova2;

import java.util.Comparator;

public class ComparadorPersonalizacao implements Comparator<PratoPersonalizado>{

	@Override
	public int compare(PratoPersonalizado obj1, PratoPersonalizado obj2) {
		
		return obj1.getPersonalizacao().compareTo(obj2.getPersonalizacao());
	}

}
