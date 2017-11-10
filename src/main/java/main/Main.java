package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by joel_thinkpad on 10.11.2017.
 */
public class Main {

    public static void main (String[] args) {

        try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String nam = br.readLine();
            String name ="test";
            System.out.println("helloü" + name);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
