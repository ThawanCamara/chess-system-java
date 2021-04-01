package boardlayer;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column)
	{
		return pieces[row][column];
	}
	
	public Piece piece(Position position)
	{
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position)
	{
		
	}
	
	public Piece removePiece(Position position)
	{
		
	}
	
	public boolean positionExists(Position position)
	{
		
	}
	
	public boolean thereIsAPiece(Position position)
	{
		
	}
	
}
