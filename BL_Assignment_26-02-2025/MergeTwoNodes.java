package org.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeTwoNodes {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json1 = "{ \"name\": \"Divya\", \"age\": 22 }";
            JsonNode node1 = objectMapper.readTree(json1);
            String json2 = "{ \"email\": \"divyasingh@example.com\", \"city\": \" Varanasi\" }";
            JsonNode node2 = objectMapper.readTree(json2);
            ObjectNode mergedNode = objectMapper.createObjectNode();
            mergedNode.setAll((ObjectNode) node1);
            mergedNode.setAll((ObjectNode) node2);
            String mergedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedNode);

            System.out.println("Merged JSON: " + mergedJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
