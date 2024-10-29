package com.company.methods;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialization {

    public static void serialize(List<Object> data, String fileName) {

        try {

            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(data);
            o.close();
            f.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
