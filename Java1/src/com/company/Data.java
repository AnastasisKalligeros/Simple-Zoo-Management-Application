package com.company;

import com.company.animals.*;
import com.company.methods.Deserialization;
import com.company.methods.Serialization;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private static List<String> name;
    private static List<Integer> code;
    private static List<Integer> weight;
    private static List<Integer> age;
    private List<Object> all = new ArrayList<>();

    List<String> names;
    List<Integer> codes;
    List<Integer> weights;
    List<Integer> ages;
    List<Object> data;

    Data(int choice) { // Serialization

        switch(choice) {

            case 1:
                name = Amphibia.getName();
                code = Amphibia.getCode();
                weight = Amphibia.getWeight();
                age = Amphibia.getAge();

                all.add(name);
                all.add(code);
                all.add(weight);
                all.add(age);

                Serialization.serialize(all, "amphibia.ser");
                break;

            case 2:
                name = Birds.getName();
                code = Birds.getCode();
                weight = Birds.getWeight();
                age = Birds.getAge();

                all.add(name);
                all.add(code);
                all.add(weight);
                all.add(age);

                Serialization.serialize(all, "birds.ser");
                break;

            case 3:
                name = Fish.getName();
                code = Fish.getCode();
                weight = Fish.getWeight();
                age = Fish.getAge();

                all.add(name);
                all.add(code);
                all.add(weight);
                all.add(age);

                Serialization.serialize(all, "fish.ser");
                break;

            case 4:
                name = Mammals.getName();
                code = Mammals.getCode();
                weight = Mammals.getWeight();
                age = Mammals.getAge();

                all.add(name);
                all.add(code);
                all.add(weight);
                all.add(age);

                Serialization.serialize(all, "mammals.ser");
                break;

            case 5:
                name = Reptiles.getName();
                code = Reptiles.getCode();
                weight = Reptiles.getWeight();
                age = Reptiles.getAge();

                all.add(name);
                all.add(code);
                all.add(weight);
                all.add(age);

                Serialization.serialize(all, "reptiles.ser");
                break;


        }

    }

    Data(String choice) { // Deserialization

        switch(choice) {

            case "1":
                data = Deserialization.deserialize("amphibia.ser");

                names = (List<String>) data.get(0);
                codes = (List<Integer>) data.get(1);
                weights = (List<Integer>) data.get(2);
                ages = (List<Integer>) data.get(3);

                Amphibia.setName(names);
                Amphibia.setCode(codes);
                Amphibia.setWeight(weights);
                Amphibia.setAge(ages);
                break;

            case "2":
                data = Deserialization.deserialize("birds.ser");

                names = (List<String>) data.get(0);
                codes = (List<Integer>) data.get(1);
                weights = (List<Integer>) data.get(2);
                ages = (List<Integer>) data.get(3);

                Birds.setName(names);
                Birds.setCode(codes);
                Birds.setWeight(weights);
                Birds.setAge(ages);
                break;

            case "3":
                data = Deserialization.deserialize("fish.ser");

                names = (List<String>) data.get(0);
                codes = (List<Integer>) data.get(1);
                weights = (List<Integer>) data.get(2);
                ages = (List<Integer>) data.get(3);

                Fish.setName(names);
                Fish.setCode(codes);
                Fish.setWeight(weights);
                Fish.setAge(ages);
                break;

            case "4":
                data = Deserialization.deserialize("mammals.ser");

                names = (List<String>) data.get(0);
                codes = (List<Integer>) data.get(1);
                weights = (List<Integer>) data.get(2);
                ages = (List<Integer>) data.get(3);

                Mammals.setName(names);
                Mammals.setCode(codes);
                Mammals.setWeight(weights);
                Mammals.setAge(ages);
                break;

            case "5":
                data = Deserialization.deserialize("reptiles.ser");

                names = (List<String>) data.get(0);
                codes = (List<Integer>) data.get(1);
                weights = (List<Integer>) data.get(2);
                ages = (List<Integer>) data.get(3);

                Reptiles.setName(names);
                Reptiles.setCode(codes);
                Reptiles.setWeight(weights);
                Reptiles.setAge(ages);
                break;

        }

    }

}
