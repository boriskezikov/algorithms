import com.sun.jdi.CharType;
import javax.lang.model.type.TypeVariable;
import java.io.*;
import java.net.SocketOption;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class breadthSearch {
    public void BreadthSearch(){
        try{
        BufferedReader reader = new BufferedReader(new FileReader("/Users/kezikovboris/Desktop/java_files/graph.txt"));
        String line;
        int size = Integer.parseInt(reader.readLine());
        List<String> matrix = new LinkedList<>();

        while ((line = reader.readLine()) != null)  {

            matrix.add(line.replaceAll("\\s+",""));
            System.out.println(line);
        }
        String coordinats = matrix.get(size);
        char[] cords = coordinats.toCharArray();
        char start_cord = cords[0];
        char finish_cord = cords[1];
        Queue<String> DataQueue = new LinkedList<>() {
        };

        
      



       
       
       









        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }


       
       

    }

    public static void main(String[] args){
        breadthSearch call = new breadthSearch();
        call.BreadthSearch();

    }
}
