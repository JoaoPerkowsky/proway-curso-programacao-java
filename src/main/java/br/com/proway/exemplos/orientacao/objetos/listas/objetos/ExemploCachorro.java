package br.com.proway.exemplos.orientacao.objetos.listas.objetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ExemploCachorro {

    public static void main(String[] args) {
        ArrayList<String> apelidos = new ArrayList<>();
        ArrayList<Double> pesos = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<String> racas = new ArrayList<>();

        apelidos.add("Ana");
        pesos.add(3.10);
        idades.add(5);
        racas.add("Pinscher");

        apelidos.add("Ozzy");
        pesos.add(10.4);
        idades.add(7);
        racas.add("Schitzu");

        ArrayList<Cachorro> cachorros = new ArrayList();

        // Criamos um objeto definindo valor para os 
        // atributos (características) deste objeto.
        Cachorro cachorraAna = new Cachorro();
        cachorraAna.setApelido("Ana");
        cachorraAna.setIdade(5);
        cachorraAna.setPeso(3.10);
        cachorraAna.setRaca("Pinscher");

        // Adicionado o objeto chamado cachorraAna na 
        // lista de cachorros(objetos)
        cachorros.add(cachorraAna);

        // Instanciar o objeto do cachorro Ozzy
        Cachorro cachorroOzzy = new Cachorro();
        cachorroOzzy.setApelido("Ozzy");
        cachorroOzzy.setIdade(7);
        cachorroOzzy.setPeso(10.4);
        cachorroOzzy.setRaca("Schitzu");

        cachorros.add(cachorroOzzy);

        Cachorro cachorroBus = new Cachorro();
        cachorroBus.setApelido(JOptionPane
                .showInputDialog("Apelido do cachorro"));
        cachorroBus.setIdade(Integer.parseInt(JOptionPane
                .showInputDialog("Idade do cachorro")));
        cachorroBus.setPeso(Double.parseDouble(JOptionPane
                .showInputDialog("Peso do cachorro")));
        cachorroBus.setRaca(JOptionPane
                .showInputDialog("Raça do cachorro"));

        cachorros.add(cachorroBus);

        JOptionPane.showMessageDialog(null,
                "Quantidade de cachorros: " + cachorros.size());

        String texto = "";
        for (int i = 0; i < cachorros.size(); i++) {
            Cachorro cachorroDaLista = cachorros.get(i);

            texto = texto
                    + "\nApelido: " + cachorroDaLista.getApelido()
                    + "\nRaça: " + cachorroDaLista.getRaca()
                    + "\nIdade: " + cachorroDaLista.getIdade()
                    + "\nPeso: " + cachorroDaLista.getPeso()
                    + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);

        String nomeCachorroApagar = JOptionPane
            .showInputDialog(
            "Digite o nome do cachorro que será removido");
        
        var cachorroExiste = false;
        
        for (int i = 0; i < cachorros.size(); i++) {
            Cachorro cachorroAtual = cachorros.get(i);
            
            if(cachorroAtual.getApelido()
                    .equalsIgnoreCase(nomeCachorroApagar)){
                cachorros.remove(cachorroAtual);
                cachorroExiste = true;
            }
        }
        if(cachorroExiste == true){
            JOptionPane.showMessageDialog(null, 
                "Cachorro removido com sucesso");
        }else {
            JOptionPane.showMessageDialog(null, 
                "Cachorro inexistente com este nome");
        }
        // CRUD (CREATE, READ, UPDATE, DELETE)
        // Criar    .add(cachorro)
        // ler      .get(indiceDoCachorro)
        // alterar TODO
        // apagar   .remove(objeto)
        Cachorro cachorroAlterado = cachorros.get(2);
        cachorroAlterado.setApelido(JOptionPane
                .showInputDialog(null, "Digite o apelido",
                        cachorroAlterado.getApelido()));

        cachorroAlterado.setIdade(Integer.parseInt(
                JOptionPane.showInputDialog(
                        null, "Digite a idade",
                        cachorroAlterado.getIdade())));
        
        cachorroAlterado.setPeso(Double.parseDouble(
                JOptionPane.showInputDialog(
                        null, "Digite o peso",
                        cachorroAlterado.getPeso())));

        cachorroAlterado.setRaca(JOptionPane.showInputDialog(
                null, "Digite a raça", cachorroAlterado.getRaca()));
        
        cachorros.set(2, cachorroAlterado);
        
        texto = "";
        for (int i = 0; i < cachorros.size(); i++) {
            Cachorro cachorroDaLista = cachorros.get(i);

            texto = texto
                    + "\nApelido: " + cachorroDaLista.getApelido()
                    + "\nRaça: " + cachorroDaLista.getRaca()
                    + "\nIdade: " + cachorroDaLista.getIdade()
                    + "\nPeso: " + cachorroDaLista.getPeso()
                    + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}
