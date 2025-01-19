package components;

public class Player {
    String Name;
    int pos;
    public Player(String Name){
        this.Name=Name;
        this.pos=0;
    }

    // getter
    String getName(){
        return this.Name;
    }

    int getPosition(){
        return this.pos;
    }


    // setter
    void setName(String Name){
        this.Name=Name;
    }

    void setPosition(int pos){
        this.pos=pos;
    }
}
