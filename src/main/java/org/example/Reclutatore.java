package org.example;

import net.datafaker.Faker;

public class Reclutatore {
    private final Faker faker = new Faker();

    public String valutaCandidato(int difficoltaRichiesta) throws EroeNonIdoneoException {
        // Genera nome da supereroe e potere da 1 a 100
        String nome = faker.superhero().name();
        int potere = faker.number().numberBetween(1, 101); // 1-100 inclusi

        System.out.printf("Candidato valutato: %s | Livello Potere: %d%n", nome, potere);

        if (potere < difficoltaRichiesta) {
            throw new EroeNonIdoneoException(nome, potere, difficoltaRichiesta);
        }

        return nome;
    }
}
