
public class Spookhuis extends Attractie {
	protected String naam;
	protected double prijs;
	protected int oppervlakte;
	protected static int kaartjesVerkocht;
	protected static double omzet;
	protected Kassa kassa = new Kassa();
	
	Spookhuis(){
		this.prijs = 3.2;
		this.naam = "Spookhuis";
	}
	
	@Override
	void draaien(Attractie attractie) {
		kaartjeKopen(attractie);
		System.out.println(this.naam + " draait!");
	}

	@Override
	void omzetTonen(Attractie attractie) {
		String omzet1  = String.format("%.2f", omzet);
		System.out.println("Omzet " + this.naam + ": " + omzet1 + " euro");
		}

	@Override
	void kaartjesTonen(Attractie attractie) {
		 System.out.println("Verkochte kaartjes " + this.naam + ": " + kaartjesVerkocht);
	}

	void kaartjeKopen(Attractie attractie) {
		omzet += this.prijs;
		kaartjesVerkocht++;
		kassa.kaartjeKopen(this.prijs);
		}
}
