import java.io.*;

public class FileRead {


    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        FileInputStream fis = null;
        try {
             fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] text = new byte[(int) file.length()];
        fis.read(text);
        String s = new String(text, "UTF-8");

        String[] arrayString = s.split(" ");

        for(String temp : arrayString){
            System.out.println(temp);
        }
        File outFile = new File("out.txt");
        if(!outFile.exists()){
            outFile.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(outFile);
        fos.write(s.toUpperCase().getBytes());

    }
}