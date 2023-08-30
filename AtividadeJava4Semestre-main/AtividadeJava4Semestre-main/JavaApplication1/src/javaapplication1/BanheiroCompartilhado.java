
package javaapplication1;

public class BanheiroCompartilhado {
    private boolean ocupado;
    private String ocupante;

    // Construtor
    public BanheiroCompartilhado() {
        ocupado = false;
        ocupante = null;
    }

    // Getter para ocupado
    public boolean isOcupado() {
        return ocupado;
    }

    // Getter para ocupante
    public String getOcupante() {
        return ocupante;
    }

    // Método para usar o banheiro
    public void usarBanheiro(String nome) {
        if (!ocupado) {
            ocupado = true;
            ocupante = nome;
            System.out.println(nome + " está usando o banheiro.");
        } else {
            System.out.println("O banheiro está ocupado. " + nome + " terá que esperar.");
        }
    }

    // Método para liberar o banheiro
    public void liberarBanheiro() {
        if (ocupado) {
            ocupado = false;
            ocupante = null;
            System.out.println("O banheiro foi liberado.");
        } else {
            System.out.println("O banheiro já está livre.");
        }
    }
}
