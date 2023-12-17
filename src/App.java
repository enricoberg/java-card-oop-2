public class App {
    public static void main(String[] args) throws Exception {
        Card carta1 = new Card(8,"denari");
        carta1.setType("bastoni");
        String tipo_carta1=carta1.getType();
        System.out.println(tipo_carta1);
    }
}
