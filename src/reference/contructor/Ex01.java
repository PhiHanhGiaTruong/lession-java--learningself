package reference.contructor;

import java.util.function.Supplier;

import bean.Apple;

public class Ex01 {
	/*
	 *  shorthand way create instance if FI return object
	 *  Supplier<T> ==> T get()
	 */
	public static void main(String[] args) {
//		support to create instance of Apple with no parameter
//		Supplier<Apple> spl01 = () -> new Apple();
		Supplier<Apple> spl01 = Apple::new;
		Apple apl01 = spl01.get();
		System.out.println(apl01);
		
	}

}
