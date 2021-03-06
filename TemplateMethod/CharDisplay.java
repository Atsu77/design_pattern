package TemplateMethod;

public class CharDisplay extends AbstractDisplay {
  private char ch;

  public CharDisplay(char ch){
    this.ch = ch;
  }

  public void open() {
    System.out.println("<<");
  }

  public void print() {
    System.out.println(ch);
  }

  public void close() {
    System.out.println(">>");
  }
}
