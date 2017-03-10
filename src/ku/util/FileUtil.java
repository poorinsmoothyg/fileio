package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

public class FileUtil {
	
	public FileUtil(){
	}
	
	static void copy ( InputStream in , OutputStream out ) {
		try {
			int b ;
			while( (b=in.read()) >= 0 ) {    // read() returns -1 at end of file
				out.write( (byte)b );
			}
			in.close();
			out.close();
		}catch ( RuntimeException e ) {
			System.out.println("RuntimeException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
	
	static void copy ( InputStream in , OutputStream out , int blocksize ) {
		try {
	        byte[] buffer = new byte[blocksize];
	        int size ;
	        while ((size = in.read(buffer)) != -1) {
	            out.write(buffer, 0, size);
	        }
			in.close();
			out.close();
		}catch (RuntimeException e ){
			System.out.println("RuntimeException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
	
	static void bcopy ( InputStream in , OutputStream out) {
		try {
			Reader reader = new InputStreamReader( in );
			BufferedReader br = new BufferedReader( reader );
			String line = null;
			// readLine() is null when end of input is reached
			while( (line = br.readLine()) != null ) {
				System.out.println( line );
			}
			in.close();
			out.close();
		}catch (RuntimeException e ){
			System.out.println("RuntimeException");
		} catch (IOException e) {
			System.out.println("IOException");
		}
	}
}