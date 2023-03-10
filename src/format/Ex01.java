package format;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01 {
	public static void main(String[] args) {
		//Locale.setDefault(new Locale("da", "DK"));
		System.out.println("default locale: " + Locale.getDefault());
		// default locale >> [country, language] >> en_US
		//có thế giá trị tiền, học số nào đó
		double value = 124654667.778d;
		//code
		System.out.println(value);
		// thiết lập một locale cụ thể.
		Locale locale = new Locale("da", "DK");
		//actual: currency
		// factory, [singleton]
		NumberFormat nf = NumberFormat.getInstance(locale);
		System.out.println("Number format: "+ nf.format(value));
		// format currency
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println("cf format: " + cf.format(value));
		
		System.out.println("==============================");
		
		// in ra tất cả các locale của các nước.
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
	}

}
