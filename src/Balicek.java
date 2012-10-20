
public class Balicek {
	static int pocetKaret=0;
	int idKarty;
	public static void main(String[] args) {

		for(int b=1;b<5;b++){
			for(int i=7;i<15;i++) {
				//idKarty= ++pocetKaret;
				Karta karta = new Karta(b,i);
				System.out.println(karta.vypisKartu(karta));
			}
		}
		Karta nahodnaKarta = new Karta(5,5);
		System.out.println(nahodnaKarta.getBarva());
		System.out.println(nahodnaKarta.getHodnota());
		System.out.print(nahodnaKarta.vypisKartu(nahodnaKarta));

	}

}
