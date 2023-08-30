
package javaapplication1;


public class JavaApplication1 {


    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Oscar");
        System.out.println(p.getNome());
        System.out.println("---------------------------------------");
        Produto p1 = new Produto();
        p1.setNome("playstation 5 ");
        p1.setPreco(3200);
        p1.setDescricao("videogame de alto nivel de gameplay e qualidade");
        System.out.println(p1.getNome()+"\n" + p1.getDescricao()+"\n"+ p1.getPreco());
        System.out.println("---------------------------------------");
        Circulo c = new Circulo();
        c.setRaio(50);
        c.setCor("vermelho");
        System.out.println(c.getCor()+"\n"+ c.getRaio());
        System.out.println("---------------------------------------");
        Estudante e = new Estudante("Gabriel", 15, "47874544541", "rua antonelio silva");
        e.getNome();
        e.getIdade();
        e.getCpf();
        e.getEndereco();
        System.out.println(e.getNome()+"\n"+ e.getIdade()+"\n"+ e.getCpf()+"\n"+ e.getEndereco());
        System.out.println("---------------------------------------");
        ContaBancaria minhaConta = new ContaBancaria("João", 123456, 1000.0);

        System.out.println("Saldo inicial: " + minhaConta.getSaldo());

        minhaConta.depositar(500.0);
        System.out.println("Novo saldo: " + minhaConta.getSaldo());

        minhaConta.sacar(200.0);
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());
        System.out.println("---------------------------------------");
        
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 60.0);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Velocidade inicial: " + meuCarro.getVelocidade());

        meuCarro.acelerar(80.0);
        System.out.println("Velocidade após aceleração: " + meuCarro.getVelocidade());

        meuCarro.frear(30.0);
        System.out.println("Velocidade após frenagem: " + meuCarro.getVelocidade());
        System.out.println("---------------------------------------");
   
        BanheiroCompartilhado banheiro = new BanheiroCompartilhado();

        banheiro.usarBanheiro("João");
        System.out.println("Banheiro ocupado: " + banheiro.isOcupado());
        System.out.println("Ocupante: " + banheiro.getOcupante());

        banheiro.liberarBanheiro();
        System.out.println("Banheiro ocupado: " + banheiro.isOcupado());
    }
    }
    
    
    
   
