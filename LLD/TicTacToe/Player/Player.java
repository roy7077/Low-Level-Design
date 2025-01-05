package Player;
import PlayingPiece.PlayingPiece;

public class Player {
    String name;
    PlayingPiece type;

    public Player(String name,PlayingPiece playingPiece){
        this.name=name;
        this.type=playingPiece;
    }

    // getter 
    public String getName() {
        return name;
    }

    public PlayingPiece getType() {
        return type;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setType(PlayingPiece type) {
        this.type = type;
    }
}
