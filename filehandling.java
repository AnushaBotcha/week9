import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
class ex{
    public static void main(String[] args) throws IOException {
        FileInputStream x;
        FileOutputStream y;
        try{
            x=new FileInputStream("file.txt");
            y=new FileOutputStream("copy.txt");
            int ch;
            while((ch=x.read())!=-1){
                y.write(ch);
            }
        }
        catch(IOException e){e.printStackTrace();}
    }
}

