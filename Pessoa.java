import java.lang.IllegalArgumentException;
/**
 * Classe que representa uma pessoa.
 * Uma pessoa tem nome e idade.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.10.06
 */
public class Pessoa
{
	// Nome da pessoa
	private String nome;
	// Idade da pessoa
	private int idade;
	
	/**
	 * Construtor padrão de uma pessoa.
	 *
	 * @param nome Nome da pessoa
	 * @param idade Idade da pessoa
	 *
	 * @throws IllegalArgumentException se nome for null ou idade for negativa
	 */
	public Pessoa( String nome, int idade ) throws IllegalArgumentException
	{
		setNome( nome );
		setIdade( idade );
	}
	
	/**
	 * Define o nome da pessoa
	 *
	 * @param nome Nome da pessoa
	 *
	 * @throws IllegalArgumentException se nome for null
	 */
	public void setNome( String nome ) throws IllegalArgumentException
	{
		if( nome == null )
		{
			throw new IllegalArgumentException( "Nome não pode ser nulo!!!" );
		} else 
		{
			this.nome = nome;
		}	
	}
	
	/**
	 * Retorna o nome da pessoa
	 *
	 * @return O nome da pessoa
	 */
	public String getNome()
	{
		return nome;
	}
	
	/**
	 * Define a idade da pessoa
	 *
	 * @param idade Idade da pessoa
	 *
	 * @throws IllegalArgumentException se idade for negativa
	 */
	public void setIdade( int idade )
	{
		if( idade < 0 )
		{
			throw new IllegalArgumentException( "Idade de uma pessoa não pode ser negativa!!!" );
		} else 
		{
			this.idade = idade;
		}
	}
	
	/**
	 * Retorna a idade da pessoa
	 *
	 * @return A idade da pessoa
	 */
	public int getIdade()
	{
		return idade;
	}
}