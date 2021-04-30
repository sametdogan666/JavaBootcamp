package intro;

public class Main {
	public static void main(String[] args) {

		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "İnternet Şubeye gir";
		double dolarDun = 8.15;
		double dolarBugun = 8.30;
		int vade = 36;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düştü resmi");
		} else if (dolarDun == dolarBugun) {
			System.out.println("Dolar eşit resmi");
		} else {
			System.out.println("Dolar yükseldi resmi");
		}

		String kredi1 = "Hızlı kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftçi kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);

		String krediler[] = { "Hızlı Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Çiftçi Kredisi", "Msb Kredisi",
				"Meb Kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
