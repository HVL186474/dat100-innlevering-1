package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {

		int antallStudenter = 10;

		for (int i = 1; i <= antallStudenter; i++) {

			int poengsum;

			while (true) {

				String input = showInputDialog(null, "Skriv inn poengsum for student " + i + " (0-100):");

				poengsum = parseInt(input);

				if (poengsum >= 0 && poengsum <= 100) {
					break;
				} else {
					showMessageDialog(null, "Feil: Ugyldig poengsum. Poengsummen må være mellom 0 og 100. Prøv igjen.");
				}
			}

			char karakter;
			if (poengsum >= 90) {
				karakter = 'A';
			} else if (poengsum >= 80) {
				karakter = 'B';
			} else if (poengsum >= 70) {
				karakter = 'C';
			} else if (poengsum >= 60) {
				karakter = 'D';
			} else if (poengsum >= 50) {
				karakter = 'E';
			} else {
				karakter = 'F';
			}

			showMessageDialog(null, "Student " + i + " sin karakter er: " + karakter);
		}
	}
}
