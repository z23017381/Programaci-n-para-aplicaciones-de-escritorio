import java.util.Scanner;

public class UrnaVotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        int[] votos = new int[candidatos.length];
        int totalVotos = 0;

        System.out.println("Ingrese los votos por número de candidato (1-" + candidatos.length + ", 0 para terminar):");
        while (true) {
            int voto = scanner.nextInt();
            if (voto == 0) {
                break;
            }
            if (voto >= 1 && voto <= candidatos.length) {
                votos[voto - 1]++;
                totalVotos++;
            } else {
                System.out.println("Número de candidato no válido. Intente de nuevo.");
            }
        }

        scanner.close();

        System.out.println("Resultados:");
        for (int i = 0; i < candidatos.length; i++) {
            double porcentaje = totalVotos > 0 ? (votos[i] * 100.0) / totalVotos : 0;
            System.out.printf("%s: %.2f%% (%d votos)\n", candidatos[i], porcentaje, votos[i]);
        }
    }
}
