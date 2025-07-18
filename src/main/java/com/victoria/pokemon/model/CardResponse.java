package com.victoria.pokemon.model;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
public class CardResponse {
    private Card data;

    @Getter
    @Setter
    static class Card {
        private String id;
        private String name;
        private String supertype;
        private List<String> subtypes;
        private String level;
        private List<String> types;
        private String evolvesFrom;
        private String evolvesTo;
        private String rules;
        private Object ancientTraits;
        private List<Ability> abilities;
        private List<Attack> attacks;
        private List<WeaknessAndResistance> weaknesses;
        private List<WeaknessAndResistance> resistances;
        private List<String> retreatCost;
        private int convertedRetreatCost;
        private Set set;
        private String rarity;
        private List<Integer> nationalPokedexNumbers;
    }
}