package piece_collection;
public class Square {

    private int Xposition;
    private int Yposition;
    private Piece piece;

    public Square(int x, int y){
        this.Xposition = Xposition;
        this.Yposition = Yposition; 
    }

    public int getX() {
        return Xposition;
        
    }

    public int getY() {
        return Yposition;
        
    }
    public void setPiece(Piece piece){
        this.piece = piece;

    }
    public Piece getPiece(){
        return piece;
    }
    
}
