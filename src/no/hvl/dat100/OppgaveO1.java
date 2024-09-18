package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {

		String input = showInputDialog(null, "Skriv inn bruttoinntekt:");

		double bruttoinntekt = Double.parseDouble(input);

		double trinnskatt = 0.0;

		if (bruttoinntekt > 1350000) {
			trinnskatt += (bruttoinntekt - 1350000) * 0.176;
			bruttoinntekt = 1350000;
		}

		if (bruttoinntekt > 969200) {
			trinnskatt += (bruttoinntekt - 969200) * 0.162;
			bruttoinntekt = 969200;
		}

		if (bruttoinntekt > 643000) {
			trinnskatt += (bruttoinntekt - 643000) * 0.132;
			bruttoinntekt = 643000;
		}

		if (bruttoinntekt > 277750) {
			trinnskatt += (bruttoinntekt - 277750) * 0.04;
			bruttoinntekt = 277750;
		}

		if (bruttoinntekt > 208050) {
			trinnskatt += (bruttoinntekt - 208050) * 0.017;
		}

		showMessageDialog(null, "Trinnskatten er: " + trinnskatt + " kr");
	}
}
