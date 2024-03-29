import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] islemler = {"+", "-", "*", "/"};
        int soruSayisi; 
        int[] dogruCevap ;
        int dogruCevapSayisi = 0;
        
        System.out.println("Matematik oyununa hoşgeldiniz.  Kaç soru çözmek istediğinizi giriniz: ");
        soruSayisi = input.nextInt(); 
        dogruCevap = new int[soruSayisi]; 

        for (int i = 0; i < soruSayisi; i++) {
            int sayi1 = (int) (Math.random() * 10);
            int sayi2 = (int) (Math.random() * 10);

            int islemIndex = (int) (Math.random() * 4);
            String islem = islemler[islemIndex];

            switch (islem) {
                case "+" -> dogruCevap[i] = sayi1 + sayi2;
                case "-" -> dogruCevap[i] = sayi1 - sayi2;
                case "*" -> dogruCevap[i] = sayi1 * sayi2;
                case "/" -> dogruCevap[i] = sayi1 / sayi2;
            }

            System.out.print("Soru " + (i+1) + ": " + sayi1 + " " + islem + " " + sayi2 + " = ");
            int cevap = input.nextInt();

            if (cevap == dogruCevap[i]) {
                System.out.println("Tebrikler!! Doğru cevap.");
                dogruCevapSayisi++;
            } else {
                System.out.println("Üzgünüm, yanlış cevap. Doğru cevap: (" + dogruCevap[i]+")");
            }
        }

       System.out.println("Oyun bitti. Toplam doğru cevap sayısı: " + dogruCevapSayisi + " / " + soruSayisi);
    }
}
