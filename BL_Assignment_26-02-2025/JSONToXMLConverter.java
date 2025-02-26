package org.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;

public class JSONToXMLConverter {
    public static void main(String[] args) {
        try {

            ObjectMapper objectMapper = new ObjectMapper();

            JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\Divya Singh\\IdeaProjects\\Jsonquestions\\target\\data.json"));

            XmlMapper xmlMapper = new XmlMapper();

            String xmlOutput = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            System.out.println(xmlOutput);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
