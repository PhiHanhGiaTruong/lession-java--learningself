package reference.contructor;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;
import functional.QuFunction;

public class Ex04 {
	/*
	 * shorthand way create instance if FI return object Supplier<R> ==> R get()
	 * Function<T, R> ==> R get(T t)
	 */
	public static void main(String[] args) {
//		Type inference 
//		support to create instance of Apple with no parameter
//		Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);
//		Function<Integer, Apple> fnt2 = (Integer t) -> new Apple(t);
		Function<Integer, Apple> fnt2 = Apple::new;
		Apple apl02 = fnt2.apply(123);
		System.out.println(apl02);
		BiFunction<Integer, String, Apple> spl03 = Apple::new;
		Apple apl03 = spl03.apply(321, "VietNam");
		System.out.println(apl03);
		QuFunction<Integer, String, Double, String, Apple> qun04 = Apple::new;
		Apple apl04 = qun04.apply(234, "blue",236d,"VietNam");
		System.out.println(apl04);

	}

}
