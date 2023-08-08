import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Welcome {
    public static String greet(String language) {
        // Create a new HashMap to store language-greeting pairs
        Map<String, String> langMap = new HashMap<>();

        // Populate the language database with key-value pairs
        langMap.put("english", "Welcome");
        langMap.put("czech", "Vitejte");
        langMap.put("danish", "Velkomst");
        langMap.put("dutch", "Welkom");
        langMap.put("estonian", "Tere tulemast");
        langMap.put("finnish", "Tervetuloa");
        langMap.put("flemish", "Welgekomen");
        langMap.put("french", "Bienvenue");
        langMap.put("german", "Willkommen");
        langMap.put("irish", "Failte");
        langMap.put("italian", "Benvenuto");
        langMap.put("latvian", "Gaidits");
        langMap.put("lithuanian", "Laukiamas");
        langMap.put("polish", "Witamy");
        langMap.put("spanish", "Bienvenido");
        langMap.put("swedish", "Valkommen");
        langMap.put("welsh", "Croeso");

        // Check if the provided language is not null and exists in the language database
        if (language != null && langMap.containsKey(language.toLowerCase())) {
            // Return the corresponding greeting for the language
            return langMap.get(language.toLowerCase());
        } else {
            // Return the default greeting ("Welcome") in case of invalid input or language not found
            return "Welcome";
        }
    }
    public static void main(String[] args) {
        System.out.println(greet("dutch"));
    
    
    }
}

// Java is not as easy as I thoght It would  be, God damn...