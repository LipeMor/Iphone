package iphone;

public class Equipamento {

	public static void main(String[] args) {
		
		String numero = "(31) 9 8513-6758";
		String url = "msn.com";
		String musica = "As dores do mundo";
		
		Iphone iphone = new Iphone();
		
		iphone.selecionarMusica(musica);
		iphone.pausar();
		iphone.tocar();
		
		iphone.ligar(numero);
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.exibirPagina(url);
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		

	}

}
