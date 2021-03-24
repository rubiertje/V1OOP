package Oefenen_OOP;

import les2.oefening2.Product;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class InputOutputOefening{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Product> producten = new ArrayList<>();

        producten.add(new Product("Meel", "jfiewoj43598fj", 1.19));
        producten.add(new Product("kaas", "nrioveht8934c", 2.19));
        producten.add(new Product("Ham", "3c4ioegrvfsd", 1.49));

        OutputStream outputStream = Files.newOutputStream(Path.of("producten.obj"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(producten);

        outputStream.close();
        objectOutputStream.close();

        InputStream inputStream = Files.newInputStream(Path.of("producten.obj"));
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object obj = objectInputStream.readObject();

        ArrayList<Product> list = (ArrayList<Product>) obj;

        objectInputStream.close();

        System.out.println(list);

        for (Product product: list){
            System.out.println(product);
        }

    }
}
