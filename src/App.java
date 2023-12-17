public class App {
    public static void main(String[] args) throws Exception {
        Card carta1 = new Card(8,CardTypes.bastoni);
        carta1.setType(CardTypes.denari);
        CardTypes tipo_carta1=carta1.getType();
        System.out.println(tipo_carta1);
    }
}
