package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private static List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public static void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }

    public static void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas t : tarefasList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefasList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }

    public static void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        ListaTarefas.adicionarTarefa("Tarefa 1");
        ListaTarefas.adicionarTarefa("Tarefa 2");
        ListaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        ListaTarefas.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        ListaTarefas.obterDescricoesTarefas();
    }
}
