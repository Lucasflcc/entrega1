/public class Estudante extends Usuario {
    
    //public Estudante(String user, String cpf, String senha, int idade, String sexo, String email, 
                     //String nomeCartao, String numCartao, String codVerifCartao) {
        //super(user, cpf, senha, idade, sexo, email, nomeCartao, numCartao, codVerifCartao);
    //}
    
    //@Override
    //public double bilhete(Filme filme, int quantidade) {
        //double valor = filme.getValor();
        //double total = valor*quantidade*0.5; // aplicando desconto de 50% para estudantes
        //return total;
    //}
   
//}

public class Estudante extends Compra{

	public Estudante(Usuario usuario) {
		super(usuario);

	}
	
	 public double bilhete(Filme filme, int quantidade) {
		double valor = filme.getValor();
    	double total = valor*quantidade*0.5;
    	return total;
	}
	
}
