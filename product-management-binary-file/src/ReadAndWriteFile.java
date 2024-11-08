import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static final String SRC_DATA = "src/data/product.dat";

    public void save(Product p) {
        List<Product> products = getAll();
        products.add(p);
        writeFileBinary(products);
    }

    public void writeFileBinary(List<Product> products) {
        File file = new File(SRC_DATA);
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Looix khong tim thay file");
        } catch (IOException e) {
            System.out.println("loi ghi file");
        }
    }

    public List<Product> searchByName(String name) {
        List<Product> products = getAll();
        List<Product> temp = new ArrayList<>();
        for (Product p: products) {
            if(p.getName().contains(name)) {
                temp.add(p);
            }
        }
        return temp;
    }

    public static List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        File file = new File(SRC_DATA);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Loi ko tim thay file");
        } catch (IOException e) {
            System.out.println("Loi doc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Loi khong tim thay class");
        }
        return products;
    }
}
