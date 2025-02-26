package org.example;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SchemaValidatorsConfig;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import java.util.Set;

class EmailValidation {
    public static void main(String[] args) {
        String schemaString = """
        {
          "$schema": "https://json-schema.org/draft/2020-12/schema",
          "type": "object",
          "properties": {
            "email": {
              "type": "string",
              "format": "email"
            }
          },
          "required": ["email"]
        }
        """;
        String validJson = "{ \"email\": \"user@example.com\" }";
        String invalidJson = "{ \"email\": \"invalid-email\" }";

        validateJson(schemaString, validJson);
        validateJson(schemaString, invalidJson);
    }

    public static void validateJson(String schemaString, String jsonData) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode schemaNode = objectMapper.readTree(schemaString);
            JsonNode jsonNode = objectMapper.readTree(jsonData);

            JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);
            JsonSchema schema = factory.getSchema(schemaNode, new SchemaValidatorsConfig());

            Set<ValidationMessage> validationResult = schema.validate(jsonNode);

            if (validationResult.isEmpty()) {
                System.out.println("Valid JSON: " + jsonNode);
            } else {
                System.out.println("Invalid JSON: " + validationResult);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
