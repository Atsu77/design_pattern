package FactoryMethod;

public class Main {
  public static void main(String[] args){
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("田中太郎");
    Product card2 = factory.create("山本耕一");
    Product card3 = factory.create("佐藤瑠美");
    card1.use();
    card2.use();
    card3.use();
  }
}
