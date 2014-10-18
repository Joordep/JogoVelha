package game;

import javax.swing.JFrame;

public class JogoDaVelha extends JFrame {

	public static void main(String[] args){
		
		Jogo tela = new Jogo(); // objeto do tipo jogo
		tela.setDefaultCloseOperation(EXIT_ON_CLOSE); // Determina que ao fechar a tela a aplicacao é finalizada
		tela.setResizable(false); // faz com quem a tela nao seja maximizada 
		
	}
}
