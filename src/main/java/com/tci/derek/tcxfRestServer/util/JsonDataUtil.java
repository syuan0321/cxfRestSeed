package com.tci.derek.tcxfRestServer.util;



import java.io.File;
import java.io.FileFilter;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.customProperties.HyperSchemaFactoryWrapper;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import com.tci.derek.tcxfRestServer.model.User;

public class JsonDataUtil {
    public static String DATA_DESTINATION_PATH = "src\\main\\java\\com\\tci\\derek\\tcxfRestServer\\data\\";

    public static String MODEL_PATH = "com.tci.derek.tcxfRestServer.model";
    
    public static ObjectMapper objectMapper;
    
    private static ObjectMapper getObjectMapper(){
    	return objectMapper == null ? new ObjectMapper() : objectMapper;
     }

    public static void generateJSONSchema(String modelName){
    	HyperSchemaFactoryWrapper schemaFactoryMapper = new HyperSchemaFactoryWrapper();
    	try {
			getObjectMapper().acceptJsonFormatVisitor(Class.forName(MODEL_PATH + "." +modelName), schemaFactoryMapper);
			JsonSchema schema = schemaFactoryMapper.finalSchema(); 
			
			
			File f = new File(DATA_DESTINATION_PATH  + modelName + ".json");
			System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
			
			getObjectMapper().writeValue(f, schema);
			
			System.out.println(getObjectMapper().writeValueAsString(schema));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public static void witePOJOToJSON(Object obj){
    	try {
    		getObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {//Gonna handle exceptions into logs later
			e.printStackTrace();
		} 
    }
    
    public static void main(String[] args) throws JsonProcessingException {
    	System.out.println(DATA_DESTINATION_PATH  + "User" + ".json");
    	
    	generateJSONSchema("User");
    
    }    
    
    
}
