/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KondisiSwitchCase;
import java.util.*;
/**
 *
 * @author DELL
 */
public class LatScan4 {
    public static void main(String[]args)
{
int kd;
String nb="";
Scanner input =new Scanner(System.in);
System.out.print("masukan kode barang[1..3]");
kd= input.nextInt();

switch(kd)
{
    
    case 1:
            nb="alat elektronik";
            break;
    case 2:
            nb="alat elektronik";
            break;
    case 3:
            nb="alat alat masak";
            break;
    default:
        nb="anda salah kode !!!";
            break;
}
System.out.println("\nnama barang :" +nb);
}

}
