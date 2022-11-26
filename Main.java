import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um número");
    double x = sc.nextDouble();
    System.out.println("Insira o segundo número: ");
    double y = sc.nextDouble();

    x = (x * 1000);
    x = (x / 1000);

    y = (y * 1000);
    y = (y / 1000);

    if (x == y){
      System.out.println("São iguais.");
    } else {
      System.out.println("São diferentes");
    }
  }
}