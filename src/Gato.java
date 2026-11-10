/** Gato: especialização de Animal com cor e indicação se vive só dentro de casa. */
public class Gato extends Animal {

    private String cor;
    private boolean viveSomenteDentroDeCasa;

    public Gato(int codigo, String nome, int idade, double peso, String nomeResponsavel,
                String cor, boolean viveSomenteDentroDeCasa) {
        super(codigo, nome, idade, peso, nomeResponsavel);
        this.cor = cor;
        this.viveSomenteDentroDeCasa = viveSomenteDentroDeCasa;
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String getDescricao() {
        return "[Gato] " + super.getDescricao()
                + " | Cor: " + cor
                + " | Vive somente dentro de casa: " + (viveSomenteDentroDeCasa ? "sim" : "não");
    }
}
