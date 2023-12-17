
  enum CardTypes {
    bastoni,
    spade,
    coppe,
    denari
  }

public class Card{
    int value;
    CardTypes type;


    public Card(int CardValue, CardTypes CardType){
        //VALIDATE THE VALUES INSERTED BEFORE INSTANTIATING THE OBJECT
        if (CardValue < 1 || CardValue > 10) {
            System.out.println("Errore: Il valore della carta deve essere compreso tra 1 e 10. Carta non istanziata.");
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
  public CardTypes getType() {
    return type;
  }
  //SETTERS
  public void setValue(int newValue) {
    this.value = newValue;
  }
  public void setType(CardTypes newType) {
    this.type = newType;
  }
}
