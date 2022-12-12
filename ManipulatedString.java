import java.util.Scanner;

public class ManipulatedString {
  public static void main(String[] args) {
    System.out.println("==================================");
    System.out.print("Inputkan kata: ");
    Scanner sc = new Scanner(System.in);
    String inputText = sc.nextLine();
    System.out
        .println("Kebalikan dari kata" + " " + inputText + " " + "adalah: " + ManipulatedString.reverse(inputText));
    ManipulatedString.isPallindrom(inputText, ManipulatedString.reverse(inputText));

    sc.close();
  }

  private static String reverse(String text) {
    String s = text;
    Integer jml = s.length();
    String hasil = "";

    for (int i = jml; i > 0; i--) {
      hasil = hasil + s.substring(i - 1, i);
    }

    return hasil;
  }

  public static void isPallindrom(String text, String textreverse) {
    String s = text;
    String r = textreverse;

    boolean isPallindrom = s.equalsIgnoreCase(r);
    if (isPallindrom) {
      System.out.println("Kata" + " " + s + " " + "adalah Palindrom");
    } else {
      System.out.println("Kata" + " " + s + " " + "Bukan isPallindrom");
    }
    System.out.println("==================================");
  }
}