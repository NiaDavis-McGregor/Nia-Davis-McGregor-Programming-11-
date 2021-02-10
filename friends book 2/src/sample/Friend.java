package sample;

import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class Friend {

    public String name;
    public int age;
    public String personality;

    Friend (String name, int age, String personality) {
        this.name = name;
        this.age = age;
        this.personality = personality;
    }


    Friend() {

    }

    public void writeToFile(BufferedWriter bw) throws IOException {
        bw.write("Name: " + name + "\r");
        bw.write( "Age: " + Integer.toString(age) + "\r");
        bw.write("Personality: " + personality + "\r");
        bw.write(" \r");
    }

    public boolean readFromFile(BufferedReader br) throws IOException {

        String line = br.readLine();
        if (line == null) {
            return false;
        }

        name = line.substring(6);
        line = br.readLine();
        line = line.substring(5);
        age = Integer.parseInt(line);
        personality = br.readLine().substring(13);
        br.readLine();

        return true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPersonality() {
        return personality;
    }

    public String toString(){
        return name;
    }
}
