package com.victoria.pokemon.model;

import java.util.List;

public record Attack(String name, List<String> cost, Integer convertedEnergyCost,
                     String damage, String text) {}
