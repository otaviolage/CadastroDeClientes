
public class CadastroDeClientes {
    
    public static void main(String[] args) {
        
        //Pessoa(String nome, float cpf, String endereco, String cidade, String estado)
        UI_CadastroDeClientes formulario = new UI_CadastroDeClientes();
        Pessoa funcionario = new Pessoa(formulario.nome, formulario.cpf, formulario.endereco, formulario.cidade, formulario.estado);
        
        System.out.println(funcionario.getCpf());
        
    }
    
}
