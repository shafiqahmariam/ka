import java.util.Scanner;
public class penilaian_prestasi_k4 
{
public static void main(String args [])
{
    int gaji;

Scanner input=new Scanner(System.in);
System.out.println("masukkan nama :");
String nama=input.next();
System.out.println(" masukkan bilangan jam sehari :");
int bil_jam_sehari=input.nextInt();

if (bil_jam_sehari > 9);
{ System.out.println("Bilangan jam hari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul");
System.out.println("masukkan bilangan jam hari : ");
}

System.out.println("masukkan bilangan hari :");
int bil_hari=input.nextInt();

    
if (bil_hari > 30);
{System.out.println("Bilangan hari bekerja tidak boleh melebihi 30 hari, sila masukkan bilangan hari yang betul");
System.out.println("masukkan bilangan hari :");
}

System.out.println("masukkan bilangan jam ot :");
int bil_jam_ot=input.nextInt();

if (bil_jam_ot>50);
{System.out.println("Bilangan jam bekerja lebih masa tidak boleh melebihi 50 jam, sila masukkan bilangan jam yang betul");
System.out.println("masukkan bilangan jam ot :");
}

 gaji=(bil_jam_sehari*bil_hari*20) + (bil_jam_ot * 15);


        
System.out.println("Rumusan gaji bulanan "+nama+":");
        
System.out.println("jumlah jam bekerja "+bil_jam_sehari+"jam");
        
System.out.println("jumlah hari bekerja:"+bil_hari+"hari");
       
System.out.println("jumlah jam lebih masa :"+bil_jam_ot+"jam");
        
System.out.println("JUMLAH GAJI:RM"+gaji);


