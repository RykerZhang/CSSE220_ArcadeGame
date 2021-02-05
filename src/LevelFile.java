import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class LevelFile {
    private ArrayList<platform>platformList=new ArrayList<platform>();
    private int Level;
    private String platformName;
    private int x;
    private int y;
    private int width;
    private int height;

    public LevelFile(){
        processPlatform("File/LevelFile.txt");
    }

    public void processPlatform(String fileName ){
        int lineNumber = 0;
        try {
            FileReader file = new FileReader(fileName);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                lineNumber++;
                String line = scanner.nextLine();
                String[] contents = line.split(",");
//                System.out.println(Arrays.deepToString(contents));
                if(lineNumber==1){
                    Level = Integer.valueOf(contents[1]);
                }
                if(lineNumber>1&&lineNumber<8){
                    platformName = contents[0];
                     x = Integer.valueOf(contents[1]);
                     y = Integer.valueOf(contents[2]);
                     width = Integer.valueOf(contents[3]);
                     height = Integer.valueOf(contents[4]);
                     platform thePlatform = new platform(x,y,width,height);
                    platformList.add(thePlatform);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find the file");

        }
    }

    public ArrayList<platform> getPlatform(){
        return platformList;
    }

    public int setLevel(){
        return Level;
    }


}
