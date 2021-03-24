package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            Pagines pagines = mapper.readValue(new File("notes2.yaml"), Pagines.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
