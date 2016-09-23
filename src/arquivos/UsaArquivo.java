package arquivos;
/* Aulas sobre o modulo de Arquivos
 * Por: Lívia Sampaio Campos
 * Iniciado: 14/09/2016
 * Observacao: Esse codigo é uma prova de conceito,
 * portanto, pode estar incompleto ou com algumas 
 * simplificações.
 */

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
public class UsaArquivo {
	public static void main(String[] args) {
		try{
			//copyBytes();
			//copyBytes2();
			escreveObjeto();
			//leObjetos();
			//escreveArquivoTexto("livia.txt");
			//leArquivoTexto("livia.txt");
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	}

	private static void copyBytes() throws IOException{
		FileInputStream in = null;
	      FileOutputStream out = null;
	      try {
	        in = new FileInputStream("proverbiochines.txt");
	        out = new FileOutputStream("copiadeproverbiochines.txt");
	        int c;
	 
	        while ((c = in.read()) != -1) {
	           out.write(c);
	        }	 
	      } finally {
	        if (in != null) {
	           in.close();
	        }
	        if (out != null) {
	           out.close();
	        }
	      }
	      
	}
	
	private static void copyBytes2() throws IOException{
		//usando uma versao mais enxuta do try-catch, chamada try with resources
	      try(FileInputStream in = new FileInputStream("proverbiochines.txt"); 
	    		  FileOutputStream out = new FileOutputStream("c:\\teste\\copiadeproverbiochines.txt")){
	    	  int c;
	    		 
		        while ((c = in.read()) != -1) {
		           out.write(c);
		        }  
	      }
	}
	
	private static List<BigDecimal> geraBigDecimal(){
		String[] numeros = {"0.1", "0.2", "1.97", "29.7"};
		BigDecimal x = new BigDecimal(0);
		List<BigDecimal> lista = new ArrayList<>();
		
		for (int i = 0; i < numeros.length; i++) {
			BigDecimal y = new BigDecimal(numeros[i]);
			lista.add(y);
			x = x.add(y); 
		}
		lista.add(x);
		return lista;
	}
	
	private static void escreveObjeto() throws FileNotFoundException, IOException{
		//escreve cada elemento da lista
		List<BigDecimal> lista = geraBigDecimal();
		ObjectOutputStream arqObjectos = null;
		try{
			arqObjectos = new ObjectOutputStream(new FileOutputStream("arquivoDeObjetos.bin"));
			for (BigDecimal bigDecimal : lista) {
				System.out.println(bigDecimal);
				//escrever em arquivo
				arqObjectos.writeObject(bigDecimal);
			}
		}finally{
			if(arqObjectos != null)
				arqObjectos.close();
			
		}
		
	}
	
	private static void escreveObjeto2() throws FileNotFoundException, IOException{
		// escreve toda a lista
		List<BigDecimal> lista = geraBigDecimal();
		ObjectOutputStream arqObjectos = null;
		try{
			arqObjectos = new ObjectOutputStream(new FileOutputStream("arquivoDeObjetos.bin"));
			arqObjectos.writeObject(lista);
		}finally{
			if(arqObjectos != null)
				arqObjectos.close();
		}
	}
	
	private static void leObjetos() throws FileNotFoundException, IOException, ClassNotFoundException{
		// le cada elemento da lista
		List<BigDecimal> lista = new ArrayList<>();
		ObjectInputStream arqObjectos = null;
		try{
			arqObjectos = new ObjectInputStream(new FileInputStream("arquivoDeObjetos.bin"));
			while(true){
				try{
					lista.add((BigDecimal)arqObjectos.readObject());
				}catch(EOFException e){
					break;
				}
			}
			System.out.println("Lista de BigDecimal: " + lista);
		}finally{
			if(arqObjectos != null)
				arqObjectos.close();
		}
		
		
	}
		
	private static void leObjetos2() throws FileNotFoundException, IOException, ClassNotFoundException{
		//le toda a lista
		List<BigDecimal> lista = new ArrayList<>();
		ObjectInputStream arqObjectos = null;
		try{
			arqObjectos = new ObjectInputStream(new FileInputStream("arquivoDeObjetos.bin"));
			lista = (List<BigDecimal>) arqObjectos.readObject();
			System.out.println("Lista de BigDecimal: " + lista);
		}finally{
			if(arqObjectos != null)
				arqObjectos.close();
		}
		
		
	}	//Usando Scanner
	private static void leArquivoTexto(String nomeArquivo, String separador) throws IOException{
		FileInputStream arquivo = null;
		Scanner sc = null;
		
		try{
			arquivo = new FileInputStream(new File(nomeArquivo));
			sc = new Scanner(arquivo);
			
			while(sc.hasNext()){
				String linha = sc.nextLine();
				String[] linhaQuebrada = linha.split(separador); 
				for(String s: linhaQuebrada)
					System.out.println(s);
			}
		}catch(Exception e){
			System.err.println(e.getMessage());
		}finally{
			if (arquivo != null) arquivo.close();
			if(sc != null) sc.close();
		}
		
	}
	
	// Usando BufferedReader
	private static void leArquivoTexto(String nomeArquivo) throws IOException{
		BufferedReader arquivo = null;
		
		try{
			arquivo = new BufferedReader(new FileReader(nomeArquivo));
			String linha;
			
			while((linha = arquivo.readLine()) != null){
				System.out.println(linha);
			}
		}finally{
			if (arquivo != null) arquivo.close();
		}
		
	}
	

	private static void escreveArquivoTexto(String nomeArquivo) throws IOException{
		PrintWriter arquivo = null;
		
		try{
			arquivo = new PrintWriter(new BufferedWriter(new FileWriter(nomeArquivo)));
			String linha = "Mensagem para o arquivo";
			
			for (int i = 0; i < 10; i++) {
				arquivo.println(linha);
			}
		}finally{
			if (arquivo != null) arquivo.close();
		}
		
	}
}
