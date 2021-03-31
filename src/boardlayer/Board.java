package boardlayer;

public class Board {

	private int rows;
	private int column;
	
	public Board(int rows, int column) {
		super();
		this.rows = rows;
		this.column = column;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public Piece piece(int row, int column)
	{
		
	}
	
	public Piece piece(Position position)
	{
		
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
