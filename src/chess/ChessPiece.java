package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	/*Retirando o set pois a cor não pode ser modificada, ele só pode ser acessada
	public void setColor(Color color) {
		this.color = color;
	}*/	

}
