package org.example;

public class EroeNonIdoneoException extends Exception {
    private final String nomeEroe;
    private final int livelloPotere;

    public EroeNonIdoneoException(String nomeEroe, int livelloPotere, int difficoltaRichiesta) {
        super(String.format("L'eroe '%s' (Potere: %d) non ha superato la selezione. Richiesto: %d",
                nomeEroe, livelloPotere, difficoltaRichiesta));
        this.nomeEroe = nomeEroe;
        this.livelloPotere = livelloPotere;
    }

    public String getNomeEroe() {
        return nomeEroe;
    }

    public int getLivelloPotere() {
        return livelloPotere;
    }
}
