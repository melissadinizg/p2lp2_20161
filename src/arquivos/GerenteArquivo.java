package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class GerenteArquivo {
	public static void salvar(String folhaPagamento) throws IOException{
		PrintWriter arquivo = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try{
			String hoje = LocalDate.now().toString();
			fw = new FileWriter(new File(hoje));
			bw = new BufferedWriter(fw);
			arquivo = new PrintWriter(bw);
			arquivo.println(folhaPagamento);
		}finally{
			if (arquivo != null) arquivo.close();
		}
		
	}
	
	public static String ler(String nomeArquivo)throws IOException{
		BufferedReader br = null;
		FileReader fr = null;
		String resultado = "";
		try{
			fr = new FileReader(nomeArquivo);
			br = new BufferedReader(fr);
			String linha;
			while((linha = br.readLine()) != null){
				resultado += linha + "\n";
			}
			return resultado;
		}finally{
			if (br != null) br.close();
		}
	}

}
