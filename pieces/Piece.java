package pieces;

import java.util.ArrayList;

import chess.Cell;

/**

La clase Piece es una clase abstracta que representa una pieza en el juego de ajedrez.

Contiene atributos y métodos comunes a todas las piezas.
*/
public abstract class Piece implements Cloneable{

	private int color;
	private String id=null;
	private String path;
	protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();
	
	/**
	
	Devuelve una lista de movimientos posibles que la pieza puede realizar desde una posición dada.
	@param pos una matriz de celdas que representa el tablero de ajedrez.
	@param x la posición x de la pieza.
	@param y la posición y de la pieza.
	@return una lista de objetos Cell que representan las celdas a las que la pieza puede moverse.
	*/
	public abstract ArrayList<Cell> move(Cell pos[][],int x,int y);
	/**
	
	Establece el identificador de la pieza.
	@param id el identificador de la pieza.
	*/
	public void setId(String id)
	{
	this.id=id;
	}
	/**
	
	Establece la ruta de la imagen de la pieza.
	@param path la ruta de la imagen de la pieza.
	*/
	public void setPath(String path)
	{
	this.path=path;
	}
	/**
	
	Establece el color de la pieza.
	@param c el color de la pieza (0 para blanco, 1 para negro).
	*/
	public void setColor(int c)
	{
	this.color=c;
	}
	/**
	
	Obtiene la ruta de la imagen de la pieza.
	@return la ruta de la imagen de la pieza.
	*/
	public String getPath()
	{
	return path;
	}
	/**
	
	Obtiene el identificador de la pieza.
	@return el identificador de la pieza.
	*/
	public String getId()
	{
	return id;
	}
	/**
	
	Obtiene el color de la pieza.
	@return el color de la pieza (0 para blanco, 1 para negro).
	*/
	public int getcolor()
	{
	return this.color;
	}
	/**
	
	Devuelve una copia de la pieza.
	@return una copia de la pieza.
	@throws CloneNotSupportedException si la clonación no es compatible.
	*/
	public Piece getcopy() throws CloneNotSupportedException
	{
	return (Piece) this.clone();
	}
	}