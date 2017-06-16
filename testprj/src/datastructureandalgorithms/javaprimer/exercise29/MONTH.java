package datastructureandalgorithms.javaprimer.exercise29;

public enum MONTH {
	JAN(31), FEB(28), LFEB(29), MAR(31), APR(30), MAY(31), JUN(30), JUL(31), AUG(31), SEP(30), OCT(31), NOV(
			30), DEC(31);
	int numberOfdays;

	MONTH(int numberOfdays) {
		this.numberOfdays = numberOfdays;
	};
};
