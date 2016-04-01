package exp.jsonschema2java;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONSchema2Java
{
  public static void main(String[] argc) throws IOException
  {
    ObjectMapper mapper = new ObjectMapper();
    File addressFile = new File(JSONSchema2Java.class.getClassLoader().getResource("./json/address.json").getFile());

      Address address1 = mapper.readValue("{\"post-office-box\": \"232\", \"extended-address\": \"an extended\",  " +
      "\"street-address\": \"123 Main St\", \"locality\": \"a locality\", " +
      "\"region\": \"a region\", \"postal-code\": \"666\", \"country-name\": \"USA\" }", Address.class);

    Address address2 = mapper.readValue(addressFile, Address.class);

    System.out.println("Address: " + address1);
    System.out.println("Address: " + address2);
  }
}
