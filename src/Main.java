import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			/*  Intakes Basic Input (i.e. Memory Location + 4 digit hexadecimal numbers)
			    Example: 10 7C0A
				10 - Memory Location
				7C0A - Either Instruction or Data depending on the state of the machine
			*/
			String[] words = br.readLine().split(" ");
			
			int memLoc = Integer.parseInt(words[0]);
			String cmd = words[1];
			
		}
		
		for ()
		
	}
	
	private static void perform (int memLoc, String cmd) {
		
	}
	
}
