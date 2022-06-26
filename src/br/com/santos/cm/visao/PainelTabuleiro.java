package br.com.santos.cm.visao;

import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.santos.cm.modelo.Tabuleiro;

public class PainelTabuleiro extends JPanel {

	private static final long serialVersionUID = 1L;

	public PainelTabuleiro(Tabuleiro tabuleiro) {

		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		tabuleiro.paraCada(c -> add(new BotaoCampo(c)));

		tabuleiro.registrarObservador(e ->{
			//TODO mostrar resultado para o usuário.
		});
		}
}
