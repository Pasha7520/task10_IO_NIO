package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
            Droid droid1 = new Droid("Droid_1",10,30);
            Droid droid2 = new Droid("Droid_2",20,35);
            Droid droid3 = new Droid("Droid_3",15,33);
            Droid droid4 = new Droid("Droid_4",10,34);
            Droid droid5 = new Droid("Droid_5",17,35);
            Droid droid6 = new Droid("Droid_6",7,55);
            Droid droid7 = new Droid("Droid_7",11,55);
            Droid droid8 = new Droid("Droid_8",30,10);
            Droid droid9 = new Droid("Droid_9",20,20);
            Droid droid10 = new Droid("Droid_10",4,80);
            List<Droid> droidList = new ArrayList<>();
            droidList.add(droid1);
            droidList.add(droid2);
            droidList.add(droid3);
            droidList.add(droid4);
            droidList.add(droid5);
            droidList.add(droid6);
            droidList.add(droid7);
            droidList.add(droid8);
            droidList.add(droid9);
            droidList.add(droid10);
            Ship ship = new Ship("Freedom",3000,droidList,true);
            deserShip();


    }
    public static void serShip(Ship ship){
        try {
            File dir = new File("tmp/test");
            dir.mkdirs();
            File file = new File(dir,"ship.ser");
            if(!file.exists()){
                file.createNewFile();
            }

            FileOutputStream fileOut =
                    new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ship);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/ship.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public static void deserShip(){

            Ship ship = null;
            try {
                File dir = new File("tmp/test");
                File file = new File(dir,"ship.ser");
                FileInputStream fileIn = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                ship = (Ship) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException i) {
                i.printStackTrace();
                return;
            } catch (ClassNotFoundException c) {
                System.out.println("Ship class not found");
                c.printStackTrace();
                return;
            }

            System.out.println(ship);

    }
    

}
