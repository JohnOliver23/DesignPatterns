package questao3;

public class Client {
	public static void main(String[] args) {
		ImplementacaoRefrigerante cocaCola = new CocaCola();
		AbstracaoTamanho tamanhoPequeno = new TamanhoPequeno(cocaCola);
		AbstracaoTamanho tamanhoMedio = new TamanhoMedio(cocaCola);
		AbstracaoTamanho tamanhoGrande = new TamanhoGrande(cocaCola);
		tamanhoPequeno.beber();
		tamanhoMedio.beber();
		tamanhoGrande.beber();
		
		ImplementacaoRefrigerante guarana = new Guarana();
		tamanhoPequeno = new TamanhoPequeno(guarana);
		tamanhoMedio = new TamanhoMedio(guarana);
		tamanhoGrande = new TamanhoGrande(guarana);
		tamanhoPequeno.beber();
		tamanhoMedio.beber();
		tamanhoGrande.beber();
		
		ImplementacaoRefrigerante sprite = new Sprite();
		tamanhoPequeno = new TamanhoPequeno(sprite);
		tamanhoMedio = new TamanhoMedio(sprite);
		tamanhoGrande = new TamanhoGrande(sprite);
		tamanhoPequeno.beber();
		tamanhoMedio.beber();
		tamanhoGrande.beber();

	}
}
