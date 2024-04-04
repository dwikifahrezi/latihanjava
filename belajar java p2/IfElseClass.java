/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiIfElse;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class IfElseClass {
  public String nama,ket;
  public int nilAkhir;
  Scanner input = new Scanner (System.in);

  public void setInputData(){
  System.out.print("Masukan Nama Siswa   : ");
  nama = input.nextLine();
  System.out.print("Masukan Nilai Akhir  : ");
  nilAkhir = input.nextInt();
  }
    public String getKeterangan(){
   if(nilAkhir > 70 ){
       ket="lulus";
   }else {
       ket="Gagal";
   }
   return ket;
    }
    
  
}
