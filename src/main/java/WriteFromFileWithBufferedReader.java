import java.io.*;

public class WriteFromFileWithBufferedReader {
    public static void main(String[] args) throws IOException {
        File file = new File("read.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String s = null;
        System.out.println("Введите слова: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s = reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        File fileOutString = new File("outString.txt");
        try {
            fileOutString.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileOutputStream fos = new FileOutputStream(fileOutString, true);
        fos.write(s.getBytes());
        System.out.println("Запись окончена=)");
    }


}
