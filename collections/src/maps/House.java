package maps;

public class House {

	String capital;
	String sigil ;
	
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getSigil() {
		return sigil;
	}
	public void setSigil(String sigil) {
		this.sigil = sigil;
	}
	public House(String capital, String sigil) {
		super();
		this.capital = capital;
		this.sigil = sigil;
	}
	@Override
	public String toString() {
		return "\n" +"House Details::" + "\n" + "Capital : " + this.capital + "\n" 
				+ "Sigil : "  + this.sigil;
	}
	
	
}
