package com.example.finalproject_oop213.MirzaMdSufianHridoy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PutObjectInBinFileOrTxtFile {


    static class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        @Override
        protected void writeStreamHeader() throws IOException {
            reset();
        }
    }


    public static void writeObjInBinaryFile(String filePath, Object obj) {
        File file = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = file.exists() && file.length() > 0
                     ? new AppendableObjectOutputStream(fos)
                     : new ObjectOutputStream(fos)) {

            oos.writeObject(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void overwriteBinaryFile(String filePath, Object obj) {
        File file = new File(filePath);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false))) {
            oos.writeObject(obj);
            System.out.println("Binary file overwritten with new object.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String readObjFromBinaryFile(String filePath) {
        StringBuilder result = new StringBuilder();
        File file = new File(filePath);

        if (!file.exists()) {
            return "File not found: " + filePath;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    result.append(obj.toString()).append("\n");
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result.toString();
    }


    public static void writeObjectInTxtFile(String filePath, Object obj) {
        try (FileWriter fw = new FileWriter(filePath, true)) {
            fw.write(obj.toString() + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void overwriteTxtFile(String filePath, Object obj) {
        try (FileWriter fw = new FileWriter(filePath, false)) {
            fw.write(obj.toString() + System.lineSeparator());
            System.out.println("Text file overwritten successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static String readFromTxtFile(String filePath) {
        StringBuilder result = new StringBuilder();

        try (Scanner sc = new Scanner(new File(filePath))) {
            while (sc.hasNextLine()) {
                result.append(sc.nextLine()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public static void appendLineToTxtFile(String filePath, String text) {
        try (FileWriter fw = new FileWriter(filePath, true)) {  // 'true' means append mode
            fw.write(text + System.lineSeparator());
            System.out.println("Line added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static List<Object> readObjectsAsListFromBinaryFile(String filePath) {
        List<Object> objectList = new ArrayList<>();
        File file = new File(filePath);

        if (!file.exists()) return objectList;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    objectList.add(obj);
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objectList;
    }


    public static void overwriteBinaryFileWithList(String filePath, List<Object> objectList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath, false))) {
            for (Object obj : objectList) {
                oos.writeObject(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean removeParticularObjectFromBinFile(String filePath, ObjectMatcher matcher) {
        List<Object> objects = readObjectsAsListFromBinaryFile(filePath);
        boolean removed = objects.removeIf(matcher::matches);

        if (!removed) {
            System.out.println("No matching object found to remove.");
            return false;
        }

        overwriteBinaryFileWithList(filePath, objects);
        System.out.println("Matching object removed successfully.");
        return true;
    }

    public static Object getLastObjectFromBinaryFile(String filePath) {
        File file = new File(filePath);

        if (!file.exists() || file.length() == 0) {
            System.out.println("File is empty or does not exist.");
            return null;
        }

        Object lastObject = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    lastObject = ois.readObject();
                } catch (EOFException eof) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return lastObject;
    }



}
