import javax.swing.*;
import java.awt.*;

public class HPBoard {
    private int HPNumber;

    public HPBoard(int HPNumber){
        this.HPNumber = HPNumber;
    }

    public String display(){
        return ("Current HP:"+this.HPNumber);
    }





}
