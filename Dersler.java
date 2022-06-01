import java.util.Scanner;

 public class Dersler {
    public static void main(String[] args) {
        int math, fiz, kim, turk, muz,div;
        Scanner in = new Scanner(System.in);
        div=0;
        System.out.print("Matematik Notunu Giriniz :");
        math = in.nextInt();
        if (0 < math && math < 101){
        math = math;
        }
          else {
            math  =0;
            div+=1;
          }
        System.out.print("Fizik Notunu Giriniz :");
        fiz = in.nextInt();

        if (0 < fiz && fiz < 101){
            fiz = fiz;
        }
         else {
            fiz = 0;
          div+=1;
         }
        System.out.print("Kimya Notunu Giriniz :");
        kim = in.nextInt();
        if (0 < kim && kim < 101){
            kim = kim;
        }
         else {
            kim= 0;
         div+=1;
}
        System.out.print("Turkce Notunu Giriniz :");
        turk = in.nextInt();
        if (0 < turk && turk < 101){
            turk = turk;

}       else {
            turk=0;
        div+=1;
}

        System.out.print("Muzik Notunu Giriniz :");
        muz = in.nextInt();
        if (0 < muz && muz < 101){
            muz = muz;
        }
        else {
            muz= 0;
div+=1;


}

        double toplam = math+ fiz+turk+ muz+kim;

        double ortalama = toplam/(5-div);

       if(ortalama>=55){
           System.out.println("Ortalamaniz:"+ortalama);
           System.out.println("Gectiniz..");

       }
       else {
           System.out.println("Ortalamaniz:"+ortalama);
           System.out.print("Kaldiniz..");
       }






    }
            }
