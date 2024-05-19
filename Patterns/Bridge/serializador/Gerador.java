package serializador;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;


public abstract class Gerador {

	
	PosProcessador posProcessador;
	
	public Gerador(PosProcessador posProcessador) {
		this.posProcessador = posProcessador;
	}

    public final void gerarArquivo(String nome, Map<String, Object> propriedades)
            throws IOException{
    	
    	String conteudo = gerarConteudo(propriedades);
    
        byte[] bytes = gerarArrayBytes(conteudo);

        bytes = posProcessador.posProcessar(bytes);

        salvarEmArquivo(nome, bytes);

    }

    public void setPosProcessador(PosProcessador posProcessador) {
		this.posProcessador = posProcessador;
	}

	private byte[] gerarArrayBytes(String conteudo) {
		byte [] bytes = conteudo.getBytes();
		return bytes;
	}


	private void salvarEmArquivo(String nome, byte[] bytes) throws FileNotFoundException, IOException {
		FileOutputStream fileout = new FileOutputStream(nome);
        fileout.write(bytes);
        fileout.close();
	}
    
    
    public abstract String gerarConteudo(Map<String, Object> propriedades);
    
    
    






}
