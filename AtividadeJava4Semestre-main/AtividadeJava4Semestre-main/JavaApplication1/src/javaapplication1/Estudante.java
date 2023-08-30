
package javaapplication1;


public class Estudante {
   private String nome;
   private int idade;
   private String cpf;
   private String endereco;
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Estudante(String n, int i, String c, String e){
       nome = n;
       idade = i;
       cpf = c;
       endereco = e; 
    }
    
}
