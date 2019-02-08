import java.util.Comparator;

public class ComparadorDeImposto implements Comparator<Imposto> {

	@Override
	public int compare(Imposto o1, Imposto o2) {
		if (o1.getTaxa() < o2.getTaxa()) {
			return -1;
		} else if(o1.getTaxa() == o2.getTaxa()) {
			return 0;
		} else {
			return 1;
		}
	}

}
