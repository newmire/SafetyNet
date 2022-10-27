package com.remi.safetynet;

import com.remi.safetynet.repository.JSONObject;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        JSONParser jsonP = new JSONParser(String);
        JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader("C:\\Users\\Utilisateur\\OneDrive\\Documents\\OpenClassRoom\\P5\\data.json"));
    }
}
