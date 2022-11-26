package com.remi.safetynet.repository;


import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Component
public class DataHolder {
    private Data data;
    public DataHolder(String[] args) throws IOException {
        ClassLoader classLoader = DataHolder.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("data.json");
        String fileContent = readFromInputStream(inputStream);
        //ICI UTILISATION JSONITER transfo string en
    }

    private static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
}
