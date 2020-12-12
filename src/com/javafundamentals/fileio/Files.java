package com.javafundamentals.fileio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Files {
    public static void main(String[] args) {
        String fileName = "src/data.csv";
        File file = new File(fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " created!");
            } catch (IOException e) {
                System.out.println("Error creating file.");
                System.out.println(e);
            }
        }

        //Writing To Files
        try {
            FileWriter fileWriter = new FileWriter(fileName); //setting append to true to append to file
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("id,name,email\n1, Jamal,Azam@gmail.com");
            writer.println("2,Smith,John@gmail.com");
            writer.println("3,Doodle, poodle@gmail.com");
            writer.flush(); //flush before closing!
            writer.close();
            System.out.println("Contents added to file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reading Files
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = "";
            //Skipping first line
            System.out.println("Header = " + reader.readLine());

            List<User> users = new ArrayList<>();
            while((line = reader.readLine()) != null) {
                System.out.println(line);
                //Parsing the file
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                String email = split[2];
                User user = new User(id, name, email);
                System.out.println(user);
                users.add(user);
            }

            reader.close();

            System.out.println("Iterating through User List:");
            users.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
