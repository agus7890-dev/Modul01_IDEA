import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main(String[] args){

  String namaDepan = "Agus";
  String namaTengah = "Mau";
  String namaBelakang= "lana";
  int usia = 19;
  int lamaKuliah = 4;
  double ipk;
  char nilai = 'A';
  
  Scanner inputan = new Scanner(System.in);

  System.out.println("=========Fase input =========");
  System.out.print("Input nama depan : ");
  namaDepan = inputan.nextLine();

  System.out.println("==========Fase output ========");
  System.out.print("Nama depan : ");
  System.out.println(namaDepan);
  System.out.println("Nama tengah : " +namaTengah);
  System.out.println("Nama belakang : " +namaBelakang );
  System.out.println("Usia : " +usia);
  System.out.println("Usia saat lulus (String) : " + usia + lamaKuliah );
  System.out.println("Usia saat lulus (kurung) : " + (usia + lamaKuliah ));

  int UsiaLulus = usia + lamaKuliah;
  System.out.println("Usia saat lulus (variable) : " + (usia + lamaKuliah ));

  JOptionPane.showMessageDialog(null, "Hai, " + namaDepan +namaTengah +namaBelakang);
  }
}