package testprj;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWrite {

	public static void main(String[] args) throws Exception{
		
		byteBasedReadAndWriteWithBuffer();
		byteBasedReadAndWriteWithoutBuffer();
		charBasedReadAndWriteWithBuffer();
		charBasedReadAndWriteWithoutBuffer();
		
	}
	
	
	private static void charBasedReadAndWriteWithBuffer() throws Exception{
		
		
		long currentTime = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new FileReader("hs_err_pid9336.log"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("text4"));
		
		int c = -1;
		
		/*
		while((c=br.read())!=-1){
			
			//System.out.print((char)c);
			
			bw.write(c);
			
		}*/
		
		String line= null;
		while((line=br.readLine())!=null){
			
			bw.write(line);
			bw.newLine();
		}
			
		
		br.close();
		bw.close();
		
		System.out.println("charBasedReadAndWriteWithBuffer time spend : " + (System.currentTimeMillis() - currentTime) + " millisecond.");
		
		
	}
	
	
	
	private static void charBasedReadAndWriteWithoutBuffer() throws Exception{
		
		
		long currentTime = System.currentTimeMillis();
		
		FileReader fr = new FileReader("hs_err_pid9336.log");
		FileWriter fw = new FileWriter("text3");
		
		int c = -1;
		
		while((c=fr.read())!=-1){
			
			fw.write(c);
			
		}
		
		fr.close();
		fw.close();
		
		System.out.println("charBasedReadAndWriteWithoutBuffer time spend : " + (System.currentTimeMillis() - currentTime) + " millisecond.");
		
		
	}
	
	
	private static void byteBasedReadAndWriteWithoutBuffer() throws Exception{

		long currentTime = System.currentTimeMillis();

		FileInputStream fis = new FileInputStream("hs_err_pid9336.log");

		FileOutputStream fos = new FileOutputStream("text2");

		int c = -1;

		while ((c = fis.read()) != -1) {

			//System.out.print((char) c);

			fos.write(c);
		}

		fis.close();
		fos.close();

		System.out.println("byteBasedReadAndWriteWithoutBuffer time spend : " + (System.currentTimeMillis() - currentTime) + " millisecond."); 

	}
	

	private static void byteBasedReadAndWriteWithBuffer() throws Exception{

		long currentTime = System.currentTimeMillis();

		FileInputStream fis = new FileInputStream("hs_err_pid9336.log");
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("text1");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int c = -1;

		while ((c = bis.read()) != -1) {

			//System.out.print((char) c);

			bos.write(c);
		}

		bis.close();
		fis.close();
		bos.close();
		fos.close();

		System.out.println("byteBasedReadAndWriteWithBuffer time spend : " + (System.currentTimeMillis() - currentTime) + " millisecond."); 

	}

}
