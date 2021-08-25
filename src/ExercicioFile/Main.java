package ExercicioFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String path = "C:\\temp\\in.csv";
		List<Produto> produtos = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String item = br.readLine();
			while(item != null) {
				String[] valores = item.split(",");
				String nome = valores[0];
				double valor = Double.parseDouble(valores[1]);
				int qtd = Integer.parseInt(valores[2]);
				
				produtos.add(new Produto(nome, valor, qtd));
				
				item = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\out\\out.csv"))){
				for(Produto produto : produtos) {
					bw.write(produto.toString());;
					bw.newLine();
				}
			} catch(IOException e) {
				System.out.println("Erro: " + e.getMessage());
			}
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
