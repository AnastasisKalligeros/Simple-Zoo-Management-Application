package com.company.animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Birds implements Serializable { // πτηνά

    private static List<String> name = new ArrayList<>(); // η λίστα περιέχει τα ονόματα των πτηνών.
    private static List<Integer> code = new ArrayList<>(); // η λίστα περιέχει τους κωδικούς των πτηνών.
    private static List<Integer> weight = new ArrayList<>(); // η λίστα περιέχει το βάρος των πτηνών.
    private static List<Integer> age = new ArrayList<>(); // η λίστα περιέχει τη μέγιστη ηλικία των πτηνών.

    public static List<Integer> getCode() {

        return code;

    }

    public static List<String> getName() {

        return name;

    }

    public static List<Integer> getWeight() {

        return weight;

    }

    public static List<Integer> getAge() {

        return age;

    }

    public static void setName(List<String> name) {

        Birds.name = name;

    }

    public static void setCode(List<Integer> code) {

        Birds.code = code;

    }

    public static void setWeight(List<Integer> weight) {

        Birds.weight = weight;

    }

    public static void setAge(List<Integer> age) {

        Birds.age = age;

    }

    public static void setName(String data) {

        name.add(data);

    }

    public static void setCode(int data) {

        code.add(data);

    }

    public static void setWeight(int data) {

        weight.add(data);

    }

    public static void setAge(int data) {

        age.add(data);

    }

    public static String getCode(int pos) {

        return code.get(pos).toString();

    }

    public static String getWeight(int pos) {

        return weight.get(pos).toString();

    }

    public static String getAge(int pos) {

        return age.get(pos).toString();

    }

    public static String getName(int pos) {

        return name.get(pos);

    }

    public static void changeWeight(int data, int pos) {

        weight.set(pos, data);

    }

    public static void changeAge(int data, int pos) {

        age.set(pos, data);

    }

    public static void deleteAnimal(int pos) {

        name.remove(pos);
        code.remove(pos);
        weight.remove(pos);
        age.remove(pos);

    }

}
