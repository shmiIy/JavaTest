import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        SerializableEmployee e = new SerializableEmployee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 122333;
        e.number = 101;
        try {
            FileOutputStream fileOut = new
              FileOutputStream("/WorkSpace/Java/SerializableEmployee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in "
              + "/WorkSpace/Java/SerializableEmployee.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }
    }
}