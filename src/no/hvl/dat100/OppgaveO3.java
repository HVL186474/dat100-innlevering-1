package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class OppgaveO3 {

	public static void main(String[] args) {

		String input = showInputDialog(null, "Skriv inn et heltall n (n > 0): ");

		int n = parseInt(input);

		if (n > 0) {

			int fakultet = 1;

			for (int i = 1; i <= n; i++) {

				fakultet *= i;
			}

			showMessageDialog(null, "Verdien av " + n + "! er " + fakultet);

		} else {

			showMessageDialog(null, "Feil: n må være større enn 0.");
		}
	}
}
