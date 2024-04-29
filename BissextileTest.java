package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BissextileTest {

    @ParameterizedTest()
    @ValueSource(ints = {2000, 2020, 1600, 2004})
    void doit_retourner_vrai_pour_une_anne_bissextile(int annee) {
        Bissextile bissextile = new Bissextile();
        boolean estBissextile = bissextile.estBissextile(annee);
        assertTrue(estBissextile);
    }
    @ParameterizedTest()
    @ValueSource(ints = {1900, 2018, 1601, 2005})
    void doit_retourner_faux_pour_une_annee_non_bissextile(int annee) {
        Bissextile bissextile = new Bissextile();
        boolean estBissextile = bissextile.estBissextile(annee);
        assertFalse(estBissextile);
    }
}
