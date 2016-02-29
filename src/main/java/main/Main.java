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
		boolean exit = true;
		while (exit) {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
				String line = br.readLine();
				System.out.println(line);
			} catch (IOException e) {
				e.getMessage();
			}
		}
	}
}
