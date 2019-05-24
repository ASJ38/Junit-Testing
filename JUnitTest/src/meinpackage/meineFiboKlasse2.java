package meinpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class meineFiboKlasse2 {
	FiboPrinter meinFiboPrinter = new FiboPrinter();
	static Scanner s = new Scanner(System.in);
	
	MeineFiboTestklasse2 meineFiboTestKlasse;

	public static void main(String[] args) {
		meineFiboKlasse2 mF2 = new meineFiboKlasse2();
		mF2.isBerechnet();
	}

	public void isBerechnet() {
		String index = "";

		while (Again(index)) {
			index = s.next();
			System.out.println("Geben sie eine Zahl zwischen 2 und 5000 ein!");
			meinFiboPrinter.againPrinter();
			// index = input.next();

			if (isNumericAndUnterGrenze(index)) {
				fiboZahlen(Integer.parseInt(index));
				meinFiboPrinter.lastFiboIndexPrinter(fiboZahlen(Integer.parseInt(index)));

			}
		}

	}

	public boolean isNumericAndUnterGrenze(String str) {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		if (mF.isNumeric(str) && mF.isUnterGrenze(str)) {
			return true;
		}

		return false;

	}

	public float[] fiboZahlen(int b) {
		float fiboNumbers[] = new float[b];

		fiboNumbers[0] = 1;
		fiboNumbers[1] = 1;
		for (int i = 2; i < fiboNumbers.length; i++) {
			fiboNumbers[i] = fiboNumbers[i - 1] + fiboNumbers[i - 2];
		}
		return fiboNumbers;
	}

	public boolean isUnterGrenze(String j) {
		int b = Integer.parseInt(j);
		if ((b > 1) && (b <= 5000)) {
			return true;
		} else {
			meinFiboPrinter.notUntergrenzePrinter();
		}
		return false;
	}

	public boolean isNumeric(String j) {
		try {
			Integer num = Integer.parseInt(j);
		} catch (NumberFormatException e) {
			meinFiboPrinter.notNumericPrinter();
			return false;
		}
		return true;
	}

	public boolean Again(String j) {
		if ("E".equals(j)) {
			meinFiboPrinter.programmEndePrinter();
			return false;
		}
		return true;
	}

}
