import java.util.ArrayList;

/**
 * Classe de serviço: gerencia os animais da clínica.
 * A lista é do tipo da superclasse (Animal), por isso aceita cães e gatos.
 *
 * Operações inválidas lançam IllegalArgumentException com mensagem compreensível.
 */
public class ClinicaVeterinaria {

    private ArrayList<Animal> animais = new ArrayList<>();

    /** Adiciona um animal, impedindo códigos repetidos. */
    public void adicionar(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal inválido: não pode ser nulo.");
        }
        if (existe(animal.getCodigo())) {
            throw new IllegalArgumentException(
                    "Já existe um animal cadastrado com o código " + animal.getCodigo() + ".");
        }
        animais.add(animal);
    }

    /** Remove o animal que possui o código informado. */
    public void remover(int codigo) {
        Animal animal = buscar(codigo);
        animais.remove(animal);
    }

    /** Busca um animal pelo código. Lança exceção se não encontrar. */
    public Animal buscar(int codigo) {
        for (Animal animal : animais) {
            if (animal.getCodigo() == codigo) {
                return animal;
            }
        }
        throw new IllegalArgumentException("Nenhum animal encontrado com o código " + codigo + ".");
    }

    /** Mostra a descrição de todos os animais cadastrados. */
    public void listar() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (int i = 0; i < animais.size(); i++) {
            System.out.println((i + 1) + ") " + animais.get(i).getDescricao());
        }
        System.out.println("Total de animais: " + animais.size());
    }

    /** Atualiza o peso do animal com o código informado. */
    public void atualizarPeso(int codigo, double novoPeso) {
        buscar(codigo).atualizarPeso(novoPeso);
    }

    /** Registra uma consulta para o animal com o código informado. */
    public void registrarConsulta(int codigo) {
        buscar(codigo).registrarConsulta();
    }

    /** Mostra o som de cada animal (polimorfismo: cada subclasse responde do seu jeito). */
    public void exibirSons() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        for (Animal animal : animais) {
            System.out.println(animal.getNome() + " faz: " + animal.emitirSom());
        }
    }

    private boolean existe(int codigo) {
        for (Animal animal : animais) {
            if (animal.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }
}
