import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.*;
import Sarasas.*;
import java.text.*;
import java.lang.*;

public class Miestai {
	
	public static void main(String[] args) throws IOException {
		
		String file_name="miestai.txt";
		String dataLine = ",";
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader (file_name) );
			dataLine = reader.readLine();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
		
		String[] stringArray = dataLine.split(",");
	
		//if (stringArray.length%4 !=0){
		//	System.out.println("Blogai");
		//	return;
		//}
		String thisLine;
		
		BufferedReader br = new BufferedReader( new FileReader( "miestai.txt" ) );
		
		while ( ( thisLine = br.readLine() ) != null ) {
			
			
					
			for(int i = 0; i < stringArray.length; i+=4){
			String pav =(stringArray[i]);
			String raj = (stringArray[i+1]);
			double plot = Double.parseDouble(stringArray[i+2]);
			double pop = Double.parseDouble(stringArray[i+3]);
			Duomenys skaiciai = new Duomenys();
			double tank = (pop/plot);
			
			 
			System.out.println(pav +" "+ raj +" "+ plot +"km "+ pop +"-gyventoju "+ tank);
			}
		}	
	}	
}