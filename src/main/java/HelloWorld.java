public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Java 21 features demonstration
        
        // Text blocks (Java 15+)
       String javaVersion = System.getProperty("java.version");
        String multilineMessage = """
            Welcome to Java %s!
            This is a modern Hello World example.
            Java continues to evolve with great features.
            """.formatted(javaVersion);
        System.out.println(multilineMessage);
        
        // Pattern matching with switch expressions (Java 17+, enhanced in 21)
        String dayType = getDayType("Monday");
        System.out.println("Today is a " + dayType);
        
        // Record classes (Java 14+)
        Person person = new Person("Java Developer", System.getProperty("java.version"));
        System.out.println("Hello from " + person.name() + ", Java version " + person.version());
    }
    
    // Switch expressions with pattern matching
    public static String getDayType(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "weekday";
            case "Saturday", "Sunday" -> "weekend";
            default -> "unknown day";
        };
    }
    
    // Record class (concise data carrier)
    public record Person(String name, String version) {}
}
