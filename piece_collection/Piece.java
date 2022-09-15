package piece_collection;


public class Piece{


    private Square position;

    private boolean alive=true;
    private boolean white;    //true for white, false for black


    public Piece(Square position, boolean whitee){
        this.position = position;
        this.white=whitee;
    }

    public Square getposition(){
        return position;
    }

    public boolean getAlive(){
        return alive;
    }

    public void Setposition(Square position){
        this.position = position;

    }
    public void setAlive(boolean al){
        this.alive=al;
    }
}
