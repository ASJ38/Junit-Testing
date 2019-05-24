package meinpackage;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class MeineFiboTestklasse2 extends TestCase {

	@Test
	public void test20() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("Die länge muss 20 betragen", 20, mF.fiboZahlen(20).length);
		assertEquals("Der Wert mus 2,0 sein", 2, 0, mF.fiboZahlen(20)[2]);
		assertEquals("Der Wert muss 6765 sein", 6765, 0, mF.fiboZahlen(20)[19]);

		// fail("Not yet implemented");
	}

	public void test50() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("Die länge muss 50 betragen", 50, mF.fiboZahlen(50).length);
		assertEquals("Der Wert muss 3,0 sein", 3, 0, mF.fiboZahlen(50)[3]);// 4 stelle
		assertEquals("Der Wert muss 832040 sein", 832040, 0, mF.fiboZahlen(50)[29]);// 30 stelle

		// fail("Not yet implemented");
	}

	public void test100() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("Die länge muss 100 betragen", 100, mF.fiboZahlen(100).length);
		assertEquals("Der Wert muss 55,0 sein", 55, 0, mF.fiboZahlen(100)[10]);// 11 stelle
		assertEquals("Der Wert muss 832040 sein", 832040, 0, mF.fiboZahlen(100)[99]);// 33 stelle

		// fail("Not yet implemented");
	}

	public void test68() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("Die länge muss 68 betragen", 68, mF.fiboZahlen(68).length);
		assertEquals("Der Wert muss 3,0 sein", 610, 0, mF.fiboZahlen(68)[14]);// 15 stelle
		assertEquals("Der Wert muss 832040 sein", 9227465, 0, mF.fiboZahlen(68)[34]);// 35 stelle

		// fail("Not yet implemented");
	}

	public void test32() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("Die länge muss 32 betragen", 32, mF.fiboZahlen(32).length);
		assertEquals("Der Wert muss 3,0 sein", 34, 0, mF.fiboZahlen(32)[8]);// 9 stelle
		assertEquals("Der Wert muss 832040 sein", 317811, 0, mF.fiboZahlen(32)[27]);// 28 stelle

		// fail("Not yet implemented");
	}

	public void testNumeric() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("", true, mF.isNumeric("50"));
	}

	public void testisUnterGrenze() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("", true, mF.isUnterGrenze("5000"));
	}

	public void testAgain() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("", false, mF.Again("E"));
	}

	// REV
	public void testRevNumeric() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("k ist keine Zahl", false, mF.isNumeric("k"));
	}

	public void testRevisUnterGrenze() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("5001 ist über der Grenze", false, mF.isUnterGrenze("5001"));
	}

	public void testRevAgain() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("", true, mF.Again("A"));
	}

	public void testIsNumericAndIsUnterGrenze() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("12d ist keine Zahl", false, mF.isNumericAndUnterGrenze("12d"));

	}

	public void testIsNumericAndIsUnterGrenze2() {
		meineFiboKlasse2 mF = new meineFiboKlasse2();
		assertEquals("50 ist eine Zahl", true, mF.isNumericAndUnterGrenze("50"));

	}

}
