public class Karta {

		private int barva; //1-list, 2-srdce, 3-kule, 4-zalud
		private int hodnota; // 7,8,9,10,11=spodek,12=vrsek,13=kral,14=eso
		
		Karta(int barva,int hodnota) {
			if (barva<1 && barva>4){
				//System.out.println("Neplatn� karta.");
				return;
			} else {
				this.setBarva(barva);
			}
			
			if(hodnota<7 && hodnota>14) {
				//System.out.print("Neplatn� karta");
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
			String vypisKarty="V ruce m� pr�v� ";
			switch(karta.getBarva()) {
			case 1: vypisKarty = vypisKarty + "listovou"; break;
			case 2: vypisKarty = vypisKarty + "srdcovou"; break;
			case 3: vypisKarty = vypisKarty + "kulovou"; break;
			case 4: vypisKarty = vypisKarty + "�aludovou"; break;
			default: vypisKarty = vypisKarty + "kartu neplatn� barvu";
			}
			
			switch(karta.getHodnota()) {
			case 7: vypisKarty = vypisKarty + " sedmi�ku"; break;
			case 8: vypisKarty = vypisKarty + " osmi�ku"; break;
			case 9: vypisKarty = vypisKarty + " dev�tku"; break;
			case 10: vypisKarty = vypisKarty + " des�tku"; break;
			case 11: vypisKarty = vypisKarty + " spodka"; break;
			case 12: vypisKarty = vypisKarty + " vr�ka"; break;
			case 13: vypisKarty = vypisKarty + " kr�le"; break;
			case 14: vypisKarty = vypisKarty + " eso"; break;
			default: vypisKarty = vypisKarty + " kartu neplatn� hodnoty ";
			}
			return vypisKarty;
		} 
}
