/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayBerdimensiSatu;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class LatihanArray {
        public static void main(String[]args)throws IOException
    {
        Scanner input=new Scanner(System.in);
        int i,j;
        double pemasukan=0;
        String namapetugas,tanggal;
        String [] kodebarang=new String[10];
        String [] namabarang=new String[10];
        int [] jumlah=new int[10];
        double [] harga = new double [10];
        double [] total = new double [10];
        
        

        System.out.println("            PT.PERMATA 'PRATAMA' ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print(" Masukan Nama Petugas    : "); namapetugas=input.nextLine();
        System.out.print(" Tanggal                 : ");tanggal=input.nextLine();
        System.out.println("  ");
        System.out.print(" Jumlah Data yang akan di masukan :"); j=input.nextInt();
        System.out.println("-----------------------------------------------");
        for(i=1;i<=j; i++)
        {
            System.out.println("        Data Ke- " +i);
            System.out.print("          kode barang :");kodebarang[i]=input.next();
            System.out.print("          Jumlah      :");jumlah[i]=input.nextInt();
            System.out.println("    -------------------------");
            if (kodebarang[i].equalsIgnoreCase("P001"))
            {
                namabarang[i]="Printer    ";
                harga[i]=700000;
            }
            else if (kodebarang[i].equalsIgnoreCase("V001"))
            {
                namabarang[i]="VGA Card   ";
                harga[i]=75000;
            }
            else if (kodebarang[i].equalsIgnoreCase("M001"))
            {
                namabarang[i]="Motherboard";
                harga[i]=950000;
            }
            else
            {
                namabarang[i]="Tidak ada  ";
                harga[i]=0;
            }
        }
        System.out.println("                            PT.PERMATA 'PRATAMA'                    ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++s++");
        System.out.print("Nama Petugas          : " +namapetugas);System.out.println("       Tanggal : "+ tanggal);
        System.out.println("Jumlah Data yang dimasukan : " +j);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Data Ke     Kode Barang     Nama Barang         Harga Barang        Jumlah Barang   Total Harga");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for(i=1; i<=j; i++)
        {
            total[i]=harga[i]*jumlah[i];
            System.out.println("   "+i+"            "+kodebarang[i]+"        "+namabarang[i]+"            "+harga[i]+"               "+jumlah[i]+ "          "+total[i]);
            pemasukan=pemasukan+total[i];
        }
        System.out.println("Total pendapatan pada tanggal" + "   "+tanggal+"  adalah sebesar Rp. "+pemasukan );
     }   
}

