package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	String nuumero;
	String url;
	String musica;

	@Override
	public void exibirPagina(String url) {
		this.url = url;
		System.out.println("Está é a url: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("NOVA ABA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA...");
		
	}

	@Override
	public void ligar(String numero) {
		this.nuumero = numero;
		System.out.println("Discando " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("CAIXA POSTAL");
		
	}

	@Override
	public void tocar() {
		System.out.println("TOCANDO...");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO MUSICA");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musica = musica;
		System.out.println("Musica escolhida: " + musica);
		
	}

}
