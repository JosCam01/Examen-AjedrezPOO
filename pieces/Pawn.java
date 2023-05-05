package pieces;

import java.util.ArrayList;

import chess.Cell;

/**
 *Clase Pawn que extiende de Piece.
 */

public class Pawn extends Piece{
	
	/**
	 * Constructor de la clase Knight.
	 * @param i Identificador de la pieza.
	 * @param p Ruta de la imagen de la pieza.
	 * @param c Color de la pieza (0 para blanco, 1 para negro).
	 */
	public Pawn(String i,String p,int c)
	{
		//Inicialización de atributos heredados de la clase Piece
		setId(i);
		setPath(p);
		setColor(c);
	}
	
	/**
	 *Método para calcular los posibles movimientos de un caballo (Knight).
	 *@param state: el estado actual del tablero.
	 *@param x: posición x actual del caballo.
	 *@param y: posición y actual del caballo.
	 *@return Un ArrayList con las posibles celdas a las que el caballo puede moverse.
	 */

	public ArrayList<Cell> move(Cell state[][],int x,int y)
	{
		//Se vacía el ArrayList possiblemoves para evitar que se acumulen movimientos de ejecuciones previas.
		possiblemoves.clear();
		if(getcolor()==0)
		{
			if(x==0)
				return possiblemoves;
			if(state[x-1][y].getpiece()==null)
			{
				possiblemoves.add(state[x-1][y]);
				if(x==6)
				{
					if(state[4][y].getpiece()==null)
						possiblemoves.add(state[4][y]);
				}
			}
			if((y>0)&&(state[x-1][y-1].getpiece()!=null)&&(state[x-1][y-1].getpiece().getcolor()!=this.getcolor()))
				possiblemoves.add(state[x-1][y-1]);
			if((y<7)&&(state[x-1][y+1].getpiece()!=null)&&(state[x-1][y+1].getpiece().getcolor()!=this.getcolor()))
				possiblemoves.add(state[x-1][y+1]);
		}
		else
		{
			if(x==8)
				return possiblemoves;
			if(state[x+1][y].getpiece()==null)
			{
				possiblemoves.add(state[x+1][y]);
				if(x==1)
				{
					if(state[3][y].getpiece()==null)
						possiblemoves.add(state[3][y]);
				}
			}
			if((y>0)&&(state[x+1][y-1].getpiece()!=null)&&(state[x+1][y-1].getpiece().getcolor()!=this.getcolor()))
				possiblemoves.add(state[x+1][y-1]);
			if((y<7)&&(state[x+1][y+1].getpiece()!=null)&&(state[x+1][y+1].getpiece().getcolor()!=this.getcolor()))
				possiblemoves.add(state[x+1][y+1]);
		}
		return possiblemoves;
	}
}
