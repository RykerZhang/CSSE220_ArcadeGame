import javax.swing.*;
import java.awt.*;




public class Main {


    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main(){
        /**
         * Create Frame
         */
        JFrame MainFrame = new JFrame();
        MainFrame.setSize(1200,800);
        MainFrame.setTitle("Arcade Game");
        MainFrame.setBackground(Color.ORANGE);
        MainFrame.setLayout(null);

        /**
         * Create Level Label
         */
        LevelFile levelFile = new LevelFile();
        JLabel LevelLabel = new JLabel("Level: " + levelFile.setLevel());
        LevelLabel.setFont(new Font("宋体", Font.PLAIN,30));
        LevelLabel.setForeground(Color.RED);
        LevelLabel.setSize(200,30);
        LevelLabel.setLocation(0,30);
        MainFrame.add(LevelLabel);


        /**
         * Create HPlabel, setting the location and other characters
         */
        HPBoard theHPBoard = new HPBoard(10);
        JLabel HPlabel = new JLabel(theHPBoard.display());
        HPlabel.setFont(new Font("宋体", Font.PLAIN,30));
        HPlabel.setForeground(Color.BLUE);
        HPlabel.setSize(200,30);
        HPlabel.setLocation(0,0);
        MainFrame.add(HPlabel);



        /**
        * Create Hero
        */
        Hero h = new Hero(560, 720, 50, 50);
        h.setSize(1200,800);
        h.setLocation(0,0);
        MainFrame.add(h);
        MainFrame.addKeyListener(h);


        /**
         * Add the platform into the frame
         */
        platformComponent Platforms = new platformComponent();
        Platforms.setSize(1200,800);
        Platforms.setLocation(0,0);
        MainFrame.add(Platforms);



        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.setVisible(true);
    }


}
