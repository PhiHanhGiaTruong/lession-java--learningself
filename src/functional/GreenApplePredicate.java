package functional;

import bean.Apple;

public class GreenApplePredicate implements functionPredicate{
	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}

}
