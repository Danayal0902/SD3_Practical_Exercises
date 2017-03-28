import java.io.*;
import java.util.ArrayList;


public class SortStudents {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(":/Users/danayaliftikhar/Downloads/students.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<String> al = new ArrayList<String>();
		String l;
		while ((l=br.readLine())!=null)
			al.add(l);
		System.out.println(al);
	}
}
