package boardgame;

public class Piece {
	
	protected Position position;
	protected Board board;
	
	//construtor criado sem Position pois uma peça inicialmente não está no tabuleiro, portanto sua posição inicial é nulo
	public Piece(Board board) {		
		this.board = board;
		//não é preciso colocar o valor nulo, pois se não for colocado por padrão o Java atribui nulo, só está sendo colocado para enfatizar que eleé nulo
		position = null; 
	}
	
	//Ficará protected pois somente classes do mesmo pacote poderão acessar esse método, não pode ser acessado pela camada de jogo, somente uso interno pela camada do tabuleiro
	protected Board getBoard() {
		return board;
	}
	
	/*o método set é retirado para não permitir que o tabuleiro seja alterado
	public void setBoard(Board board) {
		this.board = board;
	}*/
	
	

}
