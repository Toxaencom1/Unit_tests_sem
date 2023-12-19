package com.taxah.unit_test.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        assertConditionA();
        assertConditionB();
        int C = assertConditionC(1500000000, 15);
        System.out.printf("C = All is ok and == %d\n", C);
        checkingShoppingCart();
        String[] colors = {"aqua", "yellow", "blue", "orange", "green", "violet", "gold",};
        testingJavaCollectionsAssertJ(colors);
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        checkingHero(new Hero("Emmett",50,"sword",heroBag,true),heroBag);

    }

    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assertThat(weekends.length).isEqualTo(2);
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

    public static void assertConditionB() {
        int x = -1;
        assertThat(x).isLessThanOrEqualTo(0);
        System.out.println("B = All is ok");
    }

    public static int assertConditionC(int a, int b) {
        long res = (long) a + b;
        assertThat(res).isBetween((long) Integer.MIN_VALUE, (long) Integer.MAX_VALUE);
        return (int) res;
    }

    public static void checkingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();
        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");
        productCategories.add("liquid");
        ArrayList<String> products = new ArrayList<>();
        products.add("apple");
        products.add("tomato1");
        products.add("bread");
        products.add("water");
        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.get(0));
            } else if (product.equals("tomato1")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            } else if (product.equals("water")) {
                System.out.println("category: " + productCategories.get(3));
            } else {
                assert false : "Unknown category for the product " + product;
            }
        }
    }

    public static void testingJavaCollectionsAssertJ(String[] colors) {
        assertThat(colors)
                .isNotEmpty()
                .hasSize(7)
                .doesNotHaveDuplicates()
                .contains("orange", "green", "violet")
                .endsWith("gold")
                .startsWith("aqua")
                .containsSequence("yellow", "blue")
                .doesNotContain("red", "black");
    }

    public static void checkingHero(Hero hero, List<String> heroBag) {
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
//        assertThat(emmett.getName()).isEqualTo("Emmet");
//        assertThat(emmett.getArmor()).isEqualTo(50);
//        assertThat(emmett.getWeapon()).isEqualTo("sword");
//        assertThat(emmett.getInventory()).isNotEmpty().hasSize(3).containsAll(List.of("Bow", "Axe", "Gold"));
//        assertThat(emmett.isHuman()).isTrue();
        assertThat(hero).isEqualTo(emmett);
    }
}