package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 
 * @author homma
 *
 */
public class Main {

	public static void main(String[] args) {
		while (true) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
				String inputCommand = br.readLine();
				if (inputCommand.equals("exit")) { 
					break;
				}
				System.out.println(inputCommand);
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
	
}
