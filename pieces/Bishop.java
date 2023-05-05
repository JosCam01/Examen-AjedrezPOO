package pieces;

import java.util.ArrayList;

import chess.Cell;

/**Clase que representa una pieza de ajedrez de tipo alfil.
	Hereda de la clase Piece.**/

public class Bishop extends Piece{
	
	/** Constructor de la clase.
	 * @param i Identificador de la pieza.
	 * @param p Ruta de la imagen de la pieza.
	 * @param c Color de la pieza.
	 */
	public Bishop(String i,String p,int c)
	{
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	/**
	 * Calcula los movimientos posibles del alfil en el estado actual del tablero.
	 * @param state Estado actual del tablero.
	 * @param x Fila en la que se encuentra la pieza.
	 * @param y Columna en la que se encuentra la pieza.
	 * @return ArrayList con los movimientos posibles de la pieza.
	 */
	
	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		
		possiblemoves.clear();
		// Movimientos en diagonal hacia arriba y a la izquierda.
		int tempx=x+1,tempy=y-1;
		while(tempx<8&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
			{
				possiblemoves.add(state[tempx][tempy]);
			}
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy--;
		}
		// Movimientos en diagonal hacia abajo y a la derecha.
		tempx=x-1;tempy=y+1;
		while(tempx>=0&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy++;
		}
		// Movimientos en diagonal hacia arriba y a la derecha.
		tempx=x-1;tempy=y-1;
		while(tempx>=0&&tempy>=0)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx--;
			tempy--;
		}
		// Movimientos en diagonal hacia abajo y a la izquierda.
		tempx=x+1;tempy=y+1;
		while(tempx<8&&tempy<8)
		{
			if(state[tempx][tempy].getpiece()==null)
				possiblemoves.add(state[tempx][tempy]);
			else if(state[tempx][tempy].getpiece().getcolor()==this.getcolor())
				break;
			else
			{
				possiblemoves.add(state[tempx][tempy]);
				break;
			}
			tempx++;
			tempy++;
		}
		return possiblemoves;
	}
}