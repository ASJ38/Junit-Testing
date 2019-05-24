package meinpackage;

public class FiboPrinter {

	public void againPrinter() {
		System.out.println("Geben sie eine Zahl zwischen 2 und 5000 ein!");
	}

	public void notNumericPrinter() {
		System.out.println("Bitte geben Sie nur Zahlen ein!");
	}

	public void notUntergrenzePrinter() {
		System.out.println("Die Zahl muss größer als 1 und kleiner als 5000 sein!");
	}

	public void programmEndePrinter() {
System.out.println("Ende des Programms");
	}

	public void lastFiboIndexPrinter(float[] fiboZahlen) {
		System.out.println("Letzer Wert des Arrays: |" + fiboZahlen[fiboZahlen.length - 1] + "| an Stelle: |"
				+ fiboZahlen.length + "| >>>Zum Beenden des Programmes |E| drücken<<<");
	}
}
