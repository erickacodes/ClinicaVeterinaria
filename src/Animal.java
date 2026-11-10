/**
 * Superclasse abstrata que representa um animal atendido na clínica.
 * Guarda os dados comuns a todas as espécies.
 */
public abstract class Animal {

    private int codigo;
    private String nome;
    private int idade;
    private double peso;
    private String nomeResponsavel;
    private int totalConsultas;

    public Animal(int codigo, String nome, int idade, double peso, String nomeResponsavel) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do animal não pode ficar em branco.");
        }
        if (nomeResponsavel == null || nomeResponsavel.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do responsável não pode ficar em branco.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida: não pode ser negativa.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido: deve ser maior que zero.");
        }
        this.codigo = codigo;
        this.nome = nome.trim();
        this.idade = idade;
        this.peso = peso;
        this.nomeResponsavel = nomeResponsavel.trim();
        this.totalConsultas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public int getTotalConsultas() {
        return totalConsultas;
    }

    /** Operação do domínio: atualiza o peso do animal, validando o novo valor. */
    public void atualizarPeso(double novoPeso) {
        if (novoPeso <= 0) {
            throw new IllegalArgumentException("Peso inválido: deve ser maior que zero.");
        }
        this.peso = novoPeso;
    }

    /** Operação do domínio: registra mais uma consulta para o animal. */
    public void registrarConsulta() {
        this.totalConsultas++;
    }

    /** Som característico da espécie. Cada subclasse implementa o seu. */
    public abstract String emitirSom();

    /** Descrição com os dados comuns. As subclasses sobrescrevem para acrescentar os seus. */
    public String getDescricao() {
        return "Código: " + codigo
                + " | Nome: " + nome
                + " | Idade: " + idade + " ano(s)"
                + " | Peso: " + String.format("%.2f", peso) + " kg"
                + " | Responsável: " + nomeResponsavel
                + " | Consultas: " + totalConsultas;
    }
}
