
public abstract class EscolaDeSamba implements TemMestreSala, TemPortaBandeira{
	@Override
	public String mostraMestreSala() {
		return "Temos mestre sala";
	}
	
	@Override
	public abstract String mostraPortaBandeira();
}
