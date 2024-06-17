import java.io.*;
import java.util.*;
public class final11202 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int l=0,w=0,h=0;
		try {
			l=sc.nextInt();
			w=sc.nextInt();
			h=sc.nextInt();
			CCube cc1=new CCube(l,w,h);
		}catch(InputMismatchException e) {
			System.out.println("輸入錯誤");
		}
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("final11202"));
			bw.write(String.valueOf(l));
			bw.write("\r\n");
			bw.write(String.valueOf(w));
			bw.write("\r\n");
			bw.write(String.valueOf(h));
			bw.write("\r\n");
			bw.flush();
			bw.close();
			BufferedReader br=new BufferedReader(new FileReader("final11202"));
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}catch(IOException e) {
		}
		
		
	}

}
