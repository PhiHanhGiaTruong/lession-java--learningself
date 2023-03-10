package functional;

import bean.Apple;

public class LightWeightApplePredicate implements functionPredicate{
@Override
public boolean test(Apple apple) {
	return apple.getWeight() < 200;
}
}
