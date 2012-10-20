public class Karta {

		private int barva; //1-list, 2-srdce, 3-kule, 4-zalud
		private int hodnota; // 7,8,9,10,11=spodek,12=vrsek,13=kral,14=eso
		
		Karta(int barva,int hodnota) {
			if (barva<1 && barva>4){
				//System.out.println("Neplatná karta.");
				return;
			} else {
				this.setBarva(barva);
			}
			
			if(hodnota<7 && hodnota>14) {
				//System.out.print("Neplatná karta");
				return;
			} else {
				this.hodnota = hodnota;
			}
	
		}

		public int getBarva() {
			return barva;
		}

		public void setBarva(int barva) {
			this.barva = barva;
		}
		
		public int getHodnota() {
			return hodnota;
		}

		String vypisKartu(Karta karta){
			String vypisKarty="V ruce máš právì ";
			switch(karta.getBarva()) {
			case 1: vypisKarty = vypisKarty + "listovou"; break;
			case 2: vypisKarty = vypisKarty + "srdcovou"; break;
			case 3: vypisKarty = vypisKarty + "kulovou"; break;
			case 4: vypisKarty = vypisKarty + "žaludovou"; break;
			default: vypisKarty = vypisKarty + "kartu neplatné barvu";
			}
			
			switch(karta.getHodnota()) {
			case 7: vypisKarty = vypisKarty + " sedmièku"; break;
			case 8: vypisKarty = vypisKarty + " osmièku"; break;
			case 9: vypisKarty = vypisKarty + " devítku"; break;
			case 10: vypisKarty = vypisKarty + " desítku"; break;
			case 11: vypisKarty = vypisKarty + " spodka"; break;
			case 12: vypisKarty = vypisKarty + " vrška"; break;
			case 13: vypisKarty = vypisKarty + " krále"; break;
			case 14: vypisKarty = vypisKarty + " eso"; break;
			default: vypisKarty = vypisKarty + " kartu neplatné hodnoty ";
			}
			return vypisKarty;
		} 
}
