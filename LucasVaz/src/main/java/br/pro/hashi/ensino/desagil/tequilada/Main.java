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
		
		char row;
		String col;
		
	
		try {
			fr = new FileReader("C://Users//Lucas Tarraf Vaz//workspace//Java-3-semestre//LucasVaz//src//lab.txt");
			br = new BufferedReader(fr);
			String lineRead = br.readLine();
			
			row=lineRead.charAt(0);
			//System.out.println("numero de linhas  "+row);
			col=lineRead.substring(2,4);
			//System.out.println("numero de colunas  "+col);	
			
			
			while(lineRead != null){
				String certo="";
				for(int contador = 0; contador < lineRead.length(); contador++) {
					if(lineRead.charAt(contador)=='#'){
						certo=certo+"X";
						}
					else{
						certo=certo+" ";
					}
					
				
				}
				lineRead=certo;
				System.out.println(lineRead);
				lineRead = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		 
		
	}

}