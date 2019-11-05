package cthprogram;
import java.util.Scanner;
public class biodata {
    public static void main(String[] args) {
      //deklarasi variabel
      String nama;
      String nim;
      //memberikan nilia pada varibel secara dinamis
      //memanggil class scanner
      Scanner input_bio=new Scanner (System.in);
      //nama
      System.out.print("Nama:");
      nama=input_bio.nextLine();
      //nim
      System.out.print("Nim:");
      nim=input_bio.nextLine();
      //cetak nama dan nim
      System.out.println("nama"+nama);
      System.out.println("nim"+nim); 
    }
}
