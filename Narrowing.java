public class Narrowing {
  public static void main(String[] args) {
      double x = 10.5; //8 byte
      int y = (int) x; // 4  byte
      System.out.println(y);
  }  
}
