package com.company.methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Deserialization {

    public static List<Object> deserialize(String fileName) {

        List<Object> data = new ArrayList<>();

        try {

            FileInputStream f = new FileInputStream(fileName);
            ObjectInputStream o = new ObjectInputStream(f);
            data = (List<Object>) o.readObject();
            o.close();
            f.close();

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();

        }

        return data;

    }

}
