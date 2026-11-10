
public class Main {

    public static void main(String[] args) {
        ClinicaVeterinaria clinica = new ClinicaVeterinaria();

        // 1. Cadastrar dois cães e dois gatos
        titulo("1. Cadastrar dois cães e dois gatos");
        try {
            clinica.adicionar(new Cao(1, "Rex", 5, 28.5, "Maria Silva", "Labrador", "Grande"));
            clinica.adicionar(new Cao(2, "Mel", 2, 8.2, "João Souza", "Poodle", "Pequeno"));
            clinica.adicionar(new Gato(3, "Mimi", 3, 4.1, "Ana Lima", "Branca", true));
            clinica.adicionar(new Gato(4, "Tom", 1, 3.6, "Carlos Pereira", "Cinza", false));
            System.out.println("Animais cadastrados com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        clinica.listar();

        // 2. Tentar cadastrar um código repetido
        titulo("2. Tentar cadastrar um código repetido");
        try {
            clinica.adicionar(new Cao(1, "Bolt", 4, 15.0, "Pedro Alves", "Beagle", "Médio"));
            System.out.println("Animal cadastrado.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 3. Tentar informar peso ou idade inválidos
        titulo("3. Tentar informar peso ou idade inválidos");
        try {
            clinica.adicionar(new Gato(5, "Luna", -2, 3.0, "Paula Costa", "Preta", true));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro (idade): " + e.getMessage());
        }

        try {
            clinica.adicionar(new Cao(6, "Thor", 3, 0, "Paula Costa", "Boxer", "Grande"));
        } catch (IllegalArgumentException e) {
            System.out.println("Erro (peso): " + e.getMessage());
        }

        // 4. Buscar um animal existente e outro inexistente
        titulo("4. Buscar um animal existente e outro inexistente");
        try {
            Animal encontrado = clinica.buscar(3);
            System.out.println("Encontrado: " + encontrado.getDescricao());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            clinica.buscar(99);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Registrar consulta
        titulo("Registrar consulta");
        try {
            clinica.registrarConsulta(1);
            clinica.registrarConsulta(1);
            System.out.println("Consultas registradas. " + clinica.buscar(1).getDescricao());
            clinica.registrarConsulta(99);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 5. Atualizar o peso
        titulo("5. Atualizar o peso");
        try {
            System.out.println("Antes: " + clinica.buscar(2).getDescricao());
            clinica.atualizarPeso(2, 8.9);
            System.out.println("Depois: " + clinica.buscar(2).getDescricao());
            clinica.atualizarPeso(2, -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 6. Exibir o som de cada animal
        titulo("6. Exibir o som de cada animal");
        clinica.exibirSons();

        // 7. Remover um animal e apresentar a listagem final
        titulo("7. Remover um animal e listagem final");
        try {
            clinica.remover(4);
            System.out.println("Animal de código 4 removido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        clinica.listar();
    }

    private static void titulo(String texto) {
        System.out.println();
        System.out.println("=== " + texto + " ===");
    }
}
