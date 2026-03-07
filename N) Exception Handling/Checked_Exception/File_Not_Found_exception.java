import java.io.FileInputStream;
public class File_Not_Found_Exception{
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("d:/abc.txt");
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
