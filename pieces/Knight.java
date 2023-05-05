package pieces;

import java.util.ArrayList;

import chess.Cell;
/**
 *Clase Knight que extiende de Piece.
 */

public class Knight extends Piece{
	
	/**
	 * Constructor de la clase Knight.
	 * @param i Identificador de la pieza.
	 * @param p Ruta de la imagen de la pieza.
	 * @param c Color de la pieza (0 para blanco, 1 para negro).
	 */
	public Knight(String i,String p,int c)
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
		//Se define un arreglo con las posibles coordenadas x e y a las que el caballo puede moverse.
		int posx[]={x+1,x+1,x+2,x+2,x-1,x-1,x-2,x-2};
		int posy[]={y-2,y+2,y-1,y+1,y-2,y+2,y-1,y+1};
		//Se recorren todas las posibles posiciones a las que el caballo puede moverse.

		for(int i=0;i<8;i++)
		//Se verifica que la posible posición esté dentro del tablero.

			if((posx[i]>=0&&posx[i]<8&&posy[i]>=0&&posy[i]<8))
			//Se verifica que la celda esté vacía o tenga una pieza de color distinto al del caballo.

				if((state[posx[i]][posy[i]].getpiece()==null||state[posx[i]][posy[i]].getpiece().getcolor()!=this.getcolor()))
				{
					//Si se cumple lo anterior, se agrega la celda a possiblemoves.

					possiblemoves.add(state[posx[i]][posy[i]]);
				}
				//Se devuelve el ArrayList con las posibles celdas a las que el caballo puede moverse.

		return possiblemoves;
	}
}