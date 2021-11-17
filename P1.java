import java.util.Scanner;
public class P1{
      public static void main(String [] args)
      {/*
      double r1=Math.abs(-15);
      System.out.println(r1);

      long r2=Math.abs(-15);
      System.out.println(r2);

      float r3=Math.abs(-15);
      System.out.println(r3);

      double r4 = Math.ceil(3.5347);
      System.out.println(r4);

      double r5 = Math.floor(3.743);
      System.out.println(r5);
      int a = -123, b = 5;
      System.out.println(Math.floorMod(a, b));
      System.out.println("**************************");

      
      double r6 = Math.min(15.005, 15.00);
      System.out.println(r6);

      double r7 = Math.round(5.494);
      System.out.println(r7);

      double r8 = Math.round(5.503);
      System.out.println(r8);

      double r9 = Math.random()*100;      //if u want between 0-100 u should ...*100D. for ex
      System.out.println(r9);             
      
      double r10 = Math.pow(2, 3);
      System.out.println(r10);
    
      Scanner in = new Scanner(System.in);
      System.out.print("Enter price: ");
      double price = in.nextDouble();
      System.out.printf("%.2f", price);
      System.out.printf("%10.2f", price);

      String name="hendy";
      int l=name.length();
      System.out.println(l);

      String name1="Nur";
      String name2="Can";
      int a=name1.length();
      int b=name2.length();
      System.out.println(a+b);

      String name3="papa";
      char start = name3.charAt(0);
      char second = name3.charAt(1);
      char third = name3.charAt(2);
      char last = name3.charAt(3);
      System.out.print(start);
      System.out.print(second);
      System.out.print(third);
      System.out.print(last);
      
      
      Scanner in=new Scanner (System.in);
      System.out.println("input: ");
      int floor=in.nextInt();
      if (floor==5) {
            System.out.println("5.kattasın"); 
      }

      Scanner in=new Scanner (System.in);
      System.out.print("input: ");
      int ayDegeri = in.nextInt();
      String ayDegeriStr = null;

      switch(ayDegeri) {
            case 1:
                ayDegeriStr = "Ocak";
                break;
            case 2:
                ayDegeriStr = "Şubat";
                break;
            case 3:
                ayDegeriStr = "Mart";
                break;
            case 4:
                ayDegeriStr = "Nisan";
                break;
            case 5:
                ayDegeriStr = "Mayıs";
                break;
            case 6:
                ayDegeriStr = "Haziran";
                break;
            case 7:
                ayDegeriStr = "Temmuz";
                break;
            case 8:
                ayDegeriStr = "Ağustos";
                break;
            case 9:
                ayDegeriStr = "Eylül";
                break;
            case 10:
                ayDegeriStr = "Ekim";
                break;
            case 11:
                ayDegeriStr = "Kasım";
                break;
            case 12:
                ayDegeriStr = "Aralık";
                break;
            default:
                break;
        }
        //Konsol ekranina secilen ayin yazdirildigi bolum
        System.out.println("Seçilen Ay Değeri: " + ayDegeriStr);*/

            
           
            
            //int sayi=in.nextInt();
            
            /*double bakiye=1000; 
            int islem;
            
            System.out.println("1- Bakiye Görüntüle");
            System.out.println("2- Para Yatırma");
            System.out.println("3- Para Çekme");
            System.out.println("4- Sistemden Çıkış");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            islem=in.nextInt();

            switch (islem) {
                  case 1:
                        System.out.print("Bakiyeniz: "+bakiye);
                        break;
                  case 2:
                        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                        double ekle=in.nextDouble();
                        bakiye+=ekle;
                        System.out.print("Güncel Bakiyeniz: " +bakiye);
                        break;
                  case 3:
                        System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                        double cek=in.nextDouble();
                        bakiye-=cek;
                        System.out.print("Güncel Bakiyeniz: " +bakiye);
                        break;
                  case 4:
                        System.out.print("Sistemden Çıkış Başarılı");
                  default:
                        System.out.print("Geçersiz işlem");
                        break;
            }*/

            System.out.print("a için değer giriniz: ");
            Scanner in=new Scanner(System.in);

            int a=in.nextInt();
            int fak=1;

            while (a<=10 ){
                  fak = fak*a;
                  a++;
                  System.err.println(fak);
            }
            
            
            
            
            
            
            
            
            
            
            /*
            switch (sayi) {
                  case 1:
                        System.out.println("one");
            break;
                  case 2:
                        System.out.println("two");
            break;
                  case 3:
                        System.out.println("three");
            break;
                  case 4:
                        System.out.println("four");
            break;
                  case 5:
                        System.out.println("five");
            break;
                  case 6:
                        System.out.println("six");
                  break;
            default:
                        System.out.println("stop");
                        break;
            }*/

      }
}