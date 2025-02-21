import java.io.*;
public class UpperToLowerFileConverter {
    public static void main(String[] args) {
      String inputfile="source.txt";
	  String outputfile="destination.txt";
	  try(FileReader fir=new FileReader(inputfile);
	  BufferedReader br=new BufferedReader(fir);
	  FileWriter fiw=new FileWriter(outputfile);
	  BufferedWriter bw=new BufferedWriter(fiw)){
		String line;
		while((line=br.readLine())!=null){
			bw.write(line.toLowerCase());
			bw.newLine();
		}
		System.out.println("File is Copied from uppercase to lowercase");
		
	  }catch(IOException e){
		  System.out.println("Error processing the file: "+e.getMessage());
    }
}
}