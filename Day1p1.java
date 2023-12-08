
import java.io.*;

public class Day1p1 {

    public static int extractAndAddNumber(String s)  {
        int i = 0, j = s.length() - 1;
        while( i < s.length()){
            if( s.charAt(i) <= '9' && s.charAt(i) >= '0' )  {
                break;
            }
            i++;
        }

        while( j >= 0 ){
            if( s.charAt(j) <= '9' && s.charAt(j) >= '0' )  {
                break;
            }
            j--;
        }

        return 10 * (s.charAt(i) - '0') + s.charAt(j) - '0' ;
    }
    
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\anass\\Downloads\\input.txt" ;     //change the path
        int result = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String line = br.readLine();
            while(line != null){
                result += extractAndAddNumber(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);

    }
}
