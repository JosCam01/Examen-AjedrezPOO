package pieces;

import java.util.ArrayList;

import chess.Cell;


/**

La clase Queen representa a una reina del juego de ajedrez.

Extiende la clase Piece y define su movimiento.
*/
public class Queen extends Piece{

	/**
	
	Crea una nueva instancia de Queen con un identificador, una ruta de imagen y un color especificados.
	@param i Identificador de la reina.
	@param p Ruta de la imagen de la reina.
	@param c Color de la reina.
	*/
	public Queen(String i, String p, int c)
	{
	setId(i);
	setPath(p);
	setColor(c);
	}
	/**
	
	Calcula todos los movimientos posibles de la reina en el estado actual del tablero.
	
	@param state Tablero actual del juego.
	
	@param x Coordenada x de la posición actual de la reina.
	
	@param y Coordenada y de la posición actual de la reina.
	
	@return ArrayList de objetos Cell que representan los movimientos posibles de la reina.
	*/
	public ArrayList<Cell> move(Cell state[][], int x, int y)
	{
	possiblemoves.clear();
	
	// Movimientos horizontales y verticales
	int tempx = x - 1;
	while(tempx >= 0) {
	if(state[tempx][y].getpiece() == null)
	possiblemoves.add(state[tempx][y]);
	else if(state[tempx][y].getpiece().getcolor() == this.getcolor())
	break;
	else {
	possiblemoves.add(state[tempx][y]);
	break;
	}
	tempx--;
	}
	
	tempx = x + 1;
	while(tempx < 8) {
	if(state[tempx][y].getpiece() == null)
	possiblemoves.add(state[tempx][y]);
	else if(state[tempx][y].getpiece().getcolor() == this.getcolor())
	break;
	else {
	possiblemoves.add(state[tempx][y]);
	break;
	}
	tempx++;
	}
	
	int tempy = y - 1;
	while(tempy >= 0) {
	if(state[x][tempy].getpiece() == null)
	possiblemoves.add(state[x][tempy]);
	else if(state[x][tempy].getpiece().getcolor() == this.getcolor())
	break;
	else {
	possiblemoves.add(state[x][tempy]);
	break;
	}
	tempy--;
	}
	
	tempy = y + 1;
	while(tempy < 8) {
	if(state[x][tempy].getpiece() == null)
	possiblemoves.add(state[x][tempy]);
	else if(state[x][tempy].getpiece().getcolor() == this.getcolor())
	break;
	else {
	possiblemoves.add(state[x][tempy]);
	break;
	}
	tempy++;
	}
	
	// Movimientos diagonales
	tempx = x + 1;
	tempy = y - 1;
	while(tempx < 8 && tempy >= 0) {
	if(state[tempx][tempy].getpiece() == null)
	possiblemoves.add(state[tempx][tempy]);
	else if(state[tempx][tempy].getpiece().getcolor() == this.getcolor())
	break;
	else {
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}