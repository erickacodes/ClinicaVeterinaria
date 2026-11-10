/** Cão: especialização de Animal com raça e porte. */
public class Cao extends Animal {

    private String raca;
    private String porte;

    public Cao(int codigo, String nome, int idade, double peso, String nomeResponsavel,
               String raca, String porte) {
        super(codigo, nome, idade, peso, nomeResponsavel);
        this.raca = raca;
        this.porte = porte;
    }

    @Override
    public String emitirSom() {
        return "Au au!";
    }

    @Override
    public String getDescricao() {
        return "[Cão] " + super.getDescricao()
                + " | Raça: " + raca
                + " | Porte: " + porte;
    }
}
