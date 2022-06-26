package br.com.santos.cm.visao;

import javax.swing.JFrame;

import br.com.santos.cm.modelo.Tabuleiro;

public class TelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		add(new PainelTabuleiro(tabuleiro));

		setTitle("Campo Minado");
		setSize(700,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TelaPrincipal();

	}
}
