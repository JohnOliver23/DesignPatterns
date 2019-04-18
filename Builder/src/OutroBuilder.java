
public interface OutroBuilder <K, T> {
	public T create();
	public K cpf(String cpf);
	public K nome(String nome);
	public K rg(String rg);
	public K email(String email);
	public K idade(int idade);
	public K grau(int grau);
}
