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
	
	// TODO Available Logger

	public static void main(String[] args) {
		while (true) {
			String input = readConsole();
			if (input.equals("exit")) { 
				break;
			}
			System.out.println(input);
		}
	}
	
	private static String readConsole() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			String input = br.readLine();
			return input;
		} catch (IOException e) {
			return "Error"; // TODO Error Command pick up form Enum
		}
	}
	
}
