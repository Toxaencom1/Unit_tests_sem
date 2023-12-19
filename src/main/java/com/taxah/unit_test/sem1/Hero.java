package com.taxah.unit_test.sem1;

import java.util.List;
import java.util.Objects;

public class Hero {
    private String name;
    private int armor;
    private String weapon;
    private List<String> inventory;
    private boolean isHuman;

    public Hero(String name, int armor, String weapon, List<String> inventory, boolean isHuman) {
        this.name = name;
        this.armor = armor;
        this.weapon = weapon;
        this.inventory = inventory;
        this.isHuman = isHuman;
    }

    public void addToInventory(String string){
        inventory.add(string);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return armor == hero.armor && isHuman == hero.isHuman && Objects.equals(name, hero.name) && Objects.equals(weapon, hero.weapon) && Objects.equals(inventory, hero.inventory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, armor, weapon, inventory, isHuman);
    }
}
