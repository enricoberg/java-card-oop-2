public class Card{
    int value;
    String type;


    public Card(int CardValue, String CardType){
        //VALIDATE THE VALUES INSERTED BEFORE INSTANTIATING THE OBJECT
        if (CardValue < 1 || CardValue > 10) {
            System.out.println("Errore: Il valore della carta deve essere compreso tra 1 e 10. Carta non istanziata.");
            return; 
        }
        if(CardType!="bastoni" && CardType!="spade" && CardType!="coppe" && CardType!="denari") {
           System.out.println("Errore: Il tipo di carta inserito non è valido");
           return;  
        }
        value=CardValue;
        type=CardType;
        String converted_value = String.valueOf(value);
        if (value==1) converted_value="Asso";
        if (value==8) converted_value="Fante";
        if (value==9) converted_value="Cavallo";
        if (value==10) converted_value="Re";
        
        System.out.println("Nuova carta instanziata: "+ converted_value + " di " + type);
    }
  // GETTERS
  public int getValue() {
    return value;
  }
  public String getType() {
    return type;
  }
  //SETTERS
  public void setValue(int newValue) {
    this.value = newValue;
  }
  public void setType(String newType) {
    this.type = newType;
  }
}
