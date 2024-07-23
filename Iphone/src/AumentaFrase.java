public class AumentaFrase {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
            System.out.println("Frase antiga: " + frase);
            System.out.println("Frase nova: " + novaFrase);
        } catch (NullPointerException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}