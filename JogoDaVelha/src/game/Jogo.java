package game;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Jogo extends JFrame{

	JButton cor;
	JButton [] botoes;
	JPanel PainelJogo;
	int vezJogador;
	String simbolo;
	
	public Jogo(){//Contrutor
		super("Jogo da Velha");//titulo da janela
		((JComponent)getContentPane()).setBorder(new EmptyBorder(5, 5, 5, 5));
		
		PainelJogo = new JPanel(); // Cria um Painel
		PainelJogo.setLayout(new GridLayout(3, 3, 10, 10));//Atribui um Layout do tipo gridlayot
		cor = new JButton(); // Botao para restaurar a cor do outros botoes
		
		botoes = new JButton[9];//Cria um vector com tamanho 9 
		
		for( int i=0; i<9; i ++){
			botoes[i] = new JButton("");//Cria e atribui os botoes a matriz
		}
		
	//Inicio da formatação dos botoes do jogo
		
		botoes[0].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[0].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(0); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[0]); //add o botao ao painel
		
		botoes[1].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[1].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(1); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[1]); //add o botao ao painel
		
		botoes[2].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[2].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(2); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[2]); //add o botao ao painel
		
		botoes[3].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[3].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(3); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[3]); //add o botao ao painel
		
		botoes[4].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[4].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(4); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[4]); //add o botao ao painel
		
		botoes[5].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[5].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(5); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[5]); //add o botao ao painel
		
		botoes[6].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[6].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(6); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[6]); //add o botao ao painel
		
		botoes[7].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[7].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(7); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[7]); //add o botao ao painel
	
		botoes[8].setFont(new Font("Calibri", Font.BOLD, 70)); // determina a fonte do botão
		botoes[8].addActionListener(new ActionListener() { //atribui uma açao ao botao
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Jogada(8); //chama o metodo jogaca atriuindo o valor 0 para identtificar o botao
				
			}
		});
		PainelJogo.add(botoes[8]); //add o botao ao painel
		

// fim da formatacao dos botoes
		
		add(PainelJogo); // add o painel a janela
		setLocation(470, 200);//localizacao das janelas
		setSize(400, 400);
		setVisible(true);
		
		
	}
	
	//Metodo que verifica de quem é a vez e seu simbolo
	public void Jogada(int Simbol){ //cria o metodo jogada e pede um valor do tipo inteiro
		//verifica vez e indica o simbolo do jogador
		if(vezJogador ==0){
			simbolo = "X";
			vezJogador = 1;
		}else{
			simbolo = "O";
			vezJogador = 0;
		}
		botoes[Simbol].setText(simbolo); // Atribui o simbolo ao botao de acordo com o valor do tipo fornecido
		botoes[Simbol].setEnabled(false); // deixa o botao desativado
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
