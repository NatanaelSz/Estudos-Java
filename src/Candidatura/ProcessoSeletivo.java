package Candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo lista de candidatos informando o indice do elemento: ");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.printf("O candidato de Número: %d é %s\n", i+1, candidatos[i]);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s Solicitou este valor de salario %.2f\n", candidato, salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra Proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais Candidatos");
        }
    }
}
