package questao5;

public class App {

	public static void main(String[] args) {

		ArquivoAbstracao pasta = new Pasta("videos/");
		ArquivoAbstracao video = new ArquivoVideo("video.mp4");
		ArquivoAbstracao video2 = new ArquivoVideo("video2.mp4");
		
		try {
			video.adicionar(video2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			pasta.adicionar(video);
			pasta.adicionar(video2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		pasta.printNomeDoArquivo();
		
	}

}
