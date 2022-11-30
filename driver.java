import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
//		int km, yas,oneWay, roundType, select;
//		double tutar, discountPrice, doublePrice, noDiscount;
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen yaşınızı giriniz: ");
//		yas=input.nextInt();
//		
//		System.out.println("Lütfen mesafe giriniz: ");
//		km=input.nextInt();
//		
//		tutar = km * 0.10;
//		System.out.println("=>1-Tek Yön\n=> 2-Gidiş-DÖnüş");
//		select = input.nextInt();
//		
//		if(select==1 && yas >=1 && yas <=100 && km>=1) {
//			System.out.println("Tek yön seçilmiştir");
//			if(yas<12){
//				discountPrice = tutar -((tutar*50)/100);
//				System.out.println("Ödeyeceğiniz indirimli tutar : " + " " + discountPrice);
//				
//			}else if (yas<=12 && yas>=24) {
//				discountPrice = tutar -((tutar * 10)/ 100);
//				System.err.println("Ödeyeceğiniz indirimli tutar : "+" " + discountPrice);
//			}else if(yas>65) {
//				discountPrice = tutar - ((tutar * 30)/ 100);
//				System.out.println("Ödeyeceğiniz indirimli tutar : "+" " + discountPrice);
//			}else {
//				System.out.println("Ödenecek tutar: " + "" + tutar);
//			}
//		}
//		else if (select==2 && yas >=1 && yas<= 100 && km>=1) {
//			doublePrice = (tutar *2);
//			noDiscount = tutar*2;
//			System.out.println("Gidiş-Dönüş seöilmiştir.");
//			
//			if(yas<12) {
//				doublePrice = doublePrice - ((doublePrice*70)/100);
//				System.out.println("Ödeyeceğiniz indirimli tutar : "+" " + doublePrice + "TL -" + "İndirimsiz tutar:" + noDiscount + "TL");
//			}else if (yas<=12 && yas>=24) {
//				doublePrice = ((tutar-(tutar*0.50))-((tutar-(tutar*0.50))*0.20));
//				System.err.println("Ödeyeceğiniz indirimli tutar : "+" " + doublePrice + "TL -" + "İndirimsiz tutar:" + noDiscount + "TL");
//			}else if (yas>65) {
//				doublePrice = doublePrice - ((doublePrice*50)/100);
//				System.out.println("Ödeyeceğiniz indirimli tutar : "+ " " + doublePrice + "TL -" + "İndirimsiz tutar:" + noDiscount + "TL");
//			}else {
//				noDiscount = doublePrice - ((doublePrice*20)/100);
//			
//			
//			System.out.println("Ödeyeceğiniz indirimli tutar : "+" " + noDiscount + "TL -" + "İndirimsiz tutar:" + noDiscount + "TL");}
//		}
//		else {
//			System.out.print("HATA!");
//		}
//		
//	
//		
//	
//		
//		
//		
//		
		
//	}
//
//}
		int mesafe, yas, yolculukTipi;
		double kmBasina = 0.10, normalTutar, yasIndirimi = 0, yasIndirimOrani = 0;
		double indirimliTutar, gidisDonusIndirimi = 0, toplamTutar;
		Scanner sc = new Scanner(System.in);

		System.out.println("Gidilecek Mesafeyi Giriniz: ");
		mesafe = sc.nextInt();
		System.out.println("Yaşınızı Giriniz: ");
		yas = sc.nextInt();
		System.out.println("Tek Yön ise(1) Gidiş Dönüş ise(2) Seçiniz: ");
		yolculukTipi = sc.nextInt();

		if (mesafe > 0 && yas > 0 && yolculukTipi == 1 || yolculukTipi == 2) {
			if (yas < 12) {
				yasIndirimOrani = 0.50;
			} else if (yas >= 12 && yas <= 24) {
				yasIndirimOrani = 0.10;
			} else if (yas > 65) {
				yasIndirimOrani = 0.30;
			} else {
				yasIndirimOrani = 0;
			}

			normalTutar = mesafe * kmBasina;
			yasIndirimi = normalTutar * yasIndirimOrani;
			indirimliTutar = normalTutar - yasIndirimi;
			if (yolculukTipi == 2) {
				gidisDonusIndirimi = indirimliTutar * 0.20;
				toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
			} else {
				toplamTutar = indirimliTutar;
			}
			System.out.println("Toplam Tutar: " + toplamTutar + " Türk Lirası");
		} else {
			System.out.println("Hatalı Veri Girdiniz");
		}
	}}