package org.example;
public class Main {
    public static void main(String[] args) {
        final int DIFFICOLTA_MISSIONE = 75;
        final int NUMERO_TENTATIVI = 5;

        Reclutatore reclutatore = new Reclutatore();

        System.out.printf(" INIZIO RECLUTAMENTO (Difficoltà richiesta: %d)%n", DIFFICOLTA_MISSIONE);

        int arruolati = 0;

        for (int i = 1; i <= NUMERO_TENTATIVI; i++) {
            System.out.printf("%n[Tentativo %d di %d]%n", i, NUMERO_TENTATIVI);
            try {
                String eroeIdoneo = reclutatore.valutaCandidato(DIFFICOLTA_MISSIONE);
                System.out.println("-> IDONEO! " + eroeIdoneo + " è stato arruolato per la missione!");
                arruolati++;
            } catch (EroeNonIdoneoException e) {
                // Catturiamo l'eccezione senza interrompere il ciclo for
                System.err.println("-> SCARTATO: " + e.getMessage());
            }
        }

        System.out.printf("Fine: %d eroe/i idonei su %d tentativi.%n", arruolati, NUMERO_TENTATIVI);
    }
}
