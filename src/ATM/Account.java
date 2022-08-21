package ATM;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Account implements Serializable {
  String name, uid;
  int age, pin;
  int bal;
  Account(String name, String uid, int age, int pin, int bal){
    this.name= name;
    this.uid= uid;
    this.age= age;
    this.pin= pin;
    this.bal= bal;
  }
  
  

}
