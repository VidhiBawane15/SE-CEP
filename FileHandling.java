import java.io.*;
class FileHandling 
{
  public static void main(String[] args) throws Exception 
  {
    FileWriter fw = new FileWriter("sample.txt");
    fw.write("Hello, this is a file handling demo!");
    fw.close();
    BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
    System.out.println("File content: " + br.readLine());
    br.close();
  }
}
