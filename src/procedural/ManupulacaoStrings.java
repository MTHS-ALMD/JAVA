package procedural;

public class ManupulaçaoStrings {
    public static void main(String[] args) {
        String x="   Uma frase aleatória    ";
        System.out.println(x.length());
        System.out.println(x.contains("Uma"));
        System.out.println(x.indexOf("r"));
        System.out.println(x.lastIndexOf("aleatória"));
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.trim());
        System.out.println(x.substring(9));
    }
}
