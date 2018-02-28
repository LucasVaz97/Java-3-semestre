package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Projeto 1");
		
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader("C://Users//Lucas Tarraf Vaz//workspace//Java-3-semestre//LucasVaz//src//lab.txt");
			br = new BufferedReader(fr);
			String lineRead = br.readLine();
			while(lineRead != null){
				lineRead = lineRead.replace('#','X');
				System.out.println(lineRead);
				lineRead = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
		
	}

}
