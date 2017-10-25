import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Round {
	char [][] field;
	FileReader fr = null;
	BufferedReader br = null;
	public String leerRound(File b){
		

		String texto = "";

		try {

			fr = new FileReader (b);
			br = new BufferedReader(fr);
			String in = br.readLine();
			String temp = "";
			String linea;
			field = new char[Integer.parseInt(in.split(" +")[0])][Integer.parseInt(in.split(" +")[1])];
			for (int i = 0; i < field.length; i++) {
				field [i] = br.readLine().toCharArray();
			}

				
			texto = temp;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return texto;
	}
}
